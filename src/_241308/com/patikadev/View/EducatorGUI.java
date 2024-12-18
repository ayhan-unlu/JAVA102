package _241308.com.patikadev.View;

import _241308.com.patikadev.Helper.Config;
import _241308.com.patikadev.Helper.Helper;
import _241308.com.patikadev.Model.Course;
import _241308.com.patikadev.Model.Educator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class EducatorGUI extends JFrame {
    private JPanel wrapper;
    private JPanel panel_top;
    private JLabel label_educator_welcome;
    private JButton button_logout;
    private JTabbedPane tab_educator;
    private JPanel panel_educator_course_list;
    private JScrollPane scroll_educator_course_list;
    private JTable table_educator_course_list;
    private final Educator educator;
    private DefaultTableModel model_educator_course_list;
    private Object[] row_educator_course_list;

    public EducatorGUI(Educator educator) {
        //check point 5
        this.educator = educator;
        add(wrapper);
        setSize(400, 400);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        label_educator_welcome.setText("Welcome Educator " + educator.getName());
        setVisible(true);

        //ModelEducatorCourseList

        model_educator_course_list = new DefaultTableModel();
        Object[] column_educator_course_list = {"Id", "Course Name", "Educator", "Path", "Language"};
        model_educator_course_list.setColumnIdentifiers(column_educator_course_list);

        //Manually adding a row
        // Object[] first_educator_course_row = {"1", "Path Clone", "Mustafa Çetindağ", "Java102", "Java"};
        //model_educator_course_list.addRow(first_educator_course_row);
        for (Course obj : Course.getListByUser(educator.getId())) {
            Object [] row = new Object[column_educator_course_list.length];
            row[0]=obj.getId();
            row[1]=obj.getName();
            row[2]=obj.getEducator().getName();
            row[3]=obj.getPath().getName();
            row[4]=obj.getLanguage();
            model_educator_course_list.addRow(row);
        }
        table_educator_course_list.setModel(model_educator_course_list);

        table_educator_course_list.getTableHeader().setReorderingAllowed(false);


        button_logout.addActionListener(e -> {
            dispose();
            LoginGUI loginGUI = new LoginGUI();

        });
    }
}
