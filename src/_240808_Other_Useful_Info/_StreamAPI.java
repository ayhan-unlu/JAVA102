package _240808_Other_Useful_Info;

import java.util.ArrayList;
import java.util.Comparator;

public class _StreamAPI {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(25);
        list.add(25);
        list.add(12);
        list.add(3);
        list.add(89);
        list.add(25);
        list.add(44);
        list.add(100);
        list.add(7);
        list.add(63);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("'1'");

        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println("'2'");

        list.stream().forEach(i -> System.out.print(i + " "));
        System.out.println("'3'");

        list.forEach(i -> System.out.print(i + " "));
        System.out.println("'4'");

        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println("'5'");

        list.stream().filter(i -> i > 60).forEach(i -> System.out.print(i + " "));
        System.out.println("'6'");

        list.stream().distinct().forEach(i -> System.out.print(i + " "));
        System.out.println("'7'");

        list.stream().sorted().forEach(i -> System.out.print(i + " "));
        System.out.println("'8'");

        list.stream().distinct().sorted().forEach(i -> System.out.print(i + " "));
        System.out.println("'9'");

        list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));
        System.out.println("'10'");

        list.stream().limit(5L).forEach(i -> System.out.print(i + " "));
        System.out.println("'11'");

        list.stream().limit(5).forEach(i -> System.out.print(i + " "));
        System.out.println("'12'");

        list.stream().skip(5).limit(5).forEach(i -> System.out.print(i + " "));
        System.out.println("'13'");

        long count = list.stream().count();
        System.out.print("Count: " + count + " ");
        System.out.println("'14'");

        boolean control = list.stream().anyMatch(i -> i == 25);
        System.out.print("Control: " + control + " ");
        System.out.println("'15'");

        boolean control2 = list.stream().anyMatch(i -> i == 1);
        System.out.print("Control2 : " + control2 + " ");
        System.out.println("'16'");

        boolean control3 = list.stream().allMatch(i -> i > 1);
        System.out.print("Control3: " + control3 + " ");
        System.out.println("'17'");

        boolean control4 = list.stream().allMatch(i -> i < 99);
        System.out.print("Control4: " + control4 + " ");
        System.out.println("'18'");

        boolean control5 = list.stream().noneMatch(i -> i < 0);
        System.out.print("Control5: " + control5 + " ");
        System.out.println("'19'");

        boolean control6 = list.stream().noneMatch(i -> i > 0);
        System.out.print("Control6: " + control6 + " ");
        System.out.println("'20'");

        list.stream().map(i -> i * 2).forEach(i -> System.out.print(i + " "));
        System.out.println("'21'");

        list.stream().map(i -> i * i).forEach(i -> System.out.print(i + " "));
        System.out.println("'22'");

        list.stream().map(i -> i * i).map(i -> Math.sqrt(i)).forEach(i -> System.out.print(i + " "));
        System.out.println("'23'");

        list.stream().map(i -> i * i).map(i -> (int) Math.sqrt(i)).forEach(i -> System.out.print(i + " "));
        System.out.println("'24'");

    }

}