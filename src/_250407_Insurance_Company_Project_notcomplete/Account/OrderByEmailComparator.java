package _250407_Insurance_Company_Project_notcomplete.Account;

import java.util.Comparator;

public class OrderByEmailComparator implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2){
        return(o1.getUser().getEmail().compareTo(o2.getUser().getEmail()));
    }
}
