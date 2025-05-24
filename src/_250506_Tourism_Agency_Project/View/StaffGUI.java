package _250506_Tourism_Agency_Project.View;

import _250506_Tourism_Agency_Project.Helper.Config;
import _250506_Tourism_Agency_Project.Helper.Helper;
import _250506_Tourism_Agency_Project.Model.Hotel;
import _250506_Tourism_Agency_Project.Model.Staff;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
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
    private JPanel panel_staff_periods;
    private JPanel panel_staff_price;
    private JPanel panel_staff_search_room;
    private JPanel panel_staff_reservation;
    private JTable table_staff_hotel;
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
    private DefaultTableModel model_staff_hotel_list;
    private Object[] row_staff_hotel_list;

    public StaffGUI(Staff staff) {
        this.staff = staff;

        add(wrapper);
        setSize(1000, 1000);
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

        table_staff_hotel.setModel(model_staff_hotel_list);
        table_staff_hotel.getTableHeader().setReorderingAllowed(false);
        table_staff_hotel.getColumnModel().getColumn(0).setMaxWidth(50);

        table_staff_hotel.getSelectionModel().addListSelectionListener(e -> {
            try {
                String selected_hotel_id = table_staff_hotel.getValueAt(table_staff_hotel.getSelectedRow(), 0).toString();
                field_staff_hotel_delete_hotel_id.setText(selected_hotel_id);
            } catch (Exception e1) {
            }
        });

        table_staff_hotel.getModel().addTableModelListener(e -> {
            int selectedRow = table_staff_hotel.getSelectedRow();
            if (e.getType() == TableModelEvent.UPDATE) {
                int id = Integer.parseInt(table_staff_hotel.getValueAt(selectedRow, 0).toString());
                String name = table_staff_hotel.getValueAt(selectedRow, 1).toString();
                String city = table_staff_hotel.getValueAt(selectedRow, 2).toString();
                String region = table_staff_hotel.getValueAt(selectedRow, 3).toString();
                String address = table_staff_hotel.getValueAt(selectedRow, 4).toString();
                String email = table_staff_hotel.getValueAt(selectedRow, 5).toString();
                String phone = table_staff_hotel.getValueAt(selectedRow, 6).toString();
                String star = table_staff_hotel.getValueAt(selectedRow, 7).toString();
                String facility_feature = table_staff_hotel.getValueAt(selectedRow,8).toString();
                if (Hotel.update(id, name, city, region, address, email, phone, star/*,facility_feature*/)) {
                    Helper.showMessage("success");

                }
                loadStaffHotelListModel();
            }
        });


        // ##ModelHotelList


        button_staff_logout.addActionListener(e -> {
            dispose();
            LoginGUI loginGUI = new LoginGUI();
        });

        button_staff_hotel_add.addActionListener(e -> {
            ArrayList<JTextField> staffHotelAddTextFieldList = new ArrayList<>();

            staffHotelAddTextFieldList.add(field_staff_hotel_add_name);
            staffHotelAddTextFieldList.add(field_staff_hotel_add_city);
            staffHotelAddTextFieldList.add(field_staff_hotel_add_region);
            staffHotelAddTextFieldList.add(field_staff_hotel_add_address);
            staffHotelAddTextFieldList.add(field_staff_hotel_add_email);
            staffHotelAddTextFieldList.add(field_staff_hotel_add_phone);
            staffHotelAddTextFieldList.add(field_staff_hotel_add_star);
            if (Helper.isAnyFieldEmpty(staffHotelAddTextFieldList)) {
                Helper.showMessage("fill");
            } else {
                if (Hotel.add(field_staff_hotel_add_name.getText(),
                        field_staff_hotel_add_city.getText(),
                        field_staff_hotel_add_region.getText(),
                        field_staff_hotel_add_address.getText(),
                        field_staff_hotel_add_email.getText(),
                        field_staff_hotel_add_phone.getText(),
                        field_staff_hotel_add_star.getText()/*,""*/)) {
                    Helper.showMessage("success");

                    loadStaffHotelListModel();
                } else {
                    Helper.showMessage("error");
                }
            }
            for (int i = 0; i <= staffHotelAddTextFieldList.size() - 1; i++) {
                staffHotelAddTextFieldList.get(i).setText(null);
            }

        });
        button_staff_hotel_delete.addActionListener(e -> {
            if (field_staff_hotel_delete_hotel_id.getText().isEmpty()) {
                Helper.showMessage("select");
            } else {
                if (Helper.confirm("sure")) {
                    int selected_hotel_id = Integer.parseInt(field_staff_hotel_delete_hotel_id.getText());
                    if (Hotel.delete(selected_hotel_id)) {
                        Helper.showMessage("success");
                        loadStaffHotelListModel();
                    } else {
                        Helper.showMessage("error");
                    }
                }
            }
            field_staff_hotel_delete_hotel_id.setText(null);
        });
    }

    public void loadStaffHotelListModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_staff_hotel.getModel();
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
}
