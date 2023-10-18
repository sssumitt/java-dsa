package recursion;

public class MaxArray {

    public static int MAX(int arr[], int idx) {
        int max = Integer.MIN_VALUE;

        // base case

        if (idx == arr.length - 1) {
            return arr[idx];
        }

        // call statement
        max = MAX(arr, idx + 1);

        // self work (to store maximum value in max)
        return Math.max(arr[idx], max);
        // or we do like this
        // if(max<arr[idx]) {
        // max= arr[idx];
        // }
        //return max

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, 4, -5, 6, 7, 3, 3 };

        System.out.println(MAX(arr, 0));

    }

}
