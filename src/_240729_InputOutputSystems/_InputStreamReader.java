package _240729_InputOutputSystems;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class _InputStreamReader {
    public static void main(String[] args) {

        try {
            FileInputStream fileInput = new FileInputStream("src\\\\_240729_InputOutputSystems\\\\patika.txt");

//            InputStreamReader inputReader= new InputStreamReader(fileInput,"UTF-8");
InputStreamReader inputReader= new InputStreamReader(fileInput,Charset.forName("UTF-8"));

            System.out.println(inputReader.getEncoding());

            int i=inputReader.read();
            while(i!=-1){
                System.out.print((char)i);
                i=inputReader.read();
             }
        /*            int i=fileInput.read();
            while(i!=-1){
                System.out.print((char)i);
                i=fileInput.read();
             }
   */     } catch (/*FileNotFoundException*/Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
