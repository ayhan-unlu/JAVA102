package _240729_ChatGPT_Insurance_Homework_notcomplete;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        

        // Örnek kullanıcılar oluşturuluyor
        User user1 = new User("John", "Doe", "john@example.com", "password123", "Engineer", 30);
        User user2 = new User("Jane", "Smith", "jane@example.com", "password456", "Doctor", 28);
        Individual individualAccount = new Individual(user1);
        Enterprise enterpriseAccount = new Enterprise(user2);

        accountManager.addAccount(individualAccount);
        accountManager.addAccount(enterpriseAccount);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Email: ");
        String email = scanner.nextLine();

        System.out.println("Password: ");
        String password = scanner.nextLine();

        Account loggedInAccount = accountManager.login(email, password);

        if (loggedInAccount != null) {
            System.out.println("Login successful!");
            loggedInAccount.showUserInfo();
        } else {
            System.out.println("Login failed!");
        }

        scanner.close();
    }
}
