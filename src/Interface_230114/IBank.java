package Interface_230114;

public interface IBank {
    
    final String hostIpAddress="127.0.0.1";

    boolean connect (String ipAddress);
    
    boolean withdrawal(double withdrawAmount, String cardNumber, String expirationDate, String cvc);
     
}
