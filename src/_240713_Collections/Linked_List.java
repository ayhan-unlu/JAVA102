package _240713_Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
    public static void main(String[] args){
        List <String> list = new LinkedList<>();
        
        list.add("Mustafa");
        list.add("Mustafa");
        list.add("Çetindağ");
        list.add("Java");
        list.add("102");
        list.add("Mustafa");

        list.remove(1);
        list.remove("Mustafa");
        Iterator <String> itr=list.iterator();

        while(itr.hasNext()){
            System.out.println("While "+itr.next());
        }

        for(String str:list){
            System.out.println("For "+str);
        }

    }

}
