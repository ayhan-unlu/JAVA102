package _241308.com.patikadev.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper {

    public static void setLayout() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException |
                         InstantiationException e) {
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

    public static boolean isFieldEmpty(JTextField field) {
//        return field.getText().trim().length()==0;
        return field.getText().isEmpty();
    }

    public static void showMessage(String str) {
        optionPaneTr();
        String msg;
        String title;
        switch (str) {
            case "fill":
                msg = "Please fill all the fields.";
                title = "Error";
                break;
            case "success":
                msg = "Operation is successful.";
                title = "Result";
                break;
            case "error":
                msg = "Operation failed.";
                title = "Error";
                break;
            default:
                msg = str;
                title = "Message";
        }
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void optionPaneTr() {
        UIManager.put("OptionPane.okButtonText", "Okey");
        UIManager.put("OptionPane.background", Color.green);
    }
}
