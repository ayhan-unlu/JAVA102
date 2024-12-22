package _241308.com.patikadev.View;

import _241308.com.patikadev.Helper.Config;
import _241308.com.patikadev.Helper.Helper;
import _241308.com.patikadev.Model.Content;
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
    private JPanel panel_educator_content_list;
    private JScrollPane scroll_educator_content_list;
    private JTable table_educator_content_list;
    private JPanel panel_educator_content_add;
    private JTextField field_educator_content_add_name;
    private JLabel label_educator_content_add_name;
    private JLabel label_educator_content_add_info;
    private JTextField field_educator_content_add_info;
    private JLabel label_educator_content_add_youtube_link;
    private JTextField field_educator_content_add_youtube_link;
    private JLabel label_educator_content_add_quiz_questions;
    private JTextField field_educator_content_add_quiz_questions;
    private JLabel label_educator_content_add_course_id;
    private JComboBox combobox_educator_content_add_course_id;
    private JButton button_educator_content_add;
    private final Educator educator;
    private DefaultTableModel model_educator_course_list;
    private Object[] row_educator_course_list;
    private DefaultTableModel model_educator_content_list;
    private Object[] row_educator_content_list;

    public EducatorGUI(Educator educator) {
        //check point 5
        this.educator = educator;
        add(wrapper);
        setSize(1000, 500);
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
            Object[] row = new Object[column_educator_course_list.length];
            row[0] = obj.getId();
            row[1] = obj.getName();
            row[2] = obj.getEducator().getName();
            row[3] = obj.getPath().getName();
            row[4] = obj.getLanguage();
            model_educator_course_list.addRow(row);
        }

        table_educator_course_list.setModel(model_educator_course_list);

        table_educator_course_list.getTableHeader().setReorderingAllowed(false);
        table_educator_course_list.getColumnModel().getColumn(0).setMaxWidth(30);

        //##ModelEducatorCourseList

        //ModelEducatorContentList
        model_educator_content_list = new DefaultTableModel();
        Object [] column_educator_content_list={"id","name","info","youtube_link","quiz_questions","course_id"};
        model_educator_content_list.setColumnIdentifiers(column_educator_content_list);
        row_educator_content_list = new Object[column_educator_content_list.length];

        loadContentList();
        table_educator_content_list.setModel(model_educator_content_list);
        table_educator_content_list.getColumnModel().getColumn(0).setMaxWidth(75);
        table_educator_content_list.getTableHeader().setReorderingAllowed(false);



        //##ModelEducatorContentList


        button_logout.addActionListener(e -> {
            dispose();
            LoginGUI loginGUI = new LoginGUI();

        });
        button_educator_content_add.addActionListener(e -> {
            if(Helper.isFieldEmpty(field_educator_content_add_name)||Helper.isFieldEmpty(field_educator_content_add_info)||Helper.isFieldEmpty(field_educator_content_add_info)||Helper.isFieldEmpty(field_educator_content_add_youtube_link)||Helper.isFieldEmpty(field_educator_content_add_quiz_questions)){
                Helper.showMessage("fill");
            }

        });
    }

    private void loadContentList() {

        DefaultTableModel clearModel= (DefaultTableModel)table_educator_content_list.getModel();
        clearModel.setRowCount(0);
        int i=0;

        for(Content obj: Content.getList()){
            i=0;
            row_educator_content_list[i++]=obj.getId();
            row_educator_content_list[i++]=obj.getName();
            row_educator_content_list[i++]=obj.getInfo();
            row_educator_content_list[i++]=obj.getYoutube_link();
            row_educator_content_list[i++]=obj.getQuiz_questions();
            row_educator_content_list[i++]=obj.getCourse().getId();
            model_educator_content_list.addRow(row_educator_content_list);
        }
    }
}
