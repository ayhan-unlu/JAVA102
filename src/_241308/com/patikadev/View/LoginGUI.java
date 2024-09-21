package _241308.com.patikadev.View;

import _241308.com.patikadev.Helper.Config;
import _241308.com.patikadev.Helper.Helper;

import javax.swing.*;

public class LoginGUI extends JFrame{
    private JPanel wrapper;
    private JPanel wrapper_top;
    private JPanel wrapper_buttom;
    private JLabel label_login_userlogin;
    private JTextField field_login_username;
    private JLabel label_login_username;
    private JLabel label_login_password;
    private JButton button_login;
    private JPasswordField field_login_password;

    public LoginGUI(){
        add(wrapper);
        setSize(400,400);
        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        Helper.setLayout();
        LoginGUI loginGUI=new LoginGUI();
    }
}
