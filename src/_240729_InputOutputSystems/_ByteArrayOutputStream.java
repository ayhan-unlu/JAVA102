package _240729_InputOutputSystems;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class _ByteArrayOutputStream {
    public static void main(String[] args) {
        String str = "Java 102 Courses";

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        byte[] strByteArray = str.getBytes();

        try {
            output.write(strByteArray);

            String newStr=output.toString();
            System.out.println("Output Stream : "+newStr);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
