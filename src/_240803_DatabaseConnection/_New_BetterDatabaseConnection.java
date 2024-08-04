package _240803_DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _New_BetterDatabaseConnection {

    public static final String DB_URL = "jdbc:mysql://localhost/universityy";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "password";

    public static void main(String []args) {

        Connection newConnection123 = null;
        try {
            newConnection123 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            newConnection123.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
