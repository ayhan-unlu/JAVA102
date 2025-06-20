package _250506_Tourism_Agency_Project.Helper;

import _250506_Tourism_Agency_Project.Model.Feature;
import _250506_Tourism_Agency_Project.Model.Hotel;
import _250506_Tourism_Agency_Project.Model.Room;
import _250506_Tourism_Agency_Project.Model.Roomfeature;

import javax.swing.*;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Helper {

    public static void setLayout() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                         UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
        }
    }

    public static int screenCenterPoint(String axis, Dimension size) {
        int point;
        switch (axis) {
            case "x":
                point = (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
                break;
            case "y":
                point = (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
                break;
            default:
                point = 0;
        }
        return point;
    }

    public static boolean isAnyFieldEmpty(ArrayList<JTextField> textFieldList) {
        boolean result = false;
        for (int i = 0; i <= textFieldList.size() - 1; i++) {
            if (textFieldList.get(i).getText().length() == 0) {
                result = true;
                if (result) {
                    return result;
                }
            }
        }
        return result;
    }

    public static void emptyFields(ArrayList<JTextField> fieldList) {
        for (int i = 0; i <= fieldList.size() - 1; i++) {
            fieldList.get(i).setText("");
        }
    }

    public static int getHotelIdFromSelectedHotelName(JComboBox combobox) {
        String selectedHotelName = combobox.getSelectedItem().toString();
        int hotel_id = Hotel.getFetch(selectedHotelName).getId();
        return hotel_id;
    }

    public static void showMessage(String string) {
        //     optionPaneTR();
        String message;
        String title;
        switch (string) {
            case "fill":
                message = "Please fill in all fields";
                title = "Error";
                break;
            case "select":
                message = "Please select a row from the table on the left";
                title = "error";
                break;
            case "exist":
                message = "User already Exists Please use a unique username";
                title = "error";
                break;
            case "success":
                message = "Operation is successful";
                title = "Result";
                break;
            case "error":
                message = "An error occured. Please retry.";
                title = "Error";
                break;
            default:
                message = string;
                title = "Title";
        }

        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean confirm(String str) {

        String message;

        switch (str) {
            case "sure":
                message = "Are You Sure To Delete the Component?";
                break;
            default:
                message = str;
        }
        return JOptionPane.showConfirmDialog(null, message, "Confirmation Required", JOptionPane.YES_NO_OPTION) == 0;
    }

    public static int createIntFromStringDate(String selectedDate) {
        int dateInt = 0;
        int season;
        String preparedString = "";

        preparedString += selectedDate.substring(6, 10);
//        System.out.println(preparedString);
        preparedString += selectedDate.substring(3, 5);
//        System.out.println(preparedString);
        preparedString += selectedDate.substring(0, 2);
//        System.out.println(preparedString);
        dateInt = (Integer) Integer.parseInt(preparedString);
//        System.out.println(dateInt+"int");

        return dateInt;
    }public static int decideSeasonFromStringDate(String selectedDate) {
        int dateInt = 0;
        int season;
        String preparedString = "";

        preparedString += selectedDate.substring(6, 10);
//        System.out.println(preparedString);
        preparedString += selectedDate.substring(3, 5);
//        System.out.println(preparedString);
        preparedString += selectedDate.substring(0, 2);
//        System.out.println(preparedString);
        dateInt = (Integer) Integer.parseInt(preparedString);
//        System.out.println(dateInt+"int");
        if (dateInt < 20250531) {
//            System.out.println("Season 1");
            season = 1;
        } else {
//            System.out.println("Season 2");
            season = 2;
        }
        return season;
    }

    public static int calculateDuration(String check_in_date, String check_out_date) {
        int duration = 0;
        if(!check_in_date.isEmpty()) {
            duration = Helper.createIntFromStringDate(check_out_date) - Helper.createIntFromStringDate(check_in_date);
            System.out.println("int checkout date" + Helper.createIntFromStringDate(check_out_date));
            System.out.println("int checkin date" + Helper.createIntFromStringDate(check_in_date));
        }
        return duration;
    }

    public static int convertComboboxItemToInt(JComboBox combobox) {
        int selectedInt = 0;
        if (combobox.getSelectedItem().toString().equals("")) return selectedInt;
        selectedInt = (Integer) Integer.parseInt(combobox.getSelectedItem().toString());
        return selectedInt;
    }

    public static boolean stockController(int room_id) {
        if (Room.getFetch(room_id).getStock() == 0) return false;
        else return true;
    }

    public static String createStringFeatureList(Hotel hotel) {

        String hotelFeatureList = "";

        hotelFeatureList += hotel.getName() + ", ";
        hotelFeatureList += hotel.getCity() + ": ";

        Feature feature = Feature.getFetch(hotel.getId());

        if (feature.isFree_wifi()) hotelFeatureList += " Free Wifi ";
        if (feature.isFree_parking()) hotelFeatureList += " Free Parking ";
        if (feature.isPool()) hotelFeatureList += " Pool ";
        if (feature.isFitness_center()) hotelFeatureList += " Fitness Center ";
        if (feature.isHotel_concierge()) hotelFeatureList += " Hotel Concierge ";
        if (feature.isSpa()) hotelFeatureList += " Spa ";
        if (feature.isRoom_service()) hotelFeatureList += " 24/7 Room Service ";

        return hotelFeatureList;
    }

    public static String createStringFeatureList(Room room) {
        String roomFeatureList = "";

        Roomfeature roomfeature = Roomfeature.getFetch(room.getId());

        if (roomfeature.getBed_count() != 0) roomFeatureList += " Bed Count: " + roomfeature.getBed_count() + " ";
        if (roomfeature.getSquaremeters() != 0)
            roomFeatureList += "Squaremeters: " + roomfeature.getSquaremeters() + " ";
        if (roomfeature.isTv()) roomFeatureList += " Tv ";
        if (roomfeature.isMinibar()) roomFeatureList += " Minibar ";
        if (roomfeature.isConsole()) roomFeatureList += " Console ";
        if (roomfeature.isSafe()) roomFeatureList += " Safe ";
        if (roomfeature.isProjector()) roomFeatureList += " Projector ";

        return roomFeatureList;
    }

    public static int calculateGuestCount(String guest_1_name, String guest_2_name) {
        int guestCount = 0;
        if (!guest_1_name.isEmpty()) guestCount += 1;
        if (!guest_2_name.isEmpty()) guestCount += 1;
        return guestCount;
    }

    public static int calculateGuestCount(String guest_3_name) {
        int guestCount = 0;
        if (!guest_3_name.isEmpty()) guestCount += 1;
        return guestCount;

    }

    public static void decreaseRoomStockOne(int room_id) {

        String query = "UPDATE room SET stock=? WHERE id=?";
        Room foundRoom = Room.getFetch(room_id);

        int stock = foundRoom.getStock();
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, stock - 1);
            pr.setInt(2, room_id);
            pr.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void increaseRoomStockOne(int room_id) {
        String query = "UPDATE room SET stock=? WHERE id=?";
        Room foundRoom = Room.getFetch(room_id);
        int stock = foundRoom.getStock();
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, stock + 1);
            pr.setInt(2, room_id);

        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public static boolean guestTypeController(String guest_1_type, String guest_2_type, String guest_3_type) {
        boolean condition = false;
        String type1 = "adult";
        String type2 = "child";

        if ((guest_1_type.equals(type1) || guest_1_type.equals(type2) || guest_1_type.isEmpty()) && (guest_2_type.equals(type1) || guest_2_type.equals(type2) || guest_2_type.isEmpty()) && (guest_3_type.equals(type1) || guest_3_type.equals(type2) || guest_3_type.isEmpty())) {
            condition = true;
        }
        return condition;
    }

    public static void main(String[] args) {
        Hotel hotel = Hotel.getFetch(1);
        System.out.println(createStringFeatureList(hotel));
        System.out.println(createStringFeatureList(Room.getFetch(1)));
        // Helper.createIntFromStringDate("12.06.2025");
    }

    public static void optionPaneTR() {
        UIManager.put("OptionPane.okButtonText", "Tamam");
    }
}
