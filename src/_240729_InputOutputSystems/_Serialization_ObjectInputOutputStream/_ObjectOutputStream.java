package _240729_InputOutputSystems._Serialization_ObjectInputOutputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class _ObjectOutputStream {

    public static void main(String[] args) {

        Car c1 = new Car("Audi", "A3");

        try {
            FileOutputStream outputFile=new FileOutputStream("src\\\\_240729_InputOutputSystems\\\\Car.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputFile);
            output.writeObject(c1);
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
