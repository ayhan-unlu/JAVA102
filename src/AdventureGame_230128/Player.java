package AdventureGame_230128;

import java.util.Scanner;

public class Player {
    private int Id;
    private int damage;
    private int health;
    private int money;
    private String charName;
    private String name;
    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
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

        System.out.println("Chosen Character: " + this.getName() +
                " Id: " + this.getId() +
                " Damage: " + this.getDamage() +
                " Health " + this.getHealth() +
                " Money: " + this.getMoney());
        // System.out .println("You have chosen " + + " , Congrats!!");
    }

    public void initPlayer(GameChar gameChar) {
        this.setName(gameChar.getName());
        this.setId(gameChar.getId());
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());

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
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
