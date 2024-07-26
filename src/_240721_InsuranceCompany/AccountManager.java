package _240721_InsuranceCompany;

import java.util.TreeSet;

public class AccountManager implements Comparable {

    // TreeSet<Account> accountList= new TreeSet<>(new OrderByEmailComparator());

    @Override
    public int compareTo(Object o1) {
        return 0;
    }

    public Account login(String email, String password, TreeSet<User> list) {

        try {
            for (User u : list) {
                System.out.println(u.getEmail() + "  " + u.getPassword());
                if (email.equals(u.getEmail()) && password.equals(u.getPassword())) {
                    System.out.println("Login confirmed**********");
                }else{
                    System.out.println("Access Denied.");
                }
            }
        }

        catch (Exception e) {
            System.out.println("InvalidAuthenticationException");
            // TODO: handle exception
        }
        return null;

    }

}
