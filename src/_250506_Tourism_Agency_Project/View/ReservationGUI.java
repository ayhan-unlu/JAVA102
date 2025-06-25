package _250506_Tourism_Agency_Project.View;

import _250506_Tourism_Agency_Project.Helper.Config;
import _250506_Tourism_Agency_Project.Helper.Helper;
import _250506_Tourism_Agency_Project.Helper.Item;
import _250506_Tourism_Agency_Project.Model.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import static java.lang.Math.round;

public class ReservationGUI extends JFrame {
    private JPanel wrapper;
    private JPanel panel_staff_reservation_top;
    private JPanel panel_staff_reservation_bottom;
    private JLabel label_staff_reservation_hotel_name;
    private JLabel label_staff_reservation_hotel_star;
    private JLabel label_staff_reservation_hotel_info_title;
    private JLabel label_staff_reservation_hotel_info;
    private JLabel label_staff_reservation_hotel_feature;
    private JLabel label_staff_reservation_hotel_feature_title;
    private JLabel label_staff_reservation_room_feature_title;
    private JLabel label_staff_reservation_room_feature;
    private JLabel label_staff_reservation_room_type_title;
    private JLabel label_staff_reservation_room_type;
    private JLabel label_staff_reservation_check_in_date;
    private JLabel label_staff_reservation_check_out_date;
    private JLabel label_staff_reservation_adult_guest_count;
    private JLabel label_staff_reservation_child_guest_count;
    private JLabel label_staff_reservation_duration;
    private JLabel label_staff_reservation_adult_price;
    private JLabel label_staff_reservation_child_price;
    private JTable table_staff_reservation_accommodation_type_list;
    private JComboBox combobox_staff_reservation_accommodation_type_list;
    private JLabel label_staff_reservation_accommodation_type_title;
    private JButton button_staff_reservation;
    private JLabel label_staff_reservation_confirmation_title;
    private DefaultTableModel model_reservation_accommodation_type_list;
    private Object[] row_reservation_accommodation_type_list;

    //    private Accommodation accommodation;
//    private Feature feature;
//    private Hotel hotel;
//    private Price price;
//    private Roomfeature roomfeature;
//    private Season season;
    private Room room;
    private Reservation reservation;
    private Hotel hotel;
    private String selectedAccommodation_type;

    public ReservationGUI(Room room, String check_in_date, String check_out_date, int adultGuestCount, int childGuestCount) {
        this.room = room;
        add(wrapper);
        setSize(1500, 1500);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);
//        System.out.println(check_in_date + "check in date" + check_out_date + "checkoutdate");
        hotel = Hotel.getFetch(room.getHotel_id());
        label_staff_reservation_hotel_name.setText(hotel.getName());
        label_staff_reservation_hotel_star.setText(hotel.getStar()+ " Star");
        label_staff_reservation_hotel_info.setText("City: " + hotel.getCity() + " Region: " + hotel.getRegion() + " Address: " + hotel.getAddress() + " Email: " + hotel.getEmail() + " Phone: " + hotel.getPhone());
        label_staff_reservation_hotel_feature.setText(Feature.createStringHotelFeatureList(hotel.getId()));
        label_staff_reservation_room_feature.setText(Roomfeature.createStringRoomFeatureList(room.getId()));
        label_staff_reservation_room_type.setText(room.getRoom_type());
        label_staff_reservation_check_in_date.setText("Check In Date: " + check_in_date);
        label_staff_reservation_check_out_date.setText(" Check Out Date: " + check_out_date);
        label_staff_reservation_adult_guest_count.setText(adultGuestCount + " Adult ");
        label_staff_reservation_child_guest_count.setText(childGuestCount + " Child ");
        int duration = Helper.calculateDuration(check_in_date, check_out_date);
        label_staff_reservation_duration.setText("Accommodation duration: " + String.valueOf(duration));
        int season = 0;
        int adult_price = 0;
        int child_price = 0;
        Price currentPrice = Price.getFetchByRoomId(room.getId());
        if (!check_in_date.isEmpty()) {
            season = Season.seasonDecider(check_in_date);
        }
        if (season == 1) {
            adult_price = currentPrice.getAdult_price_1();
            child_price = currentPrice.getChild_price_1();

        } else if (season == 2) {
            adult_price = currentPrice.getAdult_price_2();
            child_price = currentPrice.getChild_price_2();
        }
        label_staff_reservation_adult_price.setText("Adult Price per Night: " + adult_price + " ₺");
        label_staff_reservation_child_price.setText("Child Price per Night: " + child_price + " ₺");

        // Model Room Accommodation Type List---------------------------------------------------------------------------
        model_reservation_accommodation_type_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        Object[] column_reservation_accommodation_type_list = {"Accommodation Type", "Adult Price per Night", "Child Price per Night"};
        model_reservation_accommodation_type_list.setColumnIdentifiers(column_reservation_accommodation_type_list);
        row_reservation_accommodation_type_list = new Object[column_reservation_accommodation_type_list.length];
        loadReservationAccommodationTypeListModel(hotel, adult_price, child_price);
        table_staff_reservation_accommodation_type_list.setModel(model_reservation_accommodation_type_list);
        // Accommodation.loadHotelAccommodationTypeListCombobox(combobox_staff_reservation_accommodation_type_list, hotel.getId());
        loadStaffReservationAccommodationTypeListComboBox(hotel);


        if (!check_in_date.isEmpty()) {
        } else {
            check_in_date = "01.01.2025";
        }
        if (!check_out_date.isEmpty()) {

        } else {
            check_out_date = "02.01.2025";
        }
        // ##Model Room Accommodation Type List---------------------------------------------------------------------------

        String finalCheck_in_date = check_in_date;
        String finalCheck_out_date = check_out_date;
        button_staff_reservation.addActionListener(e -> {
            selectedAccommodation_type = combobox_staff_reservation_accommodation_type_list.getSelectedItem().toString();
            if (selectedAccommodation_type.isEmpty()) {
                Helper.showMessage("Please Choose an Accommodation Type ");
            } else {
                ConfirmationGUI confirmationGUI = new ConfirmationGUI(hotel, room, adultGuestCount, childGuestCount, finalCheck_in_date, finalCheck_out_date, selectedAccommodation_type);
            }

        });
    }

    public void loadReservationAccommodationTypeListModel(Hotel hotel, int adult_price, int child_price) {
        DefaultTableModel clearModel = (DefaultTableModel) table_staff_reservation_accommodation_type_list.getModel();
        clearModel.setRowCount(0);

        int i;
        Accommodation currentAccommodation = Accommodation.getFetch(hotel.getId());
        double roomCoefficient = Calculation.calculateCurrentCoefficient(room.getId());
        i = 0;
        row_reservation_accommodation_type_list[i++] = "Accommodation Type";
        row_reservation_accommodation_type_list[i++] = "Adult Price";
        row_reservation_accommodation_type_list[i++] = "Child Price";
        model_reservation_accommodation_type_list.addRow(row_reservation_accommodation_type_list);

        if (currentAccommodation.isUltra_all_inclusive()) {
            i = 0;
            row_reservation_accommodation_type_list[i++] = "Ultra All Inclusive";
            row_reservation_accommodation_type_list[i++] = round(roomCoefficient * 1.7 * adult_price);
            row_reservation_accommodation_type_list[i++] = round(roomCoefficient * 1.7 * child_price);
            model_reservation_accommodation_type_list.addRow(row_reservation_accommodation_type_list);
        }
        if (currentAccommodation.isAll_in()) {
            i = 0;
            row_reservation_accommodation_type_list[i++] = "All In";
            row_reservation_accommodation_type_list[i++] = round(roomCoefficient * 1.6 * adult_price);
            row_reservation_accommodation_type_list[i++] = round(roomCoefficient * 1.6 * child_price);
            model_reservation_accommodation_type_list.addRow(row_reservation_accommodation_type_list);
        }
        if (currentAccommodation.isBed_and_breakfast()) {
            i = 0;
            row_reservation_accommodation_type_list[i++] = "Bed And Breakfast";
            row_reservation_accommodation_type_list[i++] = round(roomCoefficient * 1.1 * adult_price);
            row_reservation_accommodation_type_list[i++] = round(roomCoefficient * 1.1 * child_price);
            model_reservation_accommodation_type_list.addRow(row_reservation_accommodation_type_list);
        }
        if (currentAccommodation.isFull_board()) {
            i = 0;
            row_reservation_accommodation_type_list[i++] = "Full Board";
            row_reservation_accommodation_type_list[i++] = round(roomCoefficient * 1.4 * adult_price);
            row_reservation_accommodation_type_list[i++] = round(roomCoefficient * 1.4 * child_price);
            model_reservation_accommodation_type_list.addRow(row_reservation_accommodation_type_list);
        }
        if (currentAccommodation.isHalf_board()) {
            i = 0;
            row_reservation_accommodation_type_list[i++] = "Half Board";
            row_reservation_accommodation_type_list[i++] = round(roomCoefficient * 1.2 * adult_price);
            row_reservation_accommodation_type_list[i++] = round(roomCoefficient * 1.2 * child_price);
            model_reservation_accommodation_type_list.addRow(row_reservation_accommodation_type_list);
        }
        if (currentAccommodation.isBed_only()) {
            i = 0;
            row_reservation_accommodation_type_list[i++] = "Bed Only";
            row_reservation_accommodation_type_list[i++] = round(roomCoefficient * 1 * adult_price);
            row_reservation_accommodation_type_list[i++] = round(roomCoefficient * 1 * child_price);
            model_reservation_accommodation_type_list.addRow(row_reservation_accommodation_type_list);
        }
        if (currentAccommodation.isExcluding_alcohol_full_credit()) {
            i = 0;
            row_reservation_accommodation_type_list[i++] = "Excluding Alcohol Full Credit";
            row_reservation_accommodation_type_list[i++] = round(roomCoefficient * 1.5 * adult_price);
            row_reservation_accommodation_type_list[i++] = round(roomCoefficient * 1.5 * child_price);
            model_reservation_accommodation_type_list.addRow(row_reservation_accommodation_type_list);
        }
    }

    public void loadStaffReservationAccommodationTypeListComboBox(Hotel hotel) {
        combobox_staff_reservation_accommodation_type_list.removeAllItems();
        int i;
        i = 0;
        combobox_staff_reservation_accommodation_type_list.addItem(new Item(i++, ""));
        Accommodation a = Accommodation.getFetch(hotel.getId());

        if (a.isUltra_all_inclusive()) {
            combobox_staff_reservation_accommodation_type_list.addItem(new Item(i++, "Ultra All Inclusive"));
        }

        if (a.isAll_in()) {
            combobox_staff_reservation_accommodation_type_list.addItem(new Item(i++, "All In"));
        }

        if (a.isBed_and_breakfast()) {
            combobox_staff_reservation_accommodation_type_list.addItem(new Item(i++, "Bed And Breakfast"));
        }

        if (a.isFull_board()) {
            combobox_staff_reservation_accommodation_type_list.addItem(new Item(i++, "Full Board"));
        }

        if (a.isHalf_board()) {
            combobox_staff_reservation_accommodation_type_list.addItem(new Item(i++, "Half Board"));
        }

        if (a.isBed_only()) {
            combobox_staff_reservation_accommodation_type_list.addItem(new Item(i++, "Bed Only"));
        }

        if (a.isExcluding_alcohol_full_credit()) {
            combobox_staff_reservation_accommodation_type_list.addItem(new Item(i++, "Excluding Alcohol Full Credit"));
        }

    }

    public static void main(String[] args) {
        ReservationGUI reservationGUI = new ReservationGUI(new Room(1,1,"single_room",2),"01.01.2025","02.02.2025",1,0);
    }
}