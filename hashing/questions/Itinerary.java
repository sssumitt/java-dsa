package hashing.questions;

import java.util.*;

public class Itinerary {

    public static void path(HashMap<String, String> map) {

        Set<String> val = new HashSet<>();
        String start = new String();

        for (String keys : map.keySet()) {
            val.add(map.get(keys));
        }

        for (String keys : map.keySet()) {
            if (!val.contains(keys)) {
                start = keys;
            }
        }

        while (map.containsKey(start)) {
            System.out.print(start + " ->");
            start = map.get(start);

        }
        System.out.print(start);

        return;
    }

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Chennai", "Bengaluru");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");
        map.put("Mumbai", "Delhi");
        

        path(map);

    }

}
