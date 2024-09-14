package _241308.com.patikadev.View;

import _241308.com.patikadev.Helper.Config;
import _241308.com.patikadev.Helper.Helper;
import _241308.com.patikadev.Model.Path;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdatePathGUI extends JFrame {
    private JPanel wrapper;
    private JLabel label_update_path_name;
    private JTextField field_update_path_name;
    private JButton button_path_update;
    private Path path;

    public UpdatePathGUI(Path path) {
        this.path = path;
        add(wrapper);
        setSize(300, 150);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        field_update_path_name.setText(path.getName());
        setVisible(true);
        button_path_update.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_update_path_name)) {
                Helper.showMessage("fill");
            } else {
                if (Path.update(path.getId(), field_update_path_name.getText())) {
                    Helper.showMessage("success");
                } else {
                    Helper.showMessage("error");
                }
                dispose();
            }
        });
    }

/*    public static void main(String[] args) {
        Helper.setLayout();
        Path pTest = new Path(1, "Frontend");
        UpdatePathGUI upTest = new UpdatePathGUI(pTest);
    }
*/
}
