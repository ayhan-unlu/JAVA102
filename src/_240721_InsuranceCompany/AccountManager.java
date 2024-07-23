package _240721_InsuranceCompany;

import java.util.TreeSet;

public class AccountManager implements Comparable {

    @Override
    public int compareTo(Object o1){
        return 0;
    } 

    

    public Account login(String email, String password,TreeSet<Account>list){

        try {

            for( Account a:list){
                return a;

                }            
        } catch (Exception e) {
            System.out.println("InvalidAuthenticationException");
            // TODO: handle exception
        }
        return null;


    }

}
