package _230128_AdventureGame;

import java.util.Random;

public abstract class BattleLocation extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLocation(Player player, String name, Obstacle obstacle, int maxObstacle, String award) {
        super(player, name);
        this.obstacle = obstacle;
        this.maxObstacle = maxObstacle;
        this.award = award;
    }

    @Override
    public boolean onLocation() {
        int obstacleNumber = this.randomObstacleNumber();
        System.out.println("\nYou are at " + this.getName() + " now!\n");
        System.out.println("Be careful ! Here is the land of " + this.getObstacle().getName() + "s");
        System.out.println("You may face up to " + this.maxObstacle + " " + this.getObstacle().getName() + "s in the "
                + this.getName());
        System.out.println(
                "In this game You will fight " + obstacleNumber + " " + this.getObstacle().getName() + "(s)\n");
        System.out.print("Please choose <F>ight or <R>un away:");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("F") && combat(obstacleNumber)) {
            System.out.println();
            System.out.println("You have killed all " + this.getObstacle().getName() + "(s) in " + this.getName());
            addAwardToInventory();
            if (this.getObstacle().getName() == "Snake") {
                snakeAward();
            }

            return true;

        }
        if (this.getPlayer().getHealth() == 0) {
            System.out.println("Sorry to tell you that but You are Dead!!!");
            return false;

        } else {
            System.out.println("Running away so fast!!");
        }
        return true;
    }

    public void addAwardToInventory() {
        switch (this.getAward()) {
            case "Food":
                this.getPlayer().getInventory().setCaveAward("Food");
                break;

            case "Firewood":
                this.getPlayer().getInventory().setForestAward("Firewood");
                break;

            case "Water":
                this.getPlayer().getInventory().setRiverAward("Water");
                break;

            default:
                break;
        }
        System.out.println("Your Award Inventory: Cave Award: "
                + this.getPlayer().getInventory().getCaveAward() + "  Forest Award: "
                + this.getPlayer().getInventory().getForestAward() + " River Award: "
                + this.getPlayer().getInventory().getRiverAward());

    }

    public boolean combat(int obstacleNumber) {

        for (int i = 1; i <= obstacleNumber; i++) {
            int whoHitsFirst = whoHitsFirst(); // this function decides who hits first 50% player starts which is equal
                                               // to zero "0" 50% enemy starts which is equal to one "1"
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            printPlayerStats();
            printEnemyStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.print("<H>it or <R>unaway :");
                String selectCombat = input.nextLine().toUpperCase();
                if (selectCombat.equals("H")) {
                    if (whoHitsFirst == 0) {
                        System.out.println("You hit your enemy...");
                        this.getObstacle()
                                .setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                        printHealthAfterHit();
                        if (this.getObstacle().getHealth() > 0) {
                            System.out.println();
                            System.out.println("The Enemy hits you...");
                            int obstacleCurrentDamage = this.getObstacle().getDamage()
                                    - this.getPlayer().getInventory().getArmor().getBlockage();
                            if (obstacleCurrentDamage < 0) {
                                obstacleCurrentDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleCurrentDamage);
                            printHealthAfterHit();
                        }
                    } else {
                        System.out.println();
                        System.out.println("The Enemy hits you...");
                        int obstacleCurrentDamage = this.getObstacle().getDamage()
                                - this.getPlayer().getInventory().getArmor().getBlockage();
                        if (obstacleCurrentDamage < 0) {
                            obstacleCurrentDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleCurrentDamage);
                        printHealthAfterHit();
                        if (this.getPlayer().getHealth() > 0) {
                            System.out.println("You hit your enemy...");
                            this.getObstacle()
                                    .setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                            printHealthAfterHit();
                        }
                    }
                } else {
                    return false;
                }
            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("-------------------");
                System.out.println("you won");
                // System.out.println("Congratulations !!! You have killed the " +
                // this.getObstacle().getName());
                System.out.println("You have earned " + this.getObstacle().getAwardMoney());
                this.getPlayer().setMoney(this.getPlayer().getMoney() + obstacleNumber*(this.getObstacle().getAwardMoney()));
                System.out.println("Your Current Balance is : " + this.getPlayer().getMoney());
            } else {
                return false;
            }
        }
        return true;

    }

    public void snakeAward() {
        int chance = createPercentageChance();
        int weaponChance = createPercentageChance();
        int armorChance = createPercentageChance();
        int moneyChance = createPercentageChance();
        // System.out.print("chance" + chance);
        // System.out.print("weaponChance" + weaponChance);
        // System.out.print("armorChance" + armorChance);
        // System.out.println("moneyChance" + moneyChance);
        if (chance < 55) {
            System.out.println(" You are going to win something");
            if (chance < 15) {
                System.out.println("You are going to win a weapon");
                if (weaponChance < 50) {
                    System.out.println("You won a Pistol");
                    this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(1));
                } else if ((weaponChance < 80) && (weaponChance >= 50)) {
                    System.out.println("You have won a Rifle");
                    this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(3));

                } else {
                    System.out.println("You won a sword");
                    this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(2));

                }
            }
            if ((chance >= 15) && (chance < 30)) {
                System.out.println("You are going to win an armor");
                if (armorChance < 50) {
                    System.out.println("You won a Light Armor");
                    this.getPlayer().getInventory().setArmor(Armor.getArmorObjbyId(1));
                } else if ((armorChance < 80) && (armorChance >= 50)) {
                    System.out.println("You have won a Medium Armor");
                    this.getPlayer().getInventory().setArmor(Armor.getArmorObjbyId(2));
                } else {
                    System.out.println("You won a Heavy Armor");
                    this.getPlayer().getInventory().setArmor(Armor.getArmorObjbyId(3));
                }
            }

            if (chance >= 30) {
                System.out.println("You are going to win a money");
                if (moneyChance < 50) {
                    System.out.println("You won 1 Money");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);
                } else if ((moneyChance < 80) && (moneyChance >= 50)) {
                    System.out.println("You have won 5 Money");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);
                } else {
                    System.out.println("You won 10 Money");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
                }

            }
        } else {
            System.out.println("Sorry !!! You won NOTHING SADDLY.");
        }
    }

    public int createPercentageChance() {
        Random r = new Random();
        int percentage = r.nextInt(100);
        return percentage;
    }

    private int whoHitsFirst() {
        Random r = new Random();
        return r.nextInt(2);
    }

    public void printHealthAfterHit() {
        System.out.println(this.getPlayer().getName() + " Your health is " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " health is " + this.getObstacle().getHealth());
        System.out.println();

    }

    public void printPlayerStats() {
        System.out.println("Player " + this.getPlayer().getName() + " Info ");
        System.out.println("-------------------------------");
        System.out.println("Health  :" + this.getPlayer().getHealth());
        System.out.println("Weapon  :" + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Damage  :" + this.getPlayer().getTotalDamage());
        System.out.println("Armor   :" + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Blockage:" + this.getPlayer().getInventory().getArmor().getBlockage());
        System.out.println("Money   :" + this.getPlayer().getMoney());
        System.out.println();
    }

    public void printEnemyStats(int i) {
        System.out.println(i + ". " + this.getObstacle().getName() + " Info ");
        System.out.println("-------------------------------");
        System.out.println("Health      :" + this.getObstacle().getHealth());
        System.out.println("Damage      :" + this.getObstacle().getDamage());
        System.out.println("Award Money :" + this.getObstacle().getAwardMoney());
        System.out.println();
    }

    public int randomObstacleNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}