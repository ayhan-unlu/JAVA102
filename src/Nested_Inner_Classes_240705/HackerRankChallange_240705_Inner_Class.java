package Nested_Inner_Classes_240705;

import java.util.Scanner;

public class HackerRankChallange_240705_Inner_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Inner i = new Inner();
        Inner.Private ip = i.new Private();
        String assume = ip.powerof2(num)?"is":"is not a";

        System.out.print(num+" "+assume+" power of 2\n");
        System.out.println("An instance of class:Solution.Inner.Private has been created");

    }
}
class Inner{
    class Private{
        boolean powerof2(int num){
            while (num>1){
                if (num%2!=0) return false;
                num/=2;

            }
            return true;
        }
    }
}