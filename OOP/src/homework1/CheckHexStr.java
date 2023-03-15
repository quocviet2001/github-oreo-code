package homework1;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String inStr = in.next().toUpperCase();
        int inStrLen = inStr.length();
        boolean isHexStr = true;
        for (int charId = 0; charId < inStrLen; charId++) {
            char inChar = inStr.charAt(charId);
            if (!((inChar  >= '0' && inChar <= '9')
                    || (inChar >= 'A' && inChar <= 'F')
                    || (inChar >= 'a' && inChar <= 'f'))) {
                isHexStr = false;
            }
        }
        if (isHexStr) {
            System.out.println("'" + inStr +"' is a hex string");
        }
        else {
            System.out.println("'" + inStr + "' is not hex string");
        }
    }
}
