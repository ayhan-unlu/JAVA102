package Inheritance_221230;

public class Employee {
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

    public void enterUniversity() {
        System.out.println(this.getNameSurname() + " entered university.");
    }

    public void enterUniversity(String time) {
        System.out.println(this.getNameSurname() + " entered university at " + time);
    }

    public void enterUniversity(String time, String gate) {
        System.out.println(this.getNameSurname() + " entered university at "+ time +" using gate "+gate);
    }
    public void exitUniversity() {
        System.out.println(this.getNameSurname() + " left the university.");
    }

    public void goToMesshall() {
        System.out.println(this.getNameSurname() + " went to messhall");
    }

}
