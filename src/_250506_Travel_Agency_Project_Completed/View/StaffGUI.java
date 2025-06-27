package _250506_Travel_Agency_Project_Completed.View;

import _250506_Travel_Agency_Project_Completed.Helper.Config;
import _250506_Travel_Agency_Project_Completed.Helper.Helper;
import _250506_Travel_Agency_Project_Completed.Helper.Item;
import _250506_Travel_Agency_Project_Completed.Model.*;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class StaffGUI extends JFrame {
    private final Staff staff;
    private JPanel wrapper;
    private JPanel panel_staff_top;
    private JTabbedPane tabbed_panel_staff;
    private JLabel label_staff_welcome;
    private JButton button_staff_logout;
    private JPanel panel_staff_hotel;
    private JPanel panel_staff_room;
    private JPanel panel_staff_season;
    private JPanel panel_staff_price;
    private JPanel panel_staff_search;
    private JPanel panel_staff_reservation;
    private JTable table_staff_hotel_list;
    private JScrollPane scroll_panel_staff_hotel;
    private JPanel panel_staff_hotel_add;
    private JLabel label_staff_hotel_add_title;
    private JTextField field_staff_hotel_add_name;
    private JTextField field_staff_hotel_add_city;
    private JTextField field_staff_hotel_add_region;
    private JTextField field_staff_hotel_add_address;
    private JTextField field_staff_hotel_add_email;
    private JTextField field_staff_hotel_add_phone;
    private JTextField field_staff_hotel_add_star;
    private JButton button_staff_hotel_add;
    private JLabel label_staff_hotel_add_name;
    private JLabel label_staff_hotel_add_city;
    private JLabel label_staff_hotel_add_region;
    private JLabel label_staff_hotel_add_address;
    private JLabel label_staff_hotel_add_email;
    private JLabel label_staff_hotel_add_phone;
    private JLabel label_staff_hotel_add_star;
    private JTextField field_staff_hotel_delete_hotel_id;
    private JPanel panel_staff_hotel_delete;
    private JLabel label_staff_hotel_delete_title;
    private JLabel label_staff_hotel_delete_hotel_id;
    private JButton button_staff_hotel_delete;
    private JComboBox combobox_staff_hotel_add_star;
    private JScrollPane scroll_panel_staff_room_list;
    private JPanel panel_staff_room_add;
    private JPanel panel_staff_room_delete;
    private JTable table_staff_room_list;
    private JComboBox combobox_staff_room_add_hotel_name;
    private JComboBox combobox_staff_room_add_room_type;
    private JButton button_staff_room_add;
    private JTextField field_staff_room_delete_room_id;
    private JButton button_staff_room_delete;
    private JLabel label_staff_room_add_title;
    private JLabel label_staff_room_add_hotel_name;
    private JLabel label_staff_room_add_room_type;
    private JLabel label_staff_room_add_stock;
    private JLabel label_staff_room_delete_title;
    private JLabel label_staff_room_delete_room_id;
    private JTextField field_staff_room_add_stock;
    private JScrollPane scroll_panel_staff_season_list;
    private JPanel panel_staff_season_add;
    private JPanel panel_staff_season_delete;
    private JTable table_staff_season_list;
    private JLabel label_staff_season_add_title;
    private JLabel label_staff_season_add_hotel_name;
    private JComboBox combobox_staff_season_add_hotel_name;
    private JCheckBox checkbox_staff_season_add_season_1;
    private JCheckBox checkbox_staff_season_add_season_2;
    private JButton button_staff_season_add;
    private JComboBox combobox_staff_season_delete_season_id;
    private JButton button_staff_season_delete;
    private JLabel label_staff_season_delete_title;
    private JLabel label_staff_season_delete_season_id;
    private JTable table_staff_price_list;
    private JScrollPane scroll_panel_staff_price_list;
    private JComboBox combobox_staff_price_add_room_id;
    private JTextField field_staff_price_add_adult_price_1;
    private JTextField field_staff_price_add_child_price_1;
    private JTextField field_staff_price_add_adult_price_2;
    private JTextField field_staff_price_add_child_price_2;
    private JButton butoon_staff_price_add;
    private JPanel panel_staff_price_add;
    private JLabel label_staff_price_add_title;
    private JLabel label_staff_price_add_room_id;
    private JLabel label_staff_price_add_season_1;
    private JLabel label_staff_price_add_adult_price_1;
    private JLabel label_staff_price_add_child_price_1;
    private JLabel label_staff_price_add_season_2;
    private JLabel label_staff_price_add_adult_price_2;
    private JLabel label_staff_price_add_child_price_2;
    private JComboBox combobox_staff_price_delete_room_id;
    private JButton button_staff_price_delete;
    private JLabel label_staff_price_delete_title;
    private JLabel label_staff_price_delete_room_id;
    private JScrollPane scroll_staff_search_room_list;
    private JPanel panel_staff_search_room;
    private JTable table_staff_search_room_list;
    private JLabel label__staff_search_room_title;
    private JLabel label_staff_search_room_check_in_date;
    private JTextField field_staff_search_room_check_in_date;
    private JTextField field_staff_search_room_check_out_date;
    private JLabel label_staff_search_room_check_out_date;
    private JLabel label_staff_search_room_city;
    private JComboBox combobox_staff_search_room_city;
    private JComboBox combobox_staff_search_room_hotel_name;
    private JLabel label_staff_search_room_hotel_name;
    private JButton button_staff_search_room;
    private JLabel label_staff_search_room_guests;
    private JComboBox combobox_staff_search_room_guest_adult_number;
    private JLabel label_staff_search_room_guest_adult;
    private JComboBox combobox_staff_search_room_guest_child_number;
    private JLabel label_staff_search_room_guest_child;
    private JButton button_staff_reservation_delete;
    private JTable table_staff_reservation_list;
    private JPanel panel_staff_reservation_list;
    private JScrollPane scroll_panel_staff_reservation_list;
    private JLabel label_staff_reservation_delete_reservation_id;
    private JLabel label_staff_reservation_delete_title;
    private JButton button_staff_reservation_update_;
    private JLabel label_staff_reservation_update_title;
    private JLabel label_staff_reservation_update_reservation_id;
    private JComboBox combobox_staff_reservation_delete_reservation_id;
    private JComboBox combobox_staff_reservation_update_reservation_id;
    private JPanel panel_staff_feature;
    private JScrollPane scroll_panel_staff_feature;
    private JTable table_staff_feature_list;
    private JPanel panel_staff_feature_add;
    private JLabel label_staff_feature_add_title;
    private JLabel label_staff_feature_add_hotel_id;
    private JLabel label_staff_feature_add_feature;
    private JCheckBox checkbox_staff_feature_add_free_parking;
    private JCheckBox checkbox_staff_feature_add_free_wifi;
    private JCheckBox checkbox_staff_feature_add_pool;
    private JCheckBox checkbox_staff_feature_add_fitness_center;
    private JCheckBox checkbox_staff_feature_add_hotel_concierge;
    private JCheckBox checkbox_staff_feature_add_spa;
    private JCheckBox checkbox_staff_feature_add_room_service;
    private JButton button_staff_feature_add;
    private JComboBox combobox_staff_feature_add_hotel_name;
    private JPanel panel_staff_accommodation;
    private JScrollPane scroll_panel_staff_accommodation;
    private JTable table_staff_accommodation_list;
    private JPanel panel_staff_accommodation_add;
    private JLabel label_staff_accommodation_add_title;
    private JLabel label_staff_accommodation_add_hotel_name;
    private JComboBox combobox_staff_accommodation_add_hotel_name;
    private JCheckBox checkbox_staff_accommodation_add_ultra_all_inclusive;
    private JCheckBox checkbox_staff_accommodation_add_all_in;
    private JCheckBox checkbox_staff_accommodation_add_bed_and_breakfast;
    private JCheckBox checkbox_staff_accommodation_add_full_board;
    private JCheckBox checkbox_staff_accommodation_add_half_board;
    private JCheckBox checkbox_staff_accommodation_add_bed_only;
    private JCheckBox checkbox_staff_accommodation_add_excluding_alcohol_full_credit;
    private JButton button_staff_accommodation_add_;
    private JPanel panel_staff_roomfeature;
    private JScrollPane scroll_panel_staff_roomfeature;
    private JTable table_staff_roomfeature_list;
    private JPanel panel_staff_roomfeature_add;
    private JLabel label_staff_roomfeature_add_title;
    private JLabel label_staff_roomfeature_add_room_id;
    private JComboBox combobox_staff_roomfeature_add_room_id;
    private JLabel label_staff_roomfeature_bed_count;
    private JTextField field_staff_roomfeature_bed_count;
    private JLabel label_staff_roomfeature_squaremeters;
    private JTextField field_staff_roomfeature_squaremeters;
    private JCheckBox checkbox_staff_roomfeature_tv;
    private JCheckBox checkbox_staff_roomfeature_minibar;
    private JCheckBox checkbox_staff_roomfeature_console;
    private JCheckBox checkbox_staff_roomfeature_safe;
    private JCheckBox checkbox_staff_roomfeature_projector;
    private JButton button_staff_roomfeature_add;
    private JPanel panel_staff_price_delete;
    private DefaultTableModel model_staff_hotel_list;
    private Object[] row_staff_hotel_list;
    private DefaultTableModel model_staff_feature_list;
    private Object[] row_staff_feature_list;
    private DefaultTableModel model_staff_accommodation_list;
    private Object[] row_staff_accommodation_list;
    private DefaultTableModel model_staff_room_list;
    private Object[] row_staff_room_list;
    private DefaultTableModel model_staff_roomfeature_list;
    private Object[] row_staff_roomfeature_list;
    private DefaultTableModel model_staff_season_list;
    private Object[] row_staff_season_list;
    private DefaultTableModel model_staff_price_list;
    private Object[] row_staff_price_list;
    private DefaultTableModel model_staff_search_room_list;
    private Object[] row_staff_search_room_list;
    private JPopupMenu selectRoomMenu;
    private DefaultTableModel model_staff_reservation_list;
    private Object[] row_staff_reservation_list;


    private Accommodation accommodation;
    private Feature feature;
    private Hotel hotel;
    private Price price;
    private Reservation reservation;
    private Room room;
    private Roomfeature roomfeature;
    private Season season;

    public StaffGUI(Staff staff) {
        this.staff = staff;

        add(wrapper);
        setSize(2000, 1000);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        label_staff_welcome.setText("Welcome " + staff.getName());

        //ModelHotelList

        model_staff_hotel_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0)
                    return false;
                return super.isCellEditable(row, column);
            }
        };

        Object[] column_staff_hotel_list = {"Id", "Name", "City", "Region", "Address", "Email", "Phone", "Star"};
        model_staff_hotel_list.setColumnIdentifiers(column_staff_hotel_list);
        row_staff_hotel_list = new Object[column_staff_hotel_list.length];

        loadStaffHotelListModel();

        table_staff_hotel_list.setModel(model_staff_hotel_list);
        table_staff_hotel_list.getTableHeader().setReorderingAllowed(false);
        table_staff_hotel_list.getColumnModel().getColumn(0).setMaxWidth(50);

        table_staff_hotel_list.getSelectionModel().addListSelectionListener(e -> {
            try {
                String selected_hotel_id = table_staff_hotel_list.getValueAt(table_staff_hotel_list.getSelectedRow(), 0).toString();
                field_staff_hotel_delete_hotel_id.setText(selected_hotel_id);
            } catch (Exception e1) {
            }
        });

        table_staff_hotel_list.getModel().addTableModelListener(e -> {
            int selectedRow = table_staff_hotel_list.getSelectedRow();
            if (e.getType() == TableModelEvent.UPDATE) {
                int id = Integer.parseInt(table_staff_hotel_list.getValueAt(selectedRow, 0).toString());
                String name = table_staff_hotel_list.getValueAt(selectedRow, 1).toString();
                String city = table_staff_hotel_list.getValueAt(selectedRow, 2).toString();
                String region = table_staff_hotel_list.getValueAt(selectedRow, 3).toString();
                String address = table_staff_hotel_list.getValueAt(selectedRow, 4).toString();
                String email = table_staff_hotel_list.getValueAt(selectedRow, 5).toString();
                String phone = table_staff_hotel_list.getValueAt(selectedRow, 6).toString();
                String star = table_staff_hotel_list.getValueAt(selectedRow, 7).toString();
                if (Hotel.update(id, name, city, region, address, email, phone, star)) {
                    Helper.showMessage("success");
                }
                loadStaffModelsAndComboboxes();
                clearAllFieldsAndComboboxes();
            }
        });

        // ##ModelHotelList

        //ModelFeatureList-------------------------------------------------------------------------------------------------------------------------------------------------------

        model_staff_feature_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
//                if (column == 0 || column == 1) {
                return false;
                //  }
                //    return super.isCellEditable(row, column);
            }
        };

        Object[] column_staff_feature_list = {"Id", "Hotel Id", "Hotel Name", "Free Parking", "Free Wifi", "Pool", "Fitness Center", "Hotel Corcierge", "SPA", "24/7 Room Service"};
        model_staff_feature_list.setColumnIdentifiers(column_staff_feature_list);
        row_staff_feature_list = new Object[column_staff_feature_list.length];
        loadStaffFeatureListModel();
        //  loadStaffFeatureHotelNameCombobox();
        loadStaffHotelNameCombobox(combobox_staff_feature_add_hotel_name);

        table_staff_feature_list.setModel(model_staff_feature_list);
        table_staff_feature_list.getTableHeader().setReorderingAllowed(false);


        //##ModelFeatureList-------------------------------------------------------------------------------------------------------------------------------------------------------

        //ModelAccommodationList
        model_staff_accommodation_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1)
                    return false;
                return super.isCellEditable(row, column);
            }
        };
        Object[] column_staff_accommodation_list = {"Id", "Hotel Id", "Hotel Name", "Ultra Al Inclusive", "All In", "Bed And Breakfast", "Full Board", "Half Board", "Bed Only", "Excluding Alcohol Full Credit"};
        model_staff_accommodation_list.setColumnIdentifiers(column_staff_accommodation_list);
        row_staff_accommodation_list = new Object[column_staff_accommodation_list.length];

        loadStaffAccommodationListModel();
        loadStaffHotelNameCombobox(combobox_staff_accommodation_add_hotel_name);
        table_staff_accommodation_list.setModel(model_staff_accommodation_list);
        table_staff_accommodation_list.getTableHeader().setReorderingAllowed(false);
        table_staff_accommodation_list.getColumnModel().getColumn(0).setMaxWidth(50);
        table_staff_accommodation_list.getColumnModel().getColumn(1).setMaxWidth(50);


        //##ModelAccommodationList-------------------------------------------------------------------------------------------------------------------------------------------------------


        // ModelRoomList

        model_staff_room_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1 || column == 2)
                    return false;
                return super.isCellEditable(row, column);
            }
        };

        Object[] column_staff_room_list = {"Id", "Hotel Id", "Hotel Name", "Room Type", "Stock"};
        model_staff_room_list.setColumnIdentifiers(column_staff_room_list);
        row_staff_room_list = new Object[column_staff_room_list.length];
        loadStaffRoomListModel();
        table_staff_room_list.setModel(model_staff_room_list);
        table_staff_room_list.getTableHeader().setReorderingAllowed(false);

        table_staff_room_list.getSelectionModel().addListSelectionListener(e -> {
            try {
                String selected_room_id = table_staff_room_list.getValueAt(table_staff_room_list.getSelectedRow(), 0).toString();
                field_staff_room_delete_room_id.setText(selected_room_id);
            } catch (Exception e1) {
            }
        });

        table_staff_room_list.getModel().addTableModelListener(e -> {
            int selectedRow = table_staff_room_list.getSelectedRow();
            if (e.getType() == TableModelEvent.UPDATE) {
                int id = Integer.parseInt(table_staff_room_list.getValueAt(selectedRow, 0).toString());
                int hotel_id = Integer.parseInt(table_staff_room_list.getValueAt(selectedRow, 1).toString());
                String room_type = table_staff_room_list.getValueAt(selectedRow, 3).toString();
                int stock = Integer.parseInt(table_staff_room_list.getValueAt(selectedRow, 4).toString());

                if (Room.update(id, hotel_id, room_type, stock)) {
                    Helper.showMessage("success");
                } else {
                    Helper.showMessage("error");
                }
                loadStaffModelsAndComboboxes();
                clearAllFieldsAndComboboxes();
            }
        });


        // ##ModelRoomList

        //ModelRoomfeatureList-------------------------------------------------------------------------------------------------------------------------------------------------------

        model_staff_roomfeature_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
//                if (column == 0 || column == 1 || column == 2) {
                return false;
//                }
//                return super.isCellEditable(row, column);
            }
        };

        Object[] column_staff_roomfeature_list = {"Id", "Hotel Id", "Hotel Name", "Room Id", "Bed Count", "Square Meters", "Tv", "Minibar", "Console", "Safe", "Projector"};
        model_staff_roomfeature_list.setColumnIdentifiers(column_staff_roomfeature_list);
        row_staff_roomfeature_list = new Object[column_staff_roomfeature_list.length];
        loadStaffRoomfeatureListModel();
        loadStaffRoomIdCombobox(combobox_staff_roomfeature_add_room_id);

        table_staff_roomfeature_list.setModel(model_staff_roomfeature_list);
        table_staff_roomfeature_list.getTableHeader().setReorderingAllowed(false);


        //##ModelRoomfeatureList-------------------------------------------------------------------------------------------------------------------------------------------------------


        // ModelSeasonList

        model_staff_season_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {

//UPDATING is canceled cause is not required in the project.                if (column == 0 || column == 1 || column == 2)
                return false;
                //   return super.isCellEditable(row, column);
            }
        };

        Object[] column_staff_season_list = {"Id", "Hotel Id", "Hotel Name", "Season 1 (01.01.2025-31.05.2025)", "Season 2 (01.06.2025-31.12.2025)"};
        model_staff_season_list.setColumnIdentifiers(column_staff_season_list);

        row_staff_season_list = new Object[column_staff_season_list.length];
        loadStaffSeasonListModel();
        table_staff_season_list.setModel(model_staff_season_list);
        table_staff_season_list.getTableHeader().setReorderingAllowed(false);
/* Model Season List Update
        table_staff_season_list.getModel().addTableModelListener(e -> {
            int selectedRow = table_staff_season_list.getSelectedRow();
            if (e.getType() == TableModelEvent.UPDATE) {
                int id = Integer.parseInt(table_staff_season_list.getValueAt(selectedRow, 0).toString());
                String season_1 = table_staff_season_list.getValueAt(selectedRow, 3).toString();
                String season_2 = table_staff_season_list.getValueAt(selectedRow, 4).toString();
                if (Season.update(id, season_1, season_2)) {
                    Helper.showMessage("success");
                    loadStaffPriceListModel();
                }
                loadStaffSeasonListModel();
            }
        });

 */


        // ##ModelSeasonList

        // ModelPriceList

        model_staff_price_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1 || column == 2)
                    return false;
                return super.isCellEditable(row, column);
            }
        };

        Object[] column_staff_price_list = {"Id", "Room Id", "Hotel Id", "Hotel Name", "Adult Price Season 1", "Adult Price Season 2", "Child Price Season 1", "Child Price Season 2"};
        model_staff_price_list.setColumnIdentifiers(column_staff_price_list);
        row_staff_price_list = new Object[column_staff_price_list.length];
        loadStaffPriceListModel();
        loadStaffRoomIdCombobox(combobox_staff_price_add_room_id);
        loadStaffRoomIdCombobox(combobox_staff_price_delete_room_id);

        table_staff_price_list.setModel(model_staff_price_list);
        table_staff_price_list.getTableHeader().setReorderingAllowed(false);

        table_staff_price_list.getModel().addTableModelListener(e -> {
            int selectedRow = table_staff_price_list.getSelectedRow();
            if (e.getType() == TableModelEvent.UPDATE) {
                //int id = Integer.parseInt(table_staff_price_list.getValueAt(selectedRow,0).toString());
                int hotel_id = Integer.parseInt(table_staff_price_list.getValueAt(selectedRow, 2).toString());
                //String hotel_name = table_staff_price_list.getValueAt(selectedRow,2).toString();
                int room_id = Integer.parseInt(table_staff_price_list.getValueAt(selectedRow, 1).toString());
                boolean season1 = Season.getFetchByHotelId(hotel_id).isSeason_1();
                boolean season2 = Season.getFetchByHotelId(hotel_id).isSeason_2();
                int adult_price_1;
                int child_price_1;
                int adult_price_2;
                int child_price_2;
                if (season1) {
                    adult_price_1 = Integer.parseInt(table_staff_price_list.getValueAt(selectedRow, 4).toString());
                    child_price_1 = Integer.parseInt(table_staff_price_list.getValueAt(selectedRow, 6).toString());
                } else {
                    adult_price_1 = 0;
                    child_price_1 = 0;
                }
                if (season2) {
                    adult_price_2 = Integer.parseInt(table_staff_price_list.getValueAt(selectedRow, 5).toString());
                    child_price_2 = Integer.parseInt(table_staff_price_list.getValueAt(selectedRow, 7).toString());
                } else {
                    adult_price_2 = 0;
                    child_price_2 = 0;
                }
//                if (adult_price_1 == 0 || child_price_1 == 0 || adult_price_2 == 0 || child_price_2 == 0) {
//                    Helper.showMessage("When the hotel is closed in the season the price is updated to zero");
//                }
//                if (Price.update1(room_id, adult_price_1, adult_price_2, child_price_1, child_price_2)) {
//                    Helper.showMessage("success");
//                }
                loadStaffPriceListModel();
            }
        });

        // ##ModelPriceList

        // ModelSearchRoomList

        selectRoomMenu = new JPopupMenu();
        JMenuItem selectRoomMenuItem = new JMenuItem("Select Room for Reservation");
        selectRoomMenu.add(selectRoomMenuItem);

        selectRoomMenuItem.addActionListener(e -> {
            int selected_room_id = Integer.parseInt(table_staff_search_room_list.getValueAt(table_staff_search_room_list.getSelectedRow(), 0).toString());
            String check_in_date = "";
            String check_out_date = "";
            int adultGuestCount = 0;
            int childGuestCount = 0;
            if (!field_staff_search_room_check_in_date.getText().isEmpty()) {
                check_in_date = field_staff_search_room_check_in_date.getText();
            }
            if (!field_staff_search_room_check_out_date.getText().isEmpty()) {
                check_out_date = field_staff_search_room_check_out_date.getText();
            }
            if (!combobox_staff_search_room_guest_adult_number.getSelectedItem().toString().isEmpty()) {
                adultGuestCount = Integer.parseInt(combobox_staff_search_room_guest_adult_number.getSelectedItem().toString());
            }
            if (!combobox_staff_search_room_guest_child_number.getSelectedItem().toString().isEmpty()) {
                childGuestCount = Integer.parseInt(combobox_staff_search_room_guest_child_number.getSelectedItem().toString());
            }
            //   System.out.println(check_in_date + "check in date" + check_out_date + "checkoutdate");
            ReservationGUI reservationGUI = new ReservationGUI(Room.getFetch(selected_room_id), check_in_date, check_out_date, adultGuestCount, childGuestCount);

        });

        model_staff_search_room_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        Object[] column_staff_search_room_list = {"Room Id", "Hotel Id", "Hotel Name", "Room Type", "Stock", "Star", "Hotel Features", "Room Features", "Accommodation Type", "Available Seasons", "Adult Price 2", "Child Price 2"};
        model_staff_search_room_list.setColumnIdentifiers(column_staff_search_room_list);
        row_staff_search_room_list = new Object[column_staff_search_room_list.length];
        //loadStaffSearchRoomListModel();
        //  field_staff_search_room_check_in_date.setText("12.06.2025");
        //  field_staff_search_room_check_out_date.setText("15.06.2025");
        loadStaffHotelNameCombobox(combobox_staff_search_room_hotel_name);
        loadStaffHotelCityCombobox(combobox_staff_search_room_city);
        table_staff_search_room_list.setModel(model_staff_search_room_list);
        table_staff_search_room_list.setComponentPopupMenu(selectRoomMenu);
        table_staff_search_room_list.getTableHeader().setReorderingAllowed(false);
        table_staff_search_room_list.getColumnModel().getColumn(0).setMaxWidth(60);
        table_staff_search_room_list.getColumnModel().getColumn(1).setMaxWidth(60);
        table_staff_search_room_list.getColumnModel().getColumn(2).setMaxWidth(100);
        table_staff_search_room_list.getColumnModel().getColumn(3).setMaxWidth(100);
        table_staff_search_room_list.getColumnModel().getColumn(9).setMaxWidth(150);
        table_staff_search_room_list.getColumnModel().getColumn(10).setMaxWidth(100);
        table_staff_search_room_list.getColumnModel().getColumn(11).setMaxWidth(100);


        table_staff_search_room_list.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Point point = e.getPoint();
                int selectedRow = table_staff_search_room_list.rowAtPoint(point);
                table_staff_search_room_list.setRowSelectionInterval(selectedRow, selectedRow);
            }
        });

        // ##ModelSearchRoomList

        // ModelReservationList

        model_staff_reservation_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        Object[] column_staff_reservation_list = {"Reservation Id", "Hotel Id", "Room Id", "Accommodation Type", "Season", "Contact Person", " Phone ", "Email", "Note", "Adult Guests", "Child(ren)", "Price"};
        model_staff_reservation_list.setColumnIdentifiers(column_staff_reservation_list);
        row_staff_reservation_list = new Object[column_staff_reservation_list.length];
        loadStaffReservationListModel();
        loadStaffReservationIdCombobox(combobox_staff_reservation_delete_reservation_id);
        loadStaffReservationIdCombobox(combobox_staff_reservation_update_reservation_id);
        table_staff_reservation_list.setModel(model_staff_reservation_list);
        table_staff_reservation_list.getTableHeader().setReorderingAllowed(false);

        // ##ModelReservationList

        button_staff_logout.addActionListener(e -> {
            dispose();
            LoginGUI loginGUI = new LoginGUI();
        });

        button_staff_hotel_add.addActionListener(e -> {
            ArrayList<JTextField> staffHotelTextFieldList = new ArrayList<>();

            staffHotelTextFieldList.add(field_staff_hotel_add_name);
            staffHotelTextFieldList.add(field_staff_hotel_add_city);
            staffHotelTextFieldList.add(field_staff_hotel_add_region);
            staffHotelTextFieldList.add(field_staff_hotel_add_address);
            staffHotelTextFieldList.add(field_staff_hotel_add_email);
            staffHotelTextFieldList.add(field_staff_hotel_add_phone);


            if (Helper.isAnyFieldEmpty(staffHotelTextFieldList) || combobox_staff_hotel_add_star.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                if (Hotel.add(field_staff_hotel_add_name.getText(),
                        field_staff_hotel_add_city.getText(),
                        field_staff_hotel_add_region.getText(),
                        field_staff_hotel_add_address.getText(),
                        field_staff_hotel_add_email.getText(),
                        field_staff_hotel_add_phone.getText(),
                        combobox_staff_hotel_add_star.getSelectedItem().toString())) {
                    Helper.showMessage("success");
                    loadStaffModelsAndComboboxes();

                    //   loadStaffHotelListModel();
                } else {
                    Helper.showMessage("error");
                }
            }
            for (int i = 0; i <= staffHotelTextFieldList.size() - 1; i++) {
                staffHotelTextFieldList.get(i).setText(null);
            }
            field_staff_hotel_delete_hotel_id.setText(null);
            combobox_staff_hotel_add_star.setSelectedItem("");
        });
        button_staff_hotel_delete.addActionListener(e -> {
            if (field_staff_hotel_delete_hotel_id.getText().isEmpty()) {
                Helper.showMessage("select");
            } else {
                if (Helper.confirm("sure")) {
                    int selected_hotel_id = Integer.parseInt(field_staff_hotel_delete_hotel_id.getText());
                    if (Hotel.delete(selected_hotel_id) && Feature.deleteByHotelId(selected_hotel_id) && Accommodation.deleteByHotelId(selected_hotel_id) && Season.delete(selected_hotel_id) && Room.deleteByHotelId(selected_hotel_id) && Roomfeature.deleteByHotelId(selected_hotel_id) && Price.deleteByHotelId(selected_hotel_id)) {
                        Helper.showMessage("success");
//
//                        ArrayList<Room> hotelRoomList = new ArrayList<>();
//                        hotelRoomList = Room.getListByHotelName(Hotel.getFetch(selected_hotel_id).getName());
//
//                        for (Room obj : hotelRoomList) {
//                            if(Room.delete(obj.getId())&&Price.delete(obj.getId())){}
//                        }
                        loadStaffModelsAndComboboxes();

                        loadStaffHotelListModel();

                    } else {
                        Helper.showMessage("error");
                    }
                }
            }
            field_staff_hotel_delete_hotel_id.setText(null);
        });

        button_staff_feature_add.addActionListener(e -> {
            //   Item hotelNameItem = (Item) combobox_staff_feature_add_hotel_name.getSelectedItem();
            String selectedHotelName = combobox_staff_feature_add_hotel_name.getSelectedItem().toString();

            boolean free_parking = checkbox_staff_feature_add_free_parking.isSelected();
            boolean free_wifi = checkbox_staff_feature_add_free_wifi.isSelected();
            boolean pool = checkbox_staff_feature_add_pool.isSelected();
            boolean fitness_center = checkbox_staff_feature_add_pool.isSelected();
            boolean hotel_concierge = checkbox_staff_feature_add_hotel_concierge.isSelected();
            boolean spa = checkbox_staff_feature_add_spa.isSelected();
            boolean room_service = checkbox_staff_feature_add_room_service.isSelected();


            if (combobox_staff_feature_add_hotel_name.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                int hotel_id = (Hotel.getFetch(selectedHotelName)).getId();

                if (Feature.add(hotel_id, free_parking, free_wifi, pool, fitness_center, hotel_concierge, spa, room_service)) {
                    Helper.showMessage("success");
                    loadStaffModelsAndComboboxes();

                    loadStaffFeatureListModel();
                }
            }
            //   field_staff_feature_add_hotel_id.setText(null);
            //  combobox_staff_feature_add_hotel_name.set
        });


        button_staff_accommodation_add_.addActionListener(e -> {

            String selectedHotelName = combobox_staff_accommodation_add_hotel_name.getSelectedItem().toString();

            //int hotel_id = (Integer) Integer.parseInt(field_staff_accommodation_add_hotel_id.getText());
            boolean ultra_all_inclusive = checkbox_staff_accommodation_add_ultra_all_inclusive.isSelected();
            boolean all_in = checkbox_staff_accommodation_add_all_in.isSelected();
            boolean bed_and_breakfast = checkbox_staff_accommodation_add_bed_and_breakfast.isSelected();
            boolean full_board = checkbox_staff_accommodation_add_full_board.isSelected();
            boolean half_board = checkbox_staff_accommodation_add_half_board.isSelected();
            boolean bed_only = checkbox_staff_accommodation_add_bed_only.isSelected();
            boolean excluding_alcohol_full_credit = checkbox_staff_accommodation_add_excluding_alcohol_full_credit.isSelected();

            if (combobox_staff_accommodation_add_hotel_name.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                int hotel_id = (Hotel.getFetch(selectedHotelName)).getId();
                if (Accommodation.add(hotel_id, ultra_all_inclusive, all_in, bed_and_breakfast, full_board, half_board, bed_only, excluding_alcohol_full_credit)) {
                    Helper.showMessage("success");
                    loadStaffModelsAndComboboxes();

                    loadStaffAccommodationListModel();
                }
//                field_staff_accommodation_add_hotel_id.setText(null);
                //              combobox_staff_accommodation_add_hotel_name.setSelectedItem(combobox_staff_accommodation_add_hotel_name.getItemAt(0));

            }

        });
        button_staff_room_add.addActionListener(e -> {
            if (combobox_staff_room_add_hotel_name.getSelectedItem().toString().isEmpty() || combobox_staff_room_add_room_type.getSelectedItem().toString().isEmpty() || field_staff_room_add_stock.getText().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                int hotel_id = Helper.getHotelIdFromSelectedHotelName(combobox_staff_room_add_hotel_name);
                String room_type = combobox_staff_room_add_room_type.getSelectedItem().toString();
                int stock = (Integer) Integer.parseInt(field_staff_room_add_stock.getText());
                if (Room.add(hotel_id, room_type, stock)) {
                    Helper.showMessage("success");
                    loadStaffModelsAndComboboxes();
                }
            }
            clearAllFieldsAndComboboxes();
//            combobox_staff_room_add_hotel_name.setSelectedItem(new Item(0,""));
//            combobox_staff_room_add_room_type.setSelectedItem(null);
//            field_staff_room_add_stock.setText(null);
//            field_staff_room_delete_room_id.setText(null);
        });
        button_staff_room_delete.addActionListener(e -> {

            if (field_staff_room_delete_room_id.getText().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                if (Helper.confirm("sure")) {
                    int selected_room_id = Integer.parseInt(field_staff_room_delete_room_id.getText());
                    if (Room.delete(selected_room_id) && Roomfeature.deleteByHotelId(Room.getFetch(selected_room_id).getHotel_id()) && Price.delete(selected_room_id)) {
                        Helper.showMessage("success");
                        loadStaffModelsAndComboboxes();
                        clearAllFieldsAndComboboxes();
                    }
                }
            }
        });
        button_staff_roomfeature_add.addActionListener(e -> {
            if (combobox_staff_roomfeature_add_room_id.getSelectedItem().toString().isEmpty() || field_staff_roomfeature_bed_count.getText().isEmpty() || field_staff_roomfeature_squaremeters.getText().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                int room_id = (Integer) Integer.parseInt(combobox_staff_roomfeature_add_room_id.getSelectedItem().toString());
                int hotel_id = Room.getFetch(room_id).getHotel_id();
                int bed_count = (Integer) Integer.parseInt(field_staff_roomfeature_bed_count.getText());
                int squaremeters = (Integer) Integer.parseInt(field_staff_roomfeature_squaremeters.getText());
                boolean tv = checkbox_staff_roomfeature_tv.isSelected();
                boolean minibar = checkbox_staff_roomfeature_minibar.isSelected();
                boolean console = checkbox_staff_roomfeature_console.isSelected();
                boolean safe = checkbox_staff_roomfeature_safe.isSelected();
                boolean projector = checkbox_staff_roomfeature_projector.isSelected();
                if (Roomfeature.add(hotel_id, room_id, bed_count, squaremeters, tv, minibar, console, safe, projector)) {
                    Helper.showMessage("success");
                    loadStaffModelsAndComboboxes();

                    loadStaffRoomfeatureListModel();
                }
            }
        });
        button_staff_season_add.addActionListener(e -> {
            if (combobox_staff_season_add_hotel_name.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                if (Season.add(Helper.getHotelIdFromSelectedHotelName(combobox_staff_season_add_hotel_name), checkbox_staff_season_add_season_1.isSelected(), checkbox_staff_season_add_season_2.isSelected())) {
                    Helper.showMessage("success");
                }
            }
            loadStaffModelsAndComboboxes();

            loadStaffSeasonListModel();
            loadStaffSeasonIdCombobox(combobox_staff_season_delete_season_id);
        });
        button_staff_season_delete.addActionListener(e -> {
            if (combobox_staff_season_delete_season_id.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                if (Helper.confirm("sure")) {
                    int selected_id = (Integer) Integer.parseInt(combobox_staff_season_delete_season_id.getSelectedItem().toString());
                    if (Season.delete(selected_id)) {
                        Helper.showMessage("success");
                        loadStaffModelsAndComboboxes();

                        loadStaffSeasonListModel();
                        loadStaffSeasonIdCombobox(combobox_staff_season_delete_season_id);
                    }

                }
            }

        });


        butoon_staff_price_add.addActionListener(e -> {
            if (combobox_staff_price_add_room_id.getSelectedItem().toString().isEmpty() ||
                    field_staff_price_add_adult_price_1.getText().isEmpty() ||
                    field_staff_price_add_child_price_1.getText().isEmpty() ||
                    field_staff_price_add_adult_price_2.getText().isEmpty() ||
                    field_staff_price_add_child_price_2.getText().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                int room_id = Integer.parseInt(combobox_staff_price_add_room_id.getSelectedItem().toString());
                int hotel_id = Room.getFetch(room_id).getHotel_id();
                int adult_price_1 = Integer.parseInt(field_staff_price_add_adult_price_1.getText());
                int adult_price_2 = Integer.parseInt(field_staff_price_add_adult_price_2.getText());
                int child_price_1 = Integer.parseInt(field_staff_price_add_child_price_1.getText());
                int child_price_2 = Integer.parseInt(field_staff_price_add_child_price_2.getText());

                if (Price.add(hotel_id, room_id, adult_price_1, adult_price_2, child_price_1, child_price_2)) {
                    Helper.showMessage("success");
                    loadStaffModelsAndComboboxes();

                    loadStaffPriceListModel();
                }
            }
        });
        button_staff_price_delete.addActionListener(e -> {
            if (combobox_staff_price_delete_room_id.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                if (Helper.confirm("sure")) {
                    int selectedPriceId = Integer.parseInt(combobox_staff_price_delete_room_id.getSelectedItem().toString());
                    if (Price.delete(selectedPriceId)) {
                        Helper.showMessage("success");
                        loadStaffModelsAndComboboxes();

                        loadStaffPriceListModel();
                    } else {
                        Helper.showMessage("error");
                    }
                }
            }
        });
        button_staff_search_room.addActionListener(e -> {
            String check_in_date = field_staff_search_room_check_in_date.getText();
            String check_out_date = field_staff_search_room_check_out_date.getText();
            String city = "";
            String hotel_name = "";
            int guestCount = 0;
            int adultGuestCount = 0;
            int childGuestCount = 0;
            if (!combobox_staff_search_room_guest_adult_number.getSelectedItem().toString().isEmpty()) {
                adultGuestCount = Integer.parseInt(combobox_staff_search_room_guest_adult_number.getSelectedItem().toString());
            } else {
                Helper.showMessage("At Least One Adult Guest Required");
            }
            if (!combobox_staff_search_room_guest_child_number.getSelectedItem().toString().isEmpty()) {
                childGuestCount = Integer.parseInt(combobox_staff_search_room_guest_child_number.getSelectedItem().toString());
            }
            guestCount = adultGuestCount + childGuestCount;
            System.out.println("guest count" + guestCount);

            if (!combobox_staff_search_room_city.getSelectedItem().toString().isEmpty()) {
                city = combobox_staff_search_room_city.getSelectedItem().toString();
            }
            if (!combobox_staff_search_room_hotel_name.getSelectedItem().toString().isEmpty()) {
                hotel_name = combobox_staff_search_room_hotel_name.getSelectedItem().toString();
            }

            if ((check_in_date.isEmpty() || check_out_date.isEmpty()) && city.isEmpty() && hotel_name.isEmpty() || combobox_staff_search_room_guest_adult_number.getSelectedItem().toString().isEmpty()) {
                Helper.showMessage("fill");
            } else {
                //Room.searchRoomList(query);
                String query = Room.createSearchQuery(check_in_date, check_out_date, city, hotel_name, guestCount);

                System.out.println("1");
                loadStaffModelsAndComboboxes();
                loadStaffSearchRoomListModel(Room.searchRoomList(query));

                System.out.println("2");
            }
        });
        button_staff_reservation_delete.addActionListener(e -> {
            String stringSelectedReservationId = combobox_staff_reservation_delete_reservation_id.getSelectedItem().toString();
            if (stringSelectedReservationId.isEmpty()) {
                Helper.showMessage("fill");
            } else {
                if (Helper.confirm("sure")) {
                    int intSelectedReservationId = (Integer) Integer.parseInt(stringSelectedReservationId);
                    if (Reservation.delete(intSelectedReservationId)) {
                        Helper.showMessage("success");
                        loadStaffModelsAndComboboxes();
                        loadStaffReservationListModel();
                        loadStaffReservationIdCombobox(combobox_staff_reservation_delete_reservation_id);
                        loadStaffReservationIdCombobox(combobox_staff_reservation_update_reservation_id);
                        loadStaffRoomListModel();
                    }
                }
            }
        });
        button_staff_reservation_update_.addActionListener(e -> {

            String stringSelectedReservationId = combobox_staff_reservation_update_reservation_id.getSelectedItem().toString();
            if (stringSelectedReservationId.isEmpty()) {
                Helper.showMessage("fill");
            } else {
                int intSelectedReservationId = (Integer) Integer.parseInt(stringSelectedReservationId);
                ReservationUpdateGUI reservationUpdateGUI = new ReservationUpdateGUI(intSelectedReservationId);
                loadStaffModelsAndComboboxes();

                // ConfirmationGUI confirmationGUI = new ConfirmationGUI();
            }


        });
        tabbed_panel_staff.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loadStaffReservationListModel();
                loadStaffReservationIdCombobox(combobox_staff_reservation_delete_reservation_id);
                loadStaffReservationIdCombobox(combobox_staff_reservation_update_reservation_id);
                super.mouseClicked(e);
            }
        });
        tabbed_panel_staff.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loadStaffHotelListModel();
                super.mouseClicked(e);
            }
        });
        tabbed_panel_staff.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loadStaffFeatureListModel();
                loadStaffHotelNameCombobox(combobox_staff_feature_add_hotel_name);
                super.mouseClicked(e);
            }
        });
        tabbed_panel_staff.addComponentListener(new ComponentAdapter() {
        });
        tabbed_panel_staff.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loadStaffAccommodationListModel();
                loadStaffHotelNameCombobox(combobox_staff_accommodation_add_hotel_name);
                super.mouseClicked(e);

            }
        });
        tabbed_panel_staff.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loadStaffRoomListModel();
                loadStaffHotelNameCombobox(combobox_staff_room_add_hotel_name);
                super.mouseClicked(e);
            }
        });
        tabbed_panel_staff.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loadStaffRoomfeatureListModel();
                loadStaffRoomIdCombobox(combobox_staff_roomfeature_add_room_id);
                super.mouseClicked(e);
            }
        });
        tabbed_panel_staff.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loadStaffSeasonListModel();
                loadStaffHotelNameCombobox(combobox_staff_season_add_hotel_name);
                loadStaffSeasonIdCombobox(combobox_staff_season_delete_season_id);
                super.mouseClicked(e);
            }
        });
        tabbed_panel_staff.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loadStaffPriceListModel();
                loadStaffRoomIdCombobox(combobox_staff_price_add_room_id);
                loadStaffRoomIdCombobox(combobox_staff_price_delete_room_id);
                super.mouseClicked(e);
            }
        });
        tabbed_panel_staff.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loadStaffSearchRoomListModel();
                loadStaffHotelCityCombobox(combobox_staff_search_room_city);
                loadStaffHotelNameCombobox(combobox_staff_search_room_hotel_name);
                super.mouseClicked(e);
            }
        });
    }

    public void clearAllFieldsAndComboboxes() {
        combobox_staff_room_add_hotel_name.setSelectedItem(new Item(0, ""));
        combobox_staff_room_add_room_type.setSelectedItem(null);
        field_staff_room_add_stock.setText(null);
        field_staff_room_delete_room_id.setText(null);

    }

    public void loadStaffModelsAndComboboxes() {
        loadStaffHotelListModel();
        loadStaffAccommodationListModel();
        loadStaffAccommodationListModel();
        loadStaffRoomListModel();
        loadStaffRoomfeatureListModel();
        loadStaffSeasonListModel();
        loadStaffPriceListModel();
        loadStaffSearchRoomListModel();
        loadStaffReservationListModel();
        loadStaffHotelNameCombobox(combobox_staff_room_add_hotel_name);
        loadStaffHotelNameCombobox(combobox_staff_season_add_hotel_name);
        loadStaffSeasonIdCombobox(combobox_staff_season_delete_season_id);
    }

    public void loadStaffHotelListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_staff_hotel_list.getModel();
        clearModel.setRowCount(0);

        int i;

        for (Hotel obj : Hotel.getList()) {
            i = 0;
            row_staff_hotel_list[i++] = obj.getId();
            row_staff_hotel_list[i++] = obj.getName();
            row_staff_hotel_list[i++] = obj.getCity();
            row_staff_hotel_list[i++] = obj.getRegion();
            row_staff_hotel_list[i++] = obj.getAddress();
            row_staff_hotel_list[i++] = obj.getEmail();
            row_staff_hotel_list[i++] = obj.getPhone();
            row_staff_hotel_list[i++] = obj.getStar();
            model_staff_hotel_list.addRow(row_staff_hotel_list);
        }
    }

    public void loadStaffFeatureListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_staff_feature_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Feature obj : Feature.getList()) {
            i = 0;
            row_staff_feature_list[i++] = obj.getId();
            row_staff_feature_list[i++] = obj.getHotel_id();
            row_staff_feature_list[i++] = Hotel.getFetch(obj.getHotel_id()).getName();
            row_staff_feature_list[i++] = obj.isFree_parking();
            row_staff_feature_list[i++] = obj.isFree_wifi();
            row_staff_feature_list[i++] = obj.isPool();
            row_staff_feature_list[i++] = obj.isFitness_center();
            row_staff_feature_list[i++] = obj.isHotel_concierge();
            row_staff_feature_list[i++] = obj.isSpa();
            row_staff_feature_list[i++] = obj.isRoom_service();
            model_staff_feature_list.addRow(row_staff_feature_list);
        }
    }

    public void loadStaffAccommodationListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_staff_accommodation_list.getModel();
        clearModel.setRowCount(0);

        int i;
        for (Accommodation obj : Accommodation.getList()) {
            i = 0;
            row_staff_accommodation_list[i++] = obj.getId();
            row_staff_accommodation_list[i++] = obj.getHotel_id();
            row_staff_accommodation_list[i++] = Hotel.getFetch(obj.getHotel_id()).getName();
            row_staff_accommodation_list[i++] = obj.isUltra_all_inclusive();
            row_staff_accommodation_list[i++] = obj.isAll_in();
            row_staff_accommodation_list[i++] = obj.isBed_and_breakfast();
            row_staff_accommodation_list[i++] = obj.isFull_board();
            row_staff_accommodation_list[i++] = obj.isHalf_board();
            row_staff_accommodation_list[i++] = obj.isBed_only();
            row_staff_accommodation_list[i++] = obj.isExcluding_alcohol_full_credit();
            model_staff_accommodation_list.addRow(row_staff_accommodation_list);
        }
    }


    public void loadStaffRoomListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_staff_room_list.getModel();
        clearModel.setRowCount(0);
        int i;

        for (Room obj : Room.getList()) {
            i = 0;
            row_staff_room_list[i++] = obj.getId();
            row_staff_room_list[i++] = obj.getHotel_id();
            row_staff_room_list[i++] = Hotel.getFetch(obj.getHotel_id()).getName();
            row_staff_room_list[i++] = obj.getRoom_type();
            row_staff_room_list[i++] = obj.getStock();
            model_staff_room_list.addRow(row_staff_room_list);
        }
    }

    public void loadStaffRoomfeatureListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_staff_roomfeature_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Roomfeature obj : Roomfeature.getList()) {
            i = 0;
            row_staff_roomfeature_list[i++] = obj.getId();
            row_staff_roomfeature_list[i++] = obj.getHotel_id();
            row_staff_roomfeature_list[i++] = Hotel.getFetch(obj.getHotel_id()).getName();
            row_staff_roomfeature_list[i++] = obj.getRoom_id();
            row_staff_roomfeature_list[i++] = obj.getBed_count();
            row_staff_roomfeature_list[i++] = obj.getSquaremeters();
            row_staff_roomfeature_list[i++] = obj.isTv();
            row_staff_roomfeature_list[i++] = obj.isMinibar();
            row_staff_roomfeature_list[i++] = obj.isConsole();
            row_staff_roomfeature_list[i++] = obj.isSafe();
            row_staff_roomfeature_list[i++] = obj.isProjector();
            model_staff_roomfeature_list.addRow(row_staff_roomfeature_list);
        }
    }

    public void loadStaffSeasonListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_staff_season_list.getModel();
        clearModel.setRowCount(0);

        int i;

        for (Season obj : Season.getList()) {

            i = 0;
            row_staff_season_list[i++] = obj.getId();
            row_staff_season_list[i++] = obj.getHotel_id();
            row_staff_season_list[i++] = Hotel.getFetch(obj.getHotel_id()).getName();
            row_staff_season_list[i++] = obj.isSeason_1();
            row_staff_season_list[i++] = obj.isSeason_2();
            model_staff_season_list.addRow(row_staff_season_list);
        }
    }

    public void loadStaffPriceListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_staff_price_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Price obj : Price.getList()) {
            i = 0;
            row_staff_price_list[i++] = obj.getId();
            row_staff_price_list[i++] = obj.getRoom_id();
            row_staff_price_list[i++] = obj.getHotel_id();
            row_staff_price_list[i++] = (Hotel.getFetch(obj.getHotel_id())).getName();
            row_staff_price_list[i++] = obj.getAdult_price_1();
            row_staff_price_list[i++] = obj.getAdult_price_2();
            row_staff_price_list[i++] = obj.getChild_price_1();
            row_staff_price_list[i++] = obj.getChild_price_2();
            model_staff_price_list.addRow(row_staff_price_list);
        }
    }

    public void loadStaffSearchRoomListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_staff_search_room_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Room obj : Room.getList()) {
            i = 0;
            row_staff_search_room_list[i++] = obj.getId();
            row_staff_search_room_list[i++] = obj.getHotel_id();
            hotel = Hotel.getFetch(obj.getHotel_id());
            row_staff_search_room_list[i++] = hotel.getName();
            row_staff_search_room_list[i++] = obj.getRoom_type();
            row_staff_search_room_list[i++] = obj.getStock();
            row_staff_search_room_list[i++] = hotel.getStar();
            row_staff_search_room_list[i++] = Feature.createStringHotelFeatureList(hotel.getId());
            row_staff_search_room_list[i++] = Roomfeature.createStringRoomFeatureList(obj.getId());
            row_staff_search_room_list[i++] = Accommodation.createStringHotelAccommodationTypeList(hotel.getId());
            row_staff_search_room_list[i++] = Season.createStringSeasonList(Season.getFetchByHotelId(hotel.getId()));
            row_staff_search_room_list[i++] = Price.getFetchByRoomId(obj.getId()).getAdult_price_2();
            row_staff_search_room_list[i++] = Price.getFetchByRoomId(obj.getId()).getChild_price_2();
            model_staff_search_room_list.addRow(row_staff_search_room_list);
        }
    }

    public void loadStaffSearchRoomListModel(ArrayList<Room> roomList) {
        DefaultTableModel clearModel = (DefaultTableModel) table_staff_search_room_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Room obj : roomList) {
            i = 0;
            row_staff_search_room_list[i++] = obj.getId();
            row_staff_search_room_list[i++] = obj.getHotel_id();
            hotel = Hotel.getFetch(obj.getHotel_id());
            row_staff_search_room_list[i++] = hotel.getName();
            row_staff_search_room_list[i++] = obj.getRoom_type();
            row_staff_search_room_list[i++] = obj.getStock();
            row_staff_search_room_list[i++] = hotel.getStar();
            row_staff_search_room_list[i++] = Feature.createStringHotelFeatureList(hotel.getId());
            row_staff_search_room_list[i++] = Roomfeature.createStringRoomFeatureList(obj.getId());
            row_staff_search_room_list[i++] = Accommodation.createStringHotelAccommodationTypeList(hotel.getId());
            row_staff_search_room_list[i++] = Season.createStringSeasonList(Season.getFetchByHotelId(hotel.getId()));
            row_staff_search_room_list[i++] = Price.getFetchByRoomId(obj.getId()).getAdult_price_2();
            row_staff_search_room_list[i++] = Price.getFetchByRoomId(obj.getId()).getChild_price_2();
            model_staff_search_room_list.addRow(row_staff_search_room_list);
        }
    }

    public void loadStaffReservationListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_staff_reservation_list.getModel();
        clearModel.setRowCount(0);

        int i;
        int adultGuestCount;
        int childGuestCount;
        double calculatedReservationPrice;

        for (Reservation obj : Reservation.getList()) {
            i = 0;
            int reservation_id = obj.getId();
            int hotel_id = obj.getHotel_id();
            int room_id = obj.getRoom_id();
            String accommodation_type = obj.getAccommodation_type();
            String check_in_date = obj.getCheck_in_date();
            String check_out_date = obj.getCheck_out_date();
            int season = Season.seasonDecider(obj.getCheck_in_date());
            int duration = Helper.calculateDuration(check_in_date, check_out_date);
            adultGuestCount = 0;
            if (!obj.getGuest_1_name().isEmpty()) adultGuestCount += 1;
            if (!obj.getGuest_2_name().isEmpty()) adultGuestCount += 1;

            childGuestCount = 0;
            if (!obj.getGuest_3_name().isEmpty()) childGuestCount += 1;

            row_staff_reservation_list[i++] = reservation_id;
            row_staff_reservation_list[i++] = hotel_id;
            row_staff_reservation_list[i++] = room_id;
            row_staff_reservation_list[i++] = accommodation_type;
            row_staff_reservation_list[i++] = season;
            row_staff_reservation_list[i++] = obj.getContact_name();
            row_staff_reservation_list[i++] = obj.getContact_phone();
            row_staff_reservation_list[i++] = obj.getContact_email();
            // row_staff_reservation_list [i++]= obj.getContact_id_no();
            row_staff_reservation_list[i++] = obj.getNote();


            row_staff_reservation_list[i++] = adultGuestCount;

            row_staff_reservation_list[i++] = childGuestCount;

            calculatedReservationPrice = Calculation.calculateReservationPrice(obj.getRoom_id(), season, accommodation_type, adultGuestCount, childGuestCount, duration);
            row_staff_reservation_list[i++] = calculatedReservationPrice;
            model_staff_reservation_list.addRow(row_staff_reservation_list);
        }
    }

    public void loadStaffHotelNameCombobox(JComboBox combobox) {
        combobox.removeAllItems();
        combobox.addItem(new Item(0, ""));
        for (Hotel obj : Hotel.getList()) {
            combobox.addItem(new Item(obj.getId(), obj.getName()));
        }
    }

    public void loadStaffHotelCityCombobox(JComboBox combobox) {
        combobox.removeAllItems();
        combobox.addItem(new Item(0, ""));
        for (Hotel obj : Hotel.getList()) {
            combobox.addItem(new Item(obj.getId(), obj.getCity()));
        }
    }

    public void loadStaffSeasonIdCombobox(JComboBox combobox) {
        combobox.removeAllItems();
        combobox.addItem(new Item(0, ""));
        for (Season obj : Season.getList()) {
            combobox.addItem(new Item(obj.getId(), String.valueOf(obj.getId())));
        }
    }

    public void loadStaffRoomIdCombobox(JComboBox combobox) {
        combobox.removeAllItems();
        combobox.addItem(new Item(0, ""));
        for (Room obj : Room.getList()) {
            combobox.addItem(new Item(obj.getId(), String.valueOf(obj.getId())));
        }
    }

    public void loadStaffReservationIdCombobox(JComboBox combobox) {
        combobox.removeAllItems();
        combobox.addItem(new Item(0, ""));
        for (Reservation obj : Reservation.getList()) {
            combobox.addItem(new Item(obj.getId(), String.valueOf(obj.getId())));
        }
    }
}