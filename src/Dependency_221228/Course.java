package Dependency_221228;

public class Course {
    private String courseName;
    private String courseCode;
    private Instructor instructor;

    public Course(String courseName, String courseCode, Instructor instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Instructor getInstructor(){
        return this.instructor;
    }

    public void setInstroctor(Instructor instructor){
        this.instructor=instructor;
    }
    //Course uses a Student 
    public double calculateCourseAverage(Student [] students){
        double sum=0;
        double average=0;

    //  Student student4 = new Student("", "", "", "DD", 50);
        for (Student student : students) {
            sum+=student.getGrade();          
        }
        average=sum/students.length;
        return average;
    }

}
