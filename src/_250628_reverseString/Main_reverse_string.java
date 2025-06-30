package _250628_reverseString;

import java.util.ArrayList;

public class Main_reverse_string {
    public static void main(String[] args) {
        String str = "1 2 3 4 5";
        System.out.println((reverseString(str)));
    }

    public static String reverseString(String str) {
        ArrayList<Character> charList = new ArrayList<>();
        ArrayList<Character> reversedList = new ArrayList<>();
        String reversedString = "";
        for (int i = 0; i < str.length(); i++) {
            charList.add(str.charAt(i));
        }

        for (int j = str.length() - 1; j >= 0; j--) {
            reversedList.add(charList.get(j));
        }
        for (int k = 0; k < str.length(); k++) {
            reversedString += reversedList.get(k);
        }
        return reversedString;
    }
}
