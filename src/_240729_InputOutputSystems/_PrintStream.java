package _240729_InputOutputSystems;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class _PrintStream {
    public static void main(String[] args) {

        // System.out.println(true);
         System.out.print("Patika.dev");
        try {
            PrintStream output = new PrintStream("src\\\\_240729_InputOutputSystems\\\\print.txt");
            output.print("123 "+123456);
            output.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
