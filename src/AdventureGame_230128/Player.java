package AdventureGame_230128;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String charName;
    private String name;

    public Player(String name) {
        this.name = name;
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

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    private int selection;

    public void selectChar() {
        // Scanner scan = new Scanner(System.in);
        // selection = scan.nextInt();
        System.out.println("-------------------------------");
        System.out.println("Samurai  Damage:5 \t Health 21 \t Money:15");
        System.out.println("Bowler \t Damage:7 \t Health 18 \t Money:20");
        System.out.println("Knight \t Damage:8 \t Health 24 \t Money:25");
        switch (selection) {
            case 1:
                System.out.println("You have chosen Samurai, Congrats!!");
                break;
            case 2:
                System.out.println("You have chosen Bowler, Congrats!!");
                break;
            case 3:
                System.out.println("You have chosen Knight, Congrats!!");
                break;
            default:
                System.out.println("Please enter a valid selection");
                break;
        }
    }

}
