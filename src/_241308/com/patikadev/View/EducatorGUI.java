package _241308.com.patikadev.View;

import _241308.com.patikadev.Helper.Config;
import _241308.com.patikadev.Helper.Helper;
import _241308.com.patikadev.Model.Educator;

import javax.swing.*;

public class EducatorGUI extends JFrame {
    private JPanel wrapper;
    private JLabel label_educator_welcome;
    private JButton button_logout;
    private final Educator educator;

    public EducatorGUI(Educator educator) {
        //check point 5
        this.educator = educator;
        add(wrapper);
        setSize(400, 400);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        label_educator_welcome.setText("Welcome " + educator.getName());
        setVisible(true);
        button_logout.addActionListener(e -> {
            dispose();
            LoginGUI loginGUI = new LoginGUI();

        });
    }
}
