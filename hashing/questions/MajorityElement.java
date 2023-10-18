package hashing.questions;

import java.util.*;

// MAJORITY ELEMENT 

public class MajorityElement {
    public static void main(String[] args) {

        int nums[] = { 1, 2,3,3,3,3,3,4,5,6,6,6,6,6 };

        int len = (nums.length / 3);

        HashMap<Integer, Integer> map = new HashMap<>();


        //very imp concept  -> to make a frequency Hashset of and array

        for (int i = 0; i < nums.length; i++) {

            // the element is already in Hashset -> update the value of the keys by 1

            if ( map.containsKey(nums[i]) ) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else { // the element is not in hash ->add in Hashset with value 1
                map.put(nums[i], 1);
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for (int k : map.keySet()) {

            if (map.get(k) > len) {
                arr.add(k);
            }

        }
        System.out.println(arr);
    }
}
