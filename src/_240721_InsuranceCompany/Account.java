package _240721_InsuranceCompany;

public abstract class Account {

    User user = new User();
ArrayList<Insurance> insuranceList=new ArrayList<>();

    // user.getInsuranceList(); Insurance ArrayList
    public final void showUSerInfo() {
        System.out.println("howUSerInfo");
    }

    public int hashCode() {
        return 0;
    }

    public void equals(){
    }

}
