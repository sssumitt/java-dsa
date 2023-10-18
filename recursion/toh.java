package recursion; 
import java.util.*;


public class toh {
    public static void main(String []args) {
        Scanner sc =new Scanner(System.in);
        TOH(sc.nextInt(), "S", "H", "D");
        sc.close();
    }
    static int i =1 ; 

    public static void TOH(int n , String s , String h, String d) {

        if(n == 1 ) {
            System.out.println("Step:"+ i++ + "-> move from "+s+" to "+d);
            return;
        }
        

        TOH(n-1, s,d,h);
            System.out.println("Step:"+ i++ + "-> move from "+s+" to "+d);
        TOH(n-1, h,s,d);

    }
}