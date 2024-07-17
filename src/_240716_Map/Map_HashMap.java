package _240716_Map;

import java.util.HashMap;
//import java.util.Map;

public class Map_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        // Map<String, String> countries = new HashMap<>();

        countries.put("TR", "Türkiye");
        countries.put("D", "Almanya");
        countries.put("GB", "İngiltere");

        for (String key:countries.keySet()){
            System.out.println("Key: "+key);
            System.out.println("Value: "+countries.get(key));

        }
        
        countries.replace("GB","Birleşik Krallık");
        
        System.out.println("#######");

        for(String value:countries.values()){
            System.out.println(value);
        }


        System.out.println("#######");
        System.out.println(countries.get("TR"));


        countries.put("TR", "Turkey");
        System.out.println(countries.get("TR"));
        System.out.println("Size: " + countries.size());
        countries.clear();
        System.out.println(countries.get("GB"));
        System.out.println("#######");
        countries.remove("GB");
        System.out.println(countries.get("GB"));

        countries.put("GB", "İngiltere");
        System.out.println(countries.get("GB"));
        System.out.println("Size: " + countries.size());

        countries.remove("GB", "İngiltere");
        System.out.println(countries.get("GB"));
        System.out.println("Size: " + countries.size());

        

    }

}
