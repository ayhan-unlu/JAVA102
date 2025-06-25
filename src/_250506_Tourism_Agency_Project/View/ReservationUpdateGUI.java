package _250506_Tourism_Agency_Project.View;

import _250506_Tourism_Agency_Project.Helper.Config;
import _250506_Tourism_Agency_Project.Helper.Helper;
import _250506_Tourism_Agency_Project.Model.Reservation;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

public class ReservationUpdateGUI extends JFrame {
    int id;
    private JPanel wrapper;
    private JScrollPane scroll_panel_staff_reservation_update_list;
    private JTable table_staff_reservation_update_list;
    private JLabel label_staff_reservation_update_list;
    private DefaultTableModel model_staff_reservation_update_list;
    private Object[] row_staff_reservation_update_list;

    ReservationUpdateGUI(int id) {
        this.id = id;
        add(wrapper);
        setSize(2000, 1000);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        model_staff_reservation_update_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1 || column == 2) return false;
                return super.isCellEditable(row, column);
            }
        };

        Object[] column_staff_reservation_update_list = {"Id", "Hotel Id", "Room Id", "Accommodation Type", "Check In Date", "Check Out Date", "Contact Name", "Phone", "Email", "Id No","Note", "Guest 1 Name", "Country", "Id No", "Type", "Guest 2 Name", "Country", "Id No", "Type", "Guest 3 Name", "Country", "Id No", "Type"};
        model_staff_reservation_update_list.setColumnIdentifiers(column_staff_reservation_update_list);
        row_staff_reservation_update_list = new Object[column_staff_reservation_update_list.length];
        loadStaffReservationUpdateList(id);
        table_staff_reservation_update_list.setModel(model_staff_reservation_update_list);
        table_staff_reservation_update_list.getTableHeader().setReorderingAllowed(false);

       table_staff_reservation_update_list.getModel().addTableModelListener(e -> {
           int selectedRow = table_staff_reservation_update_list.getSelectedRow();
           if(e.getType()== TableModelEvent.UPDATE){
               int selectedId = (Integer)Integer.parseInt(table_staff_reservation_update_list.getValueAt(selectedRow,0).toString());
               String accommodation_type = table_staff_reservation_update_list.getValueAt(selectedRow,3).toString();
               String check_in_date = table_staff_reservation_update_list.getValueAt(selectedRow,4).toString();
               String check_out_date = table_staff_reservation_update_list.getValueAt(selectedRow,5).toString();
               String contact_name = table_staff_reservation_update_list.getValueAt(selectedRow,6).toString();
               String contact_phone = table_staff_reservation_update_list.getValueAt(selectedRow,7).toString();
               String contact_email = table_staff_reservation_update_list.getValueAt(selectedRow,8).toString();
               String contact_id_no = table_staff_reservation_update_list.getValueAt(selectedRow,9).toString();
               String note = table_staff_reservation_update_list.getValueAt(selectedRow,10).toString();
               String guest_1_name = table_staff_reservation_update_list.getValueAt(selectedRow,11).toString();
               String guest_1_country = table_staff_reservation_update_list.getValueAt(selectedRow,12).toString();
               String guest_1_id_no = table_staff_reservation_update_list.getValueAt(selectedRow,13).toString();
               String guest_1_type = table_staff_reservation_update_list.getValueAt(selectedRow,14).toString();
               String guest_2_name = table_staff_reservation_update_list.getValueAt(selectedRow,15).toString();
               String guest_2_country = table_staff_reservation_update_list.getValueAt(selectedRow,16).toString();
               String guest_2_id_no = table_staff_reservation_update_list.getValueAt(selectedRow,17).toString();
               String guest_2_type = table_staff_reservation_update_list.getValueAt(selectedRow,18).toString();
               String guest_3_name = table_staff_reservation_update_list.getValueAt(selectedRow,19).toString();
               String guest_3_country = table_staff_reservation_update_list.getValueAt(selectedRow,20).toString();
               String guest_3_id_no = table_staff_reservation_update_list.getValueAt(selectedRow,21).toString();
               String guest_3_type = table_staff_reservation_update_list.getValueAt(selectedRow,22).toString();

               if(Reservation.update(selectedId,accommodation_type,check_in_date,check_out_date,contact_name,contact_phone,contact_email,contact_id_no,note,guest_1_name,guest_1_country,guest_1_id_no,guest_1_type,guest_2_name,guest_2_country,guest_2_id_no,guest_2_type,guest_3_name,guest_3_country,guest_3_id_no,guest_3_type)){
                   Helper.showMessage("success");
                   loadStaffReservationUpdateList(id);
               }else loadStaffReservationUpdateList(id);

           }
       });
    }

    public void loadStaffReservationUpdateList(int id) {
        DefaultTableModel clearModel = (DefaultTableModel) table_staff_reservation_update_list.getModel();
        clearModel.setRowCount(0);

        int i;

        for (Reservation obj : Reservation.getList()) {
            i = 0;
            if(id==obj.getId()) {
                row_staff_reservation_update_list[i++] = obj.getId();
                row_staff_reservation_update_list[i++] = obj.getHotel_id();
                row_staff_reservation_update_list[i++] = obj.getRoom_id();
                row_staff_reservation_update_list[i++] = obj.getAccommodation_type();
                row_staff_reservation_update_list[i++] = obj.getCheck_in_date();
                row_staff_reservation_update_list[i++] = obj.getCheck_out_date();
                row_staff_reservation_update_list[i++] = obj.getContact_name();
                row_staff_reservation_update_list[i++] = obj.getContact_phone();
                row_staff_reservation_update_list[i++] = obj.getContact_email();
                row_staff_reservation_update_list[i++] = obj.getContact_id_no();
                row_staff_reservation_update_list[i++] = obj.getNote();
                row_staff_reservation_update_list[i++] = obj.getGuest_1_name();
                row_staff_reservation_update_list[i++] = obj.getGuest_1_country();
                row_staff_reservation_update_list[i++] = obj.getGuest_1_id_no();
                row_staff_reservation_update_list[i++] = obj.getGuest_1_type();
                row_staff_reservation_update_list[i++] = obj.getGuest_2_name();
                row_staff_reservation_update_list[i++] = obj.getGuest_2_country();
                row_staff_reservation_update_list[i++] = obj.getGuest_2_id_no();
                row_staff_reservation_update_list[i++] = obj.getGuest_2_type();
                row_staff_reservation_update_list[i++] = obj.getGuest_3_name();
                row_staff_reservation_update_list[i++] = obj.getGuest_3_country();
                row_staff_reservation_update_list[i++] = obj.getGuest_3_id_no();
                row_staff_reservation_update_list[i++] = obj.getGuest_3_type();

                model_staff_reservation_update_list.addRow(row_staff_reservation_update_list);
            }

        }
    }

}
