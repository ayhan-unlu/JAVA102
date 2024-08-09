package _240808_Other_Useful_Info._Enum;

public class Main {
    public static void main(String[] args) {
        System.out.println(Day.FRIDAY.getDayNumber());
        Day.FRIDAY.getDayName();
        Day.FRIDAY.getDayNameEnum();
        // XX Day d=new Day(8);

        Day dayMonday = Day.MONDAY;
        System.out.println(dayMonday.ordinal());
        System.out.println(dayMonday.name());

        Day[] values = Day.values();
        for (Day i : values) {
            System.out.print(i + " ");
        }

        System.out.println();
        Day dayString = Day.valueOf("MONDAY");
        System.out.println(dayString);

    }
}
