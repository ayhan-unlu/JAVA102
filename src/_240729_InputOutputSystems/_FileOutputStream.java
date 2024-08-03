package _240729_InputOutputSystems;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _FileOutputStream {
    public static void main(String[] args) {

        String str="Learning OutputStream.\nPatika Dev ";
        byte [] strByteArray=str.getBytes();

        try {
            // FileOutputStream output = new FileOutputStream("pat");
            // FileOutputStream output = new FileOutputStream("patik.txt");
            // FileOutputStream output = new FileOutputStream("patika.txt",true);
            File currentFile = new File("src\\\\_240729_InputOutputSystems\\\\patika.txt");
            FileOutputStream output= new FileOutputStream(currentFile,false);
            output.write(strByteArray);
            output.close();

//        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
