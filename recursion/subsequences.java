package recursion;

import java.util.*;

public class subsequences {

    static ArrayList<String> getSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();
        // base case

        if (s.length() == 0) {
            ans.add("");
            return ans;
        }

        char curr = s.charAt(0);

        ArrayList<String> smallAns = getSSQ(s.substring(1));
        // selfwork curr ko aage add kroo and also add all the string of in smallAns in ans
         
        for (String ss : smallAns) {
            
            ans.add(ss);
            ans.add(curr + ss);
            
        }
        

        return ans;
    }

    public static void printSSQ(String s, String sn) {
        //base case 
        if (s.length() == 0) {
           System.out.println(sn);
            return ;
        }

        //curr char 
        char curr = s.charAt(0);


        //recursive call 
        printSSQ(s.substring(1), sn+curr);
        printSSQ(s.substring(1), sn);


    } 
    
    public static void sumOfSubArray(int arr[],int idx, int sum) {
        if(idx==arr.length ) {
            System.out.println(sum);
            return;
        } 

        sumOfSubArray(arr, idx+1, sum+arr[idx]);
        sumOfSubArray(arr, idx+1, sum);

    }
    


    public static void main(String args[]) {
        printSSQ("abc", "");
        System.out.println("____________________________");
        System.out.println(getSSQ("abc"));
        for(String s :getSSQ("abc")) {

            System.out.println(s);
        }


        int arr[]= {2,4,1};
        sumOfSubArray(arr,0,0);

    }
}