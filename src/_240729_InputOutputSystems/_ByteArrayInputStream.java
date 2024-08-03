package _240729_InputOutputSystems;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class _ByteArrayInputStream {
    public static void main(String[] args) {

        byte[] byteArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ByteArrayInputStream input = new ByteArrayInputStream(byteArray,2,4);
        System.out.println("\nAvailable input data is: " + input.available());
        
//        input.skip(3);
        int i = input.read();

        
        while (i != -1) {
            System.out.print(i+" ");
            i = input.read();
        }
        try{
            input.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("\nAvailable input data is: " + input.available());
        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println("Available input data after reading thirth byte: " + input.available());
    }

}
