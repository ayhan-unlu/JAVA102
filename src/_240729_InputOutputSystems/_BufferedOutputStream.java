package _240729_InputOutputSystems;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class _BufferedOutputStream {
    public static void main(String[] args) {

        String data = "\nOn Patika.dev Java 102 Path";
        byte[] byteArray = data.getBytes();

        try {
            FileOutputStream fileOutput = new FileOutputStream("src\\\\_240729_InputOutputSystems\\\\patika.txt");
            BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);
            bufferedOutput.write(byteArray);

            System.out.println(System.nanoTime());
            // fileOutput.write(byteArray);
            bufferedOutput.close();
            fileOutput.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
