package recursion;

import java.util.*;

//concept long division method  -> euclid method ->  gcd(x,y)=gcd(y,x%y)   ->gcd(x,0)= x

// lcm ->  X*Y/gcd  

public class gcd_lcm {

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = gcd(a, b);
        System.out.println("GCD->" + c);
        System.out.println("LCM->" + (a * b) / c);
        sc.close();
    }

}
