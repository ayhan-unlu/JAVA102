package _240726_Enum;

public enum EnumDay {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int day;

    /* private */ EnumDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int Day) {
        this.day = day;
    }

    public void printDayIdiom() {

        String dayName = null;
        System.out.println(dayName);

        switch (this) {
            case MONDAY:
                System.out.println("Monday is the first day.");
                break;

            case TUESDAY:
                System.out.println("Tuesday is the day shakes.");

            default:
                break;
        }
        System.out.println("--------------------------");
        switch (this.getDay()) {
            case 1:
                System.out.println("Monday is the first day.");
                break;

            case 2:
                System.out.println("Tuesday is the day that shakes.");

            default:
                break;
        }
        System.out.println(this.getDay());
    }
}
