package AdventureGame_230128;

import java.util.Scanner;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    private int selection;

    public void selectChar() {

//        Samurai samurai = new Samurai();
//        Archer archer = new Archer();
//        Knight knight = new Knight(); 

        GameChar [] charList={new Samurai(),new Archer(), new Knight()};

        for (GameChar gameChar:charList){
            System.out.println("Character "+gameChar.getName()+ 
            " have "
            +gameChar.getDamage()+" damage "+
            gameChar.getHealth()+" health "+
            gameChar.getMoney()+" money");
        }
        
        
        // Scanner scan = new Scanner(System.in);
        // selection = scan.nextInt();
//        System.out.println("-------------------------------");
  //      System.out.println("Samurai  Damage:5 \t Health 21 \t Money:15");
    //    System.out.println("Archer \t Damage:7 \t Health 18 \t Money:20");
      //  System.out.println("Knight \t Damage:8 \t Health 24 \t Money:25");
        switch (selection) {
            case 1:
                System.out.println("You have chosen Samurai, Congrats!!");
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

}
