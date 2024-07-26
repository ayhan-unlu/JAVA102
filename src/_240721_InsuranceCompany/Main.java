package _240721_InsuranceCompany;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        System.out.println("   546");
        GetInput g = new GetInput();
        // TreeSet <Account> accountList = new TreeSet<>(new OrderByEmailComparator();)

        User u = new User(null, null, null, null, null, 0);
        User u5 = new User("k", "o", "t@d", "zf", "4", 5);
        User u2 = new User("h", "l", "p@d", "uf", "1", 2);
        User u4 = new User("j", "n", "s@d", "yf", "3", 4);
        User u1 = new User("a", "b", "c@d", "ef", "g", 1);
        User u3 = new User("i", "m", "r@d", "vf", "2", 3);
    
        TreeSet<User> list = new TreeSet<>(new OrderByEmailComparator());

        u.addUsersToList(list, u1);
        u.addUsersToList(list, u2);
        u.addUsersToList(list, u3);
        u.addUsersToList(list, u4);
        u.addUsersToList(list, u5);

        u.printUserList(list);

        AccountManager aManager = new AccountManager();
        aManager.login(g.getEmailInput(), g.getPasswordInput() , list );
        // HomeAddress homeaddress = new HomeAddress(null, null);
        // public static ArrayList<IAddress> addressList = new ArrayList<>();

        // homeaddress.printAddressList(addressList);

    }

}
