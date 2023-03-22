import java.util.Scanner;

public class ReverseString {

    public static void FirstReverse(String str) {
        char [] StringArray = str.toCharArray();
        for (int i=StringArray.length-1;i>=0;i--){
            System.out.print(StringArray[i]);
        }
        // code goes here
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        FirstReverse(input);
    }
}
