package _240709_Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Throw {

    public static void checkAge(int age) throws AgeCheckException {
        if (age < 18) {
            // throw new Exception("Your age is not proper")
            // throw new ArithmeticException("Your age is not proper");
            // throw new Exception("Your age is not proper");
            throw new AgeCheckException("Age Check Exception Caught");
            // throw new IndexOutOfBoundsException("Your age is not proper");
            // throw new IOException("Your age is not proper");

        }
        System.out.println("Your age is elder than the limit.");
    }

    public static void main(String[] args) throws AgeCheckException{
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age: ");

        int age = input.nextInt();
        // System.out.println(1 / 0);
        try {
            checkAge(age);
        }
        catch(AgeCheckException e){
            System.out.println(e.toString());
        }
        // catch(ArithmeticException e){
//         catch (Exception e) {
  //          System.out.println("Exception is caught");
            // System.out.println(e.toString());
    //        System.out.println(e.getClass().getSimpleName());
      //  }
        System.out.println("The program finished");
    }
}
