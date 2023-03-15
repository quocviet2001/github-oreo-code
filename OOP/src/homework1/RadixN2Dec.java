package homework1;

import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = in.nextInt();
        System.out.print("Enter the string: ");
        String inStr = in.next();
        if (radix <= 16) {
            int count = Integer.parseInt(inStr, radix);
            System.out.println("The equivalent decimal number '" + inStr + "' is: " + count);
        }
        else {
            System.out.println("Erorr!!!");
        }
    }
}
