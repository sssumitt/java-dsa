package SORTING;

public class mergeSort {
    public static void main(String[]args) {
        int arr[] = {2,3,1,2,3,6,3,7,8,4,8};
        for(int a: arr)
        System.out.print(a+" ");
        divide(arr,0,arr.length-1);  

        System.out.println(" ");
        for(int a: arr)
        System.out.print(a+" ");
        
    }

    public static void divide(int arr[], int st, int end) {
        if(st>=end) {
            return;
        }

        int mid =(st+ end)/2;
        divide(arr, st, mid);
        divide(arr, mid+1 , end);
        merge(arr, st, mid, end);

    }
    public static void merge(int arr[], int st, int mid , int end ) {
        int arrnew[] = new  int[end-st+1];

        int idx1 = st; 
        int idx2= mid+1;
        int x= 0 ;

        while(idx1<= mid && idx2<= end) { 
            if(arr[idx1] <= arr[idx2]) {

                arrnew[x++]= arr[idx1++];

            }   else {
                arrnew[x++]= arr[idx2++];
            }
        }


        while(idx1<= mid) arrnew[x++] = arr[idx1++];
        while(idx2<= end) arrnew[x++] = arr[idx2++];


        for(int i =0,  j =st ;i<arrnew.length ; i++, j++) arr[j] =arrnew[i];


    }
}