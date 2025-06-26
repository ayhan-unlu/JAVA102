package _250626_Patika_Travel_Agency_Project_Completed.View;

import _250626_Patika_Travel_Agency_Project_Completed.Helper.Config;
import _250626_Patika_Travel_Agency_Project_Completed.Helper.Helper;
import _250626_Patika_Travel_Agency_Project_Completed.Helper.Item;
import _250626_Patika_Travel_Agency_Project_Completed.Model.*;

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
    private JPanel panel_admin_accommodation;
    private JScrollPane scroll_panel_admin_accommodation;
    private JPanel panel_admin_accommodation_add;
    private JTable table_admin_accommodation_list;
    private JLabel label_admin_accommodation_add_title;
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
    private JComboBox combobox_admin_feature_add_hotel_name;
    private JPanel panel_admin_room;
    private JScrollPane scroll_panel_admin_room;
    private JPanel panel_admin_room_add;
    private JTable table_admin_room_list;
    private JLabel label_admin_room_add_title;
    private JLabel label_admin_room_add_hotel_name;
    private JComboBox combobox_admin_room_add_hotel_name;
    private JPanel panel_admin_season;
    private JScrollPane scroll_panel_admin_season;
    private JPanel panel_admin_season_add;
    private JTable table_admin_season_list;
    private JLabel label_admin_season_add_title;
    private JLabel label_admin_season_add_hotel_name;
    private JCheckBox checkbox_admin_season_add_season_1;
    private JCheckBox checkbox_admin_season_add_season_2;
    private JButton button_admin_season_add;
    private JComboBox combobox_admin_season_add_hotel_name;
    private JLabel label_admin_room_add_room_type;
    private JComboBox combobox_admin_room_add_room_type;
    private JButton button_admin_room_add;
    private JLabel label_admin_room_add_stock;
    private JTextField field_admin_room_add_stock;
    private JPanel panel_admin_roomfeature;
    private JScrollPane scroll_panel_admin_roomfeature;
    private JTable table_admin_roomfeature_list;
    private JPanel panel_admin_roomfeature_add;
    private JLabel label_admin_roomfeature_add_title;
    private JLabel label_admin_roomfeature_add_room_id;
    private JComboBox combobox_admin_roomfeature_add_room_id;
    private JTextField field_admin_roomfeature_bed_count;
    private JTextField field_admin_roomfeature_squaremeters;
    private JCheckBox checkbox_admin_roomfeature_tv;
    private JCheckBox checkbox_admin_roomfeature_minibar;
    private JCheckBox checkbox_admin_roomfeature_console;
    private JCheckBox checkbox_admin_roomfeature_safe;
    private JCheckBox checkbox_admin_roomfeature_projector;
    private JButton button_admin_roomfeature_add;
    private JLabel label_admin_roomfeature_bed_count;
    private JLabel label_admin_roomfeature_squaremeters;
    private JPanel panel_admin_calculation;
    private JComboBox combobox_admin_calculation_coefficient_room_id;
    private JLabel label_admin_calculation_coefficient;
    private JLabel label_admin_calculation_coefficient_room_id;
    private JButton button_admin_calculation_calculate_coefficient;
    private JTextField field_admin_calculation_calculated_coefficient;
    private JLabel label_admin_calculation_calculated_coefficient;
    private JLabel label_admin_calculation_room_price;
    private JLabel label_admin_calculation_adult_guest_number;
    private JComboBox combobox_admin_calculation_adult_guest_number;
    private JComboBox combobox_admin_calculation_child_guest_number;
    private JLabel lable_admin_calculation_start_date;
    private JLabel label_admin_calculation_duration;
    private JTextField field_admin_calculation_start_date;
    private JTextField field_admin_calculation_duration;
    private JButton button_admin_calculation_calcultate_room_price;
    private JLabel label_admin_calculation_room_price_room_id;
    private JComboBox combobox_admin_calculation_room_price_room_id;
    private JLabel label_admin_calculation_calculated_room_price;
    private JTextField field_admin_calculation_calculated_room_price;
    private JPanel panel_admin_search;
    private JPanel panel_admin_search_top;
    private JLabel label_admin_search_title;
    private JLabel label_admin_search_check_in_date;
    private JTextField field_admin_search_check_in_date;
    private JLabel label_admin_search_check_out_date;
    private JTextField field_admin_search_check_out_date;
    private JLabel label_admin_search_city;
    private JComboBox combobox_admin_search_city;
    private JComboBox combobox_admin_search_hotel_name;
    private JLabel label_admin_search_hotel_name;
    private JButton button_admin_search;
    private JScrollPane scroll_panel_admin_search_list;
    private JTable table_admin_search_list;
    private JLabel label_admin_search_list;
    private JPanel panel_admin_price;
    private JScrollPane scroll_panel_admin_price_list;
    private JTable table_admin_price_list;
    private JLabel label_admin_price_add_title;
    private JLabel label_admin_price_add_room_id;
    private JComboBox combobox_admin_price_add_room_id;
    private JLabel label_admin_price_add_season_1;
    private JLabel label_admin_price_add_adult_price_1;
    private JTextField field_admin_price_add_adult_price_1;
    private JLabel label_admin_price_add_child_price_1;
    private JTextField field_admin_price_add_child_price_1;
    private JButton button_admin_price_add;
    private JTextField field_admin_price_add_adult_price_2;
    private JTextField field_admin_price_add_child_price_2;
    private JLabel label_admin_price_add_season_2;
    private JLabel label_admin_price_add_adult_price_2;
    private JLabel label_admin_price_add_child_price_2;
    private JPanel panel_admin_reservation;
    private JLabel label_admin_reservation_welcome;
    private JPanel panel_admin_reservation_room;
    private JPanel panel_admin_reservation_contact;
    private JPanel panel_admin_reservation_guest;
    private JPanel panel_admin_reservation_info;
    private JPanel panel_admin_reservation_buttons;
    private JLabel label_admin_reservation_room_hotel_info;
    private JLabel label_admin_reservation_contact_info;
    private JLabel label_admin_reservation_guest_info;
    private JLabel label_admin_reservation_delete_title;
    private JButton button_admin_reservation_add;
    private JTextField field_admin_reservation_hotel_feature;
    private JLabel label_admin_reservation_room_feature;
    private JTextField field_admin_reservation_room_feature;
    private JLabel label_admin_reservation_accommodation;
    private JTextField field_admin_reservation_accommodation;
    private JLabel label_admin_reservation_season;
    private JTextField field_admin_reservation_season;
    private JLabel label_admin_reservation_contact_name;
    private JTextField field_admin_reservation_contact_name;
    private JTextField field_admin_reservation_contact_note;
    private JLabel label_admin_reservation_contact_phone;
    private JTextField field_admin_reservation_contact_phone;
    private JTextField field_admin_reservation_contact_email;
    private JLabel label_admin_reservation_contact_email;
    private JLabel label_admin_reservation_guest_1;
    private JLabel label_admin_reservation_guest_2;
    private JLabel label_admin_reservation_guest_3;
    private JTextField field_admin_reservation_guest_1_name;
    private JTextField field_admin_reservation_guest_1_country;
    private JTextField field_admin_reservation_guest_1_id_no;
    private JTextField field_admin_reservation_guest_2_name;
    private JTextField field_admin_reservation_guest_2_country;
    private JTextField field_admin_reservation_guest_2_id_no;
    private JTextField field_admin_reservation_guest_3_name;
    private JTextField field_admin_reservation_guest_3_country;
    private JTextField field_admin_reservation_guest_3_id_no;
    private JLabel label_admin_reservation_guest_info_name;
    private JLabel label_admin_reservation_guest_info_country;
    private JLabel label_admin_reservation_guest_info_id_no;
    private JScrollPane scroll_panel_admin_reservation;
    private JTable table_admin_reservation_list;
    private JLabel label_admin_reservation_room_id;
    private JComboBox combobox_admin_reservation_room_id;
    private JLabel label_admin_reservation_contact_note;
    private JLabel label_admin_reservation_contact_id_no;
    private JTextField field_admin_reservation_contact_id_no;
    private JLabel label_admin_reservation_add_title;
    private JComboBox combobox_admin_reservation_delete_reservation_id;
    private JButton button_admin_reservation_delete;
    private JComboBox combobox_admin_calculation_accommodation_type;
    private JLabel label_admin_calculation_room_price_accommodation_type;
    private DefaultTableModel model_admin_user_list;
    private Object[] row_admin_user_list;
    private DefaultTableModel model_admin_hotel_list;
    private Object[] row_admin_hotel_list;
    private DefaultTableModel model_admin_feature_list;
    private Object[] row_admin_feature_list;
    private DefaultTableModel model_admin_accommodation_list;
    private Object[] row_admin_accommodation_list;
    private DefaultTableModel model_admin_season_list;
    private Object[] row_admin_season_list;
    private DefaultTableModel model_admin_room_list;
    private Object[] row_admin_room_list;
    private DefaultTableModel model_admin_roomfeature_list;
    private Object[] row_admin_roomfeature_list;
    private DefaultTableModel model_admin_search_list;
    private Object[] row_admin_search_list;
    private DefaultTableModel model_admin_price_list;
    private Object[] row_admin_price_list;
    private DefaultTableModel model_admin_reservation_list;
    private Object[] row_admin_reservation_list;
    private Hotel hotel;
    private Room room;

    public AdminGUI(Admin admin) {
        this.admin = admin;

        add(wrapper);
        setSize(1500, 1000);
        int x = Helper.screenCenterPoint("x", getSize());
        int y = Helper.screenCenterPoint("y", getSize());
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        label_admin_welcome.setText("Welcome Admin " + admin.getName());

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

        Object[] column_admin_hotel_list = {"Id", "Name", "City", "Region", "Address", "Email", "Phone", "Star"};
        model_admin_hotel_list.setColumnIdentifiers(column_admin_hotel_list);
        row_admin_hotel_list = new Object[column_admin_hotel_list.length];
        loadAdminHotelListModel();

        table_admin_hotel_list.setModel(model_admin_hotel_list);
        table_admin_hotel_list.getTableHeader().setReorderingAllowed(false);
        table_admin_hotel_list.getColumnModel().getColumn(0).setMaxWidth(50);
        table_admin_hotel_list.getColumnModel().getColumn(7).setMaxWidth(50);

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

                if (Hotel.update(id, name, city, region, address, email, phone, star)) {
                    Helper.showMessage("success");
                }
                loadAdminHotelListModel();
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
        loadAdminHotelNameCombobox(combobox_admin_feature_add_hotel_name);

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
        Object[] column_admin_accommodation_list = {"Id", "Hotel Id", "Ultra Al Inclusive", "All In", "Bed And Breakfast", "Full Board", "Half Board", "Bed Only", "Excluding Alcohol Full Credit"};
        model_admin_accommodation_list.setColumnIdentifiers(column_admin_accommodation_list);
        row_admin_accommodation_list = new Object[column_admin_accommodation_list.length];

        loadAdminAccommodationListModel();
        loadAdminHotelNameCombobox(combobox_admin_accommodation_add_hotel_name);
        table_admin_accommodation_list.setModel(model_admin_accommodation_list);
        table_admin_accommodation_list.getTableHeader().setReorderingAllowed(false);
        table_admin_accommodation_list.getColumnModel().getColumn(0).setMaxWidth(50);
        table_admin_accommodation_list.getColumnModel().getColumn(1).setMaxWidth(50);


        //##ModelAccommodationList-------------------------------------------------------------------------------------------------------------------------------------------------------

        //ModelSeasonList-------------------------------------------------------------------------------------------------------------------------------------------------------

        model_admin_season_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1)
                    return false;
                return super.isCellEditable(row, column);
            }
        };

        Object[] column_admin_season_list = {"Id", "Hotel Id", "Season 1(01.01.2025-31.05.2025)", "Season 2(01.06.2025-31.12.2025)"};
        model_admin_season_list.setColumnIdentifiers(column_admin_season_list);
        row_admin_season_list = new Object[column_admin_season_list.length];
        loadAdminSeasonListModel();
        loadAdminHotelNameCombobox(combobox_admin_season_add_hotel_name);
        table_admin_season_list.setModel(model_admin_season_list);
        table_admin_season_list.getTableHeader().setReorderingAllowed(false);
        table_admin_season_list.getColumnModel().getColumn(0).setMaxWidth(50);
        table_admin_season_list.getColumnModel().getColumn(1).setMaxWidth(50);


        //##ModelSeasonList-------------------------------------------------------------------------------------------------------------------------------------------------------

        //ModelRoomList-------------------------------------------------------------------------------------------------------------------------------------------------------

        model_admin_room_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1)
                    return false;
                return super.isCellEditable(row, column);
            }
        };

        Object[] column_admin_room_list = {"Id", "Hotel Id", "Room Type", "Stock"};
        model_admin_room_list.setColumnIdentifiers(column_admin_room_list);
        row_admin_room_list = new Object[column_admin_room_list.length];

        loadAdminRoomListModel();
        loadAdminHotelNameCombobox(combobox_admin_room_add_hotel_name);
        table_admin_room_list.setModel(model_admin_room_list);
        table_admin_room_list.getTableHeader().setReorderingAllowed(false);

        //##ModelRoomList-------------------------------------------------------------------------------------------------------------------------------------------------------


        //ModelRoomfeatureList-------------------------------------------------------------------------------------------------------------------------------------------------------

        model_admin_roomfeature_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1 || column == 2) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };

        Object[] column_admin_roomfeature_list = {"Id", "Hotel Id", "Room Id", "Bed Count", "Square Meters", "Tv", "Minibar", "Console", "Safe", "Projector"};
        model_admin_roomfeature_list.setColumnIdentifiers(column_admin_roomfeature_list);
        row_admin_roomfeature_list = new Object[column_admin_roomfeature_list.length];
        loadAdminRoomfeatureListModel();
        loadAdminRoomIdCombobox(combobox_admin_roomfeature_add_room_id);

        table_admin_roomfeature_list.setModel(model_admin_roomfeature_list);
        table_admin_roomfeature_list.getTableHeader().setReorderingAllowed(false);


        //##ModelRoomfeatureList-------------------------------------------------------------------------------------------------------------------------------------------------------


        //Admin Calculation Panel-------------------------------------------------------------------------------------------------------------------------------------------------------
        loadAdminRoomIdCombobox(combobox_admin_calculation_coefficient_room_id);
        loadAdminRoomIdCombobox(combobox_admin_calculation_room_price_room_id);
        hotel = new Hotel();
        hotel = Hotel.getFetch(combobox_admin_calculation_room_price_room_id.getSelectedItem().toString());
        //loadAdminCalculationAccommodationTypeCombobox(hotel);

        //##Admin Calculation Panel-------------------------------------------------------------------------------------------------------------------------------------------------------

        //Admin Search Panel-------------------------------------------------------------------------------------------------------------------------------------------------------
        model_admin_search_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1) return false;
                return super.isCellEditable(row, column);
            }
        };


        Object[] column_admin_search_list = {"Room Id", "Hotel Id", "Hotel Name", "Room Type", "Stock"};
        model_admin_search_list.setColumnIdentifiers(column_admin_search_list);
        row_admin_search_list = new Object[column_admin_search_list.length];
        loadAdminSearchListModel();
        loadAdminSearchCityCombobox(combobox_admin_search_city);
        loadAdminHotelNameCombobox(combobox_admin_search_hotel_name);
        table_admin_search_list.setModel(model_admin_search_list);
        table_admin_search_list.getTableHeader().setReorderingAllowed(false);

        //##Admin Search Panel-------------------------------------------------------------------------------------------------------------------------------------------------------

        //Admin Price Panel-------------------------------------------------------------------------------------------------------------------------------------------------------

        model_admin_price_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1 || column == 2) return false;
                return super.isCellEditable(row, column);
            }
        };

        Object[] column_admin_price_list = {"Id", "Hotel Id", "Room Id", "Adult Price Season 1", "Adult Price Season 2", "Child Price Season 1", "Child Price Season 2"};
        model_admin_price_list.setColumnIdentifiers(column_admin_price_list);
        row_admin_price_list = new Object[column_admin_price_list.length];
        loadAdminPriceListModel();
        loadAdminRoomIdCombobox(combobox_admin_price_add_room_id);
        table_admin_price_list.setModel(model_admin_price_list);
        table_admin_price_list.getTableHeader().setReorderingAllowed(false);


        //##Admin Price Panel-------------------------------------------------------------------------------------------------------------------------------------------------------

        //Admin Reservation Panel-------------------------------------------------------------------------------------------------------------------------------------------------------
        model_admin_reservation_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1 || column == 2 || column == 3) return false;
                return super.isCellEditable(row, column);
            }
        };

        Object[] column_admin_reservation_list = {"Reservation Id", "Hotel Id", "Room Id", "Accommodation Id", "Season", "Contact Person", " Tel", "Email", "Note", "Adult Guests", "Child(ren)", "Price"};
        model_admin_reservation_list.setColumnIdentifiers(column_admin_reservation_list);
        row_admin_reservation_list = new Object[column_admin_reservation_list.length];
        loadAdminReservationListModel();
        loadAdminRoomIdCombobox(combobox_admin_reservation_room_id);
        loadAdminReservationIdCombobox(combobox_admin_reservation_delete_reservation_id);
        table_admin_reservation_list.setModel(model_admin_reservation_list);
        table_admin_reservation_list.getTableHeader().setReorderingAllowed(false);


        table_admin_reservation_list.getModel().addTableModelListener(e -> {
            int selectedRow = table_admin_reservation_list.getSelectedRow();
            if (e.getType() == TableModelEvent.UPDATE) {
                int id = Integer.parseInt(table_admin_reservation_list.getValueAt(selectedRow, 0).toString());
                int hotel_id = Integer.parseInt(table_admin_reservation_list.getValueAt(selectedRow, 1).toString());
                int room_id = Integer.parseInt(table_admin_reservation_list.getValueAt(selectedRow, 2).toString());
                String accommodation_type = table_admin_reservation_list.getValueAt(selectedRow, 3).toString();
                int season = Integer.parseInt(table_admin_reservation_list.getValueAt(selectedRow, 4).toString());
                String contact_name = table_admin_reservation_list.getValueAt(selectedRow, 5).toString();
                String contact_phone = table_admin_reservation_list.getValueAt(selectedRow, 6).toString();
                String contact_email = table_admin_reservation_list.getValueAt(selectedRow, 7).toString();
                String note = table_admin_reservation_list.getValueAt(selectedRow, 8).toString();
                int adult_guest_count = Integer.parseInt(table_admin_reservation_list.getValueAt(selectedRow, 9).toString());
                int child_guest_count = Integer.parseInt(table_admin_reservation_list.getValueAt(selectedRow, 10).toString());
                //   int price = Integer.parseInt(table_admin_reservation_list.getValueAt(selectedRow,11).toString());

//                if (Reservation.update(id, "All In", "14.06.2025", contact_name, contact_phone, contact_email, "111111111111", note, "1", "1", "1", "adult", "", "", "", "adult", "3", "3", "3", "child")) {
//                    Helper.showMessage("success");
//                }
//                loadAdminReservationListModel();

            }

        });

        //##Admin Reservation Panel-------------------------------------------------------------------------------------------------------------------------------------------------------


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

            String name = field_admin_hotel_add_name.getText();
            String city = field_admin_hotel_add_city.getText();
            String region = field_admin_hotel_add_region.getText();
            String address = field_admin_hotel_add_address.getText();
            String email = field_admin_hotel_add_email.getText();
            String phone = field_admin_hotel_add_phone.getText();

            ArrayList<Boolean> adminHotelAddFacilityFeatureList = new ArrayList<>();
//            adminHotelAddFacilityFeatureList.add(checkbox_admin_hotel_add_feature_free_parking.isSelected());
//            adminHotelAddFacilityFeatureList.add(checkbox_admin_hotel_add_feature_free_wifi.isSelected());
//            adminHotelAddFacilityFeatureList.add(checkbox_admin_hotel_add_feature_pool.isSelected());
//            adminHotelAddFacilityFeatureList.add(checkbox_admin_hotel_add_feature_fitness_center.isSelected());
//            adminHotelAddFacilityFeatureList.add(checkbox_admin_hotel_add_feature_hotel_corcierge.isSelected());
//            adminHotelAddFacilityFeatureList.add(checkbox_admin_hotel_add_feature_spa.isSelected());
//            adminHotelAddFacilityFeatureList.add(checkbox_admin_hotel_add_feature_room_service.isSelected());
////Feature.createStringHotelFeatureList(field_admin_hotel_add)
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
//            if (checkbox_admin_hotel_add_feature_free_parking.isSelected()) {
//                boolean freeParking = true;
//            }
//            if (checkbox_admin_hotel_add_feature_free_wifi.isSelected()) {
//            }


            //   String star = field_admin_hotel_add_star.getText();
            String star = combobox_admin_hotel_add_star.getSelectedItem().toString();


            if (Helper.isAnyFieldEmpty(adminHotelAddTextFieldList) || combobox_admin_hotel_add_star.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                if (Hotel.add(name, city, region, address, email, phone, star/*, stringHotelFacilityFeatureList*/)) {
                    Helper.showMessage("success");
                    loadAdminHotelListModel();
                    //   loadAdminFeatureHotelNameCombobox();
                }
            }
            for (int i = 0; i <= adminHotelAddTextFieldList.size() - 1; i++) {
                adminHotelAddTextFieldList.get(i).setText("");
            }
            loadAdminHotelNameCombobox(combobox_admin_feature_add_hotel_name);
            loadAdminHotelNameCombobox(combobox_admin_accommodation_add_hotel_name);
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
            String selectedHotelName = combobox_admin_feature_add_hotel_name.getSelectedItem().toString();

            boolean free_parking = checkbox_admin_feature_add_free_parking.isSelected();
            boolean free_wifi = checkbox_admin_feature_add_free_wifi.isSelected();
            boolean pool = checkbox_admin_feature_add_pool.isSelected();
            boolean fitness_center = checkbox_admin_feature_add_pool.isSelected();
            boolean hotel_concierge = checkbox_admin_feature_add_hotel_concierge.isSelected();
            boolean spa = checkbox_admin_feature_add_spa.isSelected();
            boolean room_service = checkbox_admin_feature_add_room_service.isSelected();


            if (combobox_admin_feature_add_hotel_name.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                int hotel_id = (Hotel.getFetch(selectedHotelName)).getId();

                if (Feature.add(hotel_id, free_parking, free_wifi, pool, fitness_center, hotel_concierge, spa, room_service)) {
                    Helper.showMessage("success");
                    loadAdminFeatureListModel();
                }
            }
            //   field_admin_feature_add_hotel_id.setText(null);
            //  combobox_admin_feature_add_hotel_name.set
        });

//        combobox_admin_feature_add_hotel_name.addActionListener(e -> {
//
//if(combobox_admin_feature_add_hotel_name.getSelectedItem().equals(null)||combobox_admin_feature_add_hotel_name.getSelectedItem().equals("")){}
//else {
//    int selectedHotelId = (Hotel.getFetchByHotelId(combobox_admin_feature_add_hotel_name.getSelectedItem().toString())).getId();
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
//        combobox_admin_accommodation_add_hotel_name.addActionListener(e -> {
//            Item hotelNameItem = (Item) combobox_admin_accommodation_add_hotel_name.getSelectedItem();
//            for (Hotel obj : Hotel.getList()) {
//                if (hotelNameItem.getKey() == obj.getId()) {
//                    field_admin_accommodation_add_hotel_id.setText(String.valueOf(obj.getId()));
//                }
//            }
//        });
        button_admin_accommodation_add_.addActionListener(e -> {

            String selectedHotelName = combobox_admin_accommodation_add_hotel_name.getSelectedItem().toString();

            //int hotel_id = (Integer) Integer.parseInt(field_admin_accommodation_add_hotel_id.getText());
            boolean ultra_all_inclusive = checkbox_admin_accommodation_add_ultra_all_inclusive.isSelected();
            boolean all_in = checkbox_admin_accommodation_add_all_in.isSelected();
            boolean bed_and_breakfast = checkbox_admin_accommodation_add_bed_and_breakfast.isSelected();
            boolean full_board = checkbox_admin_accommodation_add_full_board.isSelected();
            boolean half_board = checkbox_admin_accommodation_add_half_board.isSelected();
            boolean bed_only = checkbox_admin_accommodation_add_bed_only.isSelected();
            boolean excluding_alcohol_full_credit = checkbox_admin_accommodation_add_excluding_alcohol_full_credit.isSelected();

            if (combobox_admin_accommodation_add_hotel_name.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                int hotel_id = (Hotel.getFetch(selectedHotelName)).getId();
                if (Accommodation.add(hotel_id, ultra_all_inclusive, all_in, bed_and_breakfast, full_board, half_board, bed_only, excluding_alcohol_full_credit)) {
                    Helper.showMessage("success");
                    loadAdminAccommodationListModel();
                }
//                field_admin_accommodation_add_hotel_id.setText(null);
                //              combobox_admin_accommodation_add_hotel_name.setSelectedItem(combobox_admin_accommodation_add_hotel_name.getItemAt(0));

            }

        });
        button_admin_season_add.addActionListener(e -> {
            if (combobox_admin_season_add_hotel_name.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                int hotel_id = Helper.getHotelIdFromSelectedHotelName(combobox_admin_season_add_hotel_name);
                boolean season_1 = checkbox_admin_season_add_season_1.isSelected();
                boolean season_2 = checkbox_admin_season_add_season_2.isSelected();

                if (Season.add(hotel_id, season_1, season_2)) {
                    Helper.showMessage("success");
                    loadAdminSeasonListModel();
                }
            }

        });
        button_admin_room_add.addActionListener(e -> {
            if (combobox_admin_room_add_hotel_name.getSelectedItem().toString().isEmpty() || combobox_admin_room_add_room_type.getSelectedItem().toString().isEmpty() || field_admin_room_add_stock.getText().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                int hotel_id = Helper.getHotelIdFromSelectedHotelName(combobox_admin_room_add_hotel_name);
                String room_type = combobox_admin_room_add_room_type.getSelectedItem().toString();
                int stock = (Integer) Integer.parseInt(field_admin_room_add_stock.getText());

                if (Room.add(hotel_id, room_type, stock)) {
                    Helper.showMessage("success");
                    loadAdminRoomListModel();
                    loadAdminRoomIdCombobox(combobox_admin_roomfeature_add_room_id);
                    loadAdminRoomIdCombobox(combobox_admin_calculation_coefficient_room_id);
                }
            }
        });
        button_admin_roomfeature_add.addActionListener(e -> {
            if (combobox_admin_roomfeature_add_room_id.getSelectedItem().toString().isEmpty() || field_admin_roomfeature_bed_count.getText().isEmpty() || field_admin_roomfeature_squaremeters.getText().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                int room_id = (Integer) Integer.parseInt(combobox_admin_roomfeature_add_room_id.getSelectedItem().toString());
                int hotel_id = Room.getFetch(room_id).getHotel_id();
                int bed_count = (Integer) Integer.parseInt(field_admin_roomfeature_bed_count.getText());
                int squaremeters = (Integer) Integer.parseInt(field_admin_roomfeature_squaremeters.getText());
                boolean tv = checkbox_admin_roomfeature_tv.isSelected();
                boolean minibar = checkbox_admin_roomfeature_minibar.isSelected();
                boolean console = checkbox_admin_roomfeature_console.isSelected();
                boolean safe = checkbox_admin_roomfeature_safe.isSelected();
                boolean projector = checkbox_admin_roomfeature_projector.isSelected();
                if (Roomfeature.add(hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector)) {
                    Helper.showMessage("success");
                    loadAdminRoomfeatureListModel();
                }
            }
        });
        button_admin_calculation_calculate_coefficient.addActionListener(e -> {
            if (combobox_admin_calculation_coefficient_room_id.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                int selectedRoom_id = (Integer) Integer.parseInt(combobox_admin_calculation_coefficient_room_id.getSelectedItem().toString());
                double calculatedCurrentCoefficient = Calculation.calculateCurrentCoefficient(selectedRoom_id);
                field_admin_calculation_calculated_coefficient.setText(String.valueOf(calculatedCurrentCoefficient));
            }

        });
        button_admin_calculation_calcultate_room_price.addActionListener(e -> {
            if (combobox_admin_calculation_room_price_room_id.getSelectedItem().toString().isEmpty() || combobox_admin_calculation_adult_guest_number.getSelectedItem().toString().isEmpty() || field_admin_calculation_start_date.getText().isEmpty() || field_admin_calculation_duration.getText().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                int selected_room_id = (Integer) Integer.parseInt(combobox_admin_calculation_room_price_room_id.getSelectedItem().toString());
                int adultGuestCount = Helper.convertComboboxItemToInt(combobox_admin_calculation_adult_guest_number);
                int childGuestCount = Helper.convertComboboxItemToInt(combobox_admin_calculation_child_guest_number);
                int selectedSeason = Season.seasonDecider(field_admin_calculation_start_date.getText());
                int duration = (Integer) Integer.parseInt(field_admin_calculation_duration.getText());
                String selectedAccommodationType = combobox_admin_calculation_accommodation_type.getSelectedItem().toString();
                double calculatedRoomPrice = Calculation.calculateReservationPrice(selected_room_id, selectedSeason, selectedAccommodationType, adultGuestCount, childGuestCount, duration);

                field_admin_calculation_calculated_room_price.setText(String.valueOf(calculatedRoomPrice));


            }

        });
        button_admin_search.addActionListener(e -> {
            if ((field_admin_search_check_in_date.getText().isEmpty() || field_admin_search_check_out_date.getText().isEmpty()) && combobox_admin_search_city.getSelectedItem().toString().isEmpty() && combobox_admin_search_hotel_name.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                String start_date = field_admin_search_check_in_date.getText();
                String end_date = field_admin_search_check_out_date.getText();
                String city = combobox_admin_search_city.getSelectedItem().toString();
                String hotel_name = combobox_admin_search_hotel_name.getSelectedItem().toString();
//loadAdminSearchListModel(Room.searchRoomList(Room.searchQuery(start_date,end_date,city,hotel_name)));
//loadAdminSearchListModel(Price.search(field_admin_search_start_date.getText(), field_admin_search_end_date.getText(), combobox_admin_search_city.getSelectedItem().toString(),Hotel.getFetchByHotelId(combobox_admin_search_hotel_name.getSelectedItem().toString()).getId());
                if (field_admin_search_check_in_date.getText().isEmpty() && field_admin_search_check_out_date.getText().isEmpty() && combobox_admin_search_hotel_name.getSelectedItem().toString().isEmpty()) {
                    String selectedCity = combobox_admin_search_city.getSelectedItem().toString();
                    loadAdminSearchListModel(Room.getListByCity(selectedCity));
                }
                if (field_admin_search_check_in_date.getText().isEmpty() && field_admin_search_check_out_date.getText().isEmpty() && combobox_admin_search_city.getSelectedItem().toString().isEmpty()) {
                    String selectedHotelName = combobox_admin_search_hotel_name.getSelectedItem().toString();
                    loadAdminSearchListModel(Room.getListByHotelName(selectedHotelName));
                }
                if (combobox_admin_search_city.getSelectedItem().toString().isEmpty() && combobox_admin_search_hotel_name.getSelectedItem().toString().isEmpty()) {
                    String selectedStartDate = field_admin_search_check_in_date.getText();
                    String selectedEndDate = field_admin_search_check_out_date.getText();
                    int selectedSeason = Season.seasonDecider(selectedStartDate);
                    loadAdminSearchListModel(Room.getListBySeason(selectedSeason));
                }
            }
        });
        button_admin_price_add.addActionListener(e -> {
            ArrayList<JTextField> textFieldList = new ArrayList<>();
            textFieldList.add(field_admin_price_add_adult_price_1);
            textFieldList.add(field_admin_price_add_adult_price_2);
            textFieldList.add(field_admin_price_add_child_price_1);
            textFieldList.add(field_admin_price_add_child_price_2);

            if (combobox_admin_price_add_room_id.getSelectedItem().toString().isEmpty() || Helper.isAnyFieldEmpty(textFieldList)) {
                Helper.showMessage("fill");
            } else {
                int room_id = Integer.parseInt(combobox_admin_price_add_room_id.getSelectedItem().toString());
                int hotel_id = Room.getFetch(room_id).getHotel_id();
                int adult_price_1 = Integer.parseInt(field_admin_price_add_adult_price_1.getText());
                int adult_price_2 = Integer.parseInt(field_admin_price_add_adult_price_2.getText());
                int child_price_1 = Integer.parseInt(field_admin_price_add_child_price_1.getText());
                int child_price_2 = Integer.parseInt(field_admin_price_add_child_price_2.getText());

                if (Price.add(hotel_id, room_id, adult_price_1, adult_price_2, child_price_1, child_price_2)) {
                    Helper.showMessage("success");
                    loadAdminPriceListModel();
                }
            }

            for (int i = 0; i < textFieldList.size() - 1; i++) {
                textFieldList.get(i).setText("");
            }
        });
        button_admin_reservation_add.addActionListener(e -> {
            ArrayList<JTextField> textFieldList = new ArrayList<>();

            textFieldList.add(field_admin_reservation_contact_name);
            textFieldList.add(field_admin_reservation_contact_id_no);
            textFieldList.add(field_admin_reservation_contact_phone);
            textFieldList.add(field_admin_reservation_contact_email);
            textFieldList.add(field_admin_reservation_contact_note);
            textFieldList.add(field_admin_reservation_guest_1_name);
            textFieldList.add(field_admin_reservation_guest_1_country);
            textFieldList.add(field_admin_reservation_guest_1_id_no);

            if (Helper.isAnyFieldEmpty(textFieldList) || combobox_admin_reservation_room_id.getSelectedItem().toString().isEmpty())
                Helper.showMessage("fill");
            else {
                if (!combobox_admin_reservation_room_id.getSelectedItem().toString().isEmpty()) {
                    int room_id = (Integer) Integer.parseInt(combobox_admin_reservation_room_id.getSelectedItem().toString());
                    Hotel hotel = Hotel.getFetch(Room.getFetch(room_id).getHotel_id());
                    int hotel_id = hotel.getId();
                    field_admin_reservation_hotel_feature.setText(Feature.createStringHotelFeatureList(hotel_id));
                    field_admin_reservation_room_feature.setText(Roomfeature.createStringRoomFeatureList(room_id));
                    field_admin_reservation_accommodation.setText(Accommodation.createStringHotelAccommodationTypeList(hotel_id));
                    String selectedAccommodation_type = "bed_and_breakfast";
                    String accommodation_type = selectedAccommodation_type;
                    field_admin_reservation_season.setText("1");
                    String check_in_date = "12.06.2025";
                    String check_out_date = "15_06_2025";
                    String contact_name = field_admin_reservation_contact_name.getText();
                    String contact_phone = field_admin_reservation_contact_phone.getText();
                    String contact_email = field_admin_reservation_contact_email.getText();
                    String contact_id_no = field_admin_reservation_contact_id_no.getText();
                    String contact_note = field_admin_reservation_contact_note.getText();
                    String guest_1_name = field_admin_reservation_guest_1_name.getText();
                    String guest_1_country = field_admin_reservation_guest_1_country.getText();
                    String guest_1_id_no = field_admin_reservation_guest_1_id_no.getText();
                    String guest_2_name = field_admin_reservation_guest_2_name.getText();
                    String guest_2_country = field_admin_reservation_guest_2_country.getText();
                    String guest_2_id_no = field_admin_reservation_guest_2_id_no.getText();
                    String guest_3_name = field_admin_reservation_guest_3_name.getText();
                    String guest_3_country = field_admin_reservation_guest_3_country.getText();
                    String guest_3_id_no = field_admin_reservation_guest_3_id_no.getText();


                    if (Reservation.add(
                            room_id,
                            hotel_id,
                            accommodation_type,
                            check_in_date,
                            check_out_date,
                            contact_name,
                            contact_phone,
                            contact_email,
                            contact_id_no,
                            contact_note,
                            guest_1_name,
                            guest_1_country,
                            guest_1_id_no,
                            "adult",
                            guest_2_name,
                            guest_2_country,
                            guest_2_id_no,
                            "adult",
                            guest_3_name,
                            guest_3_country,
                            guest_3_id_no,
                            "child")) {
                        Helper.showMessage("success");
                        Helper.decreaseRoomStockOne(room_id);
                        loadAdminReservationListModel();
                        loadAdminRoomListModel();
                        loadAdminReservationIdCombobox(combobox_admin_reservation_delete_reservation_id);
                        Helper.emptyFields(textFieldList);
                    }
                }
            }


        });
        button_admin_reservation_delete.addActionListener(e -> {
            if (combobox_admin_reservation_delete_reservation_id.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                if (Helper.confirm("sure")) {
                    int selected_reservation_id = (Integer) Integer.parseInt(combobox_admin_reservation_delete_reservation_id.getSelectedItem().toString());
                    if (Reservation.delete(selected_reservation_id)) {
                        int room_id;
                        room_id = Reservation.getFetch(selected_reservation_id).getRoom_id();
                        Helper.showMessage("success");
                        Helper.increaseRoomStockOne(room_id);
                        loadAdminReservationListModel();
                        loadAdminRoomListModel();
                    }
                }
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

    public void loadAdminSeasonListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_admin_season_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Season obj : Season.getList()) {
            i = 0;
            row_admin_season_list[i++] = obj.getId();
            row_admin_season_list[i++] = obj.getHotel_id();
            row_admin_season_list[i++] = obj.isSeason_1();
            row_admin_season_list[i++] = obj.isSeason_2();
            model_admin_season_list.addRow(row_admin_season_list);
        }
    }

    public void loadAdminRoomListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_admin_room_list.getModel();
        clearModel.setRowCount(0);

        int i;

        for (Room obj : Room.getList()) {
            i = 0;
            row_admin_room_list[i++] = obj.getId();
            row_admin_room_list[i++] = obj.getHotel_id();
            row_admin_room_list[i++] = obj.getRoom_type();
            row_admin_room_list[i++] = obj.getStock();
            model_admin_room_list.addRow(row_admin_room_list);
        }
    }

    public void loadAdminRoomfeatureListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_admin_roomfeature_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Roomfeature obj : Roomfeature.getList()) {
            i = 0;
            row_admin_roomfeature_list[i++] = obj.getId();
            row_admin_roomfeature_list[i++] = obj.getHotel_id();
            row_admin_roomfeature_list[i++] = obj.getRoom_id();
            row_admin_roomfeature_list[i++] = obj.getBed_count();
            row_admin_roomfeature_list[i++] = obj.getSquaremeters();
            row_admin_roomfeature_list[i++] = obj.isTv();
            row_admin_roomfeature_list[i++] = obj.isMinibar();
            row_admin_roomfeature_list[i++] = obj.isConsole();
            row_admin_roomfeature_list[i++] = obj.isSafe();
            row_admin_roomfeature_list[i++] = obj.isProjector();
            model_admin_roomfeature_list.addRow(row_admin_roomfeature_list);
        }
    }

    public void loadAdminSearchListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_admin_search_list.getModel();
        clearModel.setRowCount(0);

        int i;
        for (Room obj : Room.getList()) {
            i = 0;
            row_admin_search_list[i++] = obj.getId();
            row_admin_search_list[i++] = obj.getHotel_id();
            row_admin_search_list[i++] = Hotel.getFetch(obj.getHotel_id()).getName();
            row_admin_search_list[i++] = obj.getRoom_type();
            row_admin_search_list[i++] = obj.getStock();
            model_admin_search_list.addRow(row_admin_search_list);
        }
    }

    public void loadAdminSearchListModel(ArrayList<Room> roomListByCity) {
        DefaultTableModel clearModel = (DefaultTableModel) table_admin_search_list.getModel();
        clearModel.setRowCount(0);

        int i;
        for (Room obj : roomListByCity) {
            i = 0;
            row_admin_search_list[i++] = obj.getId();
            row_admin_search_list[i++] = obj.getHotel_id();
            row_admin_search_list[i++] = Hotel.getFetch(obj.getHotel_id()).getName();
            row_admin_search_list[i++] = obj.getRoom_type();
            row_admin_search_list[i++] = obj.getStock();
            int price = Price.getFetchByRoomId(obj.getId()).getAdult_price_1();
            int stock = obj.getStock();
            if ((price == 0 || price > 0) && stock > 0) {
                model_admin_search_list.addRow(row_admin_search_list);
            }
        }
    }

    public void loadAdminPriceListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_admin_price_list.getModel();
        clearModel.setRowCount(0);

        int i;
        for (Price obj : Price.getList()) {
            i = 0;
            row_admin_price_list[i++] = obj.getId();
            row_admin_price_list[i++] = obj.getHotel_id();
            row_admin_price_list[i++] = obj.getRoom_id();
            row_admin_price_list[i++] = obj.getAdult_price_1();
            row_admin_price_list[i++] = obj.getAdult_price_2();
            row_admin_price_list[i++] = obj.getChild_price_1();
            row_admin_price_list[i++] = obj.getChild_price_2();
            model_admin_price_list.addRow(row_admin_price_list);
        }
    }

    public void loadAdminReservationListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_admin_reservation_list.getModel();
        clearModel.setRowCount(0);

        int i;
        int adultGuestCount;
        int childGuestCount;

        for (Reservation obj : Reservation.getList()) {
            i = 0;
            row_admin_reservation_list[i++] = obj.getId();
            row_admin_reservation_list[i++] = obj.getHotel_id();
            row_admin_reservation_list[i++] = obj.getRoom_id();
            row_admin_reservation_list[i++] = obj.getAccommodation_type();
            int season = 1;
            //Season.seasonDecider(obj.getCheck_in_date());
            row_admin_reservation_list[i++] = season;
            row_admin_reservation_list[i++] = obj.getContact_name();
            row_admin_reservation_list[i++] = obj.getContact_phone();
            row_admin_reservation_list[i++] = obj.getContact_email();
            row_admin_reservation_list[i++] = obj.getNote();
            adultGuestCount = Helper.calculateGuestCount(obj.getGuest_1_name(), obj.getGuest_2_name());
            row_admin_reservation_list[i++] = adultGuestCount;
            childGuestCount = Helper.calculateGuestCount(obj.getGuest_3_name());
            row_admin_reservation_list[i++] = childGuestCount;
            //   int duration = Helper.calculateDuration(obj.getCheck_in_date(), obj.getCheck_out_date());
            row_admin_reservation_list[i++] = "will be calculated later";
            //   row_admin_reservation_list[i++] = Calculation.calculateReservationPrice(obj.getRoom_id(),adultGuestCount,childGuestCount,season,duration);
//            row_admin_reservation_list[i++] = obj.getGuest_1_type();
//            row_admin_reservation_list[i++] = obj.getGuest_2_name();
////            row_admin_reservation_list[i++] = obj.getGuest_2_country();
//            row_admin_reservation_list[i++] = obj.getGuest_2_id_no();
//            row_admin_reservation_list[i++] = obj.getGuest_2_type();
//            row_admin_reservation_list[i++] = obj.getGuest_3_name();
//            row_admin_reservation_list[i++] = obj.getGuest_3_country();
//            row_admin_reservation_list[i++] = obj.getGuest_3_id_no();
//            row_admin_reservation_list[i++] = obj.getGuest_3_type();

            model_admin_reservation_list.addRow(row_admin_reservation_list);

        }
    }


//    public void loadcompleteRoomInfoList(){
//        DefaultTableModel clearModel = (DefaultTableModel) table_admin_search_list.getModel();
//        clearModel.setRowCount(0);
//
//        int i;
//        for(Object obj:Room.getCompleteRoomInfoList()){
//            Room room=new Room();
//            room=
//            for(int i=0;i<=5,i++){
//                switch (i) {
//                    case 0:
//                        i=0;
//                        row_admin_search_list[i++]=obj[0].getId();
//                        break;
//                    case:1:
//break;
//                    case 2:
//                        break;
//                    case 3:
//                        break;
//                    case 4:
//                        break;
//                    case 5:
//                        break;
//                    default :
//                        break;
//                }
//            }
//        }
//    }

//    public void loadAdminAccommodationHotelNameCombobox() {
//        combobox_admin_accommodation_add_hotel_name.removeAllItems();
//        combobox_admin_accommodation_add_hotel_name.addItem(new Item(0, ""));
//
//        for (Hotel obj : Hotel.getList()) {
//            combobox_admin_accommodation_add_hotel_name.addItem(new Item(obj.getId(), obj.getName()));
//        }
//    }

    public void loadAdminHotelNameCombobox(JComboBox combobox) {
        combobox.removeAllItems();
        combobox.addItem(new Item(0, ""));
        for (Hotel obj : Hotel.getList()) {
            combobox.addItem(new Item(obj.getId(), obj.getName()));
        }
    }

    public void loadAdminRoomIdCombobox(JComboBox combobox) {
        combobox.removeAllItems();
        combobox.addItem(new Item(0, ""));
        for (Room obj : Room.getList()) {
            combobox.addItem(new Item(obj.getId(), String.valueOf(obj.getId())));

        }
    }

    public void loadAdminCalculationAccommodationTypeCombobox(Hotel hotel) {
        combobox_admin_calculation_accommodation_type.removeAllItems();
        int i;
        i = 0;
        combobox_admin_calculation_accommodation_type.addItem(new Item(i++, ""));

        Accommodation a = Accommodation.getFetch(hotel.getId());
        if (a.isUltra_all_inclusive()) {
            combobox_admin_calculation_accommodation_type.addItem(new Item(i++, "Ultra All Inclusive"));
        }

        if (a.isAll_in()) {
            combobox_admin_calculation_accommodation_type.addItem(new Item(i++, "All In"));
        }

        if (a.isBed_and_breakfast()) {
            combobox_admin_calculation_accommodation_type.addItem(new Item(i++, "Bed And Breakfast"));
        }

        if (a.isFull_board()) {
            combobox_admin_calculation_accommodation_type.addItem(new Item(i++, "Full Board"));
        }

        if (a.isHalf_board()) {
            combobox_admin_calculation_accommodation_type.addItem(new Item(i++, "Half Board"));
        }

        if (a.isBed_only()) {
            combobox_admin_calculation_accommodation_type.addItem(new Item(i++, "Bed Only"));
        }

        if (a.isExcluding_alcohol_full_credit()) {
            combobox_admin_calculation_accommodation_type.addItem(new Item(i++, "Excluding Alcohol Full Credit"));

        }
    }

    public void loadAdminSearchCityCombobox(JComboBox combobox) {
        combobox.removeAllItems();
        combobox.addItem(new Item(0, ""));
        for (Hotel obj : Hotel.getList()) {
            combobox.addItem(new Item(obj.getId(), obj.getCity()));
        }
    }


    public void loadAdminReservationIdCombobox(JComboBox combobox) {
        combobox.removeAllItems();
        combobox.addItem(new Item(0, ""));
        for (Reservation obj : Reservation.getList()) {
            combobox.addItem(new Item(obj.getId(), String.valueOf(obj.getId())));
        }
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}