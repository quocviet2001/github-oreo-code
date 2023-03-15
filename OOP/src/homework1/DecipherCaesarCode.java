package homework1;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String inStr = in.next().toUpperCase();
        int inStrLen = inStr.length();
        String outStr = " ";
        for (int index = 0; index < inStrLen; index++) {
            char ingChar = inStr.charAt(index);
            if (ingChar >= 'D' && ingChar <= 'Z'){
                outStr += (char)(ingChar - 3);
            } else if (ingChar == 'A') {
                outStr += 'X';
            } else if (ingChar == 'B') {
                outStr += 'Y';
            } else if (ingChar == 'C') {
                outStr += 'Z';
            }
        }
        System.out.print("The plaintext string is: " + outStr);
    }
}
