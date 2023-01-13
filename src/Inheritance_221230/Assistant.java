package Inheritance_221230;

public class Assistant extends Academician {
    private String officeHours;

    public Assistant(String nameSurname, String mobileNumber, String emailAddress, String department, String status,
            String officeHours) {
        super(nameSurname, mobileNumber, emailAddress, department, status);
        this.officeHours = officeHours;
    }

    public String getOfficeHours() {
        return this.officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void enterCourse(String courseTime) {
        System.out.println("Assistant " + this.getNameSurname() + " entered the course at " + courseTime);
    }

    @Override
    public void exitUniversity(String exitTime) {
        System.out.println("Assistant " + this.getNameSurname() + " left the university at " + exitTime);
    }

    public void makeQuiz() {
        System.out.println(this.getNameSurname() + " is making a quiz.");
    }

}
