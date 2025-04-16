package _241308.com.patikadev.Model;

import _241308.com.patikadev.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Content {

    private int id;
    private String name;
    private String info;
    private String youtube_link;
    private String quiz_questions;
    private String course_name;

    private Course course;


    public Content() {
    }

    public Content(int id, String name, String info, String youtube_link, String quiz_questions, String course_name) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.youtube_link = youtube_link;
        this.quiz_questions = quiz_questions;
        this.course = Course.getFetch(course_name);
        this.course_name = course_name;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getYoutube_link() {
        return youtube_link;
    }

    public void setYoutube_link(String youtube_link) {
        this.youtube_link = youtube_link;
    }

    public String getQuiz_questions() {
        return quiz_questions;
    }

    public void setQuiz_questions(String quiz_questions) {
        this.quiz_questions = quiz_questions;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public static ArrayList<Content> getList() {
        ArrayList<Content> contentList = new ArrayList<>();
        Content obj;

        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM content");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String info = rs.getString("info");
                String youtube_link = rs.getString("youtube_link");
                String quiz_questions = rs.getString("quiz_questions");
                String course_name = rs.getString("course_name");
                obj = new Content(id, name, info, youtube_link, quiz_questions, course_name);
                contentList.add(obj);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return contentList;
    }

    public static ArrayList<Content> getListByCourse(Course course) {
        ArrayList<Content> contentList = new ArrayList<>();
        Content obj;
        String query = "SELECT * FROM content WHERE course_name = ?";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1,course.getName());
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String info = rs.getString("info");
                String youtube_link = rs.getString("youtube_link");
                String quiz_questions = rs.getString("quiz_questions");
                String course_name = rs.getString("course_name");
                obj = new Content(id, name, info, youtube_link, quiz_questions, course_name);
                contentList.add(obj);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return contentList;
    }

    public static boolean add(String name, String info, String youtube_link, String quiz_questions, String course_name) {
        String query = "INSERT INTO content (name,info,youtube_link,quiz_questions,course_name) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            pr.setString(2, info);
            pr.setString(3, youtube_link);
            pr.setString(4, quiz_questions);
            pr.setString(5, course_name);
            return pr.executeUpdate() != -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return true;
    }

    public static boolean update(int id, String name, String info, String youtube_link, String quiz_questions, String course_name) {
        String query = "UPDATE content SET name=?, info=?,youtube_link=?, quiz_questions=?, course_name=? WHERE id=?";
        Content foundContent = Content.getFetch(id);
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            pr.setString(2, info);
            pr.setString(3, youtube_link);
            pr.setString(4, quiz_questions);
            pr.setString(5, course_name);
            pr.setInt(6, id);
            return pr.executeUpdate() != -1;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return true;
    }

    public static boolean delete(int id) {
        String query = "DELETE FROM content WHERE id=?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return true;
    }

    public static Content getFetch(int id) {
        Content obj = null;
        String query = "SELECT * FROM content WHERE id=?";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                obj = new Content();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setInfo(rs.getString("info"));
                obj.setYoutube_link(rs.getString("youtube_link"));
                obj.setQuiz_questions(rs.getString("quiz_questions"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return obj;
    }

 public static Content getFetch(String course_name){
        Content obj =null;
        String query = "SELECT * FROM content WHERE course_name=?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1,course_name);
            ResultSet rs = pr.executeQuery();
            if(rs.next()){
                obj = new Content();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setInfo(rs.getString("info"));
                obj.setYoutube_link(rs.getString("youtube_link"));
                obj.setQuiz_questions(rs.getString("quiz_questions"));
                obj.setCourse_name(rs.getString("course_name"));
            }
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
        return obj;
 }

    public static String searchQuery(String name, String course_name) {
        String query = "SELECT * FROM content WHERE name LIKE '%{{name}}%' AND course_name LIKE '%{{course_name}}%'";
        query = query.replace("{{name}}", name);
        query = query.replace("{{course_name}}", course_name);
        System.out.println(query);
        return query;
    }

    public static ArrayList<Content> searchContentList(String query) {
        ArrayList<Content> contentList = new ArrayList<>();
        Content obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                obj = new Content();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setInfo(rs.getString("info"));
                obj.setYoutube_link(rs.getString("youtube_link"));
                obj.setQuiz_questions(rs.getString("quiz_questions"));
                obj.setCourse_name(rs.getString("course_name"));
                contentList.add(obj);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return contentList;
    }

}