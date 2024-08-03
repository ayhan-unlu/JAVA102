package _240729_InputOutputSystems;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class _BufferedInputStream {
    public static void main(String[] args){

        try{
            FileInputStream fileInput=new FileInputStream("src\\\\_240729_InputOutputSystems\\\\patika.txt");
            BufferedInputStream bufferedInput=new BufferedInputStream(fileInput);
        
            int i=bufferedInput.read();
            while(i!=-1){
                System.out.print((char)i);
                i=bufferedInput.read();

            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}
