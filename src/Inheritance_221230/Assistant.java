package Inheritance_221230;

public abstract class Assistant extends Academician{
    private String officeHours;

    public Assistant(String nameSurname, String mobileNumber, String emailAddress, String department, String status, String officeHours){
        super(nameSurname, mobileNumber, emailAddress, department, status);
        this. officeHours=officeHours;
    }

    public String getOfficeHours(){
        return this.officeHours;
    }

    public void setOfficeHours(String officeHours){
        this.officeHours=officeHours;
    }

    public void makeQuiz(){
        System.out.println(this.getNameSurname()+" is making a quiz.");
    }
    
}
