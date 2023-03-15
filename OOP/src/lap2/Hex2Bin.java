package lap2;

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string : ");
        String inStr = in.next();
        int inStrLen = inStr.length();
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
        System.out.print("The equivalent binary for hexadecimal '" + inStr + "' is: ");
        for (int idx = 0; idx < inStrLen; idx++) {
            char ingChar = inStr.charAt(idx);
            if (ingChar >= '0' && ingChar <= '9') {
                System.out.print(HEX_BITS[Character.getNumericValue(ingChar)] + " ");
            } else if (ingChar != 'a') {
                System.out.print(HEX_BITS[10 + (ingChar - 'a')] + " ");
            } else {
                System.out.print(HEX_BITS[10] + " ");
            }
        }
    }
}
