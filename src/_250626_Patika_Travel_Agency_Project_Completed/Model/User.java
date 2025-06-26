package _250626_Patika_Travel_Agency_Project_Completed.Model;

import _250626_Patika_Travel_Agency_Project_Completed.Helper.DBConnector;
import _250626_Patika_Travel_Agency_Project_Completed.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private String surname;
    private String username;
    private String password;
    private String type;

    public User() {
    }

    public User(int id, String name, String surname, String username, String password, String type) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public static ArrayList<User> getList() {
        ArrayList<User> userList = new ArrayList<>();
        String query = "SELECT * FROM user";
        User obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setSurname(rs.getString("surname"));
                obj.setUsername(rs.getString("username"));
                obj.setPassword(rs.getString("password"));
                obj.setType(rs.getString("type"));
                userList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return userList;
    }

    public static boolean add(String name, String surname, String username, String password, String type) {
        String query = "INSERT INTO user (name, surname, username, password, type) VALUES (?,?,?,?,?)";
        User foundUser = User.getFetch(username);
        if (foundUser != null) {
            Helper.showMessage("exist");
            return false;
        }
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            pr.setString(2, surname);
            pr.setString(3, username);
            pr.setString(4, password);
            pr.setString(5, type);

            int response = pr.executeUpdate();
            if (response == -1) {
                Helper.showMessage("error");
            }
            return response != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static boolean delete(int id) {
        String query = "DELETE FROM user WHERE  id = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static boolean update(int id, String name, String surname, String username, String password, String type) {
        String query = "UPDATE user SET name=?, surname=?, username=?, password=?, type=? WHERE id=?";

        User foundUser = User.getFetch(username);

        if ((foundUser != null) && (foundUser.getId() != id)) {
            Helper.showMessage("exist");
            return false;
        }
        if (type.equals("admin") || type.equals("staff")) {
        } else {
            Helper.showMessage("Type should be either admin or staff");
            return false;
        }

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            pr.setString(2, surname);
            pr.setString(3, username);
            pr.setString(4, password);
            pr.setString(5, type);
            pr.setInt(6, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static ArrayList<User> searchUserList(String query) {
        ArrayList<User> userList = new ArrayList<>();
        User obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setSurname(rs.getString("surname"));
                obj.setUsername(rs.getString("username"));
                obj.setPassword(rs.getString("password"));
                obj.setType(rs.getString("type"));
                userList.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
//        System.out.println(userList);

        return userList;
    }

    public static String searchQuery(String name, String surname, String username, String type) {
        String query = "SELECT * FROM user WHERE name LIKE '%{{name}}%' AND surname LIKE '%{{surname}}%' AND username LIKE '%{{username}}%'";
        query = query.replace("{{name}}", name);
        query = query.replace("{{surname}}", surname);
        query = query.replace("{{username}}", username);
        if (!type.isEmpty()) {
            query += " AND type='{{type}}'";
            query = query.replace("{{type}}", type);
        }
        if (name.isEmpty() && surname.isEmpty() && username.isEmpty() && type.isEmpty()) {
            query = "SELECT * FROM user";
        }

        return query;
    }

    public static User getFetch(String username) {
        User obj = null;

        String query = "SELECT * FROM user WHERE username = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, username);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setSurname(rs.getString("surname"));
                obj.setUsername(rs.getString("username"));
                obj.setPassword(rs.getString("password"));
                obj.setType(rs.getString("type"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return obj;
    }

    public static User getFetch(String username, String password){
        User obj = null;

        String query = "SELECT * FROM user WHERE username = ? AND password = ?";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1,username);
            pr.setString(2,password);
            ResultSet rs = pr.executeQuery();

            if(rs.next()){
                switch(rs.getString("type")){
                    case "admin":
                        obj = new Admin();
                        break;
                    case "staff":
                        obj = new Staff();
                        break;
                    default:
                        obj = new User();
                        break;
                }
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setSurname(rs.getString("surname"));
                obj.setUsername(rs.getString("username"));
                obj.setPassword(rs.getString("password"));
                obj.setType(rs.getString("type"));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return obj;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
