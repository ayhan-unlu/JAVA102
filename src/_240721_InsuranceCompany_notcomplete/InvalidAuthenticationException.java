package _240721_InsuranceCompany_notcomplete;

public class InvalidAuthenticationException extends Throwable{

    public InvalidAuthenticationException(String msg){
        super(msg);
        System.out.println("Invalid email or password");
    }

}
