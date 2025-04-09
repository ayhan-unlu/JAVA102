package _250407_Insurance_Company_Project.Account;

public enum AuthenticationStatus {
    SUCCESS(1),FAIL(2);

    private final int authenticationStatusNumber;
    AuthenticationStatus(int authenticationStatusNumber){
        this.authenticationStatusNumber = authenticationStatusNumber;
    }

    public int getAuthenticationStatusNumber(){
        return this.authenticationStatusNumber;
    }


}
