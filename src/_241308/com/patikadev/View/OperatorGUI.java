package _241308.com.patikadev.View;

//import _241308.com.patikadev.Helper.Config;

import _241308.com.patikadev.Helper.*;
import _241308.com.patikadev.Model.*;
//import _241308.com.patikadev.Helper.Helper;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class OperatorGUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane tab_operator;
    private JPanel panel_top;
    private JButton button_logout;
    private JPanel panel_user_list;
    private JLabel label_welcome;
    private JScrollPane scroll_userlist;
    private JTable table_user_list;
    private JPanel panel_user_form;
    private JTextField field_user_name;
    private JTextField field_user_username;
    private JLabel username;
    private JLabel Password;
    private JTextField field_user_password;
    private JLabel field_user_type;
    private JComboBox combobox_user_type;
    private JButton button_user_add;
    private JTextField field_user_id;
    private JButton button_user_delete;
    private JTextField field_search_user_name;
    private JTextField field_search_user_username;
    private JLabel label_search_user_username;
    private JLabel label_search_user_name;
    private JLabel label_combobox_search_user_type;
    private JComboBox combobox_search_user_type;
    private JButton button_user_search;
    private JPanel panel_path_list;
    private JScrollPane scroll_path_list;
    private JTable table_path_list;
    private JPanel panel_path_add;
    private JLabel label_path_name;
    private JTextField field_path_name;
    private JButton button_path_add;
    private JPanel panel_course_list;
    private JScrollPane scroll_course_list;
    private JTable table_course_list;
    private JPanel panel_course_add;
    private JTextField field_course_add_course_name;
    private JLabel label_course_add_course_name;
    private JTextField field_course_add_language;
    private JLabel label_course_add_language;
    private JComboBox combobox_course_add_path;
    private JLabel label_course_add_path;
    private JLabel label_course_add_educator;
    private JComboBox combobox_course_add_educator;
    private JButton button_course_add;
    private JLabel panel_course_update;
    private JTextField field_course_update_course_name;
    private JLabel label_course_update_language;
    private JTextField field_course_update_language;
    private JLabel label_course_update_educator;
    private JComboBox combobox_course_update_educator;
    private JLabel label_course_update_path;
    private JComboBox combobox_course_update_path;
    private JButton button_course_update;
    private JTextField field_course_update_course_id;
    private JLabel label_course_update_course_id;
    private JButton button_course_delete;
    private JLabel label_course_delete_course_id;
    private JTextField field_course_delete_course_id;
    private JPanel panel_content_list;
    private JLabel label_operator_content_list_content_name;
    private JLabel label_operator_content_list_course_name;
    private JComboBox combobox_operator_content_search_content_name;
    private JComboBox combobox_operator_content_search_course_name;
    private JButton button_operator_content_search;
    private JScrollPane scroll_operator_content_list;
    private JTable table_operator_content_list;
    private JPanel panel_operator_content_add;
    private JTextField field_operator_content_add_content_name;
    private JTextField field_operator_content_add_info;
    private JTextField field_operator_content_add_youtube_link;
    private JTextField field_operator_content_add_quiz_questions;
    private JButton button_operator_content_add;
    private JTextField field_operator_content_update_content_name;
    private JTextField field_operator_content_update_info;
    private JTextField field_operator_content_update_youtube_link;
    private JTextField field_operator_content_update_quiz_questions;
    private JTextField field_operator_content_update_content_id;
    private JButton button_operator_content_update;
    private JTextField field_operator_content_delete_content_id;
    private JButton button_operator_content_delete;
    private JLabel label_operator_content_add_content_name;
    private JLabel label_operator_content_update_content_name;
    private JComboBox combobox_operator_content_add_course_name;
    private JComboBox combobox_operator_content_update_course_name;
    private JLabel label_operator_content_add_info;
    private JLabel label_operator_content_update_info;
    private JLabel label_operator_content_update_course_name;
    private JLabel label__operator_content_update_quiz_questions;
    private JLabel label__operator_content_update_youtube_link;
    private JLabel label__operator_content_add_youtube_link;
    private JLabel label__operator_content_add_quiz_questions;
    private JLabel label__operator_content_update_content_id;
    private JLabel label__operator_content_delete_content_id;
    private JLabel label_operator_content_add_course_name;
    private DefaultTableModel model_user_list;
    private Object[] row_user_list;
    private DefaultTableModel model_path_list;
    private Object[] row_path_list;
    private JPopupMenu pathMenu;
    private DefaultTableModel model_course_list;
    private Object[] row_course_list;
    private DefaultTableModel model_content_list;
    private Object[] row_content_list;


    public final Operator operator;

    public OperatorGUI(Operator operator) {
        this.operator = operator;
        add(wrapper);
        setSize(1000, 700);
        int x = Helper.screenCenterPoint("x", getSize());
        int y = Helper.screenCenterPoint("y", getSize());
        setLocation(x, y);
//        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);
        label_welcome.setText("Welcome Operator " + operator.getName());

        // Userlist

        model_user_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0)
                    return false;
                return super.isCellEditable(row, column);
            }
        };
        Object[] columns_userList = {"Id", "Name", "Username", "Password", "Type"};
        model_user_list.setColumnIdentifiers(columns_userList);
        row_user_list = new Object[columns_userList.length];
//        Object [] firstRow={"1","Mustafa Çetindağ","mustafa", "1234","operator"};
        //      model_userList.addRow(firstRow);
/*        for (User obj : User.getList()) {
            Object[] row = new Object[columns_userList.length];
            row[0] = obj.getId();
            row[1] = obj.getName();
            row[2] = obj.getUsername();
            row[3] = obj.getPassword();
            row[4] = obj.getType();
            model_userList.addRow(row);
        }
*/
        loadUserModel();
        loadEducatorCombobox();
        table_user_list.setModel(model_user_list);
        table_user_list.getTableHeader().setReorderingAllowed(false);
        table_user_list.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
//                System.out.println("Row is selected.");
                try {
                    String selected_user_id = table_user_list.getValueAt(table_user_list.getSelectedRow(), 0).toString();
                    //  System.out.println(selected_user_id);
                    field_user_id.setText(selected_user_id);
                } catch (Exception ex) {
//                    System.out.println(ex.getMessage());
                }
            }
        });

        table_user_list.getModel().addTableModelListener(e -> {
            if (e.getType() == TableModelEvent.UPDATE) {
                int user_id = Integer.parseInt(table_user_list.getValueAt(table_user_list.getSelectedRow(), 0).toString());
                String user_name = table_user_list.getValueAt(table_user_list.getSelectedRow(), 1).toString();
                String user_username = table_user_list.getValueAt(table_user_list.getSelectedRow(), 2).toString();
                String user_password = table_user_list.getValueAt(table_user_list.getSelectedRow(), 3).toString();
                String user_type = table_user_list.getValueAt(table_user_list.getSelectedRow(), 4).toString();
                if (User.update(user_id, user_name, user_username, user_password, user_type)) {
                    Helper.showMessage("success");
                    loadUserModel();
                    loadEducatorCombobox();
                    loadCourseModel();
                }
                //else{
                //  Helper.showMessage("error");
                //}
                loadUserModel();
                loadEducatorCombobox();
            }
        });

        // ## Userlist

        // PathList

        pathMenu = new JPopupMenu();
        JMenuItem updateMenu = new JMenuItem("Update");
        JMenuItem deleteMenu = new JMenuItem("Delete");
        pathMenu.add(updateMenu);
        pathMenu.add(deleteMenu);

        updateMenu.addActionListener(e -> {
            int select_id = Integer.parseInt(table_path_list.getValueAt(table_path_list.getSelectedRow(), 0).toString());
            UpdatePathGUI updateGUI = new UpdatePathGUI(Path.getFetch(select_id));
            updateGUI.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadPathModel();
                    loadPathCombobox();
                    loadCourseModel();
                }
            });

        });

        deleteMenu.addActionListener(e -> {
            if (Helper.confirm("sure")) {
                int select_id = Integer.parseInt(table_path_list.getValueAt(table_path_list.getSelectedRow(), 0).toString());
                if (Path.delete(select_id)) {
                    Helper.showMessage("success");
                    loadPathModel();
                    loadPathCombobox();
                    loadCourseModel();
                } else {
                    Helper.showMessage("error");
                }
            }

        });

        model_path_list = new DefaultTableModel()/*{
            @Override
            public boolean isCellEditable(int row,int column){
                if(column==0){
                    return false;
                }
                return super.isCellEditable(row,column);
            }
        }*/;
        Object[] column_path_list = {"Id", "Path Name"};
        model_path_list.setColumnIdentifiers(column_path_list);
        row_path_list = new Object[column_path_list.length];
        loadPathModel();
        loadPathCombobox();
        table_path_list.setModel(model_path_list);
        table_path_list.setComponentPopupMenu(pathMenu);
        table_path_list.getTableHeader().setReorderingAllowed(false);
        table_path_list.getColumnModel().getColumn(0).setMaxWidth(75);

        table_path_list.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Point point = e.getPoint();
                int selected_row = table_path_list.rowAtPoint(point);
                table_path_list.setRowSelectionInterval(selected_row, selected_row);
//        System.out.println(e.getPoint().toString());
//        super.mousePressed(e);
            }
        });
        // ## PathList
        // CourseList
        model_course_list = new DefaultTableModel();
        Object[] column_course_list = {"ID", "Course Name", "Educator", "Path", "Language"};
        model_course_list.setColumnIdentifiers(column_course_list);
        row_course_list = new Object[column_course_list.length];
        loadCourseModel();
        table_course_list.setModel(model_course_list);
        table_course_list.getColumnModel().getColumn(0).setMaxWidth(75);
        table_course_list.getTableHeader().setReorderingAllowed(false);

        table_course_list.getSelectionModel().addListSelectionListener(e -> {
//            System.out.println("row selected");
//            System.out.println(selected_course_id);
            try {
                int selected_course_id = Integer.parseInt(table_course_list.getValueAt(table_course_list.getSelectedRow(), 0).toString());

                field_course_update_course_id.setText(String.valueOf(selected_course_id));
                field_course_delete_course_id.setText(String.valueOf(selected_course_id));
                for (Course c : Course.getList()) {
                    int int_selected_course_id = Integer.parseInt(field_course_update_course_id.getText());
                    System.out.println(selected_course_id);
                    if (c.getId() == int_selected_course_id) {
                        field_course_update_course_name.setText(c.getName());
                        field_course_update_language.setText(c.getLanguage());
                        //  combobox_course_update_educator.setSelectedItem(User.getFetchByEducator(combobox_course_update_educator.getSelectedItem().toString()).getName());
                        //        combobox_course_update_educator.setSelectedItem(c.getEducator().getName());
                        //      combobox_course_update_path.setSelectedItem(c.getPath());
                        //      loadCourseModel();                    }
                    }
                }
            } catch (Exception exception) {
//                 System.out.println(exception.getMessage());
            }
        });
        /*combobox_course_add_path.addItem(new Item(1,"1. Item"));
        combobox_course_add_path.addItem(new Item(2,"2. Item"));
        combobox_course_add_path.addItem(new Item(3,"3. Item"));*/
//        loadPathCombobox();
        //      loadEducatorCombobox();
        // ## CourseList

        //Content List

        model_content_list = new DefaultTableModel();
        Object [] column_operator_content_list = {"id", "name", "info", "youtube_link", "quiz_questions", "course_name"};
        model_content_list.setColumnIdentifiers(column_operator_content_list);
        row_content_list = new Object[column_operator_content_list.length];

        loadContentModel();
        table_operator_content_list.setModel(model_content_list);
        table_operator_content_list.getColumnModel().getColumn(0).setMaxWidth(75);
        table_operator_content_list.getTableHeader().setReorderingAllowed(false);

        loadContentSearchContentNameCombobox();
        loadContentSearchCourseNameCombobox();
        loadContentAddCourseNameCombobox();
        loadContentUpdateCourseNameCombobox();

        table_operator_content_list.getSelectionModel().addListSelectionListener(e -> {

            try
            {int selected_content_id=Integer.parseInt(table_operator_content_list.getValueAt(table_operator_content_list.getSelectedRow(),0).toString());
            field_operator_content_update_content_id.setText(String.valueOf(selected_content_id));
            field_operator_content_delete_content_id.setText(String.valueOf(selected_content_id));
            for(Content obj:Content.getList()){
                int int_selected_content_id = Integer.parseInt(field_operator_content_update_content_id.getText());
                if(obj.getId()==int_selected_content_id){
                    field_operator_content_update_content_name.setText(obj.getName());
                    field_operator_content_update_info.setText(obj.getInfo());
                    field_operator_content_update_youtube_link.setText(obj.getYoutube_link());
                    field_operator_content_update_quiz_questions.setText(obj.getQuiz_questions());
                }
            }}catch(Exception eException){

            }
        });









        //# Content List


        button_user_add.addActionListener(e -> {
//            if (field_user_name.getText().length() == 0 || field_user_username.getText().isEmpty() || field_user_password.getText().length() == 0 || field_user_password.getText().length() == 0) {
            if (Helper.isFieldEmpty(field_user_name) || Helper.isFieldEmpty(field_user_username) || Helper.isFieldEmpty(field_user_password)/*||Helper.isFieldEmpty(field_user_type)*/) {
//                JOptionPane.showMessageDialog(null, "Please fill all fields", "Error", JOptionPane.INFORMATION_MESSAGE);
                Helper.showMessage("fill");
            } else {
                String name = field_user_name.getText();
                String username = field_user_username.getText();
                String password = field_user_password.getText();
                String type = combobox_user_type.getSelectedItem().toString();
                if (User.add(name, username, password, type)) {
                    Helper.showMessage("success");
                    loadUserModel();
                    loadEducatorCombobox();
                    field_user_name.setText(null);
                    field_user_username.setText(null);
                    field_user_password.setText(null);
                    field_user_type.setText(null);
                }/* else {
                    Helper.showMessage("error");
                }*/
//                Helper.showMessage("success");
//                System.out.println("adding operation");
            }
        });
        button_user_delete.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_user_id)) {
                Helper.showMessage("fill");
            } else {
                if (Helper.confirm("sure")) {
                    int user_id = Integer.parseInt(field_user_id.getText());
                    if (User.delete(user_id)) {
                        Helper.showMessage("success");
                        loadUserModel();
                        loadEducatorCombobox();
                        loadCourseModel();
                        field_user_id.setText(null);
                    } else {
                        Helper.showMessage("error");
                    }
                }
            }
        });
        button_user_search.addActionListener(e -> {
            String name = field_search_user_name.getText();
            String username = field_search_user_username.getText();
            String type = combobox_search_user_type.getSelectedItem().toString();
            String query = User.searchQuery(name, username, type);
//            ArrayList<User> searchingUser = User.searchUserList(query);
//            loadUserModel(searchingUser);
            loadUserModel(User.searchUserList(query));
            //  String type = combobox_search_user_type.getSelectedItem().toString();
            //          String query = User.searchQuery(name, username, type);
//            ArrayList<User> searchingUser = User.searchUserList(query);
            //           loadUserModel(searchingUser);
//            loadUserModel(User.searchUserList(query));
        });
        button_logout.addActionListener(e -> {
            dispose();
            LoginGUI loginGUI = new LoginGUI();
        });
        button_path_add.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_path_name)) {
                Helper.showMessage("fill");
            } else {
                if (Path.add(field_path_name.getText())) {
                    Helper.showMessage("success");
                    loadPathModel();
                    loadPathCombobox();
                    field_path_name.setText(null);
                } else {
                    Helper.showMessage("error");
                }
            }
        });
        button_course_add.addActionListener(e -> {
            Item pathItem = (Item) combobox_course_add_path.getSelectedItem();
            Item educatorItem = (Item) combobox_course_add_educator.getSelectedItem();

//            if(field_course_add_course_name.getText().isEmpty()||field_course_add_language.getText().isEmpty()){
            if (Helper.isFieldEmpty(field_course_add_course_name) || Helper.isFieldEmpty(field_course_add_language)) {
                Helper.showMessage("fill");
            } else {
                if (Course.add(educatorItem.getKey(), pathItem.getKey(), field_course_add_course_name.getText(), field_course_add_language.getText())) {
                    Helper.showMessage("success");
                    loadCourseModel();
                    field_course_add_course_name.setText(null);
                    field_course_add_language.setText(null);
                } else {
                    Helper.showMessage("error");
                }
            }
        });
        button_course_update.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_course_update_course_name) || Helper.isFieldEmpty(field_course_update_language)) {
                Helper.showMessage("fill");
            } else {
                int selected_course_id = Integer.parseInt(table_course_list.getValueAt(table_course_list.getSelectedRow(), 0).toString());

                field_course_update_course_id.setText(String.valueOf(selected_course_id));
                // combobox_course_update_educator.setSelectedItem(User.getFetchByEducator(combobox_course_update_educator.getSelectedItem().toString()).getName());
                // Course.update(id,user_id,path_id,name,language);
                if (Course.update(selected_course_id, User.getFetchByEducator(combobox_course_update_educator.getSelectedItem().toString()).getId(), Path.getFetch(combobox_course_update_path.getSelectedItem().toString()).getId(), field_course_update_course_name.getText(), field_course_update_language.getText())) {
                    Helper.showMessage("success");
                    loadCourseModel();
                } else {
                    Helper.showMessage("error");
                }
            }
        });
        button_course_delete.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_course_delete_course_id)) {
                Helper.showMessage("fill");
            } else {
                if (Helper.confirm("sure")) {
                    int selected_course_id = Integer.parseInt(table_course_list.getValueAt(table_course_list.getSelectedRow(), 0).toString());
                    field_course_delete_course_id.setText(String.valueOf(selected_course_id));
                    if (Course.delete(selected_course_id)) {
                        Helper.showMessage("success");
                        loadCourseModel();
                        field_course_delete_course_id.setText(null);
                    } else {
                        Helper.showMessage("error");
                    }
                }
            }
        });
        button_operator_content_search.addActionListener(e -> {
            String name = combobox_operator_content_search_content_name.getSelectedItem().toString();
            String course_name=combobox_operator_content_search_course_name.getSelectedItem().toString();

            String query = Content.searchQuery(name,course_name);
            loadContentModel(Content.searchContentList(query));

        });
        button_operator_content_add.addActionListener(e -> {
//            Item contentCourseNameItem = (Item) combobox_operator_content_add_course_name.getSelectedItem();
            if(Helper.isFieldEmpty(field_operator_content_add_content_name)||Helper.isFieldEmpty(field_operator_content_add_info)||Helper.isFieldEmpty(field_operator_content_add_youtube_link)||Helper.isFieldEmpty(field_operator_content_add_quiz_questions)){
                Helper.showMessage("fill");
            }else{
                if(Content.add(field_operator_content_add_content_name.getText(),field_operator_content_add_info.getText(),field_operator_content_add_youtube_link.getText(),field_operator_content_add_quiz_questions.getText(),combobox_operator_content_add_course_name.getSelectedItem().toString())){
                    Helper.showMessage("success");
                    loadContentModel();
                    field_operator_content_add_content_name.setText(null);
                    field_operator_content_add_info.setText(null);
                    field_operator_content_add_youtube_link.setText(null);
                    field_operator_content_add_quiz_questions.setText(null);
                }else{
                    Helper.showMessage("error");
                }
            }

            loadContentSearchContentNameCombobox();

        });
        button_operator_content_update.addActionListener(e -> {
            if(Helper.isFieldEmpty(field_operator_content_update_content_name)||Helper.isFieldEmpty(field_operator_content_update_info)||Helper.isFieldEmpty(field_operator_content_update_youtube_link)||Helper.isFieldEmpty(field_operator_content_update_quiz_questions)){
                Helper.showMessage("fill");
            }else{
                int selected_content_id = Integer.parseInt(table_operator_content_list.getValueAt(table_operator_content_list.getSelectedRow(),0).toString());
                field_operator_content_update_content_id.setText(String.valueOf(selected_content_id));
                if(Content.update(selected_content_id,field_operator_content_update_content_name.getText(),field_operator_content_update_info.getText(),field_operator_content_update_youtube_link.getText(),field_operator_content_update_quiz_questions.getText(),combobox_operator_content_update_course_name.getSelectedItem().toString())){
                    Helper.showMessage("success");
                    loadContentModel();
                    field_operator_content_update_content_id.setText(null);
                    field_operator_content_update_content_name.setText(null);
                    field_operator_content_update_info.setText(null);
                    field_operator_content_update_youtube_link.setText(null);
                    field_operator_content_update_quiz_questions.setText(null);
                    field_operator_content_delete_content_id.setText(null);
                }else{
                    Helper.showMessage("error");
                }
            }

        });
        button_operator_content_delete.addActionListener(e -> {
            if(Helper.isFieldEmpty(field_operator_content_delete_content_id)){
                Helper.showMessage("fill");
            }else{
                if(Helper.confirm("sure")){
                    int selected_content_id = Integer.parseInt(table_operator_content_list.getValueAt(table_operator_content_list.getSelectedRow(),0).toString());
                    field_operator_content_delete_content_id.setText(String.valueOf(selected_content_id));
                    if(Content.delete(selected_content_id)){
                        Helper.showMessage("success");
                        loadContentModel();
                        field_operator_content_delete_content_id.setText(null);
                        field_operator_content_update_content_id.setText(null);
                        field_operator_content_update_content_name.setText(null);
                        field_operator_content_update_info.setText(null);
                        field_operator_content_update_youtube_link.setText(null);
                        field_operator_content_update_quiz_questions.setText(null);
                    }else{
                        Helper.showMessage("error");
                    }
                }
            }

        });
    }



    private void loadContentModel(){
        DefaultTableModel clearModel = (DefaultTableModel) table_operator_content_list.getModel();
        clearModel.setRowCount(0);

        int i;
        for(Content obj : Content.getList()){
            i=0;
            row_content_list[i++] = obj.getId();
            row_content_list[i++] = obj.getName();
            row_content_list[i++] = obj.getInfo();
            row_content_list[i++] = obj.getYoutube_link();
            row_content_list[i++] = obj.getQuiz_questions();
            row_content_list[i++] = obj.getCourse_name();
            model_content_list.addRow(row_content_list);
        }
    }

    public void loadContentModel(ArrayList<Content> list){
        DefaultTableModel clearModel = (DefaultTableModel) table_operator_content_list.getModel();
        clearModel.setRowCount(0);

        int i;
        for (Content obj : list){
            i=0;
            row_content_list[i++] = obj.getId();
            row_content_list[i++]=obj.getName();
            row_content_list[i++]=obj.getInfo();
            row_content_list[i++]=obj.getYoutube_link();
            row_content_list[i++]=obj.getQuiz_questions();
            row_content_list[i++]=obj.getCourse_name();
            model_content_list.addRow(row_content_list);
        }
    }


    private void loadCourseModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_course_list.getModel();
        clearModel.setRowCount(0);

        int i = 0;
        for (Course obj : Course.getList()) {
            i = 0;
            row_course_list[i++] = obj.getId();
            row_course_list[i++] = obj.getName();
            row_course_list[i++] = obj.getEducator().getName();
            row_course_list[i++] = obj.getPath().getName();
            row_course_list[i++] = obj.getLanguage();
            model_course_list.addRow(row_course_list);
        }
    }

    private void loadPathModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_path_list.getModel();
        clearModel.setRowCount(0);
        int i = 0;
        for (Path obj : Path.getList()) {
            i = 0;
            row_path_list[i++] = obj.getId();
            row_path_list[i++] = obj.getName();
            model_path_list.addRow(row_path_list);
        }
    }

    public void loadUserModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_user_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (User obj : User.getList()) {
            i = 0;
            if (obj.getType().equals("operator")) {
            } else {
                row_user_list[i++] = obj.getId();
                row_user_list[i++] = obj.getName();
                row_user_list[i++] = obj.getUsername();
                row_user_list[i++] = obj.getPassword();
                row_user_list[i++] = obj.getType();
                model_user_list.addRow(row_user_list);
            }
        }
    }

    public void loadUserModel4EducatorMenu() {
        DefaultTableModel clearModel = (DefaultTableModel) table_user_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (User obj : User.getEducatorList()) {
            i = 0;
            if (obj.getType().equals("educator")) {
            } else {
                row_user_list[i++] = obj.getId();
                row_user_list[i++] = obj.getName();
                row_user_list[i++] = obj.getUsername();
                row_user_list[i++] = obj.getPassword();
                row_user_list[i++] = obj.getType();
                model_user_list.addRow(row_user_list);
            }
        }
    }

    public void loadUserModel(ArrayList<User> list) {
        DefaultTableModel clearModel = (DefaultTableModel) table_user_list.getModel();
        clearModel.setRowCount(0);
        for (User obj : list) {
            int i = 0;
            row_user_list[i++] = obj.getId();
            row_user_list[i++] = obj.getName();
            row_user_list[i++] = obj.getUsername();
            row_user_list[i++] = obj.getPassword();
            row_user_list[i++] = obj.getType();
            model_user_list.addRow(row_user_list);
        }
    }

    public void loadPathCombobox() {
        combobox_course_add_path.removeAllItems();
        for (Path obj : Path.getList()) {
            combobox_course_add_path.addItem(new Item(obj.getId(), obj.getName()));
            combobox_course_update_path.addItem(new Item(obj.getId(), obj.getName()));
        }
    }

    public void loadEducatorCombobox() {
        combobox_course_add_educator.removeAllItems();
//        for(User obj:User.getList()){
        //          if(obj.getType().equals("educator")){
        for (User obj : User.getEducatorList()) {
            combobox_course_add_educator.addItem(new Item(obj.getId(), obj.getName()));
            combobox_course_update_educator.addItem(new Item(obj.getId(), obj.getName()));
            //   }
        }
    }

    public void loadContentSearchContentNameCombobox(){
        combobox_operator_content_search_content_name.removeAllItems();
        combobox_operator_content_search_content_name.addItem(new Item(0,""));

        for(Content obj:Content.getList()){
            combobox_operator_content_search_content_name.addItem(new Item(obj.getId(),obj.getName()));
        }
    }

    public void loadContentSearchCourseNameCombobox(){
        combobox_operator_content_search_course_name.removeAllItems();
        combobox_operator_content_search_course_name.addItem(new Item(0,""));

        for(Course obj:Course.getList()){
            combobox_operator_content_search_course_name.addItem(new Item(obj.getId(),obj.getName()));
        }
    }

    public void loadContentAddCourseNameCombobox(){
        combobox_operator_content_add_course_name.removeAllItems();
        combobox_operator_content_add_course_name.addItem(new Item(0,""));

        for(Course obj:Course.getList()){
            combobox_operator_content_add_course_name.addItem(new Item(obj.getId(),obj.getName()));
        }
    }

    public void loadContentUpdateCourseNameCombobox(){
        combobox_operator_content_update_course_name.removeAllItems();
        combobox_operator_content_update_course_name.addItem(new Item(0,""));

        for(Course obj: Course.getList()){
            combobox_operator_content_update_course_name.addItem(new Item(obj.getId(), obj.getName()));
        }
    }
}