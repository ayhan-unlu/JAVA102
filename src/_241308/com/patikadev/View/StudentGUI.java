package _241308.com.patikadev.View;

import _241308.com.patikadev.Helper.Config;
import _241308.com.patikadev.Helper.Helper;
import _241308.com.patikadev.Model.Operator;
import _241308.com.patikadev.Model.Path;
import _241308.com.patikadev.Model.Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentGUI extends JFrame {
    private JPanel wrapper;
    private JLabel label_student_welcome;
    private JButton button_logout;
    private JTabbedPane tab_student;
    private JPanel panel_student_path_list;
    private JTable table_student_path_list;
    private JScrollPane scroll_student_path_list;
    private final Student student;
    private DefaultTableModel model_student_path_list;
    private Object[] row_student_path_list;
    private JPopupMenu studentJoinPathMenu;


    public StudentGUI(Student student) {
        this.student = student;
        add(wrapper);
        setSize(700, 700);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        label_student_welcome.setText("Welcome Student " + student.getName());
        setVisible(true);

        studentJoinPathMenu = new JPopupMenu();
        JMenuItem joinMenu = new JMenuItem("Get Course List");
        studentJoinPathMenu.add(joinMenu);

        joinMenu.addActionListener(e -> {
            int selected_id = Integer.parseInt(table_student_path_list.getValueAt(table_student_path_list.getSelectedRow(), 0).toString());
            StudentPathJoinGUI joinGUI = new StudentPathJoinGUI(Path.getFetch(selected_id));
        });

        //Model Student Path List
        model_student_path_list = new DefaultTableModel();
        Object[] column_student_path_list = {"Id", "Path Name"};
        model_student_path_list.setColumnIdentifiers(column_student_path_list);
        row_student_path_list = new Object[column_student_path_list.length];
        loadStudentPathModel();
        table_student_path_list.setModel(model_student_path_list);
        table_student_path_list.setComponentPopupMenu(studentJoinPathMenu);
        table_student_path_list.getTableHeader().setReorderingAllowed(false);
        table_student_path_list.getColumnModel().getColumn(0).setMaxWidth(75);

        table_student_path_list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //     System.out.println(e.getPoint().toString());
                Point point = e.getPoint();
                int selected_row = table_student_path_list.rowAtPoint(point);
                table_student_path_list.setRowSelectionInterval(selected_row, selected_row);
            }
        });

        //##Model Student Path List


        button_logout.addActionListener(e -> {
            dispose();
            LoginGUI loginGUI = new LoginGUI();
        });
    }

    private void loadStudentPathModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_student_path_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Path obj : Path.getList()) {
            i = 0;
            row_student_path_list[i++] = obj.getId();
            row_student_path_list[i++] = obj.getName();
            model_student_path_list.addRow(row_student_path_list);

        }

    }
}
