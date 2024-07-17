package _240716_Map;

import java.util.LinkedHashMap;

import _240713_Collections.Tree_Set.Student;

public class Linked_HashMAp {
    public static void main(String [] args){
        LinkedHashMap <Integer,Student> students= new LinkedHashMap<>();

        students.put(102,new Student("Mustafa",100));
        students.put(110,new Student("Damla",25));
        students.put(108,new Student("Ahmet",77));
        students.put(118,new Student("Cemre",40));

        for(Student stu:students.values()){
            System.out.println(stu.getName());
        }
    }

}
