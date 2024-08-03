package _240729_InputOutputSystems;

import java.io.FileWriter;
import java.nio.charset.Charset;
public class _FileWriter {
    public static void main(String[] args) {

        String data = " Learning Java Türkçe: Java Öğreniyorum";
        try {
            FileWriter writerFile = new FileWriter("src\\\\_240729_InputOutputSystems\\\\patika.txt",Charset.forName("UTF-8"));
            writerFile.write(data);
            writerFile.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
