package _240729_InputOutputSystems;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _FileInputStream {
    public static void main(String[] args) {

        try {
            // File currentFile=new File("src/_240729_InputOutputSystems/patika.txt");
            // currentFile.createNewFile();
            FileInputStream input = new FileInputStream("src/_240729_InputOutputSystems/patika.txt");
            System.out.println("Available Data for Input: " + input.available());
            input.skip(10);
            System.out.println("Available Data after skipping: " + input.available());

            int i = input.read();
            System.out.println("Available Data after first reading: " + input.available());
            // char c = (char) (i);
            // System.out.println(input.read());
            // System.out.println(input.read());
            // while (input.read() != -1) {
            while (i != -1) {
                // System.out.println(input.read());
                // System.out.println(i);
                System.out.print((char) i);
                // System.out.println(c);
                i = input.read();
            }
            System.out.println("\nAvailable Data before closing reading: " + input.available());
            input.close();
        } catch (/* FileNotFoundException */Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

}
