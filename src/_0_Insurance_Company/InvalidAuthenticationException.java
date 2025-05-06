package _0_Insurance_Company;


public class InvalidAuthenticationException extends Exception {
 /*   public InvalidAuthenticationException (String errorMessage){
        super(errorMessage);
        System.out.println(errorMessage);
    }
*/
    @Override
    public String getMessage(){
        return "Invalid Email address or Password";
    }
}
