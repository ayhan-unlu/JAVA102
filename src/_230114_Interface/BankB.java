package _230114_Interface;

public class BankB implements IBank{
    private String nameOfBank;
    private String terminalId;
    private String password;

    public BankB(String nameOfBank, String terminalId, String password) {
        this.nameOfBank = nameOfBank;
        this.terminalId = terminalId;
        this.password = password;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Got connected to the "+ this.getNameOfBank());
        return false;
    }

    @Override
    public boolean withdrawal(double withdrawAmount, String cardNumber, String expirationDate, String cvc) {
        System.out.println("Waiting for the bank to respond...");
        System.out.println("The transaction is succesfull.");
        return false;
    }


}
