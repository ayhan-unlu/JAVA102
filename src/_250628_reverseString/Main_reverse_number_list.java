package _250628_reverseString;

import java.util.ArrayList;

public class Main_reverse_number_list {
    public static void main(String[] args) {
        String str = "10 20 30 40 50";
        String reversedStr = "";
        ArrayList <Integer> spaceListOfString =spaceListOfString(str);
        int spaceCount=spaceListOfString.get(spaceListOfString.size()-1);
        String []subStringArray =new String[spaceCount+1];
        String []reversedSubStringArray= new String[spaceCount+1];
        for (int i=0;i<spaceCount;i++){
            subStringArray= str.split(" ");
        }

        for (int i=0;i<spaceCount+1;i++) {
         //   System.out.println(subStringArray[i]);
        }
        int j=0;
        for (int i=spaceCount+1;i>0;i--) {

            reversedSubStringArray[j]=subStringArray[i-1];
            j++;
        }
        for (int i=0;i<spaceCount+1;i++) {
      //      System.out.println(reversedSubStringArray[i]);
        }

        for (int i=0;i<spaceCount+1;i++) {
            reversedStr+=reversedSubStringArray[i];
            if(i<spaceCount+1) {
                reversedStr += " ";
            }
        }

        System.out.println(reversedStr);


//        System.out.println(reverseNumberList(str));
//    }
//
//    public static String reverseNumberList(String str) {
//        ArrayList<Integer> numberList = new ArrayList<>();
//
//        ArrayList<Integer> reversedNumberList = new ArrayList<>();
//
//
//        String reversedNumberString = "";
//        int spaceCount = spaceListOfString(str).get(spaceListOfString(str).toArray().length - 1);
//        System.out.println(spaceCount);
//        for (int i = 0; i < spaceCount; i++) {
//            int splitPoint = spaceListOfString(str).get(i);
//
////            char []alphabet= new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
////            System.out.println(alphabet.length);
//        }
//        int[] intList = new int[spaceCount];
//        for (int i = 0; i < spaceCount; i++) {
//            int beginAt = i;
//
//            int endAt = spaceListOfString(str).get(i);
//            if (endAt - beginAt >= 1) {
//               // beginAt = spaceListOfString(str).get(i - 1);
//                endAt = spaceListOfString(str).get(i);
//            }
//            intList[i] = Integer.parseInt(str.substring(beginAt, endAt));
//            System.out.println("intList"+i+": "+intList[i]);
//        }
//
//        return reversedNumberString;
    }

    public static ArrayList<Integer> spaceListOfString(String str) {
        ArrayList<Integer> spaceListOfString = new ArrayList<>();
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceListOfString.add(i);
                spaceCount += 1;
            }
        }
        spaceListOfString.add(spaceCount);
   //     System.out.println("spaceListOfString" + spaceListOfString);
        return spaceListOfString;
    }
}
