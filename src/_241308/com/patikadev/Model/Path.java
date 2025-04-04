package _241308.com.patikadev.Model;

import _241308.com.patikadev.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Path {
    private int id;
    private String name;


    public Path(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Path> getList() {
        ArrayList<Path> pathList = new ArrayList<>();
        Path obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM path");
            while (rs.next()) {
                obj = new Path(rs.getInt("id"), rs.getString("name"));
                pathList.add(obj);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return pathList;
    }

    public static boolean add(String name) {
        String query = "INSERT INTO path (name) VALUES (?)";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            return pr.executeUpdate() != -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return true;
    }

    public static boolean update(int id, String name) {
        String query = "UPDATE path SET name = ? WHERE id = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            pr.setInt(2, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return true;
    }

    public static Path getFetch(int id) {
        Path obj = null;
        String query = "SELECT * FROM path WHERE id = ?";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                obj = new Path(rs.getInt("id"), rs.getString("name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return obj;
    }

    public static Path getFetch(String name) {
        Path obj = null;
        String query = "SELECT * FROM path WHERE name=?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            ResultSet rs=pr.executeQuery();
            if(rs.next()){
                obj=new Path(rs.getInt("id"),rs.getString("name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return obj;
    }

    public static boolean delete(int id) {
        String query = "DELETE FROM path WHERE id = ?";
        ArrayList<Course> courseList = Course.getList();
        for (Course c : courseList) {
            if (c.getPath_id() == id) {
                Course.delete(c.getId());
            }
        }
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return true;
    }
}