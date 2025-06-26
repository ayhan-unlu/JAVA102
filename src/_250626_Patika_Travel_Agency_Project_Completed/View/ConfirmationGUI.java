package _250626_Patika_Travel_Agency_Project_Completed.View;

import _250626_Patika_Travel_Agency_Project_Completed.Helper.Config;
import _250626_Patika_Travel_Agency_Project_Completed.Helper.Helper;
import _250626_Patika_Travel_Agency_Project_Completed.Model.*;

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
    private int hotel_id;
    private int room_id;
    private String accommodation_type;
    private String selectedAccommodation_type;
    private String check_in_date;
    private String check_out_date;
    private int duration;
    private int selectedSeason;
    private String contact_name;
    private String contact_phone;
    private String contact_email;
    private String contact_id_no;
    private String note;
    private String guest_1_name;
    private String guest_1_country;
    private String guest_1_id_no;
    private String guest_1_type;
    private String guest_2_name;
    private String guest_2_country;
    private String guest_2_id_no;
    private String guest_2_type;
    private String guest_3_name;
    private String guest_3_country;
    private String guest_3_id_no;
    private String guest_3_type;
    private int adultGuestCount;
    private int childGuestCount;
    private double adultPrice;
    private double childPrice;
    private int confirmedAdultGuestCount;
    private int confirmedChildGuestCount;


    public ConfirmationGUI(Hotel hotel, Room room, int adultGuestCount, int childGuestCount, String check_in_date, String check_out_date, String selectedAccommodation_type) {
        //INFO BROUGHT FROM PREVIOUS RESERVATION MENU
        this.hotel = hotel;
        this.room = room;
        this.adultGuestCount = adultGuestCount;
        this.childGuestCount = childGuestCount;
//        confirmedAdultGuestCount = adultGuestCount;
//        confirmedChildGuestCount = childGuestCount;
        if (!check_in_date.isEmpty()) {
            this.check_in_date = check_in_date;
        } else {
            this.check_in_date = "01.01.2025";
        }
        if (!check_out_date.isEmpty()) {
            this.check_out_date = check_out_date;
        } else {
            this.check_out_date = "02.01.2025";
        }
        selectedSeason = Season.seasonDecider(check_in_date);
        duration = Helper.calculateDuration(check_in_date, check_out_date);
        this.selectedAccommodation_type = selectedAccommodation_type;
        add(wrapper);
        setSize(1000, 1000);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);
        int hotel_id = hotel.getId();
        int room_id = room.getId();
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

        for (int i = 1; i < confirmationFieldList.size() - 2; i++) {
            confirmationFieldList.get(i).setText("i");
        }


        gatherReservationInformationForConfirmation(room_id, hotel_id, selectedAccommodation_type, check_in_date, check_out_date, contact_name, contact_phone, contact_email, contact_id_no, note, guest_1_name, guest_1_country, guest_1_id_no, guest_1_type, guest_2_name, guest_2_country, guest_2_id_no, guest_2_type, guest_3_name, guest_3_country, guest_3_id_no, guest_3_type);
        //##INFO BROUGHT FROM PREVIOUS RESERVATION MENU

        // GATHERING RESERVATION INFORMATION FOR CONFIRMATION

        //   gatherReservationInformationForConfirmation()
        // ### GATHERING RESERVATION INFORMATION FOR CONFIRMATION

        confirmedAdultGuestCount = 1;
        confirmedChildGuestCount = 0;


//

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
//            for (int i = 1; i < confirmationFieldList.size() - 2; i++) {
//                confirmationFieldList.get(i).setText("i");
//            }
            if (Helper.isAnyFieldEmpty(confirmationFieldList)) {
                Helper.showMessage("Please fill in the required Fields");
            } else {
                //  double calculatedReservationPrice = Calculation.calculateReservationPrice();
                if (!field_staff_confirmation_guest_2_name.getText().isEmpty() && !field_staff_confirmation_guest_2_country.getText().isEmpty() && !field_staff_confirmation_guest_2_id_no.getText().isEmpty()) {
                    confirmedAdultGuestCount = +1;
                    System.out.println("confirmed adult guest count" + confirmedAdultGuestCount);
                }
                if (!field_staff_confirmation_guest_3_name.getText().isEmpty() && !field_staff_confirmation_guest_3_country.getText().isEmpty() && !field_staff_confirmation_guest_3_id_no.getText().isEmpty()) {
                    confirmedChildGuestCount += 1;
                    System.out.println("confirmed child guest count" + confirmedChildGuestCount);
                }

                field_staff_confirmation_calculated_reservation_price.setText(String.valueOf(Calculation.calculateReservationPrice(room_id, selectedSeason, selectedAccommodation_type, confirmedAdultGuestCount, confirmedChildGuestCount, duration)));
            }

        });
        button_staff_confirmation.addActionListener(e -> {
            if (Helper.isAnyFieldEmpty(confirmationFieldList)) {
                Helper.showMessage("Please Fill All Required Fields");
            } else {

                //check_in_date = field_staff_confirmation_check_in_date.getText();
                //check_out_date = field_staff_confirmation_check_out_date.getText();
                contact_name = field_staff_confirmation_contact_name.getText();
                contact_phone = field_staff_confirmation_contact_phone.getText();
                contact_email = field_staff_confirmation_contact_email.getText();
                contact_id_no = field_staff_confirmation_contact_id_no.getText();
                note = field_staff_confirmation_contact_note.getText();
                guest_1_name = field_staff_confirmation_guest_1_name.getText();
                guest_1_country = field_staff_confirmation_guest_1_country.getText();
                guest_1_id_no = field_staff_confirmation_guest_1_id_no.getText();
                guest_1_type = "adult";
                guest_2_name = field_staff_confirmation_guest_2_name.getText();
                guest_2_country = field_staff_confirmation_guest_2_country.getText();
                guest_2_id_no = field_staff_confirmation_guest_2_id_no.getText();
                guest_2_type = "adult";
                guest_3_name = field_staff_confirmation_guest_3_name.getText();
                guest_3_country = field_staff_confirmation_guest_3_country.getText();
                guest_3_id_no = field_staff_confirmation_guest_3_id_no.getText();
                guest_3_type = "child";
                System.out.println();
                System.out.println("selected accommodation type : " + selectedAccommodation_type);
                System.out.println();
                if (Reservation.add(room_id, hotel_id, selectedAccommodation_type, check_in_date, check_out_date, contact_name, contact_phone, contact_email, contact_id_no, note, guest_1_name, guest_1_country, guest_1_id_no, guest_1_type, guest_2_name, guest_2_country, guest_2_id_no, guest_2_type, guest_3_name, guest_3_country, guest_3_id_no, guest_3_type)) {
                    Helper.showMessage("success");

                }
                System.out.println(room_id + hotel_id + selectedAccommodation_type + check_in_date + check_out_date + contact_name + contact_phone + contact_email + contact_id_no + note + guest_1_name + guest_1_country + guest_1_id_no + guest_1_type + guest_2_name + guest_2_country + guest_2_id_no + guest_2_type + guest_3_name + guest_3_country + guest_3_id_no + guest_3_type);

                //   int accommodation_type = Accommodation.getFetch(hotel_id);
                //    Reservation.add(room_id, hotel_id, accommodation_type, check_in_date, check_out_date)
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
    public static ArrayList<String> gatherReservationInformationForConfirmation(int room_id, int hotel_id, String accommodation_type, String check_in_date, String check_out_date, String contact_name, String contact_phone, String contact_email, String contact_id_no, String note, String guest_1_name, String guest_1_country, String guest_1_id_no, String guest_1_type, String guest_2_name, String guest_2_country, String guest_2_id_no, String guest_2_type, String guest_3_name, String guest_3_country, String guest_3_id_no, String guest_3_type) {
        ArrayList<String> informationList = new ArrayList<>();
        informationList.add(String.valueOf(room_id));
        informationList.add(String.valueOf(hotel_id));
        informationList.add(accommodation_type);
        informationList.add(check_in_date);
        informationList.add(check_out_date);
        informationList.add(contact_name);
        informationList.add(contact_phone);
        informationList.add(contact_email);
        informationList.add(contact_id_no);
        informationList.add(note);
        informationList.add(guest_1_name);
        informationList.add(guest_1_country);
        informationList.add(guest_1_id_no);
        informationList.add(guest_1_type);
        informationList.add(guest_2_name);
        informationList.add(guest_2_country);
        informationList.add(guest_2_id_no);
        informationList.add(guest_2_type);
        informationList.add(guest_3_name);
        informationList.add(guest_3_country);
        informationList.add(guest_3_id_no);
        informationList.add(guest_3_type);

        return informationList;
    }
}
