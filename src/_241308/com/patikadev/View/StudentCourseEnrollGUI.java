package _241308.com.patikadev.View;

import _241308.com.patikadev.Helper.Config;
import _241308.com.patikadev.Helper.Helper;
import _241308.com.patikadev.Model.Content;
import _241308.com.patikadev.Model.Course;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentCourseEnrollGUI extends JFrame{
    private JPanel wrapper;
    private JLabel label_student_course_enroll_course_name;
    private JTextField field_student_course_enroll_course_name;
    private JLabel label_student_course_enroll_content_list;
    private JScrollPane scroll_student_course_enroll_content_list;
    private JTable table_student_course_enroll_content_list;
    private JButton button_student_course_enroll_take_quiz;
    private JButton button_student_course_enroll_rate_content;
    private JButton button_student_course_enroll_leave_comment;
    private DefaultTableModel model_student_course_enroll_content_list;
    private Object[] row_student_course_enroll_content_list;
    private Course course;
    private Content content;

    public StudentCourseEnrollGUI(Course course){
        this.course=course;
        add(wrapper);
        setSize(500,500);
        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        field_student_course_enroll_course_name.setText(course.getName());

        //Model Student Course Enroll Content List

        model_student_course_enroll_content_list=new DefaultTableModel();
        Object [] column_student_course_enroll_content_list={"id","name","info","youtube_link","quiz_questions","course_name"};
        model_student_course_enroll_content_list.setColumnIdentifiers(column_student_course_enroll_content_list);
        row_student_course_enroll_content_list=new Object[column_student_course_enroll_content_list.length];
        loadStudentCourseEnrollModel(course);
        table_student_course_enroll_content_list.setModel(model_student_course_enroll_content_list);

        //##Model Student Course Enroll Content List
        scroll_student_course_enroll_content_list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Point point = e.getPoint();
                int selected_row=table_student_course_enroll_content_list.rowAtPoint(point);
                table_student_course_enroll_content_list.setRowSelectionInterval(selected_row,selected_row);
            }
        });
        button_student_course_enroll_take_quiz.addActionListener(e -> {
            int selected_content_id = Integer.parseInt(table_student_course_enroll_content_list.getValueAt(table_student_course_enroll_content_list.getSelectedRow(),0).toString());
            System.out.println(selected_content_id);
            StudentQuizGUI studentQuizGUI = new StudentQuizGUI(Content.getFetch(selected_content_id));

        });
        button_student_course_enroll_rate_content.addActionListener(e -> {
            int selected_content_id = Integer.parseInt(table_student_course_enroll_content_list.getValueAt(table_student_course_enroll_content_list.getSelectedRow(),0).toString());
            StudentRateContentGUI studentRateContentGUI = new StudentRateContentGUI(Content.getFetch(selected_content_id));

        });
        button_student_course_enroll_leave_comment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selected_content_id = Integer.parseInt(table_student_course_enroll_content_list.getValueAt(table_student_course_enroll_content_list.getSelectedRow(),0).toString());
                StudentCommentContentGUI studentCommentContentGUI = new StudentCommentContentGUI(Content.getFetch(selected_content_id));
            }
        });
    }

    private void loadStudentCourseEnrollModel(Course course){
        DefaultTableModel clearModel= (DefaultTableModel)table_student_course_enroll_content_list.getModel();
        clearModel.setRowCount(0);

        int i;
        for(Content obj:Content.getListByCourse(course)){
            i=0;
            row_student_course_enroll_content_list[i++]=obj.getId();
            row_student_course_enroll_content_list[i++]=obj.getName();
            row_student_course_enroll_content_list[i++]=obj.getInfo();
            row_student_course_enroll_content_list[i++]=obj.getYoutube_link();
            row_student_course_enroll_content_list[i++]=obj.getQuiz_questions();
            row_student_course_enroll_content_list[i++]=obj.getCourse_name();
            model_student_course_enroll_content_list.addRow(row_student_course_enroll_content_list);
        }
    }
    }


