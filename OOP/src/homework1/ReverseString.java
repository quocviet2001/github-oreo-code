package homework1;

import java.util.Scanner;

public class ReverseString  {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = in.next();
        in.close();
        int inStrLen = inStr.length();
        String revStr = " ";
        for (int id = inStrLen - 1; id >= 0; id--) {
            revStr = revStr + inStr.charAt(id);

        }
        System.out.println("The reverse of the String '" + inStr + "' is '" + revStr + "'");
    }
}
