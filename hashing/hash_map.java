package hashing;

import java.util.*;

/* key concept of hash map 
 * stores key value pair 
 * ex storing student info 
 * key is always unique
 * 
 */

public class hash_map {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);

        map.put("China", 2000);

        // if same key is inserted then it updates the value in the HashSet
        map.put("China", 20001);

        System.out.println(map);

        // SEARCH --contains

        if (map.containsKey("Indonesia")) {
            System.out.println("key is present in the map");

        }

        else {
            System.out.println("key is not present in the map ");

        }

        // to get the value
        System.out.println(map.get("China"));// key exists
        System.out.println(map.get("Indonesia"));// key doesnot exists

        // new format of for loop for (val : collections);
        int arr[] = { 1, 2, 3, 4, 45 };

        for (int val : arr) {
            System.out.print(val + " \n");

        }

        // interation in HasMap

        // .entrySet set of both key value pair
        for (Map.Entry<String, Integer> e : map.entrySet()) {

            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

        // another way
        // gives the collection of keys form a HashMap
        Set<String> keys = map.keySet();
        for (String key : keys) {

            System.out.println(key + " " + map.get(key));
        }

        // how to remove the key value pair
        map.remove("China");

        System.out.println(map);

    }

}
