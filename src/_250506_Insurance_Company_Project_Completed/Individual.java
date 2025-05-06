package _250506_Insurance_Company_Project_Completed;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Individual extends Account {
    int accountTypeMultiplier=1;
    public Individual(AuthenticationStatus authenticationStatus, User user, ArrayList<Insurance> insuranceList) {
        super(authenticationStatus, user, addPresetInsuranceList());
    }

    @Override
    public TreeSet<Account> addInsurance(TreeSet<Account> accountSet, Account account) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the insurance type you want to add\n1-Car Insurance\n2-Health Insurance\n3-Residence Insurance\n4-Travel Insurance");
        int input = scanner.nextInt();
        if (account.getInsuranceList() == null) {
        } else {
            switch (input) {
                case 1 -> {
                    account.getInsuranceList().getFirst().setInsuranceName("Individual Car Insurance");
                    account.getInsuranceList().getFirst().setInsuranceFee(1);
                    account.getInsuranceList().getFirst().setInsuranceFee(account.getInsuranceList().getFirst().calculate(account.getInsuranceList().getFirst().getInsuranceFee(),accountTypeMultiplier));
                }
                case 2 -> {
                    account.getInsuranceList().get(1).setInsuranceName("Individual Health Insurance");
                    account.getInsuranceList().get(1).setInsuranceFee(1);
                    account.getInsuranceList().get(1).setInsuranceFee(account.getInsuranceList().get(1).calculate(account.getInsuranceList().get(1).getInsuranceFee(),accountTypeMultiplier));
                }

                case 3 -> {
                    account.getInsuranceList().get(2).setInsuranceName("Individual Residence Insurance");
                    account.getInsuranceList().get(2).setInsuranceFee(2);
                    account.getInsuranceList().get(2).setInsuranceFee(account.getInsuranceList().get(2).calculate(account.getInsuranceList().get(2).getInsuranceFee(),accountTypeMultiplier));
                }

                case 4 -> {
                    account.getInsuranceList().get(3).setInsuranceName("Individual Travel Insurance");
                    account.getInsuranceList().get(3).setInsuranceFee(3);
                    account.getInsuranceList().get(3).setInsuranceFee(account.getInsuranceList().get(3).calculate(account.getInsuranceList().get(3).getInsuranceFee(),accountTypeMultiplier));
                }

            }
        }
        System.out.println("New "+account.getInsuranceList().get(input-1).getInsuranceName()+" is added");
        return accountSet;
    }

    @Override
    public TreeSet<Account> deleteInsurance(TreeSet<Account> accountSet, Account account) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the insurance type you want to delete\n1-Car Insurance\n2-Health Insurance\n3-Residence Insurance\n4-Travel Insurance\n");
        int input = scanner.nextInt();
        if (account.getInsuranceList() == null) {
        } else {
            switch (input) {
                case 1 -> {
                    account.getInsuranceList().getFirst().setInsuranceName("Preset Car Insurance");
                    account.getInsuranceList().getFirst().setInsuranceFee(0);
                }
                case 2 -> {
                    account.getInsuranceList().get(1).setInsuranceName("Preset Health Insurance");
                    account.getInsuranceList().get(1).setInsuranceFee(0);
                }

                case 3 -> {
                    account.getInsuranceList().get(2).setInsuranceName("Preset Residence Insurance");
                    account.getInsuranceList().get(2).setInsuranceFee(0);
                }

                case 4 -> {
                    account.getInsuranceList().get(3).setInsuranceName("Preset Travel Insurance");
                    account.getInsuranceList().get(3).setInsuranceFee(0);
                }

            }
        }
        System.out.println("Insurance deleted. Insurance name is converted to "+account.getInsuranceList().get(input-1).getInsuranceName());
        return accountSet;
    }

    @Override
    public ArrayList<Insurance> calculateInsuranceFee(ArrayList<Insurance> insuranceList) {
        if (insuranceList == null) {
        } else {
            insuranceList.getFirst().setInsuranceFee(1.0);
            insuranceList.get(1).setInsuranceFee(10);
            insuranceList.get(2).setInsuranceFee(100);
            insuranceList.getLast().setInsuranceFee(1000);
        }

        return insuranceList;
    }

}
