package lap4;

import java.util.Scanner;

public class PrimeList {
    public static boolean isPrime(int aPosInt) {
        if (aPosInt < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int bound = in.nextInt();
        for (int i = 2; i < bound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
