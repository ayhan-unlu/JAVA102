package _241308.com.patikadev.View;

import _241308.com.patikadev.Helper.Config;
import _241308.com.patikadev.Helper.Helper;
import _241308.com.patikadev.Model.Content;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRateContentGUI extends JFrame{
    private JPanel wrapper;
    private JLabel label_student_rate_content;
    private JTextField field_student_rate_content_content_name;
    private JTextField field_student_rate_content_rating;
    private JLabel label_student_rate_content_instruction;
    private JButton button_student_rate_content_submit;
    private Content content;

    public StudentRateContentGUI (Content content){
        this.content = content;
        add(wrapper);
        setSize(300,300);
        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        field_student_rate_content_content_name.setText(content.getName());

        button_student_rate_content_submit.addActionListener(e -> {
            Helper.showMessage("Thank You For Your Rating");
            dispose();
        });
    }
}
