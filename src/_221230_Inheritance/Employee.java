package _221230_Inheritance;

public abstract class Employee {
    private String nameSurname;
    private String mobileNumber;
    private String emailAddress;

    public Employee(String nameSurname, String mobileNumber, String emailAddress) {
        this.nameSurname = nameSurname;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
    }

    public String getNameSurname() {
        return this.nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public abstract void enterUniversity();

    public void enterUniversity(String time) {
        System.out.println(this.getNameSurname() + " entered university at " + time);
    }

    public void enterUniversity(String time, String gate) {
        System.out.println(this.getNameSurname() + " entered university at " + time + " using gate " + gate);
    }

    public abstract void exitUniversity(String exitTime);

    public void goToMesshall() {
        System.out.println(this.getNameSurname() + " went to messhall");
    }

    public static void whoEnteredUniversity(Employee[] enteredEmployeeList) {
        for (Employee e : enteredEmployeeList) {
            e.enterUniversity();

        }
    }

}
