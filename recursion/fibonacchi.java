package recursion;

public class fibonacchi {

    // by chaning the arguments and every stack level
    public static void fibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;

        System.out.println(c);
        fibo(b, c, n - 1);

    }

    // by return after the stack has the base case

    public static int fact2(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        return fact2(n - 1) + fact2(n - 2);

    }

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int n = 10;

        System.out.println(a);
        System.out.println(b);

        fibo(a, b, n - 2);

        System.out.println("_____________________________________");

        for (int i = 0; i < 10; i++) {
            System.out.println(fact2(i));
        }
    }

}
