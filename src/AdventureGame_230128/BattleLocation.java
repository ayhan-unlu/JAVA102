package AdventureGame_230128;

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
        System.out.println("You are at " + this.getName() + " now!");
        System.out.println("Be careful ! Here is the land of " + this.getObstacle().getName() + "s");
        System.out.println("You may face up to " + this.maxObstacle + " " + this.getObstacle().getName() + "s in the "
                + this.getName());
        System.out.println(
                "In this game You will fight " + obstacleNumber + " " + this.getObstacle().getName());
        System.out.print("Please choose <F>ight or <R>un away:");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("F")) {
            System.out.println("Execute battle commands");

        } else {
            System.out.println("Running away so fast!!");
        }
        return true;
    }

    public boolean combat(int obstacleNumber) {
        for (int i = 1; i <= obstacleNumber; i++) {
            printPlayerStats();
            printEnemyStats();

        }
        return false;
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
    }

    public void printEnemyStats() {
        System.out.println("The Enemy " + this.getObstacle().getName() + " Info ");
        System.out.println("-------------------------------");
        System.out.println("Health      :" + this.getObstacle().getHealth());
        System.out.println("Damage      :" + this.getObstacle().getDamage());
        System.out.println("Award Money :" + this.getObstacle().getAwardMoney());
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