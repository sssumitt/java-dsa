package recursion;

public class SumOfDigits {

    public static int  Sum(int n) {

        // base case 
        if(n==0){
            return 0;

        }
        
        //  or this can be base case 2
        //  if(n>=0 && n<=9) return n;


        

        //self work
        int k= n%10;
        
        n/=10;


        //call statement 
        return k+Sum(n);

    }

    public static void main (String []args) {
        int a = 12321;




        System.out.println(Sum(a));
        

    }
    
}
