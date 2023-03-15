package homework1;

import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = in.next().toUpperCase();
        int inStrLen = inStr.length();
        String outStr = " ";
        for (int index = 0; index < inStrLen; index++) {
            char ingChar = inStr.charAt(index);
            if (ingChar >= 'A' && ingChar <= 'W') {
                outStr += (char) (ingChar + 3);
            } else if (ingChar == 'X') {
                outStr += 'A';
            } else if (ingChar == 'Y') {
                outStr += 'B';
            } else if (ingChar == 'Z') {
                outStr += 'C';
            }
        }
        System.out.print("The ciphertest string is: " + outStr);
    }
}