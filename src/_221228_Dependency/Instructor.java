package _221228_Dependency;

public class Instructor {
    private String instructorName;
    private String instructorSurname;
    private String instructorDepartment;

    public Instructor(String instructorName, String instructorSurname, String instructorDepartment) {
        this.instructorName = instructorName;
        this.instructorSurname = instructorSurname;
        this.instructorDepartment = instructorDepartment;
    }

    public String getInstructorName(){
        return this.instructorName;
    }

    public void setInstructorName(String instructorName){
        this.instructorName= instructorName;
    }

    public String getInstructorSurname(){
        return this.instructorSurname;
    }

    public void setInstructorSurname(String instructorSurname){
        this.instructorSurname=instructorSurname;
    }

    public String getInstructorDepartment(){
        return instructorDepartment;
    }

    public void setInstructorDepartment(String instructorDepartment){
        this.instructorDepartment=instructorDepartment;
    }
}
