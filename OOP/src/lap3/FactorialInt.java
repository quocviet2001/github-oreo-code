package lap3;

public class FactorialInt {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println("The factorial of " + n + " is " + factorial(n));
            if (Integer.MAX_VALUE / factorial(n) > n + 1) {
                n++;
            } else {
                n++;
                System.out.println("The factorial of " + n + " out of range");
                break;
            }
        }
    }
}
