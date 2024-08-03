package _240729_InputOutputSystems;

import java.io.FileReader;
import java.nio.charset.Charset;

public class _FileReader {
    public static void main(String[] args) {

        try {
            FileReader readFile = new FileReader("src\\\\_240729_InputOutputSystems\\\\patika.txt", Charset.forName("UTF-8"));
            // FileReader readFile = new FileReader("patika.txt",Charset.forName("Big5"));
            readFile.skip(2);
            
            int i = readFile.read();
            while (i != -1) {
                System.out.print((char) i);
                i = readFile.read();
            }
            readFile.close();

        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
