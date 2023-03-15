package lap3;

import java.util.Scanner;

public class WordGuess {
    private static boolean endGame(boolean[] bool) {
        for (boolean b : bool)
            if (!b)
                return false;
        return true;
    }

    public static void main(String[] args) {
        String word = "";
        if (args.length == 1) {
            word = args[0];
        } else {
            word = "HelloWorld!";
        }
        boolean[] bGuess = new boolean[word.length()];
        int trials = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String guess = in.nextLine();
            trials++;
            if (guess.length() > 1) {
                if (guess.equalsIgnoreCase(word))
                    for (int i = 0; i < bGuess.length; i++)
                        bGuess[i] = true;
            } else {
                for (int i = 0; i < word.length(); i++) {
                    if (guess.equalsIgnoreCase(Character.toString(word.charAt(i))))
                        bGuess[i] = true;
                }
            }
            System.out.print("Trial " + trials + ": ");
            for (int i = 0; i < word.length(); i++) {
                if (bGuess[i])
                    System.out.print(" " + word.charAt(i));
                else
                    System.out.print(" _");
            }
            System.out.println();
            if (endGame(bGuess)) {
                System.out.println("Congratulations!");
                System.out.println("You got it in " + trials + " trial" + (trials == 1 ? "!" : "s!"));
                break;
            }
        }
        in.close();
    }
}
