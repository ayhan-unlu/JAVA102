package _240729_ChatGPT_Insurance_Homework;
import java.util.TreeSet;

class AccountManager {
    private TreeSet<Account> accounts;

    public AccountManager() {
        this.accounts = new TreeSet<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account login(String email, String password) {
        for (Account account : accounts) {
            try {
                account.login(email, password);
                if (account.getLoginStatus() == AuthenticationStatus.SUCCESS) {
                    return account;
                }
            } catch (InvalidAuthenticationException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
}
