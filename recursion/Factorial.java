package recursion;

public class Factorial {

    public static int fact(int n) {

        if (n == 1) { 
            return 1;
        }

        System.out.println(n);

        return n * fact(n - 1);
    }

   

    public static void main(String[] args) {
        int n = 5;

        System.out.println(fact(n));

    }

}
