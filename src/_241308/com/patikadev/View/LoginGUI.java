package _241308.com.patikadev.View;

import _241308.com.patikadev.Helper.Config;
import _241308.com.patikadev.Helper.Helper;
import _241308.com.patikadev.Model.Operator;
import _241308.com.patikadev.Model.Student;
import _241308.com.patikadev.Model.User;

import javax.swing.*;

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
    private JLabel label_login_signup_username;
    private JLabel label_login_signup_password;
    private JButton button_login_signup;
    private JTextField field_login_signup_name;
    private JLabel label_login_signup_name;

    public LoginGUI() {
        add(wrapper);
        setSize(400, 550);
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
        button_login_signup.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_login_signup_name)||Helper.isFieldEmpty(field_login_signup_username) || Helper.isFieldEmpty(field_login_signup_password)) {
                Helper.showMessage("fill");
            }else{
                User.add(field_login_signup_name.getText(),field_login_signup_username.getText(),field_login_signup_password.getText(),"student");
                Helper.showMessage("New User added to the Database. Please close this window and Use User Login Section");
                field_login_signup_name.setText(null);
                field_login_signup_username.setText(null);
                field_login_signup_password.setText(null);
            }

        });
    }

    public static void main(String[] args) {
        Helper.setLayout();
        LoginGUI loginGUI = new LoginGUI();
//        Boolean op1=User.add("Mustafa Çetindağ","mustafa","1234","operator");
  //      Boolean op2=User.add("Mahmut Çetindağ","mahmut","1234","operator");
    //    Boolean op3=User.add("Mustafa Mahmut Çetindağ","mustafamahmut","1234","operator");

    }
}
