package _241308.com.patikadev.Model;

import _241308.com.patikadev.Helper.DBConnector;
import _241308.com.patikadev.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Course {
    private int id;
    private int user_id;
    private int path_id;
    private String name;
    private String language;

    private Path path;
    private User educator;

    public Course() {
    }

    Course(int id, int user_id, int path_id, String name, String language) {
        this.id = id;
        this.user_id = user_id;
        this.path_id = path_id;
        this.name = name;
        this.language = language;
        this.path = Path.getFetch(path_id);
        this.educator = User.getFetch(user_id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPath_id() {
        return path_id;
    }

    public void setPath_id(int path_id) {
        this.path_id = path_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public User getEducator() {
        return educator;
    }

    public void setEducator(User educator) {
        this.educator = educator;
    }

    public static ArrayList<Course> getList() {
        ArrayList<Course> courseList = new ArrayList<>();
        Course obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM course");
            while (rs.next()) {
                int id = rs.getInt("id");
                int user_id = rs.getInt("user_id");
                int path_id = rs.getInt("path_id");
                String name = rs.getString("name");
                String language = rs.getString("language");
                obj = new Course(id, user_id, path_id, name, language);
                courseList.add(obj);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return courseList;
    }

    public static ArrayList<Course> getListByUser(int user_id) {
        ArrayList<Course> courseList = new ArrayList<>();
        Course obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM course WHERE user_id = " + user_id);
            while (rs.next()) {
                int id = rs.getInt("id");
                int userId = rs.getInt("user_id");
                int path_id = rs.getInt("path_id");
                String name = rs.getString("name");
                String language = rs.getString("language");
                obj = new Course(id, userId, path_id, name, language);
                courseList.add(obj);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return courseList;
    }

    public static ArrayList<Course> getListByPath(int path_id) {
        ArrayList<Course> courseList = new ArrayList<>();
        Course obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs= st.executeQuery("SELECT * FROM course WHERE path_id = "+path_id);
            while(rs.next()){
                int id=rs.getInt("id");
                int user_id=rs.getInt("user_id");
                int pathid=rs.getInt("path_id");
                String name=rs.getString("name");
                String language=rs.getString("language");
                obj=new Course(id,user_id,pathid,name,language);
                courseList.add(obj);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }return courseList;
    }

    public static boolean add(int user_id, int path_id, String name, String language) {
        String query = "INSERT INTO course(user_id, path_id, name, language) VALUES (?,?,?,?)";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, user_id);
            pr.setInt(2, path_id);
            pr.setString(3, name);
            pr.setString(4, language);
            return pr.executeUpdate() != -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return true;
    }

    public static boolean delete(int id) {
        String query = "DELETE FROM course where id= ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return true;
    }

    public static boolean update(int id, int user_id, int path_id, String name, String language) {
        String query = "UPDATE course SET user_id=?, path_id=?,name=?,language=? WHERE id=?";
        Course foundCourse = Course.getFetch(id);
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, user_id);
            pr.setInt(2, path_id);
            pr.setString(3, name);
            pr.setString(4, language);
            pr.setInt(5, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return true;
    }

    public static Course getFetch(int id) {
        Course obj = null;
        String query = "SELECT * FROM course WHERE id=?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                obj = new Course();
                obj.setId(rs.getInt("id"));
                obj.setUser_id(rs.getInt("user_id"));
                obj.setPath_id(rs.getInt("path_id"));
                obj.setName(rs.getString("name"));
                obj.setLanguage(rs.getString("language"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return obj;
    }

    public static Course getFetch(String name) {
        Course obj = null;
        String query = "SELECT * FROM course WHERE name=?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                obj = new Course();
                obj.setId(rs.getInt("id"));
                obj.setUser_id(rs.getInt("user_id"));
                obj.setPath_id(rs.getInt("path_id"));
                obj.setName(rs.getString("name"));
                obj.setLanguage(rs.getString("language"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return obj;
    }
}