package _221230_Inheritance;

public class LabAssistant extends Assistant {

    public LabAssistant(String nameSurname, String mobileNumber, String emailAddress, String department, String status,
            String officeHours) {
        super(nameSurname, mobileNumber, emailAddress, department, status, officeHours);
    }

    public void enterLab() {
        System.out.println(this.getNameSurname() + " entered the labs");
    }

    @Override
    public void enterCourse(String courseTime) {
        System.out.println("Lab. Assistant " + this.getNameSurname() + " entered the lab. course at " + courseTime);
    }

}
