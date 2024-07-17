package _240713_Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {

        PriorityQueue<String> pQ = new PriorityQueue<>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
                // return 0;
            }
        }.reversed());

        pQ.add("Mustafa");
        pQ.add("Çetindağ");
        pQ.add("Ahmet");
        pQ.add("Damla");

        System.out.println(pQ.poll());
        System.out.println(pQ.element());
        System.out.println("#############");

        for (String str : pQ) {
            System.out.println(str);
        }
        System.out.println("#############");
        Iterator<String> itr = pQ.iterator();

        while(itr.hasNext()){
        System.out.println(itr.next());
        }
    }

}
