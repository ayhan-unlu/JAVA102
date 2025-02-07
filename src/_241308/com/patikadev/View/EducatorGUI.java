package _241308.com.patikadev.View;

import _241308.com.patikadev.Helper.Config;
import _241308.com.patikadev.Helper.Helper;
import _241308.com.patikadev.Helper.Item;
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
    private JLabel label_educator_content_add_course_name;
    private JComboBox combobox_educator_content_add_course_name;
    private JButton button_educator_content_add;
    private JTextField field_educator_content_update_name;
    private JLabel label_educator_content_update_name;
    private JTextField field_educator_content_update_info;
    private JTextField field_educator_content_update_youtube_link;
    private JTextField field_educator_content_update_quiz_questions;
    private JButton button_educator_content_update;
    private JComboBox combobox_educator_content_update_course_name;
    private JLabel label_educator_content_update_course_name;
    private JLabel label_educator_content_update_quiz_questions;
    private JLabel label_educator_content_update_youtube_link;
    private JLabel label_educator_content_update_info;
    private JTextField field_educator_content_update_content_id;
    private JLabel label_educator_content_update_content_id;
    private JLabel label_educator_content_delete_content_id;
    private JTextField field_educator_content_delete_content_id;
    private JButton button_educator_content_delete;
    private JComboBox combobox_educator_content_search_content_name;
    private JComboBox combobox_educator_content_search_course_name;
    private JButton button_educator_content_search;
    private JLabel label_educator_content_search_content_name;
    private JLabel label_educator_content_search_course_name;
    private final Educator educator;
    private DefaultTableModel model_educator_course_list;
    private Object[] row_educator_course_list;
    private DefaultTableModel model_educator_content_list;
    private Object[] row_educator_content_list;

    public EducatorGUI(Educator educator) {
        //check point 5
        this.educator = educator;
        add(wrapper);
        setSize(1000, 700);
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
        Object[] column_educator_content_list = {"id", "name", "info", "youtube_link", "quiz_questions", "course_name"};
        model_educator_content_list.setColumnIdentifiers(column_educator_content_list);
        row_educator_content_list = new Object[column_educator_content_list.length];

        loadContentModel();
        table_educator_content_list.setModel(model_educator_content_list);
        table_educator_content_list.getColumnModel().getColumn(0).setMaxWidth(75);
        table_educator_content_list.getTableHeader().setReorderingAllowed(false);
        loadContentAddCourseNameCombobox(educator);
        loadContentUpdateCourseNameCombobox(educator);
        loadContentSearchContentNameCombobox(educator);
        loadContentSearchCourseNameCombobox(educator);

        table_educator_content_list.getSelectionModel().addListSelectionListener(e -> {
            //Item contentCourseNameItem=(Item) combobox_educator_content_update_course_name.getSelectedItem();
            try {//System.out.println("Item Selected");
                int selected_content_id = Integer.parseInt(table_educator_content_list.getValueAt(table_educator_content_list.getSelectedRow(), 0).toString());

                //System.out.println(selected_content_id);
                field_educator_content_update_content_id.setText(String.valueOf(selected_content_id));
                field_educator_content_delete_content_id.setText(String.valueOf(selected_content_id));
                for (Content c : Content.getList()) {
                    int int_selected_content_id = Integer.parseInt(field_educator_content_update_content_id.getText());
                    System.out.println(selected_content_id);
                    if (c.getId() == int_selected_content_id) {
                        field_educator_content_update_name.setText(c.getName());
                        field_educator_content_update_info.setText(c.getInfo());
                        field_educator_content_update_youtube_link.setText(c.getYoutube_link());
                        field_educator_content_update_quiz_questions.setText(c.getQuiz_questions());
                    }
                }
            } catch (Exception exception) {
            }
        });

        /*combobox_educator_content_add_course_id.addItem(new Item(1,"1. Item"));
        combobox_educator_content_add_course_id.addItem(new Item(2,"2. Item"));
        combobox_educator_content_add_course_id.addItem(new Item(3,"3.Item"));
        */

        //##ModelEducatorContentList

        button_logout.addActionListener(e -> {
            dispose();
            LoginGUI loginGUI = new LoginGUI();
        });

        button_educator_content_add.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_educator_content_add_name) || Helper.isFieldEmpty(field_educator_content_add_info) || Helper.isFieldEmpty(field_educator_content_add_info) || Helper.isFieldEmpty(field_educator_content_add_youtube_link) || Helper.isFieldEmpty(field_educator_content_add_quiz_questions)) {
                Helper.showMessage("fill");
            }
        });

        button_educator_content_add.addActionListener(e -> {
            Item contentCourseNameItem = (Item) combobox_educator_content_add_course_name.getSelectedItem();
            if (Helper.isFieldEmpty(field_educator_content_add_name) || Helper.isFieldEmpty(field_educator_content_add_info) || Helper.isFieldEmpty(field_educator_content_add_youtube_link) || Helper.isFieldEmpty(field_educator_content_add_quiz_questions)) {
                Helper.showMessage("fill");
            } else {
                if (Content.add(field_educator_content_add_name.getText(), field_educator_content_add_info.getText(), field_educator_content_add_youtube_link.getText(), field_educator_content_add_quiz_questions.getText(), contentCourseNameItem.getValue())) {
                    Helper.showMessage("success");
                    loadContentModel();
                    field_educator_content_add_name.setText(null);
                    field_educator_content_add_info.setText(null);
                    field_educator_content_add_youtube_link.setText(null);
                    field_educator_content_add_quiz_questions.setText(null);
                } else {
                    Helper.showMessage("error");
                }
            }
        });

        button_educator_content_update.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_educator_content_update_name) || Helper.isFieldEmpty(field_educator_content_update_info) || Helper.isFieldEmpty(field_educator_content_update_youtube_link) || Helper.isFieldEmpty(field_educator_content_update_quiz_questions)) {
                Helper.showMessage("fill");
            } else {
                int selected_content_id = Integer.parseInt(table_educator_content_list.getValueAt(table_educator_content_list.getSelectedRow(), 0).toString());
                System.out.println(selected_content_id);
                field_educator_content_update_content_id.setText(String.valueOf(selected_content_id));
                if (Content.update(selected_content_id, field_educator_content_update_name.getText(), field_educator_content_update_info.getText(), field_educator_content_update_youtube_link.getText(), field_educator_content_update_quiz_questions.getText(), combobox_educator_content_update_course_name.getSelectedItem().toString())) {
                    Helper.showMessage("success");
                    loadContentModel();
                    field_educator_content_update_content_id.setText(null);
                    field_educator_content_update_name.setText(null);
                    field_educator_content_update_info.setText(null);
                    field_educator_content_update_youtube_link.setText(null);
                    field_educator_content_update_quiz_questions.setText(null);
                    field_educator_content_delete_content_id.setText(null);
                } else {
                    Helper.showMessage("error");
                }
            }
        });

        button_educator_content_delete.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_educator_content_delete_content_id)) {
                Helper.showMessage("fill");
            } else {
                if (Helper.confirm("sure")) {
                    int selected_content_id = Integer.parseInt(table_educator_content_list.getValueAt(table_educator_content_list.getSelectedRow(), 0).toString());
                    field_educator_content_delete_content_id.setText(String.valueOf(selected_content_id));
                    if (Content.delete(selected_content_id)) {
                        Helper.showMessage("success");
                        loadContentModel();
                        field_educator_content_delete_content_id.setText(null);
                    } else {
                        Helper.showMessage("error");
                    }
                }
            }
        });
    }

    private void loadContentModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_educator_content_list.getModel();
        clearModel.setRowCount(0);
        int i = 0;

        for (Content obj : Content.getList()) {
            i = 0;
            row_educator_content_list[i++] = obj.getId();
            row_educator_content_list[i++] = obj.getName();
            row_educator_content_list[i++] = obj.getInfo();
            row_educator_content_list[i++] = obj.getYoutube_link();
            row_educator_content_list[i++] = obj.getQuiz_questions();
            row_educator_content_list[i++] = obj.getCourse().getName();
            model_educator_content_list.addRow(row_educator_content_list);
        }
    }

    public void loadContentAddCourseNameCombobox(Educator educator) {
        combobox_educator_content_add_course_name.removeAllItems();
        for (Course obj : Course.getListByUser(educator.getId())) {
            combobox_educator_content_add_course_name.addItem(new Item(obj.getId(), obj.getName()));
        }
    }

    public void loadContentUpdateCourseNameCombobox(Educator educator) {
        combobox_educator_content_update_course_name.removeAllItems();
        for (Course obj : Course.getListByUser(educator.getId())) {
            combobox_educator_content_update_course_name.addItem(new Item(obj.getId(), obj.getName()));
        }
    }

    public void loadContentSearchContentNameCombobox(Educator educator){
        combobox_educator_content_search_content_name.removeAllItems();
        for(Content c: Content.getList()){
            combobox_educator_content_search_content_name.addItem(new Item(c.getId(),c.getName()));
        }
    }

    public void loadContentSearchCourseNameCombobox(Educator educator){
        combobox_educator_content_search_course_name.removeAllItems();

        for(Course obj:Course.getListByUser(educator.getId())){
            combobox_educator_content_search_course_name.addItem(new Item(obj.getId(),obj.getName()));
        }
    }
}
