package _241308.com.patikadev.View;

import _241308.com.patikadev.Helper.Config;
import _241308.com.patikadev.Helper.Helper;
import _241308.com.patikadev.Model.Content;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentQuizGUI extends JFrame{
    private JPanel wrapper;
    private JLabel label_student_quiz;
    private JTextField field_student_quiz_content_name;
    private JLabel label_student_quiz_answers;
    private JLabel label_student_quiz_quiz_questions;
    private JTextField field_student_quiz_answer;
    private JTextField field_student_quiz_quiz_questions;
    private JButton button_student_quiz_submit;
    private Content content;

    public StudentQuizGUI(Content content){
        this.content = content;
        add(wrapper);
        setSize(500,500);
        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        field_student_quiz_content_name.setText(content.getName());
        field_student_quiz_quiz_questions.setText(content.getQuiz_questions());

        button_student_quiz_submit.addActionListener(e -> {
            if(field_student_quiz_answer.getText().equalsIgnoreCase(content.getQuiz_questions())){
                Helper.showMessage("Congratulations!");
                dispose();
            }else {
                Helper.showMessage("Sorry You Failed Please Try Again");
                field_student_quiz_answer.setText(null);
            }});
    }
}
