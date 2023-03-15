package homework1;

import java.util.Scanner;

public class ExchangeCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = in.next().toUpperCase();
        int inStrLen = inStr.length();
        String outStr = " ";
        for (int index = 0; index < inStrLen; index++) {
            char ingChar = inStr.charAt(index);
            if (ingChar >= 'A' && ingChar <= 'Z') {
                outStr += (char)('C' + 'X' - ingChar);
            }
        }
        System.out.print("The ciphertext string is: " + outStr);
    }
}
