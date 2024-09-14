package _241308.com.patikadev.View;

//import _241308.com.patikadev.Helper.Config;

import _241308.com.patikadev.Helper.*;
import _241308.com.patikadev.Model.Operator;
import _241308.com.patikadev.Model.Path;
import _241308.com.patikadev.Model.User;
//import _241308.com.patikadev.Helper.Helper;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
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
    private DefaultTableModel model_user_list;
    private Object[] row_user_list;
    private DefaultTableModel model_path_list;
    private Object[] row_path_list;
    private JPopupMenu pathMenu;

    public final Operator operator;

    public OperatorGUI(Operator operator) {
        this.operator = operator;
        add(wrapper);
        setSize(1000, 500);
        int x = Helper.screenCenterPoint("x", getSize());
        int y = Helper.screenCenterPoint("y", getSize());
        setLocation(x, y);
//        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);
        label_welcome.setText("Welcome : " + operator.getName());

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
        table_user_list.setModel(model_user_list);
        table_user_list.getTableHeader().setReorderingAllowed(false);
        table_user_list.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
//                System.out.println("Row is selected.");
                try {
                    String selected_user_id = table_user_list.getValueAt(table_user_list.getSelectedRow(), 0).toString();
                    System.out.println(selected_user_id);
                    field_user_id.setText(selected_user_id);
                } catch (Exception ex) {
//                    System.out.println(ex.getMessage());
                }
            }
        });

        table_user_list.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    int user_id = Integer.parseInt(table_user_list.getValueAt(table_user_list.getSelectedRow(), 0).toString());
                    String user_name = table_user_list.getValueAt(table_user_list.getSelectedRow(), 1).toString();
                    String user_username = table_user_list.getValueAt(table_user_list.getSelectedRow(), 2).toString();
                    String user_password = table_user_list.getValueAt(table_user_list.getSelectedRow(), 3).toString();
                    String user_type = table_user_list.getValueAt(table_user_list.getSelectedRow(), 4).toString();
                    if (User.update(user_id, user_name, user_username, user_password, user_type)) {
                        Helper.showMessage("success");
                        loadUserModel();
                    }
                    //else{
                    //  Helper.showMessage("error");
                    //}
                    loadUserModel();
                }
            }
        });

        // ## Userlist

        // PathList

        pathMenu=new JPopupMenu();
        JMenuItem updateMenu=new JMenuItem("Update");
        JMenuItem deleteMenu=new JMenuItem("Delete");
        pathMenu.add(updateMenu);
        pathMenu.add(deleteMenu);

        updateMenu.addActionListener(e -> {
            int select_id=Integer.parseInt(table_path_list.getValueAt(table_path_list.getSelectedRow(),0).toString());
            UpdatePathGUI updateGUI= new UpdatePathGUI(Path.getFetch(select_id));
            updateGUI.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadPathModel();
                }
            });

        });

        deleteMenu.addActionListener(e -> {
            if(Helper.confirm("sure")){
                int select_id=Integer.parseInt(table_path_list.getValueAt(table_path_list.getSelectedRow(),0).toString());
                if(Path.delete(select_id)){
                    Helper.showMessage("success");
                    loadPathModel();
                }else{
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
        table_path_list.setModel(model_path_list);
        table_path_list.setComponentPopupMenu(pathMenu);
        table_path_list.getTableHeader().setReorderingAllowed(false);
        table_path_list.getColumnModel().getColumn(0).setMaxWidth(75);

table_path_list.addMouseListener(new MouseAdapter(){
    @Override
    public void mousePressed(MouseEvent e){
        Point point= e.getPoint();
        int selected_row=table_path_list.rowAtPoint(point);
        table_path_list.setRowSelectionInterval(selected_row,selected_row);
//        System.out.println(e.getPoint().toString());
//        super.mousePressed(e);
    }
});        // ## PathList

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
                if(Helper.confirm("sure")){
                    int user_id = Integer.parseInt(field_user_id.getText());
                    if (User.delete(user_id)) {
                        Helper.showMessage("success");
                        loadUserModel();
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
        });
        button_path_add.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_path_name)) {
                Helper.showMessage("fill");
            } else {
                if (Path.add(field_path_name.getText())) {
                    Helper.showMessage("success");
                    loadPathModel();
                    field_path_name.setText(null);
                } else {
                    Helper.showMessage("error");
                }
            }
        });
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
            row_user_list[i++] = obj.getId();
            row_user_list[i++] = obj.getName();
            row_user_list[i++] = obj.getUsername();
            row_user_list[i++] = obj.getPassword();
            row_user_list[i++] = obj.getType();
            model_user_list.addRow(row_user_list);
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
    /*
        public void loadUserModel(ArrayList<User> list) {
            DefaultTableModel clearModel = (DefaultTableModel) table_userlist.getModel();
            clearModel.setRowCount(0);
            for (User obj : list) {
                int i = 0;
                row_userList[i++] = obj.getId();
                row_userList[i++] = obj.getName();
                row_userList[i++] = obj.getUsername();
                row_userList[i++] = obj.getPassword();
                row_userList[i++] = obj.getType();
                model_userList.addRow(row_userList);
            }
        }
    */
    public static void main(String[] args) {
        Helper.setLayout();
        Operator op = new Operator();
        op.setId(1);
        op.setName("Mahmut Mustafa Çetindağ");
        op.setUsername("mustafa");
        op.setPassword("1234");
        op.setType("operator");
//        DBConnector.getInstance();
        OperatorGUI opGUI = new OperatorGUI(op);
    }
}