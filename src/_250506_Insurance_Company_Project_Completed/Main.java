package _250506_Insurance_Company_Project_Completed;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Account> accountSet = new TreeSet<>();// TreeSet for Accounts is created
        Menu menu = new Menu(accountSet); // Menu class is the UI
        AccountManager accountManager = new AccountManager(accountSet);//Account Manager is used to create presetAccounts and add new Account.

        accountManager.addPresetAccounts(accountSet);
        menu.runMainMenu(accountSet);
    }
}