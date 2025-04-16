package _241308.com.patikadev.View;

import _241308.com.patikadev.Helper.Config;
import _241308.com.patikadev.Helper.Helper;
import _241308.com.patikadev.Model.Content;
import _241308.com.patikadev.Model.Course;
import _241308.com.patikadev.Model.Path;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentPathJoinGUI extends JFrame {
    private JPanel wrapper;
    private JLabel label_student_join_path_name;
    private JTextField field_student_join_path_name;
    private JButton button_student_join_path;
    private JLabel label_student_join_course_list;
    private JTable table_student_join_course_list;
    private JScrollPane scroll_student_join_course;
    private DefaultTableModel model_student_join_course_list;
    private Object[] row_student_join_course_list;
    private Path path;


    public StudentPathJoinGUI(Path path) {
        this.path = path;
        add(wrapper);
        setSize(500, 500);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        field_student_join_path_name.setText(path.getName());

        //Model Student Join Course List
        model_student_join_course_list= new DefaultTableModel();
        Object [] column_student_join_course_list={"Id", "User Id", "Path Id", "Course Name", "Language"};
        model_student_join_course_list.setColumnIdentifiers(column_student_join_course_list);
        row_student_join_course_list=new Object[column_student_join_course_list.length];
        loadStudentJoinCourseModel(path.getId());
        table_student_join_course_list.setModel(model_student_join_course_list);


        button_student_join_path.addActionListener(e -> {
            int selected_course_id = (Course.getFetch((table_student_join_course_list.getValueAt(table_student_join_course_list.getSelectedRow(),3).toString()))).getId();
            System.out.println(selected_course_id);
            System.out.println(Course.getFetch(selected_course_id).getName());
            StudentCourseEnrollGUI studentCourseEnrollGUI = new StudentCourseEnrollGUI(Course.getFetch(selected_course_id));

        });
    }
    private void loadStudentJoinCourseModel(int path_id){
        DefaultTableModel clearModel = (DefaultTableModel) table_student_join_course_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Course obj:Course.getListByPath(path_id)){
            i=0;
            row_student_join_course_list[i++]=obj.getId();
            row_student_join_course_list[i++]=obj.getUser_id();
            row_student_join_course_list[i++]=obj.getPath_id();
            row_student_join_course_list[i++]=obj.getName();
            row_student_join_course_list[i++]=obj.getLanguage();
            model_student_join_course_list.addRow(row_student_join_course_list);

        }
    }

    public static void main(String[] args) {
        Path p = new Path(1, "front end");
        StudentPathJoinGUI studentjoin = new StudentPathJoinGUI(p);
    }
}
