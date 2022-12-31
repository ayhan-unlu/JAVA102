package Inheritance_221230;

public class IT_Personel extends CivilServant {
    private String duty;

    public IT_Personel(String nameSurname, String mobileNumber, String emailAddress, String department, String workingHours, String duty){
        super(nameSurname,mobileNumber,emailAddress,department, workingHours);
        this.duty=duty;
    }

    public String getDuty(){
        return this.duty;
    }

    public void setDuty(String duty){
        this.duty=duty;
    }

    public void networkEstablishment(){
        System.out.println("IT Personel "+ this.getNameSurname()+" is establishing network connections.");
    }


}
