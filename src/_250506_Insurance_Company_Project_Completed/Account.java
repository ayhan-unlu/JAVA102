package _250506_Insurance_Company_Project_Completed;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeSet;

public abstract class Account implements Comparable {

    TreeSet<Account> accountSet;
    private AuthenticationStatus authenticationStatus;
    private User user;
    private ArrayList<Insurance> insuranceList;


    public Account(AuthenticationStatus authenticationStatus, User user/*, String address*/, ArrayList<Insurance> insuranceList) {
        this.authenticationStatus = authenticationStatus;
        this.user = user;
        this.insuranceList = insuranceList;
    }

    public static ArrayList<Insurance> addPresetInsuranceList() {

        ArrayList<Insurance> presetInsuranceList = new ArrayList<>(4);

        presetInsuranceList.add(new CarInsurance("Preset Car Insurance", 0, LocalDate.of(2025, 05, 02), LocalDate.of(2026, 05, 02)));
        presetInsuranceList.add(new HealthInsurance("Preset Health Insurance", 0, LocalDate.of(2025, 05, 02), LocalDate.of(2026, 05, 02)));
        presetInsuranceList.add(new ResidenceInsurance("Preset ResidenceInsurance", 0, LocalDate.of(2025, 5, 2), LocalDate.of(2026, 6, 2)));
        presetInsuranceList.add(new TravelInsurance("Preset TravelInsurance", 0, LocalDate.of(2025, 5, 2), LocalDate.of(2026, 5, 2)));
        return presetInsuranceList;
    }

    public static void addUserAddress(User user) {
        AddressManager.addAddress(user);
    }

    public static void removeUserAddress(User user) {
        AddressManager.deleteAddress(user);
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Account) {
            Account compAcc = (Account) o;
            return this.getUser().getEmail().compareTo(compAcc.getUser().getEmail()) == 0 ? this.getUser().getPassword().compareTo(compAcc.getUser().getPassword()) : this.getUser().getEmail().compareTo(compAcc.getUser().getEmail());
        }
        return -1;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public final void showUserInfo(Account account) {
        System.out.println("Logged In Account Information is Displayed Below");
        System.out.println("------------------------------------------------");
        Address currentHomeAddress = account.getUser().getAddressList().getFirst();
        Address currentBusinessAddress = account.getUser().getAddressList().getLast();
        Insurance currentCarInsurance = account.getInsuranceList().get(0);
        Insurance currentHealthInsurance = account.getInsuranceList().get(1);
        Insurance currentResidenceInsurance = account.getInsuranceList().get(2);
        Insurance currentTravelInsurance = account.getInsuranceList().get(3);

        String className = account.getClass().toString();
        String accountType = className.substring(className.lastIndexOf(".") + 1);
        System.out.print(accountType);
        System.out.print(
                " Account \nEmail: " + account.getUser().getEmail() +
                        ", Password: " + account.getUser().getPassword() +
                        ", Name: " + account.getUser().getName() +
                        ", Surname: " + account.getUser().getSurname() +
                        ", Occupation: " + account.getUser().getOccupation());
        System.out.print("\nHome Address: ");
        if (currentHomeAddress.getAddressBlock().equals("")) {
            printAddAddressMessage();
        } else
            System.out.print(currentHomeAddress.getAddressBlock() + " " + currentHomeAddress.getCity() + " " + currentHomeAddress.getZipCode() + " " + currentHomeAddress.getCountry());

        System.out.print("\nBusiness Address: ");

        if (currentBusinessAddress.getAddressBlock().equals("")) {
            printAddAddressMessage();
        } else
            System.out.print(currentBusinessAddress.getAddressBlock() + " " + currentBusinessAddress.getCity() + " " + currentBusinessAddress.getZipCode() + " " + currentBusinessAddress.getCountry());

        System.out.print("\nInsurance List: \n1- Car Insurance: ");

        if (currentCarInsurance.getInsuranceFee() == 0) {
            printAddInsuranceMessage();
        } else
            System.out.print(currentCarInsurance.getInsuranceName() + " Fee: " + currentCarInsurance.getInsuranceFee() + " Start Date: " + currentCarInsurance.getStartDate() + " End Date: " + currentCarInsurance.getEndDate());
        System.out.print("\n2- Health Insurance: ");
        if (currentHealthInsurance.getInsuranceFee() == 0) {
            printAddInsuranceMessage();
        } else
            System.out.print(currentHealthInsurance.getInsuranceName() + " Fee: " + currentHealthInsurance.getInsuranceFee() + " Start Date: " + currentHealthInsurance.getStartDate() + " End Date: " + currentHealthInsurance.getEndDate());
        System.out.print("\n3- Residence Insurance: ");
        if (currentResidenceInsurance.getInsuranceFee() == 0) {
            printAddInsuranceMessage();
        } else
            System.out.print(currentResidenceInsurance.getInsuranceName() + " Fee: " + currentResidenceInsurance.getInsuranceFee() + " Start Date: " + currentResidenceInsurance.getStartDate() + " End Date: " + currentResidenceInsurance.getEndDate());
        System.out.print("\n4- Travel Insurance: ");
        if (currentTravelInsurance.getInsuranceFee() == 0) {
            printAddInsuranceMessage();
        } else
            System.out.print(currentTravelInsurance.getInsuranceName() + " Fee: " + currentTravelInsurance.getInsuranceFee() + " Start Date: " + currentTravelInsurance.getStartDate() + " End Date: " + currentTravelInsurance.getEndDate());
        System.out.println("\nFor addresses visit Address Menu and for Insurances Insurance Menu");
        System.out.println();
    }

    public abstract TreeSet<Account> addInsurance(TreeSet<Account> accountSet, Account account);

    public abstract TreeSet<Account> deleteInsurance(TreeSet<Account> accountSet, Account account);

    public abstract ArrayList<Insurance> calculateInsuranceFee(ArrayList<Insurance> insuranceList);

    public void printAddInsuranceMessage() {
        System.out.print(" N/A ");
    }

    public void printAddAddressMessage() {
        System.out.print(" N/A ");
    }
}