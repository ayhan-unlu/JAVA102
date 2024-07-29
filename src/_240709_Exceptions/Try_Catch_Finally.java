package _240709_Exceptions;

import java.util.Scanner;

public class Try_Catch_Finally {
    public static void main(String[] args) {

        System.out.println("The program started.");

        Scanner input = new Scanner(System.in);
        System.out.println(input);
        int a = 1;
        int b = 20;
        int c = 0;
        System.out.println(c);
        int[] arr = new int[2];

        try {
            System.out.println("Dividing started.");
            System.out.println("Dividing finished.");
            System.out.println(b / a);
            c = input.nextInt();
            arr[10] = 11;

        } catch (ArithmeticException e) {
            System.out.println(" ");
            System.out.println(e.getMessage());
            System.out.println("Arithmetic Exception is found.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getName());
        } finally {
            System.out.println("This part will work in any case");
        }
        /*
         * catch (InputMismatchException e) {
         * 
         * System.out.println("");
         * System.out.println("Invalid input");
         * System.out.println(e.getMessage());
         * 
         * } catch (IndexOutOfBoundsException e){
         * System.out.println(" ");
         * System.out.println("Index out of bound exception");
         * }
         * 
         * catch (Exception e) {
         * System.out.println("Exception is caught.");
         * System.out.println(e.getMessage());
         * e.printStackTrace();
         * System.out.println(e.toString());
         * }
         * 
         * try {
         * // c = input.nextInt();
         * } catch (Exception e) {
         * System.out.println(e.toString());
         * }
         */ System.out.println("The program finished.");
    }

}
