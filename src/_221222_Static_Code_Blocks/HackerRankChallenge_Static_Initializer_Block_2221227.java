package _221222_Static_Code_Blocks;
import java.util.Scanner;

/**
 * HackerRankChallenge_Static_Initializer_Block_2221227
 */
public class HackerRankChallenge_Static_Initializer_Block_2221227 {

    static {
        Scanner scan = new Scanner(System.in);
        int breadth = scan.nextInt();
        int height = scan.nextInt();
      //  System.out.println(breadth);
        //System.out.println(height);
        if ((breadth>0)&&(height>0)){
            System.out.println(breadth*height);

        }else System.out.println( "java.lang.Exception: Breadth and height must be positive");
        scan.close();

    }

    public static void main(String[] args) {


    }
}