package _240713_Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args) {
        //a=>123456789
        //b=>123456987
        //f(x)=(x^2)*xmod7*ln(x)
        //f(5)=1594826
        //f(6)=789456321
        //h[123456789]=a f(a)=123456789
        //h[123456987]=b
        HashSet<Integer> hSet=new HashSet<>();
        hSet.add(10);//hash 123456
        hSet.add(20);//hash 12345
        hSet.add(30);//hash 1234567
        //XX hSet.add("String");
        hSet.add(null);

        for(Integer i:hSet){
            System.out.println(i);
        }

        System.out.println(hSet.size());
        System.out.println(hSet.isEmpty());
        System.out.println("contains "+hSet.contains(20));
        System.out.println("contains "+hSet.contains(1));

        Iterator<Integer> itr = hSet.iterator();
        while(itr.hasNext()){
            System.out.println("Iterator "+itr.next());
        }

        hSet.remove(10);
        System.out.println(hSet.size());
        hSet.clone();

        hSet.clear();
        System.out.println(hSet.isEmpty());
        
        
    }

}
