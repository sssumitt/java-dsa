package recursion;

import java.util.*;

public class RecursionInArray {

    public static boolean ls(int arr[], int idx) {

        final int target = 32;

        if (idx == arr.length) {
            return false;
        }

        if (arr[idx] == target)
            return true;

        // if(ls(arr,idx+1)) return true;
        // else return false;

        return ls(arr, idx + 1);
    }

    public static int lsIndex(int arr[], int idx) {
        final int target = 32;
        // base case
        if (idx == arr.length) {
            return -1;
        }

        // self work

        if (arr[idx] == target)
            return idx;

        // recursive work
        return lsIndex(arr, idx + 1);

    }

    // to find all the indices of a integer in arr

    public static ArrayList<Integer> index(int arr[], int idx) {
        final int target = 32;
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // base case

        if (idx == arr.length) {
            return new ArrayList<Integer>();
        }

        // self work

        if (arr[idx] == target)
            nums.add(idx);

        // recursive work -> every time new ArrayList nums will be formed so we need to
        // addAll the the indices to nums with help of smallArray

        ArrayList<Integer> smallArray = index(arr, idx + 1);
        nums.addAll(smallArray);
        return nums;
    }

    public static boolean isSorted(int arr[], int idx) {
        if (idx + 1 == arr.length - 1) {
            return true;
        }

        //self work 
        if (arr[idx] >= arr[idx + 1])
            return false;
            

        return isSorted(arr, idx + 1);

    }

    public static int lastIndex(int arr[], int idx) {
        final int target = 32;
        // base case
        if (idx == 0) {
            return -1;
        }

        // self work

        if (arr[idx] == target)
            return idx;

        // recursive work
        return lastIndex(arr, idx - 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 32, 2, 3, 4, 5, 5, 4, 3, 3, 2, 32, 5, 4, 32, 2, 32 };

        System.out.println(ls(arr, 0) + " at  1st Index->" + lsIndex(arr, 0));
        System.out.println(ls(arr, 0) + " at  last Index->" + lsIndex(arr, arr.length - 1));
        System.out.println("All the indices of 32");

        System.out.println(index(arr, 0));
        int arr2[] = { 1, 2, 3, 4, 5, 6 };

        System.out.println(isSorted(arr2, 0) + " Sorted");
        System.out.println(isSorted(arr, 0) + " Sorted ");
    }

}
