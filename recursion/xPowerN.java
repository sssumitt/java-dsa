package recursion;
//two height of stack -> n   and height of stack -> log n 

public class xPowerN {

    public static long power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        System.out.println(n);

        return x * power(x, n - 1);

    }

    // log height of stack

    public static long powerLog(int x, int n) {
        if (n == 1) {
            return x;
        }
        if (x == 0) {
            return 0;
        }

        System.out.println(n);
        long a = powerLog(x, n / 2);
        if (n % 2 == 0) {

            return a * a;
            // return powerLog(x,n/2)*powerLog(x, n/2);
        } else {
            return a * a * x;

        }

    }

    public static void main(String[] args) {

        System.out.println(power(2, 50));
        System.out.println(powerLog(2, 50));

    }

}