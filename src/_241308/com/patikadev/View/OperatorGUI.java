package _241308.com.patikadev.View;

//import _241308.com.patikadev.Helper.Config;

import _241308.com.patikadev.Helper.*;
import _241308.com.patikadev.Model.Operator;
import _241308.com.patikadev.Model.User;
//import _241308.com.patikadev.Helper.Helper;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorGUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane tab_operator;
    private JPanel panel_top;
    private JButton button_logout;
    private JPanel panel_userlist;
    private JLabel label_welcome;
    private JScrollPane scroll_userlist;
    private JTable table_userlist;
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
    private DefaultTableModel model_userList;
    private Object[] row_userList;

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

        //Model Userlist

        model_userList = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                if(column ==0)
                    return false;
                return super.isCellEditable(row, column);
            }
        };
        Object[] columns_userList = {"Id", "Name", "Username", "Password", "Type"};
        model_userList.setColumnIdentifiers(columns_userList);
        row_userList = new Object[columns_userList.length];

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
        table_userlist.setModel(model_userList);
        table_userlist.getTableHeader().setReorderingAllowed(false);

        table_userlist.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
//                System.out.println("Row is selected.");
                try {
                    String selected_user_id = table_userlist.getValueAt(table_userlist.getSelectedRow(), 0).toString();
                    System.out.println(selected_user_id);
                    field_user_id.setText(selected_user_id);
                } catch (Exception ex) {
//                    System.out.println(ex.getMessage());
                }
            }
        });

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
                int user_id = Integer.parseInt(field_user_id.getText());
                if (User.delete(user_id)) {
                    Helper.showMessage("success");
                    loadUserModel();
                } else {
                    Helper.showMessage("error");
                }

            }
        });
    }

    public void loadUserModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_userlist.getModel();
        clearModel.setRowCount(0);

        for (User obj : User.getList()) {
            int i = 0;
            row_userList[i++] = obj.getId();
            row_userList[i++] = obj.getName();
            row_userList[i++] = obj.getUsername();
            row_userList[i++] = obj.getPassword();
            row_userList[i++] = obj.getType();

            model_userList.addRow(row_userList);

        }

    }

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
