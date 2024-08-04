package _240803_DatabaseConnection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class _DatabaseConnection {

    public static void main(String[] args)
{    Connection connect=null;
    String url="jdbc:mysql://localhost/university?user=root&password=password";

    try{
        connect = DriverManager.getConnection(url);
        connect.close();

    }catch(SQLException e){
        System.out.println(e.getMessage());
    }

}
}