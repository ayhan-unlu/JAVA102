package _240713_Collections.Tree_Set;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // OrderGradeComparator order = new OrderGradeComparator();

        // TreeSet<Student> students = new TreeSet(order);
        //TreeSet<Student> students = new TreeSet<>(new OrderGradeComparator().reversed());
//        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());
        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator().reversed());


        // Student s1=new Student ("Mustafa",20);
        // students.add(s1);
        students.add(new Student("Mustafa", 20));
        students.add(new Student("Ahmet", 100));
        students.add(new Student("Behlul", 45));
        students.add(new Student("Damla", 60));
        students.add(new Student("Damla", 60));
        students.add(new Student("Cemre", 60));

        for (Student stu:students){
            System.out.println(stu.getName());
        }

    }

}
