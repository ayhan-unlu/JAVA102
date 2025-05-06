package _250407_Insurance_Company_Project.Account;


public class InvalidAuthenticationException extends Exception {
/*    public InvalidAuthenticationException (String errorMessage){
        super(errorMessage);
        System.out.println(errorMessage);
    }*/

    @Override
    public String getMessage(){
        return "Invalid Email address or Password";
    }
}
