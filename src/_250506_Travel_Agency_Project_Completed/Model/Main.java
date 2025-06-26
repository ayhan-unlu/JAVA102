package _250506_Travel_Agency_Project_Completed.Model;

import _250506_Travel_Agency_Project_Completed.Helper.Helper;
import _250506_Travel_Agency_Project_Completed.View.LoginGUI;

public class Main {
    public static void main(String[] args) {
        Helper.setLayout();
        if(User.getList().isEmpty()) {
            User.add("a", "a", "a", "a", "admin");
        }
        LoginGUI loginGUI = new LoginGUI();
    }
}