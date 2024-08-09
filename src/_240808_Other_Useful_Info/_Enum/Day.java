package _240808_Other_Useful_Info._Enum;

public enum Day {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int dayNumber;

    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public void getDayName() {

        String dayName = null;

        switch (this.dayNumber) {
            case 1:
                dayName = "Monday";
                // case 1->"Monday";
                break;
            case 2:
                dayName = "Tuesday";
                // case 2->"Tuesday";
                break;
            // case 3->"Wednesday";
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = null;
                break;
        }
        System.out.println(dayName);
    }

    public void getDayNameEnum(){
        String dayName=null;

        switch(this){
            case MONDAY:
            dayName="Monday-e";
            break;
            case TUESDAY:
            dayName="Tuesday-e";
            break;
            case WEDNESDAY:
            dayName="Wednesday-e";
            break;
            case THURSDAY:
            dayName="Thursday-e";
            break;
            case FRIDAY:
            dayName="Friday-e";
            break;
            case SATURDAY:
            dayName="Saturday-e";
            break;
            case SUNDAY:
            dayName="Sunday-e";
            break;
            default:
            break;
        }
        System.out.println(dayName);
    }
}
