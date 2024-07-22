package _240721_InsuranceCompany;

import java.util.TreeSet;

public class AccountManager implements Comparable {

    @Override
    public int compareTo(Object o1){
        return 0;
    } 

    TreeSet <Account> list = new TreeSet<>();

    public void login(String email, String password){

        try {

            for( Account a:list){
                //    if(){}
                }            
        } catch (Exception e) {
            System.out.println("InvalidAuthenticationException");
            // TODO: handle exception
        }


    }

}
