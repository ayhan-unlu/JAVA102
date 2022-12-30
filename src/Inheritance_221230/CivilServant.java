package Inheritance_221230;

public class CivilServant extends Employee {

    private String department;
    private String workingHours;

    public CivilServant(String nameSurname, String mobileNumber, String emailAddress, String department,
            String workingHours) {
        super(nameSurname, mobileNumber, emailAddress);
        this.department = department;
        this.workingHours = workingHours;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorkingHours() {
        return this.workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public void work() {
        System.out.println(this.getNameSurname() + " works " + this.getWorkingHours());
    }
}
