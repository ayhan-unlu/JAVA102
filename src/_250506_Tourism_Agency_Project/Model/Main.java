package _250506_Tourism_Agency_Project.Model;

import _250506_Tourism_Agency_Project.Helper.Helper;
import _250506_Tourism_Agency_Project.View.LoginGUI;

public class Main {
    public static void main(String[] args) {
        Helper.setLayout();
        if(User.getList().isEmpty()) {
            User.add("a", "a", "a", "a", "admin");
        }
        LoginGUI loginGUI = new LoginGUI();
         //Admin defaultAdmin = new Admin();
         //AdminGUI adminGUI = new AdminGUI(defaultAdmin);
    }
}