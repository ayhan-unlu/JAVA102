package _250506_Tourism_Agency_Project.View;

import _250506_Tourism_Agency_Project.Helper.Config;
import _250506_Tourism_Agency_Project.Helper.Helper;
import _250506_Tourism_Agency_Project.Model.Admin;
import _250506_Tourism_Agency_Project.Model.Hotel;
import _250506_Tourism_Agency_Project.Model.User;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class AdminGUI extends JFrame {
    private final Admin admin;
    private JPanel wrapper;
    private JTabbedPane tab_admin;
    private JLabel label_admin_welcome;
    private JPanel panel_top;
    private JButton button_admin_logout;
    private JPanel panel_admin_user_list;
    private JTable table_admin_user_list;
    private JScrollPane scroll_panel_admin_user_list;
    private JPanel panel_admin_user_add;
    private JLabel label_admin_user_add_name;
    private JTextField field_admin_user_add_name;
    private JTextField field_admin_user_add_surname;
    private JTextField field_admin_user_add_username;
    private JTextField field_admin_user_add_password;
    private JLabel label_admin_user_add_surname;
    private JComboBox combobox_admin_user_add_type;
    private JLabel label_admin_user_add_username;
    private JLabel lable_admin_user_add_password;
    private JLabel lable_admin_user_add_type;
    private JButton button_admin_user_add;
    private JLabel label_admin_user_add_title;
    private JLabel label_admin_user_delete_title;
    private JLabel label_admin_user_delete_user_id;
    private JTextField field_admin_user_delete_user_id;
    private JButton button_admin_user_delete;
    private JTextField field_admin_user_search_name;
    private JLabel label_admin_user_search;
    private JLabel label_admin_user_search_title;
    private JTextField field_admin_user_search_surname;
    private JTextField field_admin_user_search_username;
    private JLabel label_admin_user_search_surname;
    private JPanel panel_admin_user_search;
    private JLabel label_admin_user_search_username;
    private JButton button_admin_user_search;
    private JComboBox combobox_admin_user_search_type;
    private JLabel label_admin_user_search_type;
    private JLabel label_admin_user_list_table_title;
    private JPanel panel_admin_hotel_list;
    private JScrollPane scroll_panel_admin_hotel_list;
    private JTable table_admin_hotel_list;
    private JLabel label_admin_hotel_add_title;
    private JLabel label_admin_hotel_add_name;
    private JTextField field_admin_hotel_add_name;
    private JTextField field_admin_hotel_add_city;
    private JTextField field_admin_hotel_add_region;
    private JTextField field_admin_hotel_add_address;
    private JLabel label_admin_hotel_add_city;
    private JLabel label_admin_hotel_Add_region;
    private JLabel label_admin_hotel_add_address;
    private JTextField field_admin_hotel_add_email;
    private JTextField field_admin_hotel_add_phone;
    private JTextField field_admin_hotel_add_star;
    private JButton button_admin_hotel_add;
    private JPanel panel_admin_hotel_add;
    private JPanel panel_admin_hotel_delete;
    private JLabel label_admin_hotel_delete_title;
    private JTextField field_admin_hotel_delete_hotel_id;
    private JButton button_admin_hotel_delete;
    private JLabel label_admin_hotel_delete_hotel_id;
    private DefaultTableModel model_admin_user_list;
    private Object[] row_admin_user_list;
    private DefaultTableModel model_admin_hotel_list;
    private Object[] row_admin_hotel_list;

    public AdminGUI(Admin admin) {
        this.admin = admin;

        add(wrapper);
        setSize(1000, 750);
        int x = Helper.screenCenterPoint("x", getSize());
        int y = Helper.screenCenterPoint("y", getSize());
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        label_admin_welcome.setText("Welcome " + admin.getName());

        //ModelUserList
        model_admin_user_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0)
                    return false;
                return super.isCellEditable(row, column);
            }
        };
        Object[] column_admin_user_list = {"Id", "Name", "Surname", "Username", "Password", "Type"};
        model_admin_user_list.setColumnIdentifiers(column_admin_user_list);
        row_admin_user_list = new Object[column_admin_user_list.length];
        loadAdminUserListModel();

        table_admin_user_list.setModel(model_admin_user_list);
        table_admin_user_list.getTableHeader().setReorderingAllowed(false);

        table_admin_user_list.getSelectionModel().addListSelectionListener(e -> {
            try {
                String selected_user_id = table_admin_user_list.getValueAt(table_admin_user_list.getSelectedRow(), 0).toString();
                field_admin_user_delete_user_id.setText(selected_user_id);
            } catch (Exception e1) {
            }
        });

        table_admin_user_list.getModel().addTableModelListener(e -> {
            int selectedRow = table_admin_user_list.getSelectedRow();

            if (e.getType() == TableModelEvent.UPDATE) {
                int id = Integer.parseInt(table_admin_user_list.getValueAt(selectedRow, 0).toString());
                String name = table_admin_user_list.getValueAt(selectedRow, 1).toString();
                String surname = table_admin_user_list.getValueAt(selectedRow, 2).toString();
                String username = table_admin_user_list.getValueAt(selectedRow, 3).toString();
                String password = table_admin_user_list.getValueAt(selectedRow, 4).toString();
                String type = table_admin_user_list.getValueAt(selectedRow, 5).toString();

                if (User.update(id, name, surname, username, password, type)) {
                    Helper.showMessage("success");
                }
                loadAdminUserListModel();
            }

        });


        //** ModelUserLİst

        //ModelHotelList
        model_admin_hotel_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0)
                    return false;
                return super.isCellEditable(row, column);
            }
        };

        Object[] column_admin_hotel_list = {"Id", "Name", "City", "Region", "Address", "Email", "Phone", "Star"};
        model_admin_hotel_list.setColumnIdentifiers(column_admin_hotel_list);
        row_admin_hotel_list = new Object[column_admin_hotel_list.length];
        loadAdminHotelListModel();

        table_admin_hotel_list.setModel(model_admin_hotel_list);
        table_admin_hotel_list.getTableHeader().setReorderingAllowed(false);
        table_admin_hotel_list.getColumnModel().getColumn(0).setMaxWidth(50);

        table_admin_hotel_list.getSelectionModel().addListSelectionListener(e -> {
            try {
                String selected_hotel_id = table_admin_hotel_list.getValueAt(table_admin_hotel_list.getSelectedRow(), 0).toString();
                field_admin_hotel_delete_hotel_id.setText(selected_hotel_id);
            } catch (Exception e1) {
            }
        });

        //**ModelHotelList
        button_admin_user_add.addActionListener(e -> {

            ArrayList<JTextField> adminUserAddTextFieldList = new ArrayList<>();
            adminUserAddTextFieldList.add(field_admin_user_add_name);
            adminUserAddTextFieldList.add(field_admin_user_add_surname);
            adminUserAddTextFieldList.add(field_admin_user_add_username);
            adminUserAddTextFieldList.add(field_admin_user_add_password);

            if (Helper.isAnyFieldEmpty(adminUserAddTextFieldList) || combobox_admin_user_add_type.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                if (User.add(field_admin_user_add_name.getText(),
                        field_admin_user_add_surname.getText(),
                        field_admin_user_add_username.getText(),
                        field_admin_user_add_password.getText(),
                        combobox_admin_user_add_type.getSelectedItem().toString())) {
                    Helper.showMessage("success");

                    DefaultTableModel clearModel = (DefaultTableModel) table_admin_user_list.getModel();
                    clearModel.setRowCount(0);
                    loadAdminUserListModel();
                }
            }
            for (int i = 0; i <= adminUserAddTextFieldList.size() - 1; i++) {
                adminUserAddTextFieldList.get(i).setText(null);
            }
            combobox_admin_user_add_type.setSelectedItem("");
        });
        button_admin_user_delete.addActionListener(e -> {
            if (field_admin_user_delete_user_id.getText().isEmpty()) {
                Helper.showMessage("select");
            } else {
                if (Helper.confirm("sure")) {
                    int selectedUserId = Integer.parseInt(field_admin_user_delete_user_id.getText());
                    if (User.delete(selectedUserId)) {
                        Helper.showMessage("success");
                        loadAdminUserListModel();
                    } else {
                        Helper.showMessage("error");
                    }
                }
            }
            field_admin_user_delete_user_id.setText(null);
        });
        button_admin_user_search.addActionListener(e -> {
            ArrayList<JTextField> adminUserSearchTextFieldList = new ArrayList<>();
            adminUserSearchTextFieldList.add(field_admin_user_search_name);
            adminUserSearchTextFieldList.add(field_admin_user_search_surname);
            adminUserSearchTextFieldList.add(field_admin_user_search_username);

            String name = field_admin_user_search_name.getText();
            String surname = field_admin_user_search_surname.getText();
            String username = field_admin_user_search_username.getText();
            String type = combobox_admin_user_search_type.getSelectedItem().toString();

            String query = User.searchQuery(name, surname, username, type);

            ArrayList<User> searchedUserList = User.searchUserList(query);
            loadAdminUserListModel(searchedUserList);

            for (int i = 0; i <= adminUserSearchTextFieldList.size() - 1; i++) {
                adminUserSearchTextFieldList.get(i).setText(null);
            }
            combobox_admin_user_search_type.setSelectedItem("");
        });
        button_admin_logout.addActionListener(e -> {
            dispose();
            LoginGUI loginGUI = new LoginGUI();
        });
        button_admin_hotel_add.addActionListener(e -> {

            ArrayList<JTextField> adminHotelAddTextFieldList = new ArrayList<>();
            adminHotelAddTextFieldList.add(field_admin_hotel_add_name);
            adminHotelAddTextFieldList.add(field_admin_hotel_add_city);
            adminHotelAddTextFieldList.add(field_admin_hotel_add_region);
            adminHotelAddTextFieldList.add(field_admin_hotel_add_address);
            adminHotelAddTextFieldList.add(field_admin_hotel_add_email);
            adminHotelAddTextFieldList.add(field_admin_hotel_add_phone);
            adminHotelAddTextFieldList.add(field_admin_hotel_add_star);

            String name = field_admin_hotel_add_name.getText();
            String city = field_admin_hotel_add_city.getText();
            String region = field_admin_hotel_add_region.getText();
            String address = field_admin_hotel_add_address.getText();
            String email = field_admin_hotel_add_email.getText();
            String phone = field_admin_hotel_add_phone.getText();
            String star = field_admin_hotel_add_star.getText();


            if (Helper.isAnyFieldEmpty(adminHotelAddTextFieldList)) {
                Helper.showMessage("fill");
            } else {

                if (Hotel.add(name, city, region, address, email, phone, star)) {
                    Helper.showMessage("success");

                    DefaultTableModel clearModel = (DefaultTableModel) table_admin_hotel_list.getModel();
                    clearModel.setRowCount(0);
                    loadAdminHotelListModel();
                }
            }
            for (int i = 0; i <= adminHotelAddTextFieldList.size() - 1; i++) {
                adminHotelAddTextFieldList.get(i).setText(null);
            }
        });
        button_admin_hotel_delete.addActionListener(e -> {
            if (field_admin_hotel_delete_hotel_id.getText().isEmpty()) {
                Helper.showMessage("select");
            } else {
                if (Helper.confirm("sure")) {
                    int selectedHotelId = Integer.parseInt(field_admin_hotel_delete_hotel_id.getText());
                    if (Hotel.delete(selectedHotelId)) {
                        Helper.showMessage("success");
                        loadAdminHotelListModel();
                    } else {
                        Helper.showMessage("error");
                    }
                }
            }
            field_admin_hotel_delete_hotel_id.setText(null);
        });
    }

    public void loadAdminUserListModel() {

        DefaultTableModel clearModel = (DefaultTableModel) table_admin_user_list.getModel();
        clearModel.setRowCount(0);

        for (User obj : User.getList()) {
            int i = 0;
            row_admin_user_list[i++] = obj.getId();
            row_admin_user_list[i++] = obj.getName();
            row_admin_user_list[i++] = obj.getSurname();
            row_admin_user_list[i++] = obj.getUsername();
            row_admin_user_list[i++] = obj.getPassword();
            row_admin_user_list[i++] = obj.getType();
            model_admin_user_list.addRow(row_admin_user_list);
        }
    }

    public void loadAdminUserListModel(ArrayList<User> list) {

        DefaultTableModel clearModel = (DefaultTableModel) table_admin_user_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (User obj : list) {
            i = 0;
            row_admin_user_list[i++] = obj.getId();
            row_admin_user_list[i++] = obj.getName();
            row_admin_user_list[i++] = obj.getSurname();
            row_admin_user_list[i++] = obj.getUsername();
            row_admin_user_list[i++] = obj.getPassword();
            row_admin_user_list[i++] = obj.getType();
            model_admin_user_list.addRow(row_admin_user_list);
        }
    }

    public void loadAdminHotelListModel() {

        DefaultTableModel clearModel = (DefaultTableModel) table_admin_hotel_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Hotel obj : Hotel.getList()) {
            i = 0;
            row_admin_hotel_list[i++] = obj.getId();
            row_admin_hotel_list[i++] = obj.getName();
            row_admin_hotel_list[i++] = obj.getCity();
            row_admin_hotel_list[i++] = obj.getRegion();
            row_admin_hotel_list[i++] = obj.getAddress();
            row_admin_hotel_list[i++] = obj.getEmail();
            row_admin_hotel_list[i++] = obj.getPhone();
            row_admin_hotel_list[i++] = obj.getStar();
            model_admin_hotel_list.addRow(row_admin_hotel_list);
        }

    }
}