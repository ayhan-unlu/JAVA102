package Interface_230114;

import java.util.Scanner;

/**
 * MainBankSystem
 */
public class MainBankSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the withdraw amount : ");
        double withdrawAmount = scan.nextDouble();

        System.out.println("Please enter your card number : ");
        String cardNumber = scan.next();

        System.out.println("Please enter the expiration date of your card : ");
        String expirationDate = scan.next();

        System.out.println("Please enter your card CVC : ");
        String cvc = scan.next();

        System.out.println("Please choose your bank for withdrawal:");
        System.out.println("1. Bank A");
        System.out.println("2. Bank B");
        System.out.println("3. Bank C");

        int bankSelection = scan.nextInt();

        scan.close();

        switch (bankSelection){
            case 1:
            System.out.println("Bank A selected");
            BankA bankPosA = new BankA("Bank A", "A1234", "44112233Za+");
            bankPosA.connect("127.1.1.1");
            bankPosA.withdrawal(withdrawAmount, cardNumber, expirationDate, cvc);
            break;
            case 2:
            System.out.println("Bank B is selected");
            BankB bankPosB = new BankB("Bank B", "B115544", "88775544Pi,");
            bankPosB.connect("Str");
            bankPosB.withdrawal(500,"22325252"," 21/21","333");
            break;
            case 3:
            System.out.println("Bank C is selected");
            break;
            default:
            System.out.println("Please enter a valid number");
        }
    }
}