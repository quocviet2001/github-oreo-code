package homework1;

import java.util.Scanner;

public class Oct2Dec {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Octal string: ");
        String inStr = in.next();
        boolean isOct = true;
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (!(inChar >= '0' && inChar <= '7')) {
                isOct = false;
            }
        }
        if (isOct) {
            int results = Integer.parseInt(inStr, 8);
            System.out.println("The equivalent decimal number " + inStr + " is: " + results);
        } else {
            System.out.println("error : invalid Octal string " + inStr);
        }
    }
}
