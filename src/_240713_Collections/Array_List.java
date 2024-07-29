package _240713_Collections;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // ArrayList <Integer> list= new ArrayList<>();
        List<String> cityList = new ArrayList<>();

        list.add(10);
        list.add(1);
        list.add(1);
        list.add(null);
        list.add(4);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(5);

        System.out.println(list);
        list.add(2, 15);
        System.out.println(list);
        list.set(2, 17);

        System.out.println(list);

        System.out.println(list.contains(5));
        System.out.println(list.contains(25));

        list.remove(1);
        System.out.println(list);

        list.remove(5);
        System.out.println(list);

        cityList.add("Ankara");
        cityList.add("İstanbul");
        cityList.add("Amasya");
        cityList.add("Bolu");
        cityList.add("Siirt");

        cityList.remove(4);
        System.out.println(cityList);

        List<String> cityList2 = new ArrayList<>();

        cityList2.add("İzmir");
        System.out.println(cityList2);
        cityList2.addAll(cityList);
        cityList2.addAll(0, cityList);
        System.out.println(cityList2);

        List<String> cityList3=cityList2.subList(2,5);
        System.out.println(cityList3);

        list.toString();
        Object [] objArray= list.toArray();
        System.out.println(objArray);
        String[] str =cityList.toArray(new String[0]);
        System.out.println(str[0]+"*********");
        System.out.println(str[3]+"*********");
        System.out.println(cityList.toArray());
        System.out.println(cityList.toString());
        cityList3.clear();
        System.out.println(cityList3);

        /*
         * System.out.println("1 's first found at the index number "+list.indexOf(1));
         * System.out.println("null 's first found at the index number "+list.indexOf(
         * null));
         * System.out.println("null 's last found at the index number "+list.lastIndexOf
         * (null));
         * System.out.println("1 's last found at the index number "+list.lastIndexOf(1)
         * );
         * System.out.println("12 's last found at the index number "+list.lastIndexOf(
         * 12));
         * System.out.println(list.get(3));
         * System.out.println(list.get(0));
         * // System.out.println(list.get(100));
         * System.out.println(list);
         * System.out.println(list.size()+" is the size of the list");
         * 
         * Iterator<Integer> itr = list.iterator();
         * 
         * while (itr.hasNext()) {
         * System.out.println(itr.next());
         * }
         * 
         * for (Integer i:list ){
         * System.out.println(i);
         * }
         */
    }

}