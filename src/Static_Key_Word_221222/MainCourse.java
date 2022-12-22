package Static_Key_Word_221222;

public class MainCourse {
    public static void main(String[] args) {
        Course math = new Course("Mathematics", "MAT-101", 70);
        Course physics = new Course("Physics", "PHY-101", 20);
        Course chemistry = new Course("Chemistery", "CHE-101", 100);

        // int[] grades = { math.grade, physics.grade, chemistry.grade };
        // int [] grades ={70,20,100};
        // math.calculateAverage(grades);
        // Calculate calculate = new Calculate();
        // calculate.calculateAverage(grades);

        Course [] dersler = {math,physics,chemistry} ;

        Calculate.calculateAverage(dersler);
    }
}
