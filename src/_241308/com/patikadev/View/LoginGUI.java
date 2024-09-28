package _241308.com.patikadev.View;

import _241308.com.patikadev.Helper.Config;
import _241308.com.patikadev.Helper.Helper;
import _241308.com.patikadev.Model.Operator;
import _241308.com.patikadev.Model.User;

import javax.swing.*;
import java.awt.event.*;

public class LoginGUI extends JFrame {
    private JPanel wrapper;
    private JPanel wrapper_top;
    private JPanel wrapper_buttom;
    private JLabel label_login_userlogin;
    private JTextField field_login_username;
    private JLabel label_login_username;
    private JLabel label_login_password;
    private JButton button_login;
    private JPasswordField field_login_password;
    private JLabel label_login_sign_up;
    private JTextField field_login_signup_username;
    private JTextField field_login_signup_password;
    private JButton button_login_signup;
    private JTextField field_login_signup_name;
    private JButton button_login_signup_menu;
    private JLabel label_login_signup_menu;

    public LoginGUI() {
        add(wrapper);
        setSize(400, 400);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
        button_login.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_login_username) || Helper.isFieldEmpty(field_login_password)) {
                Helper.showMessage("fill");
            } else {
//                User u=new User();
                User u = User.getFetch(field_login_username.getText(), field_login_password.getText());
                if (u == null) {
                    Helper.showMessage("The user does not exist or the password is incorrect!");
                } else {
//                    Helper.showMessage(u.getName());
                    switch (u.getType()) {
                        case "operator":
                            OperatorGUI operatorGUI = new OperatorGUI((Operator) u);
                            break;
                        case "educator":
                            EducatorGUI educatorGUI = new EducatorGUI(/*(Educator)u*/);
                            break;
                        case "student":
                            StudentGUI studentGUI = new StudentGUI();
                            break;
                    }
                    dispose();
                }
            }
        });
        button_login_signup_menu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                SignupGUI signupGUI = new SignupGUI();
            }
        });
    }

    public static void main(String[] args) {
        Helper.setLayout();
        LoginGUI loginGUI = new LoginGUI();
        User.addOperator("Mustafa Çetindağ","mustafa","1234","operator");
        User.addOperator("Mahmut Çetindağ","mahmut","1234","operator");
        User.addOperator("Mahmut Mustafa Çetindağ","mahmutmustafa","1234","operator");
        User.addOperator("Ayhan Unlu","ayhanunlu", "ayhanunlu","operator");
        User.addOperator("a","a", "a","operator");
    }
}