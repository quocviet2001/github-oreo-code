package lap4;

import java.util.Scanner;

public class PerfectAndDeficientNumbers {
    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum < n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        in.close();
        System.out.println(n + " is perfect number: " + isPerfectNumber(n));
        System.out.println(n + " is deficient number: " + isDeficient(n));
    }
}
