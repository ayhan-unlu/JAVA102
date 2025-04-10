package _250407_Insurance_Company_Project;

import _250407_Insurance_Company_Project.Account.Account;
import _250407_Insurance_Company_Project.Account.AccountManager;
import _250407_Insurance_Company_Project.Account.InputScanner;
import _250407_Insurance_Company_Project.Account.InvalidAuthenticationException;

public class Main {
    public static void main(String[] args) {


        InputScanner inputScanner = new InputScanner();
        AccountManager accountManager = new AccountManager();
        accountManager.login(inputScanner.scanLoginInfo());

    }
}
