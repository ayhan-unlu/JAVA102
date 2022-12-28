package Dependency_221228;

public class Student {
    private String name;
    private String surname;
    private String id;
    private String address;
    private int grade;

    public Student(String name, String surname, String id, String address, int grade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.address = address;
        if (grade<0||grade>100){
            grade=0;
        }
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        if(grade<0||grade>100){
            grade=0;
        }
        this.grade = grade;
    }
}
