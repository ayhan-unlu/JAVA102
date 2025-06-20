package _250506_Tourism_Agency_Project.View;

import _250506_Tourism_Agency_Project.Helper.Config;
import _250506_Tourism_Agency_Project.Helper.Helper;
import _250506_Tourism_Agency_Project.Model.Feature;
import _250506_Tourism_Agency_Project.Model.Hotel;
import _250506_Tourism_Agency_Project.Model.Room;
import _250506_Tourism_Agency_Project.Model.Roomfeature;

import javax.swing.*;
import java.util.ArrayList;

public class ConfirmationGUI extends JFrame {
    private JPanel wrapper;
    private JPanel panel_staff_confirmation_top;
    private JPanel panel_staff_confirmation_middle;
    private JPanel panel_staff_confirmation_bottom;
    private JLabel label_staff_confirmation_hotel_name;
    private JLabel label_staff_confirmation_hotel_star;
    private JLabel label_staff_confirmation_hotel_info_title;
    private JLabel label_staff_confirmation_hotel_info;
    private JLabel label_staff_confirmation_hotel_feature;
    private JLabel label_staff_confirmation_hotel_feature_title;
    private JLabel label_staff_confirmation_room_feature_title;
    private JLabel label_staff_confirmation_room_feature;
    private JLabel label_staff_confirmation_room_type_title;
    private JLabel label_staff_confirmation_room_type;
    private JPanel panel_staff_confirmation_contact;
    private JLabel label_staff_confirmation_contact_info;
    private JLabel label_staff_confirmation_contact_name;
    private JTextField field_staff_confirmation_contact_name;
    private JLabel label_staff_confirmation_contact_id_no;
    private JTextField field_staff_confirmation_contact_id_no;
    private JLabel label_staff_confirmation_contact_phone;
    private JTextField field_staff_confirmation_contact_phone;
    private JLabel label_staff_confirmation_contact_email;
    private JTextField field_staff_confirmation_contact_email;
    private JLabel label_staff_confirmation_contact_note;
    private JTextField field_staff_confirmation_contact_note;
    private JPanel panel_staff_confirmation_guest;
    private JLabel label_staff_confirmation_guest_info;
    private JLabel label_staff_confirmation_guest_1;
    private JLabel label_staff_confirmation_guest_2;
    private JLabel label_staff_confirmation_guest_3;
    private JTextField field_staff_confirmation_guest_1_name;
    private JTextField field_staff_confirmation_guest_1_country;
    private JTextField field_staff_confirmation_guest_1_id_no;
    private JTextField field_staff_confirmation_guest_2_name;
    private JTextField field_staff_confirmation_guest_2_country;
    private JTextField field_staff_confirmation_guest_2_id_no;
    private JTextField field_staff_confirmation_guest_3_name;
    private JTextField field_staff_confirmation_guest_3_country;
    private JTextField field_staff_confirmation_guest_3_id_no;
    private JLabel label_staff_confirmation_guest_info_name;
    private JLabel label_staff_confirmation_guest_info_country;
    private JLabel label_staff_confirmation_guest_info_id_no;
    private JPanel panel_staff_confirmation_date;
    private JLabel label_staff_confirmation_check_in_date;
    private JLabel label_staff_confirmation_check_out_date;
    private JTextField field_staff_confirmation_check_in_date;
    private JTextField field_staff_confirmation_check_out_date;
    private JButton button_staff_confirmation;
    private JPanel panel_staff_confirmation_accommodation_type;
    private JComboBox combobox_staff_confirmation_accommodation_type_list;
    private JLabel label_staff_confirmation_selected_accommodation_type_line;
    private JLabel label_staff_confirmation_adult_guest_count;
    private JLabel label_staff_confirmation_child_guest_count;
    private JTextField field_staff_confirmation_calculated_reservation_price;
    private JLabel label_staff_confirmation_calculated_reservation_price;
    private JButton button_staff_confirmation_calculate_reservation_price;

    private Hotel hotel;
    private Room room;
    private int adultGuestCount;
    private int childGuestCount;
    private String check_in_date;
    private String check_out_date;
    private String selectedAccommodation_type;
    private double adultPrice;
    private double childPrice;


    public ConfirmationGUI(Hotel hotel, Room room, int adultGuestCount, int childGuestCount, String check_in_date, String check_out_date, String selectedAccommodation_type) {
        this.hotel = hotel;
        this.room = room;
        this.adultGuestCount = adultGuestCount;
        this.childGuestCount = childGuestCount;
        this.check_in_date = check_in_date;
        this.check_out_date = check_out_date;
        this.selectedAccommodation_type = selectedAccommodation_type;
        add(wrapper);
        setSize(1000, 1000);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);
        int hotel_id = hotel.getId();
        label_staff_confirmation_hotel_name.setText(hotel.getName());
        label_staff_confirmation_hotel_star.setText(hotel.getStar());
        label_staff_confirmation_hotel_info.setText(Hotel.createHotelInfoString(hotel_id));
        label_staff_confirmation_hotel_feature.setText(Feature.createStringHotelFeatureList(hotel_id));
        label_staff_confirmation_room_feature.setText(Roomfeature.createStringRoomFeatureList(room.getId()));
        label_staff_confirmation_room_type.setText(room.getRoom_type());
//        label_staff_confirmation_check_in_date.setText(check_in_date);
//        label_staff_confirmation_check_out_date.setText(check_out_date);
        label_staff_confirmation_adult_guest_count.setText(adultGuestCount + " Adult Guest. This field is editable below.");
        label_staff_confirmation_child_guest_count.setText(childGuestCount + " Child Guest. This field is editable below.");
        field_staff_confirmation_check_in_date.setText(check_in_date);
        field_staff_confirmation_check_out_date.setText(check_out_date);
        //  Accommodation.loadHotelAccommodationTypeListCombobox(combobox_staff_confirmation_accommodation_type_list,hotel_id);
        //loadStaffConfirmationAccommodationTypeListCombobox(hotel_id);
        label_staff_confirmation_selected_accommodation_type_line.setText("Selected Accommodation Type: " + selectedAccommodation_type);

        ArrayList<JTextField> confirmationFieldList = new ArrayList<>();
        confirmationFieldList.add(field_staff_confirmation_contact_name);
        confirmationFieldList.add(field_staff_confirmation_contact_id_no);
        confirmationFieldList.add(field_staff_confirmation_contact_phone);
        confirmationFieldList.add(field_staff_confirmation_contact_email);
        confirmationFieldList.add(field_staff_confirmation_contact_note);
        confirmationFieldList.add(field_staff_confirmation_guest_1_name);
        confirmationFieldList.add(field_staff_confirmation_guest_1_country);
        confirmationFieldList.add(field_staff_confirmation_guest_1_id_no);
        confirmationFieldList.add(field_staff_confirmation_check_in_date);
        confirmationFieldList.add(field_staff_confirmation_check_out_date);
        for(int i=1;i<confirmationFieldList.size()-2;i++){
            confirmationFieldList.get(i).setText("i");
        }
        button_staff_confirmation_calculate_reservation_price.addActionListener(e -> {
//            ArrayList<JTextField> confirmationFieldList = new ArrayList<>();
//            confirmationFieldList.add(field_staff_confirmation_contact_name);
//            confirmationFieldList.add(field_staff_confirmation_contact_id_no);
//            confirmationFieldList.add(field_staff_confirmation_contact_phone);
//            confirmationFieldList.add(field_staff_confirmation_contact_email);
//            confirmationFieldList.add(field_staff_confirmation_guest_1_name);
//            confirmationFieldList.add(field_staff_confirmation_guest_1_country);
//            confirmationFieldList.add(field_staff_confirmation_guest_1_id_no);
//            confirmationFieldList.add(field_staff_confirmation_check_in_date);
//            confirmationFieldList.add(field_staff_confirmation_check_out_date);
            for(int i=1;i<confirmationFieldList.size()-2;i++){
                confirmationFieldList.get(i).setText("i");
            }
            if(Helper.isAnyFieldEmpty(confirmationFieldList)){
                Helper.showMessage("Please fill in the required Fields");
            }else{
                

            }

        });
    }

//    public void loadStaffConfirmationAccommodationTypeListCombobox(int hotel_id) {
//        combobox_staff_confirmation_accommodation_type_list.removeAllItems();
//        int i;
//        i = 0;
//        combobox_staff_confirmation_accommodation_type_list.addItem(new Item(i++, ""));
//        Accommodation a = Accommodation.getFetch(hotel_id);
//
//        if (a.isUltra_all_inclusive()) {
//            combobox_staff_confirmation_accommodation_type_list.addItem(new Item(i++, "Ultra All Inclusive"));
//        }
//
//        if (a.isAll_in()) {
//            combobox_staff_confirmation_accommodation_type_list.addItem(new Item(i++, "All In"));
//        }
//
//        if (a.isBed_and_breakfast()) {
//            combobox_staff_confirmation_accommodation_type_list.addItem(new Item(i++, "Bed And Breakfast"));
//        }
//
//        if (a.isFull_board()) {
//            combobox_staff_confirmation_accommodation_type_list.addItem(new Item(i++, "Full Board"));
//        }
//
//        if (a.isHalf_board()) {
//            combobox_staff_confirmation_accommodation_type_list.addItem(new Item(i++, "Half Board"));
//        }
//
//        if (a.isBed_only()) {
//            combobox_staff_confirmation_accommodation_type_list.addItem(new Item(i++, "Bed Only"));
//        }
//
//        if (a.isExcluding_alcohol_full_credit()) {
//            combobox_staff_confirmation_accommodation_type_list.addItem(new Item(i++, "Excluding Alcohol Full Credit"));
//
//        }
//    }
}
