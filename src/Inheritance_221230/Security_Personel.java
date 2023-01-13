package Inheritance_221230;

public class Security_Personel extends CivilServant {

    private String document;

    public Security_Personel(String nameSurname, String mobileNumber, String emailAddress, String department,
            String workingHours, String document) {
        super(nameSurname, mobileNumber, emailAddress, department, workingHours);
        this.document = document;
    }

    public String getDocument() {
        return this.document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public void exitUniversity(String exitTime) {
        System.out.println("Security Personel " + this.getNameSurname() + "left university at " + exitTime);
    }

    public void shift() {
        System.out.println("Security Personel " + this.getNameSurname() + " is on duty now.");
    }

}
