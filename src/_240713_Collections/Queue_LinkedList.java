package _240713_Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList {
    public static void main(String[] args) {

        // Plimorphism
        Queue<String> q = new LinkedList<>();

        q.add("Mustafa");
        q.add("Çetindağ");

        q.offer("Patika");

        // q.remove();
        // q.remove("Çetindağ");
        q.remove("2");

        // System.out.println(q.remove("patika"));
        // System.out.println(q.remove("Patika"));
        // System.out.println(q.element());
        System.out.println(q.peek());
//        System.out.println(q.poll());
        System.out.println("#########################");

        Iterator<String> itr = q.iterator();

        while (itr.hasNext()) {
            System.out.println("itr " + itr.next());
        }
    }

}
