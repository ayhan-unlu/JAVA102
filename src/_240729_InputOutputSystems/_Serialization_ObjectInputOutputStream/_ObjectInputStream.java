package _240729_InputOutputSystems._Serialization_ObjectInputOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

public class _ObjectInputStream {
    public static void main(String[] args) {
        Car c1 = new Car("Audi", "A3");

        try {
            FileInputStream inputFile = new FileInputStream("src\\\\_240729_InputOutputSystems\\\\Car.txt");
            ObjectInputStream inputStream= new ObjectInputStream(inputFile);

            Car newCar= (Car)inputStream.readObject();

            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());

            inputFile.close();
            inputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
