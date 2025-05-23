package _250506_Tourism_Agency_Project.View;

import _250506_Tourism_Agency_Project.Helper.Config;
import _250506_Tourism_Agency_Project.Helper.Helper;
import _250506_Tourism_Agency_Project.Helper.Item;
import _250506_Tourism_Agency_Project.Model.*;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class AdminGUI extends JFrame {
    private final Admin admin;
    private JPanel wrapper;
    private JTabbedPane tabbed_panel_admin;
    private JLabel label_admin_welcome;
    private JPanel panel_admin_top;
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
    private JButton button_admin_hotel_add;
    private JPanel panel_admin_hotel_add;
    private JPanel panel_admin_hotel_delete;
    private JLabel label_admin_hotel_delete_title;
    private JTextField field_admin_hotel_delete_hotel_id;
    private JButton button_admin_hotel_delete;
    private JLabel label_admin_hotel_delete_hotel_id;
    private JComboBox combobox_admin_hotel_add_star;
    private JLabel label_admin_hotel_add_feature;
    private JCheckBox checkbox_admin_hotel_add_feature_free_parking;
    private JCheckBox checkbox_admin_hotel_add_feature_free_wifi;
    private JCheckBox checkbox_admin_hotel_add_feature_pool;
    private JCheckBox checkbox_admin_hotel_add_feature_fitness_center;
    private JCheckBox checkbox_admin_hotel_add_feature_hotel_corcierge;
    private JCheckBox checkbox_admin_hotel_add_feature_spa;
    private JCheckBox checkbox_admin_hotel_add_feature_room_service;
    private JPanel panel_admin_feature;
    private JScrollPane scroll_panel_admin_feature;
    private JTable table_admin_feature_list;
    private JPanel panel_admin_feature_add;
    private JLabel label_admin_feature_add_title;
    private JLabel label_admin_feature_add_hotel_id;
    private JTextField field_admin_feature_add_hotel_id;
    private JLabel label_admin_feature_add_feature;
    private JCheckBox checkbox_admin_feature_add_room_service;
    private JButton button_admin_feature_add;
    private JCheckBox checkbox_admin_feature_add_free_parking;
    private JCheckBox checkbox_admin_feature_add_free_wifi;
    private JCheckBox checkbox_admin_feature_add_pool;
    private JCheckBox checkbox_admin_feature_add_fitness_center;
    private JCheckBox checkbox_admin_feature_add_hotel_concierge;
    private JCheckBox checkbox_admin_feature_add_spa;
    private JComboBox combobox_admin_feature_add_hotel_name;
    private JPanel panel_admin_accommodation;
    private JScrollPane scroll_panel_admin_accommodation;
    private JPanel panel_admin_accommodation_add;
    private JTable table_admin_accommodation_list;
    private JLabel label_admin_accommodation_add_title;
    private JLabel label_admin_accommodation_add_hotel_id;
    private JTextField field_admin_accommodation_add_hotel_id;
    private JLabel label_admin_accommodation_add_hotel_name;
    private JComboBox combobox_admin_accommodation_add_hotel_name;
    private JCheckBox checkbox_admin_accommodation_add_ultra_all_inclusive;
    private JCheckBox checkbox_admin_accommodation_add_all_in;
    private JCheckBox checkbox_admin_accommodation_add_bed_and_breakfast;
    private JCheckBox checkbox_admin_accommodation_add_full_board;
    private JCheckBox checkbox_admin_accommodation_add_half_board;
    private JCheckBox checkbox_admin_accommodation_add_bed_only;
    private JCheckBox checkbox_admin_accommodation_add_excluding_alcohol_full_credit;
    private JButton button_admin_accommodation_add_;
    private JComboBox combobox_admin_feature_add_hotel_id;
    private DefaultTableModel model_admin_user_list;
    private Object[] row_admin_user_list;
    private DefaultTableModel model_admin_hotel_list;
    private Object[] row_admin_hotel_list;
    private DefaultTableModel model_admin_feature_list;
    private Object[] row_admin_feature_list;
    private DefaultTableModel model_admin_accommodation_list;
    private Object[] row_admin_accommodation_list;

    public AdminGUI(Admin admin) {
        this.admin = admin;

        add(wrapper);
        setSize(1500, 750);
        int x = Helper.screenCenterPoint("x", getSize());
        int y = Helper.screenCenterPoint("y", getSize());
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        label_admin_welcome.setText("Welcome " + admin.getName());

        //ModelUserList-------------------------------------------------------------------------------------------------------------------------------------------------------
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


        //** ModelUserList-------------------------------------------------------------------------------------------------------------------------------------------------------

        //ModelHotelList-------------------------------------------------------------------------------------------------------------------------------------------------------
        model_admin_hotel_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0)
                    return false;
                return super.isCellEditable(row, column);
            }
        };

        Object[] column_admin_hotel_list = {"Id", "Name", "City", "Region", "Address", "Email", "Phone", "Star"/*, "Features"*/};
        model_admin_hotel_list.setColumnIdentifiers(column_admin_hotel_list);
        row_admin_hotel_list = new Object[column_admin_hotel_list.length];
        loadAdminHotelListModel();
       // loadAdminFeatureHotelNameCombobox();


        table_admin_hotel_list.setModel(model_admin_hotel_list);
        table_admin_hotel_list.getTableHeader().setReorderingAllowed(false);
        table_admin_hotel_list.getColumnModel().getColumn(0).setMaxWidth(50);
        table_admin_hotel_list.getColumnModel().getColumn(7).setMaxWidth(50);
        // table_admin_hotel_list.getColumnModel().getColumn(8).setMinWidth(600);

        table_admin_hotel_list.getSelectionModel().addListSelectionListener(e -> {
            try {
                String selected_hotel_id = table_admin_hotel_list.getValueAt(table_admin_hotel_list.getSelectedRow(), 0).toString();
                field_admin_hotel_delete_hotel_id.setText(selected_hotel_id);
            } catch (Exception e1) {
            }
        });

        table_admin_hotel_list.getModel().addTableModelListener(e -> {
            int selectedRow = table_admin_hotel_list.getSelectedRow();

            if (e.getType() == TableModelEvent.UPDATE) {
                int id = Integer.parseInt(table_admin_hotel_list.getValueAt(selectedRow, 0).toString());
                String name = table_admin_hotel_list.getValueAt(selectedRow, 1).toString();
                String city = table_admin_hotel_list.getValueAt(selectedRow, 2).toString();
                String region = table_admin_hotel_list.getValueAt(selectedRow, 3).toString();
                String address = table_admin_hotel_list.getValueAt(selectedRow, 4).toString();
                String email = table_admin_hotel_list.getValueAt(selectedRow, 5).toString();
                String phone = table_admin_hotel_list.getValueAt(selectedRow, 6).toString();
                String star = table_admin_hotel_list.getValueAt(selectedRow, 7).toString();
                //    String facility_feature = table_admin_hotel_list.getValueAt(selectedRow, 8).toString();

                if (Hotel.update(id, name, city, region, address, email, phone, star/*, facility_feature*/)) {
                    Helper.showMessage("success");
                }
                loadAdminHotelListModel();

        //        loadAdminFeatureHotelNameCombobox();

            }
        });

        //**ModelHotelList-------------------------------------------------------------------------------------------------------------------------------------------------------


        //ModelFeatureList-------------------------------------------------------------------------------------------------------------------------------------------------------

        model_admin_feature_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };

        Object[] column_admin_feature_list = {"Id", "Hotel Id", "Free Parking", "Free Wifi", "Pool", "Fitness Center", "Hotel Corcierge", "SPA", "24/7 Room Service"};
        model_admin_feature_list.setColumnIdentifiers(column_admin_feature_list);
        row_admin_feature_list = new Object[column_admin_feature_list.length];
        loadAdminFeatureListModel();
      //  loadAdminFeatureHotelNameCombobox();
        loadAdminFeatureHotelIdCombobox();

        table_admin_feature_list.setModel(model_admin_feature_list);
        table_admin_feature_list.getTableHeader().setReorderingAllowed(false);


        //##ModelFeatureList-------------------------------------------------------------------------------------------------------------------------------------------------------

        //ModelAccommodationList
        model_admin_accommodation_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1)
                    return false;
                return super.isCellEditable(row, column);
            }
        };
        Object[] column_admin_accommodation_list = {"id", "hotel_id", "ultra_all_inclusive", "all_in", "bed_and_breakfast", "full_board", "half_board", "bed_only", "excluding_alcohol_full_creadit"};
        model_admin_accommodation_list.setColumnIdentifiers(column_admin_accommodation_list);
        row_admin_accommodation_list = new Object[column_admin_accommodation_list.length];

        loadAdminAccommodationListModel();
        loadAdminAccommodationHotelNameCombobox();
        table_admin_accommodation_list.setModel(model_admin_accommodation_list);
        table_admin_accommodation_list.getTableHeader().setReorderingAllowed(false);
        table_admin_accommodation_list.getColumnModel().getColumn(0).setMaxWidth(50);
        table_admin_accommodation_list.getColumnModel().getColumn(1).setMaxWidth(50);


        //##ModelAccommodationList-------------------------------------------------------------------------------------------------------------------------------------------------------
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
            // adminHotelAddTextFieldList.add(field_admin_hotel_add_star);

            String name = field_admin_hotel_add_name.getText();
            String city = field_admin_hotel_add_city.getText();
            String region = field_admin_hotel_add_region.getText();
            String address = field_admin_hotel_add_address.getText();
            String email = field_admin_hotel_add_email.getText();
            String phone = field_admin_hotel_add_phone.getText();

            ArrayList<Boolean> adminHotelAddFacilityFeatureList = new ArrayList<>();
            adminHotelAddFacilityFeatureList.add(checkbox_admin_hotel_add_feature_free_parking.isSelected());
            adminHotelAddFacilityFeatureList.add(checkbox_admin_hotel_add_feature_free_wifi.isSelected());
            adminHotelAddFacilityFeatureList.add(checkbox_admin_hotel_add_feature_pool.isSelected());
            adminHotelAddFacilityFeatureList.add(checkbox_admin_hotel_add_feature_fitness_center.isSelected());
            adminHotelAddFacilityFeatureList.add(checkbox_admin_hotel_add_feature_hotel_corcierge.isSelected());
            adminHotelAddFacilityFeatureList.add(checkbox_admin_hotel_add_feature_spa.isSelected());
            adminHotelAddFacilityFeatureList.add(checkbox_admin_hotel_add_feature_room_service.isSelected());
//Feature.createStringHotelFeatureList(field_admin_hotel_add)
            String stringHotelFacilityFeatureList = "";
            for (int i = 0; i <= adminHotelAddFacilityFeatureList.size() - 1; i++) {
                if (adminHotelAddFacilityFeatureList.get(i)) {
                    switch (i) {

                        case 0:
                            stringHotelFacilityFeatureList += "Free Parking, ";
                            break;
                        case 1:
                            stringHotelFacilityFeatureList += "Free Wifi, ";
                            break;
                        case 2:
                            stringHotelFacilityFeatureList += "Pool, ";
                            break;
                        case 3:
                            stringHotelFacilityFeatureList += "Fitness Center, ";
                            break;
                        case 4:
                            stringHotelFacilityFeatureList += "Hotel Concierge, ";
                            break;
                        case 5:
                            stringHotelFacilityFeatureList += "SPA, ";
                            break;
                        case 6:
                            stringHotelFacilityFeatureList += "24/7 Room Service, ";
                            break;
                    }
                }
            }
            if (checkbox_admin_hotel_add_feature_free_parking.isSelected()) {
                boolean freeParking = true;
            }
            if (checkbox_admin_hotel_add_feature_free_wifi.isSelected()) {
            }


            //   String star = field_admin_hotel_add_star.getText();
            String star = combobox_admin_hotel_add_star.getSelectedItem().toString();


            if (Helper.isAnyFieldEmpty(adminHotelAddTextFieldList) || combobox_admin_hotel_add_star.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                if (Hotel.add(name, city, region, address, email, phone, star, stringHotelFacilityFeatureList)) {
                    Helper.showMessage("success");
                    loadAdminHotelListModel();
                 //   loadAdminFeatureHotelNameCombobox();
                }
            }
            for (int i = 0; i <= adminHotelAddTextFieldList.size() - 1; i++) {
                adminHotelAddTextFieldList.get(i).setText("");
            }
            loadAdminFeatureHotelIdCombobox();
            combobox_admin_hotel_add_star.setSelectedItem("");
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
                   //     loadAdminFeatureHotelNameCombobox();
                    } else {
                        Helper.showMessage("error");
                    }
                }
            }
            field_admin_hotel_delete_hotel_id.setText(null);
        });

        button_admin_feature_add.addActionListener(e -> {
         //   Item hotelNameItem = (Item) combobox_admin_feature_add_hotel_name.getSelectedItem();
            int hotel_id = (Integer) Integer.parseInt(combobox_admin_feature_add_hotel_id.getSelectedItem().toString());
            boolean free_parking = checkbox_admin_feature_add_free_parking.isSelected();
            boolean free_wifi = checkbox_admin_feature_add_free_wifi.isSelected();
            boolean pool = checkbox_admin_feature_add_pool.isSelected();
            boolean fitness_center = checkbox_admin_feature_add_pool.isSelected();
            boolean hotel_concierge = checkbox_admin_feature_add_hotel_concierge.isSelected();
            boolean spa = checkbox_admin_feature_add_spa.isSelected();
            boolean room_service = checkbox_admin_feature_add_room_service.isSelected();


            if (combobox_admin_feature_add_hotel_id.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                if (Feature.add(hotel_id, free_parking, free_wifi, pool, fitness_center, hotel_concierge, spa, room_service)) {
                    Helper.showMessage("success");
                    loadAdminFeatureListModel();
                }
            }
            field_admin_feature_add_hotel_id.setText(null);
         //   combobox_admin_feature_add_hotel_name.setSelectedItem(combobox_admin_feature_add_hotel_name.getItemAt(0));
        });

//        combobox_admin_feature_add_hotel_name.addActionListener(e -> {
//
//if(combobox_admin_feature_add_hotel_name.getSelectedItem().equals(null)||combobox_admin_feature_add_hotel_name.getSelectedItem().equals("")){}
//else {
//    int selectedHotelId = (Hotel.getFetch(combobox_admin_feature_add_hotel_name.getSelectedItem().toString())).getId();
//    field_admin_feature_add_hotel_id.setText(String.valueOf(selectedHotelId));
//
//
////            Item hotelNameItem = (Item) combobox_admin_feature_add_hotel_name.getSelectedItem();
////            for (Hotel obj : Hotel.getList()) {
////                if (hotelNameItem.getKey() == obj.getId()) {
////                    field_admin_feature_add_hotel_id.setText(String.valueOf(obj.getId()));
////                }
////            }
//}   });
        combobox_admin_accommodation_add_hotel_name.addActionListener(e -> {
            Item hotelNameItem = (Item) combobox_admin_accommodation_add_hotel_name.getSelectedItem();
            for (Hotel obj : Hotel.getList()) {
                if (hotelNameItem.getKey() == obj.getId()) {
                    field_admin_accommodation_add_hotel_id.setText(String.valueOf(obj.getId()));
                }
            }
        });
        button_admin_accommodation_add_.addActionListener(e -> {
            int hotel_id = (Integer) Integer.parseInt(field_admin_accommodation_add_hotel_id.getText());
            boolean ultra_all_inclusive = checkbox_admin_accommodation_add_ultra_all_inclusive.isSelected();
            boolean all_in = checkbox_admin_accommodation_add_all_in.isSelected();
            boolean bed_and_breakfast = checkbox_admin_accommodation_add_bed_and_breakfast.isSelected();
            boolean full_board = checkbox_admin_accommodation_add_full_board.isSelected();
            boolean half_board = checkbox_admin_accommodation_add_half_board.isSelected();
            boolean bed_only = checkbox_admin_accommodation_add_bed_only.isSelected();
            boolean excluding_alcohol_full_credit = checkbox_admin_accommodation_add_excluding_alcohol_full_credit.isSelected();

            if (field_admin_accommodation_add_hotel_id.getText().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                if (Accommodation.add(hotel_id, ultra_all_inclusive, all_in, bed_and_breakfast, full_board, half_board, bed_only, excluding_alcohol_full_credit)) {
                    Helper.showMessage("success");
                    loadAdminAccommodationListModel();
                }
                field_admin_accommodation_add_hotel_id.setText(null);
                combobox_admin_accommodation_add_hotel_name.setSelectedItem(combobox_admin_accommodation_add_hotel_name.getItemAt(0));

            }

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
            //  row_admin_hotel_list[i++] = obj.getFacility_feature();
            model_admin_hotel_list.addRow(row_admin_hotel_list);
        }

    }

    public void loadAdminFeatureListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_admin_feature_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Feature obj : Feature.getList()) {
            i = 0;
            row_admin_feature_list[i++] = obj.getId();
            row_admin_feature_list[i++] = obj.getHotel_id();
            //    row_admin_feature_list[i++] = obj.getHotel().getName();
            row_admin_feature_list[i++] = obj.isFree_parking();
            row_admin_feature_list[i++] = obj.isFree_wifi();
            row_admin_feature_list[i++] = obj.isPool();
            row_admin_feature_list[i++] = obj.isFitness_center();
            row_admin_feature_list[i++] = obj.isHotel_concierge();
            row_admin_feature_list[i++] = obj.isSpa();
            row_admin_feature_list[i++] = obj.isRoom_service();
            model_admin_feature_list.addRow(row_admin_feature_list);
        }
    }

//    public void loadAdminFeatureHotelNameCombobox() {
//        combobox_admin_feature_add_hotel_name.removeAllItems();
//        combobox_admin_feature_add_hotel_name.addItem(new Item(0, ""));
//        for (Hotel obj : Hotel.getList()) {
//            combobox_admin_feature_add_hotel_name.addItem(new Item(obj.getId(), obj.getName()));
//        }
//
//    }

    public void loadAdminAccommodationListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_admin_accommodation_list.getModel();
        clearModel.setRowCount(0);

        int i;
        for (Accommodation obj : Accommodation.getList()) {
            i = 0;
            row_admin_accommodation_list[i++] = obj.getId();
            row_admin_accommodation_list[i++] = obj.getHotel_id();
            row_admin_accommodation_list[i++] = obj.isUltra_all_inclusive();
            row_admin_accommodation_list[i++] = obj.isAll_in();
            row_admin_accommodation_list[i++] = obj.isBed_and_breakfast();
            row_admin_accommodation_list[i++] = obj.isFull_board();
            row_admin_accommodation_list[i++] = obj.isHalf_board();
            row_admin_accommodation_list[i++] = obj.isBed_only();
            row_admin_accommodation_list[i++] = obj.isExcluding_alcohol_full_credit();
            model_admin_accommodation_list.addRow(row_admin_accommodation_list);
        }
    }

    public void loadAdminAccommodationHotelNameCombobox() {
        combobox_admin_accommodation_add_hotel_name.removeAllItems();
        combobox_admin_accommodation_add_hotel_name.addItem(new Item(0, ""));

        for (Hotel obj : Hotel.getList()) {
            combobox_admin_accommodation_add_hotel_name.addItem(new Item(obj.getId(), obj.getName()));
        }
    }

    public void loadAdminFeatureHotelIdCombobox(){
        combobox_admin_feature_add_hotel_id.removeAllItems();
        for(Hotel obj:Hotel.getList()){
            combobox_admin_feature_add_hotel_id.addItem(new Item(obj.getId(),obj.getName()));
        }
    }
}