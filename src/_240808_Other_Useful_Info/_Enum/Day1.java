package _240808_Other_Useful_Info._Enum;

public class Day1 {

    public static final Day1 MONDAY = new Day1(1);
    public static final Day1 TUESDAY = new Day1(2);
    public static final Day1 WEDNESDAY = new Day1(3);
    public static final Day1 THURSDAY = new Day1(4);
    public static final Day1 FRIDAY = new Day1(5);
    public static final Day1 SATURDAY = new Day1(6);
    public static final Day1 SUNDAY = new Day1(7);

    private int dayNumber;

    private Day1(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

}
