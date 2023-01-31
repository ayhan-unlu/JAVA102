package AdventureGame_230128;

import java.util.Scanner;

public class Game {
    private Scanner scan = new Scanner(System.in);

    public void start() {

        System.out.println("Welcome to the Adventure Game !!!!");
        System.out.println("Please enter your name:");

        // String playerName = scan.nextLine();
        // Player player = new Player(playerName);
        Player player = new Player("Ayhan");
        System.out.println(player.getName()
                + " welcome the foggy and dark island !!! Every experience on this island will change your world!!!");
        System.out.println("Please select your character type :\n1 : Samurai\n2: Bowler\n3 : Knight");

        player.selectChar();
    }

}
