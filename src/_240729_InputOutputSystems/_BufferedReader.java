package _240729_InputOutputSystems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;

public class _BufferedReader {
    public static void main(String[] args) {
        try {
            FileReader readFile = new FileReader("src\\_240729_InputOutputSystems\\patika.txt", Charset.forName("UTF-8"));
            BufferedReader readBuff = new BufferedReader(readFile);
            // String line=null;
            // while(line==readBuff.readLine()){}
/*            String line = readBuff.readLine();
            while(line!=null){
                System.out.print(line+"#######");
                line=readBuff.readLine();
            } */
           String line;
           while((line=readBuff.readLine())!=null){
            System.out.print(line+"####### ");
            
           }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
