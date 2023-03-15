package lap4;

import java.util.Scanner;

public class PrimeFactor {
    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0 && PrimeList.isPrime(i)) {
                product *= i;
                if (product > aPosInt) {
                    return false;
                }
            }
        }
        return product == aPosInt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int bound = in.nextInt();
        in.close();
        for (int i = 2; i <= bound; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
