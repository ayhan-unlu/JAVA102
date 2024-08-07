package _221230_Inheritance;

public abstract class Academician extends Employee {
    private String department;
    private String status;

    public Academician(String nameSurname, String mobileNumber, String emailAddress, String department, String status) {
        super(nameSurname, mobileNumber, emailAddress);
        this.department = department;
        this.status = status;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract void enterCourse(String courseTime);
    // { System.out.println(this.getNameSurname() + " entered the course."); }

    @Override
    public void enterUniversity() {
        System.out.println("The academician " + this.getNameSurname()
                + " entered university using academician entering method using Gate B.");
    }
}
