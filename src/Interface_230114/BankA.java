package Interface_230114;

public class BankA {
    private String nameOfBank;
    private String terminalId;
    private String password;

    public BankA(String nameOfBank, String terminal_id, String password) {
        this.nameOfBank = nameOfBank;
        this.terminalId = terminal_id;
        this.password = password;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public void setNameOfBank(String nameOfBank){
        this.nameOfBank=nameOfBank;
    }

    public String getTerminal_id(){
        return terminalId;
    }

    public void setTerminal_id(String terminal_id){
        this.terminalId=terminal_id;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public void connect(){
        System.out.println("Got connected to the "+ this.getNameOfBank());
    }

    public void sendCardInfo(String cardNumber, String expirationDate, String cvc){
        System.out.println("The trasnaction is succesfull.");
    }

}
