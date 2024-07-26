package _240726_Enum;

public class Main {

    public static void main(String[] args) {
        // Day Monday = new Day(1);
        // Day Tuesday = new Day(2);
        // Day Wednesday= new Day(3);

        System.out.println(Day.MONDAY.getDay());
        System.out.println("###########");
        System.out.println();
        System.out.println(EnumDay.MONDAY.getDay());

        //X EnumDay newDay= new EnumDay(3);

        EnumDay.MONDAY.printDayIdiom();
        EnumDay.TUESDAY.printDayIdiom();
        
    }

}
