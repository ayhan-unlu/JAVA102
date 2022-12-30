package Inheritance_221230;

public class Lecturer extends Academician {
    private String roomNumber;

    public Lecturer( String nameSurname, String mobileNumber, String emailAddress, String department, String status, String roomNumber){
        super(nameSurname,mobileNumber, emailAddress, department, status);
        this.roomNumber=roomNumber;
    }

    public String getRoomNumber(){
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber){
        this.roomNumber=roomNumber;
    }

    public void senateMeeting(){
        System.out.println(this.getNameSurname()+ " attended Senate Meeting.");
    }

    public void makeExam(){
        System.out.println(this.getNameSurname()+" is making an exam at Room:"+ this.getRoomNumber());
    }
}
