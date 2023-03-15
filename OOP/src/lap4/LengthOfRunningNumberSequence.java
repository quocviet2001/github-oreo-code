package lap4;

import java.util.Scanner;

public class LengthOfRunningNumberSequence {
    public static String runningNumber(int n) {
        if (n == 1) {
            return "1";
        }
        return runningNumber(n - 1) + n;
    }

    public static int length(int n) {
        if (n == 1) {
            return 1;
        }
        return length(n - 1) + (n + "").length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        in.close();
        System.out.println("Running number sequence: " + runningNumber(n));
        System.out.println("Length is: " + length(n));
    }
}
