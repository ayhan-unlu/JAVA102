package _240729_InputOutputSystems;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class _PrintWriter {
    public static void main(String[] args) {
        String data = "Java 102";

        try {
            PrintWriter writer = new PrintWriter("output.txt");
          //  writer.write(data);
            writer.write(1023658);
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
