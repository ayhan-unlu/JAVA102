package _241308.com.patikadev.Model;

import _241308.com.patikadev.Helper.DBConnector;

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
    private int course_id;

    private Course course;


    public Content(int id, String name, String info, String youtube_link, String quiz_questions, int course_id) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.youtube_link = youtube_link;
        this.quiz_questions = quiz_questions;
        this.course = Course.getFetch(course_id);
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

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
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
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String info=rs.getString("info");
                String youtube_link=rs.getString("youtube_link");
                String quiz_questions=rs.getString("quiz_questions");
                int course_id=rs.getInt("course_id");
                obj = new Content(id,name,info,youtube_link,quiz_questions,course_id);
                contentList.add(obj);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return contentList;
    }

}