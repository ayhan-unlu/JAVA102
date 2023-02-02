package AdventureGame_230128;

import java.util.Scanner;

public class Player {
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

        // Samurai samurai = new Samurai();
        // Archer archer = new Archer();
        // Knight knight = new Knight();

        GameChar[] charList = { new Samurai(), new Archer(), new Knight() };
        System.out.println("Characters");
        System.out.println("-------------------------------");

        for (GameChar gameChar : charList) {
            System.out.println("Character: " + gameChar.getName() +
                    " Damage: " + gameChar.getDamage() +
                    " Health: " + gameChar.getHealth() +
                    " Money: " + gameChar.getMoney());
        }
        System.out.println("Please choose a character\n1:Samurai \n2:Archer \n3:Knight");
        selectChar  = input.nextInt();

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Archer \t Damage:7 \t Health 18 \t Money:20");
        // System.out.println("Knight \t Damage:8 \t Health 24 \t Money:25");
        switch (selectChar) {
            case 1:
                System.out .println("You have chosen Samurai, Congrats!!");
                break;
            case 2:
                System.out.println("You have chosen Archer, Congrats!!");
                break;
            case 3:
                System.out.println("You have chosen Knight, Congrats!!");
                break;
            default:
                System.out.println("Please enter a valid selection");
                break;
        }
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

}
