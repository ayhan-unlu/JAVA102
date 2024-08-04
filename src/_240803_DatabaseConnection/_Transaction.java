package _240803_DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class _Transaction {

    public static final String DB_URL = "jdbc:mysql://localhost/universityy";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "password";

    public static void main(String[] args) {

        Connection connect = null;
        String prSql = "INSERT INTO student (student_name,student_class) VALUES (?,?)";

        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            connect.setAutoCommit(false);
            PreparedStatement prSt = connect.prepareStatement(prSql);
            prSt.setString(1, "John Canwood");
            prSt.setInt(2, 4);
            prSt.executeUpdate();

            if (true) {
                throw new SQLException();
            }

            prSt.setString(1, "Doe Johnson");
             prSt.setInt(2, 5);
            prSt.executeUpdate();
            connect.commit();

            prSt.close();
            connect.close();

        } catch (SQLException e) {

            if(connect!=null){

                try{connect.rollback();}
                catch(SQLException e1){
                    System.out.println(e1.getMessage());
                }
            }
            System.out.println(e.getMessage());
        }
    }

}
