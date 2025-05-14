package _250506_Tourism_Agency_Project.View;

import _250506_Tourism_Agency_Project.Helper.Config;
import _250506_Tourism_Agency_Project.Helper.Helper;
import _250506_Tourism_Agency_Project.Model.Staff;

import javax.swing.*;

public class StaffGUI extends JFrame{
    private JPanel wrapper;
    private JLabel label_staff_welcome;

    public StaffGUI(Staff staff){
        add(wrapper);
        setSize(2000,2000);
        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(true);
        setVisible(true);
    }
}
