package _240716_Map.Tree_Map;

import java.util.ArrayList;
import java.util.TreeMap;

import _240713_Collections.Tree_Set.Student;

public class Tree_Map {
    public static void main(String[] args){
        TreeMap<Integer,Student> students=new TreeMap<>(new OrderByNoComparator().reversed());

        students.put(102,new Student("Mustafa",100));
        students.put(110,new Student("Damla",25));
        students.put(108,new Student("Ahmet",77));
        students.put(118,new Student("Cemre",40));


        for(Student stu:students.values()){
            System.out.println(stu.getName());
        }
    }

}
