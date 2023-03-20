package AdventureGame_230128;

import java.util.Scanner;

public class Player {
    private int Id;
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    // private String charName;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    private int selectChar;

    public void selectChar() {

        GameChar[] charList = { new Samurai(), new Archer(), new Knight() };
        System.out.println("Characters");
        System.out.println("---------------------------------------------------------");

        for (GameChar gameChar : charList) {
            System.out.println(gameChar.getName() +
                    " ID: " + gameChar.getId() +
                    " \tDamage: " + gameChar.getDamage() +
                    " \tHealth: " + gameChar.getHealth() +
                    " \tMoney: " + gameChar.getMoney());
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Please choose a character Id: (1-3)");
        selectChar = input.nextInt();
        System.out.println();

        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                System.out.println("You have chosen Samurai, Congrats!!");
                break;
            case 2:
                initPlayer(new Archer());
                System.out.println("You have chosen Archer, Congrats!!");
                break;
            case 3:
                initPlayer(new Knight());
                System.out.println("You have chosen Knight, Congrats!!");
                break;
            default:
                initPlayer(new Samurai());
                System.out.println("You have entered an invalid ID, Samurai is selected as default");
                break;
        }
    }

    public void initPlayer(GameChar gameChar) {
        this.setName(gameChar.getName());
        this.setId(gameChar.getId());
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOriginalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
    }

    public void printInfo() {
        System.out.println(" Weapon: " + this.getInventory().getWeapon().getName() +
                " Damage: " + this.getTotalDamage() +
                " Armor: " + this.getInventory().getArmor().getName() +
                " Blockage: " + this.getInventory().getArmor().getBlockage() +
                " Health " + this.getHealth() +
                " Money: " + this.getMoney());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

}
