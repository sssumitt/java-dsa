package Search;

public class Binarysearch {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,18};
        int key= 18; 


        if(binarySearch(arr,0,arr.length-1,(arr.length-1)/2,key)) System.out.println("found");
        else System.out.println("not found ");




        //binary search interative methods
        int low= 0;
        int high= arr.length-1;
        boolean flag = false; 

        while(low<=high) {

           int mid= (low+high)/2;

            if(arr[mid]>key)  high = mid-1;

            else if(arr[mid]< key)low= mid+1;

            else{
                System.out.println("found " + arr[mid]);
                flag = true; 
                break ;
            }

            
        }
        if(!flag) System.out.println(key + " not found ");
        
    }
    public static boolean binarySearch(int arr[],int low , int high, int mid ,int key) {

        if(low>high){
            return false;
        }

        if(arr[mid]< key) return binarySearch(arr, mid+1, high, (low+high)/2, key);
        else if(arr[mid]> key) return binarySearch(arr, low, mid-1, (low+high)/2, key);
        else return true;
        

    }

}
