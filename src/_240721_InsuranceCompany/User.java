package _240721_InsuranceCompany;

import java.util.ArrayList;
import java.util.Date;
import java.util.TreeSet;

public class User {

    private String usersName;
    private String surname;
    private String email;
    private String password;
    private String occupation;
    private int age;
    private ArrayList<IAddress> address;//??? need care
    private Date lastLoginDate;

    User(String usersName,String surname, String email,String password,String occupation, int age, ArrayList<IAddress> address, Date lastLoginDate){
        this.usersName=usersName;
        this.surname=surname;
        this.email=email;
        this.password=password;
        this.occupation=occupation;
        this.age=age;
        this.address=address;
        this.lastLoginDate=lastLoginDate;
    }

    public String getUsersName(){
        return this.usersName;
    }
    public void setUsersName(String usersName){
        this.usersName=usersName;
    }

    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public String getOccupation(){
        return this.occupation;
    }
    public void setOccupation(String occupation){
        this.occupation=occupation;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public ArrayList<IAddress> getAddress(){
        return address;
    }
    public void setAddress(ArrayList<IAddress> address){
        this.address=address;
    }

    public Date getLastLoginDate(){
        return lastLoginDate;
    }
    public void setLastLoginDate(Date lastLoginDate){
        this.lastLoginDate=lastLoginDate;
    }

    public void addUsersToList(TreeSet <User> list, User u){
        list.add(u);

        for (User ur:list){
System.out.println(ur.getUsersName()+" "+ur.getSurname());
        }
    }
    User u1=new User(null, null, null, null, null, 0, null, null);
    User u2=new User(null, null, null, null, null, 0, null, null);
    User u3=new User(null, null, null, null, null, 0, null, null);
    User u4=new User(null, null, null, null, null, 0, null, null);
    User u5=new User(null, null, null, null, null, 0, null, null);
    User u6=new User(null, null, null, null, null, 0, null, null);
    User u7=new User(null, null, null, null, null, 0, null, null);
    User u8=new User(null, null, null, null, null, 0, null, null);
    User u9=new User(null, null, null, null, null, 0, null, null);
    User u10=new User(null, null, null, null, null, 0, null, null);

    TreeSet<User> list = new TreeSet<>(new OrderByEmailComparator());
    User u = new User(null, null, null, null, null, 0, null, null);
    



}
