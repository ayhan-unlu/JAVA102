package AdventureGame_230128;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {

        System.out.println("Welcome to the Adventure Game !!!!");
        System.out.println("Please enter your name:");
        Player player = new Player("Ayhan");
        System.out.println(player.getName()
                + " welcome the foggy and dark island !!! Every experience on this island will change your world!!!");
        player.selectChar();

        Location location = null;

        while (true) {

            System.out.println();
            System.out.println("-------------");
            System.out.println("Locations:");
            System.out.println("1. Safe House : This is a safe location for You. No enemies inside.");
            System.out.println("2. Tool Store : This is a shopping center for your needs such as weapons and armours.");
            System.out.println("-------------");
            System.out.println("Please choose Location You are willing to go:(1-2)");

            int selectLoc = input.nextInt();

            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    System.out.println("You have entered an invalid Location, Safe House is selected as default");
                    location = new SafeHouse(player);
                    break;
            }
            if (!location.onLocation()) {
                System.out.println("Game Over !!!");
                break;
            }

        }

    }

}
