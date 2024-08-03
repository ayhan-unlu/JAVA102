package _240729_InputOutputSystems;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.nio.charset.Charset;

public class _BufferedWriter {
    public static void main(String[] args) {

        String data = "learning Java";
//        File currentFile = new File("patika.txt");

        try {

             FileWriter writeFile= new
             FileWriter("src\\\\_240729_InputOutputSystems\\\\patika.txt");
            //FileWriter writeFile = new FileWriter(currentFile,Charset.forName("UTF8"));
            BufferedWriter writeBuff = new BufferedWriter(writeFile);
            System.out.println(writeFile.getEncoding());

            writeBuff.write(data);

            writeFile.close();
            writeBuff.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
