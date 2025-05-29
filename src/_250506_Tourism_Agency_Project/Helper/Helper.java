package _250506_Tourism_Agency_Project.Helper;

import _250506_Tourism_Agency_Project.Model.Hotel;
import _250506_Tourism_Agency_Project.Model.Room;

import javax.swing.*;
import java.awt.*;
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
        if (dateInt < 20250631) {
//            System.out.println("Season 1");
            season = 1;
        } else {
//            System.out.println("Season 2");
            season = 2;
        }
        return season;
    }

    public static int convertComboboxItemToInt(JComboBox combobox) {
        int selectedInt = 0;
        if (combobox.getSelectedItem().toString().equals("")) return selectedInt;
        selectedInt = (Integer) Integer.parseInt(combobox.getSelectedItem().toString());
        return selectedInt;
    }

    public static boolean stockController(int room_id) {
        if ( Room.getFetch(room_id).getStock()==0) return false;
            else return true;
    }
//    public static void main(String[] args) {
//        Helper.createIntFromStringDate("12.06.2025");
//    }

    public static void optionPaneTR() {
        UIManager.put("OptionPane.okButtonText", "Tamam");
    }
}
