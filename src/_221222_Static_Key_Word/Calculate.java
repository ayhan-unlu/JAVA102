package _221222_Static_Key_Word;

public class Calculate {
    
//    public int grade = 10;
/*
    public static void calculateAverage(int [] grades){
        double sumOfGrades=0;
        for (int i=0;i<grades.length;i++){
            sumOfGrades+=grades[i];
        }*/
//        sumOfGrades+=this.grade;
/*public static void calculateAverage(Course [] grades){
    double sumOfGrades=0;
    for (Course c:grades){
        sumOfGrades+=c.grade;
    }*/

    public static void calculateAverage(Course [] grades){
        double sumOfGrades=0;
        for (int i=0;i<grades.length;i++){
            sumOfGrades+=grades[i].grade;
        }
        double averageOfGrade=sumOfGrades/grades.length; 

        System.out.println("Your Average of Grades is : "+ averageOfGrade);

    }
    
}
