package lap4;

import java.util.Scanner;

public class FactorialRecursive {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        in.close();
        System.out.println("The factorial of " + n + " is: " + factorial(n));
    }
}
