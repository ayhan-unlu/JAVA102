package _241308.com.patikadev.View;

import _241308.com.patikadev.Helper.Config;
import _241308.com.patikadev.Helper.Helper;
import _241308.com.patikadev.Model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupGUI extends JFrame {
    private JLabel label_signup_welcome;
    private JLabel label_signup_name;
    private JTextField field_signup_name;
    private JLabel label_signup_username;
    private JTextField field_signup_username;
    private JLabel label_signup_password;
    private JTextField field_signup_password;
    private JLabel label_signup_usertype;
    private JButton button_signup_add_student;
    private JPanel wrapper;

    public SignupGUI() {
        add(wrapper);
        setSize(400, 400);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setTitle(Config.PROJECT_TITLE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);

//        System.out.println("welcome to sign up Menu");
        button_signup_add_student.addActionListener(e -> {
            if(Helper.isFieldEmpty(field_signup_name)||Helper.isFieldEmpty(field_signup_username)||Helper.isFieldEmpty(field_signup_password)){
                Helper.showMessage("fill");
            }else{
                User.add(field_signup_name.getText(),field_signup_username.getText(),field_signup_password.getText(), "student");
                Helper.showMessage("New Student Added. Please Close this window and use User Login Section");
                dispose();
            }

        });
    }
}
