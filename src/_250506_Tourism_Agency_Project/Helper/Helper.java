package _250506_Tourism_Agency_Project.Helper;

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
        return JOptionPane.showConfirmDialog(null, message,"Confirmation Required", JOptionPane.YES_NO_OPTION)==0;

    }

    public static void optionPaneTR() {
        UIManager.put("OptionPane.okButtonText", "Tamam");
    }
}
