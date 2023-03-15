package lap3;

public class FibonacciInt {
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int i = 3;
        int fn = 0;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        while (i <= n) {
            fn = fnMinus1 + fnMinus2;
            i++;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
        return fn;
    }

    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= n; i++) {
            if (Integer.MAX_VALUE - fibonacci(n - 1) > fibonacci(n - 2)) {
                System.out.println("F(" + (n - 1) + ") = " + fibonacci(n));
                n++;
            } else {
                System.out.println("F(" + (n - 1) + ") is out of range of int");
                break;
            }
        }
    }
}
