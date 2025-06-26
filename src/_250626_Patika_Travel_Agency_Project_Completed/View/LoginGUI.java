package _250626_Patika_Travel_Agency_Project_Completed.View;

import _250626_Patika_Travel_Agency_Project_Completed.Helper.Config;
import _250626_Patika_Travel_Agency_Project_Completed.Helper.Helper;
import _250626_Patika_Travel_Agency_Project_Completed.Model.Admin;
import _250626_Patika_Travel_Agency_Project_Completed.Model.Staff;
import _250626_Patika_Travel_Agency_Project_Completed.Model.User;

import javax.swing.*;
import java.util.ArrayList;

public class LoginGUI extends JFrame{
    private JPanel wrapper;
    private JPanel wrapper_top;
    private JPanel wrapper_bottom;
    private JLabel label_icon_patika;
    private JLabel label_login_welcome_message;
    private JLabel label_login_user_login;
    private JTextField field_login_username;
    private JButton button_login;
    private JLabel label_login_username;
    private JLabel label_login_password;
    private JPasswordField field_login_password;

    public LoginGUI(){
        add(wrapper);
        setSize(400,400);
        setLocation(Helper.screenCenterPoint("x",getSize()), Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);

        field_login_username.setText("b");
        field_login_password.setText("b");
        button_login.addActionListener(e -> {

            ArrayList<JTextField> loginTextFieldList = new ArrayList<>();
            loginTextFieldList.add(field_login_username);
            loginTextFieldList.add(field_login_password);

            if(Helper.isAnyFieldEmpty(loginTextFieldList)){
                Helper.showMessage("fill");
            }else{
                User u = User.getFetch(field_login_username.getText(),field_login_password.getText());
                if (u == null){
                    Helper.showMessage("User not found");
                }else{
                    switch(u.getType()){
                        case "admin":
                            AdminGUI adminGUI = new AdminGUI((Admin)u);
                            break;
                        case "staff":
                            StaffGUI staffGUI = new StaffGUI((Staff)u);
                            break;

                    }
dispose();
          //          Helper.showMessage("Welcome "+u.getName());
                }
            }
            field_login_username.setText(null);
            field_login_password.setText(null);
        });
    }
}
