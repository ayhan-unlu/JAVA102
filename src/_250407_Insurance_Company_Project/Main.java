package _250407_Insurance_Company_Project;

import _250407_Insurance_Company_Project.Account.*;
import _250407_Insurance_Company_Project.InputScanner;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Account> accountList = new TreeSet<>(new OrderByEmailComparator());
        Menu.run();
    }



}