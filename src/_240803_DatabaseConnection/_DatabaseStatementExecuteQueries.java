package _240803_DatabaseConnection;

import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _DatabaseStatementExecuteQueries {

    public static final String DB_URL = "jdbc:mysql://localhost/universityy";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "password";

    public static void main(String[] args) {

        Connection connect = null;
        // Statement st = null;
        String sql = "SELECT * FROM student";
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            // Statement st = connect.createStatement();
            Statement st = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet data = st.executeQuery(sql);

            System.out.println("#### With While ####");
            while (data.next()) {
                System.out.println("ID " + data.getInt("student_id"));
                // System.out.println("ID taken with index number : "+data.getInt(1));
                System.out.println("Name: " + data.getString("student_name"));
                System.out.println("Class taken as string: " + data.getString("student_class"));
                System.out.println("Class taken as integer: " + data.getInt("student_class"));
                System.out.println("####################");
            }

            data.first();
            System.out.println("**** Without while ****");
            System.out.println("First");
            System.out.println("Name : " + data.getString("student_name"));
            System.out.println("Second");
            data.next();
            System.out.println("Name : " + data.getString("student_name"));
            data.first();
            data.last();
            System.out.println("Last");
            System.out.println("Name : " + data.getString("student_name"));
            data.absolute(2);
            System.out.println("Second row with absolute: "+data.getString("student_name"));

            data.close();
            st.close();
            connect.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
