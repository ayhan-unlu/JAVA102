package _241308.com.patikadev.View;

import _241308.com.patikadev.Helper.Config;
import _241308.com.patikadev.Helper.Helper;
import _241308.com.patikadev.Model.Course;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EducatorGUI extends JFrame{
    private JPanel wrapper;
    private JLabel label_educator_welcome;
    private JButton button_educator_logout;
    private JScrollPane scroll_educator_course_list;
    private JTable table_educator_course_list;
    private DefaultTableModel model_educator_course_list;
    private Object [] row_educator_course_list;

    public EducatorGUI(){
        add(wrapper);
        setSize(400,400);
        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
        button_educator_logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginGUI loginGUI=new LoginGUI();
            }
        });

        model_educator_course_list= new DefaultTableModel();
        Object[]column_educator_course_list={"ID","Course Name","Educator","Path","Language"};
        model_educator_course_list.setColumnIdentifiers(column_educator_course_list);
        row_educator_course_list=new Object[column_educator_course_list.length];
        loadCourseModel();
        table_educator_course_list.setModel(model_educator_course_list);
        table_educator_course_list.getColumnModel().getColumn(0).setMaxWidth(75);
        table_educator_course_list.getTableHeader().setReorderingAllowed(false);


    }

    private void loadCourseModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_educator_course_list.getModel();
        clearModel.setRowCount(0);

        int i = 0;
        for (Course obj : Course.getList()) {
            i = 0;
            row_educator_course_list[i++] = obj.getId();
            row_educator_course_list[i++] = obj.getName();
            row_educator_course_list[i++] = obj.getEducator().getName();
            row_educator_course_list[i++] = obj.getPath().getName();
            row_educator_course_list[i++] = obj.getLanguage();
            model_educator_course_list.addRow(row_educator_course_list);

        }

    }

}
