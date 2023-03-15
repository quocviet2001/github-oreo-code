package lap4;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {
        if (a <= 0 || b <= 0) {
            return -1;
        }
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        in.close();
        System.out.println("Greatest common divisor of two number is: " + gcd(num1, num2));
    }
}
