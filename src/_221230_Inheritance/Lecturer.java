package _221230_Inheritance;

public class Lecturer extends Academician {
    private String roomNumber;

    public Lecturer(String nameSurname, String mobileNumber, String emailAddress, String department, String status,
            String roomNumber) {
        super(nameSurname, mobileNumber, emailAddress, department, status);
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void enterCourse(String courseTime) {
        System.out.println("Lecturer " + this.getNameSurname() + "entered the course at " + courseTime);
    }

    public void senateMeeting() {
        System.out.println(this.getNameSurname() + " attended Senate Meeting.");
    }

    public void makeExam() {
        System.out.println(this.getNameSurname() + " is making an exam at Room:" + this.getRoomNumber());
    }

    @Override
    public void enterUniversity() {
        System.out.println("Lecturer " + this.getNameSurname()
                + " entered university using lecturer entering method using Gate C.");
    }

    @Override
    public void exitUniversity(String exitTime) {
        System.out.println("Lecturer " + this.getNameSurname() + " left the university at " + exitTime);
    }
}
