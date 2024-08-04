package _240803_DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class _DatabaseStatementExecuteUpdate_ {
    public static final String DB_URL = "jdbc:mysql://localhost/universityy";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "password";

    public static void main(String[] args) {

        Connection connect = null;
        String insertSql = "INSERT INTO student (student_name,student_class) VALUES ('Damla Erdal',4)";
        String preparedSql = "INSERT INTO student (student_name,student_class) VALUES (?,?)";
        String updateSql = "UPDATE STUDENT SET student_name='Mahmut Çetindağ' WHERE student_id=1";
        // String updateSql="UPDATE STUDENT SET student_name='Mahmut Mustafa Çetindağ
        // WHERE student_name='Mustafa Çetindağ";
        String preparedUpdateSql = "UPDATE STUDENT SET student_name=? WHERE student_id=?";
        String deleteSql = "DELETE from student WHERE student_id=4";
        String preparedDeleteSql = "DELETE from student WHERE student_id=?";

        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement st = connect.createStatement();
            System.out.println(st.executeUpdate(insertSql));
            PreparedStatement preparedSt = connect.prepareStatement(preparedSql);
            preparedSt.setInt(2, 5);
            preparedSt.setString(1, "Ahmet Vural");
            preparedSt.executeUpdate();

            System.out.println(st.executeUpdate(updateSql));
            preparedSt=connect.prepareStatement(preparedUpdateSql);

            preparedSt.setString(1, "Damla Damla");
            preparedSt.setInt(2, 4);
            preparedSt.executeUpdate();

            System.out.println(st.executeUpdate(deleteSql));
            System.out.println(st.executeUpdate(deleteSql));
            System.out.println(st.executeUpdate(deleteSql));

            preparedSt=connect.prepareStatement(preparedDeleteSql);
            preparedSt.setInt(1,4);
            preparedSt.executeUpdate();


            preparedSt.close();
            st.close();
            connect.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
