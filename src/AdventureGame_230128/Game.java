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
        boolean gameCompleted=false;
        int a=0;

        while (true) {

            if (player.getInventory().getCaveAward().equals("Food")
                    && player.getInventory().getForestAward().equals("Firewood")
                    && player.getInventory().getRiverAward().equals("Water")&&a==0) {
                System.out.println(
                        "YOU have finished all of the locations succesfully.\nYou just need to go to the Safe House to finish the game");
                        a=1;
            }
            if(gameCompleted){
                System.out.println(
                    "You are a WINNER!!!\nCONGRATULATIONS... \nYOU HAVE FINISHED THE ADVENTURE GAME SUCCESFULLY.");
                    break;        
            }
            player.printInfo();

            System.out.println();
            System.out.println("-------------");
            System.out.println("Locations:");
            System.out.println("1. Safe House : This is a safe location for You. No enemies inside.");
            System.out.println("2. Tool Store : This is a shopping center for your needs such as weapons and armors.");
            System.out.println("3. Cave       : < Award: Food     > Watch out! Cave is the land of Zombies...");
            System.out.println("4. Forest     : < Award: Firewood > Watch out! Forest is the land of Vampires...");
            System.out.println("5. River      : < Award: Water    > Watch out! River is the land of Bears...");
            System.out.println("6. Mine       : < Award: Depends on your luck Weapon/Armor/Money > Watch out! Mine is the land of Snakes...");
            System.out.println("0. Exit       : Leave the game.");
            System.out.println("-------------");
            System.out.println("Please choose Location You are willing to go:(1-5)");

            int selectLoc = input.nextInt();
            boolean isCompleted = true;

            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                if (player.getInventory().getCaveAward().equals("Food")
                && player.getInventory().getForestAward().equals("Firewood")
                && player.getInventory().getRiverAward().equals("Water")) {
                    gameCompleted=true;
            }
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    if (player.getInventory().getCaveAward().equals("Food")) {
                        System.out.println("You have finished the Cave!!! Congrats !!!");
                        System.out.println("You are not allowed to play this section again.");
                        isCompleted = false;
                        break;
                    }
                    location = new Cave(player);
                    break;
                case 4:
                    if (player.getInventory().getForestAward().equals("Firewood")) {
                        System.out.println("You have finished the Forest!!! Congrats !!!");
                        System.out.println("You are not allowed to play this section again.");
                        isCompleted = false;
                        break;
                    }
                    location = new Forest(player);
                    break;
                    case 5:
                    if (player.getInventory().getRiverAward().equals("Water")) {
                        System.out.println("You have finished the River!!! Congrats !!!");
                        System.out.println("You are not allowed to play this section again.");
                        isCompleted = false;
                        break;
                    }
                    location = new River(player);
                    break;
                    case 6:
                    location = new Mine(player);
                    break;
                default:
                    System.out.println("Please enter a valid location");
            }

            if (location == null) {
                System.out.println("You have given up on the foggy and dark island so quickly.");
                break;
            }
            if (isCompleted) {

                if (!location.onLocation()) {
                    System.out.println("Game Over !!!");
                    break;
                }
            }

        }

    }

}
