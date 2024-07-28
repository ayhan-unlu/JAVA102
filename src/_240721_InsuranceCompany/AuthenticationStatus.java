package _240721_InsuranceCompany;

public enum AuthenticationStatus {

    SUCCESS(1), 
    FAIL(2);

    private int authenticationStatus;

    AuthenticationStatus(int authenticationStatus){
        this.authenticationStatus=authenticationStatus;
    }

    public int getAuthenticationStatus(){
        return authenticationStatus;
    }

    public void setAuthenticationStatus(int authenticationStatus){
        this.authenticationStatus=authenticationStatus;
    }

/*   public AuthenticationStatus returnAuthenticationStatus(int authenticationStatus){
        if( authenticationStatus==1){
            return SUCCESS;
        }else{return FAIL;}
    }
 */ 

}