package _250506_Insurance_Company_Project_Completed;

public class InvalidAuthenticationException extends Exception {
    public InvalidAuthenticationException() {
        System.out.println(" Email/Password is/are not Correct. Logging in is not authorized");
    }

    @Override
    public String getMessage() {
        return " Email";
    }
}
