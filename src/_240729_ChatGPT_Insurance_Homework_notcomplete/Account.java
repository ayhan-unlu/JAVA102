package _240729_ChatGPT_Insurance_Homework_notcomplete;

import java.util.ArrayList;
import java.util.Date;


enum AuthenticationStatus {
    SUCCESS, FAIL
}

abstract class Account implements Comparable<Account> {
    private User user;
    private ArrayList<Insurance> insurances;
    private AuthenticationStatus loginStatus;

    public Account(User user) {
        this.user = user;
        this.insurances = new ArrayList<>();
        this.loginStatus = AuthenticationStatus.FAIL;
    }

    public void showUserInfo() {
        System.out.println("User Information:");
        System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Profession: " + user.getProfession());
        System.out.println("Age: " + user.getAge());
        System.out.println("Addresses: ");
        for (Address address : user.getAddressList()) {
            System.out.println(address.getAddressDetails());
        }
    }

    public AuthenticationStatus getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(AuthenticationStatus loginStatus) {
        this.loginStatus = loginStatus;
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            this.loginStatus = AuthenticationStatus.SUCCESS;
            user.setLastLoginDate(new Date());
        } else {
            throw new InvalidAuthenticationException("Invalid email or password.");
        }
    }

    public void addAddress(Address address) {
        user.addAddress(address);
    }

    public void removeAddress(Address address) {
        user.removeAddress(address);
    }

    public abstract void addInsurance(Insurance insurance);

    @Override
    public int compareTo(Account other) {
        return this.user.getEmail().compareTo(other.user.getEmail());
    }

    @Override
    public int hashCode() {
        return user.getEmail().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return user.getEmail().equals(account.user.getEmail());
    }
}

class Individual extends Account {
    public Individual(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        // Bireysel müşteriler için sigorta ekleme mantığı
    }
}

class Enterprise extends Account {
    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        // Kurumsal müşteriler için sigorta ekleme mantığı
    }
}
