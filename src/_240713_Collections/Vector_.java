package _240713_Collections;

import java.util.Iterator;
import java.util.Vector;

public class Vector_ {
    public static void main(String[] args){
        Vector<String> vector = new Vector<>();

        vector.add("Ankara");
        vector.add("Ankara");
        vector.add("İstanbul");
        vector.add("İzmir");

        vector.add(2,"Bolu");

        System.out.println(vector.contains("Ankara"));

        Iterator <String> itr = vector.iterator();

        while(itr.hasNext()){
            System.out.println("itr "+itr.next());
        }

        for(String str:vector){
            System.out.println("for "+str);
        }
        

    }

}
