package hashing.questions;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                arr.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }
        System.out.println(arr + " Size :" + count);

    }

}
