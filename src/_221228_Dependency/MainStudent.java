package _221228_Dependency;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Ayhan", "Unlu", "123", "AA", 100);
        Student student2 = new Student("Patika", "Dev", "1123", "bb", 85);
        Student student3 = new Student("Kodluyoruz", "Org", "11123", "CC", 85);

        student2.setGrade(110);
    
        System.out.println(student2.getGrade());

        Instructor instructor1 = new Instructor("Mahmut", "Hodja", "Math");
        Instructor instructor2 = new Instructor("a","b","CENG");
        
        System.out.println(instructor2.getInstructorDepartment());

        //Composition , Aggregation 
        //Course has a Instructor
        Course math = new Course("Mathematics", "Math101",instructor1);

        Student [] studentArray = {student1, student2, student3};

        System.out.println("Average of "+math.getCourseName()+ " Course : "+math.calculateCourseAverage(studentArray));

        System.out.println(math.getInstructor().getInstructorName());

        System.out.println(instructor1.getInstructorName());
    }
}
