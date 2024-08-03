package _240729_InputOutputSystems;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class _OutputStreamWriter {
    public static void main(String[] args) {

        String data = "ĞÜŞİÇÖğüşıçö";

        try {
            FileOutputStream fileOutput = new FileOutputStream("output.txt");

            OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutput);
            // fileOutput.write(data.getBytes("UTF-8"));
            // fileOutput.write(data.getBytes(Charset.forName("Big5")));
            fileWriter.write(data);
            System.out.println(fileWriter.getEncoding());
            // fileWriter.write(data);
            fileOutput.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
