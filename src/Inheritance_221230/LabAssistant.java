package Inheritance_221230;

public class LabAssistant extends Assistant{

    public LabAssistant(String nameSurname, String mobileNumber, String emailAddress, String department, String status, String officeHours){
        super(nameSurname,mobileNumber, emailAddress, department, status, officeHours);
    }

    public void enterLab(){
        System.out.println(this.getNameSurname()+" entered the labs");
    }

    
    
}
