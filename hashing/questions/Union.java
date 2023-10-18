package hashing.questions;
import java.util.*;

public class Union {

    public static void main(String[] args) {
        int[] arr = { 7, 3, 9 };
        int[] arr1 = { 6, 3, 9, 2, 9, 4 };
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        System.out.print(set + " Size :" + set.size());

    }
}
