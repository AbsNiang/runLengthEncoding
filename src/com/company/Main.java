package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder shortenedLetters = new StringBuilder();
        Scanner letterInput = new Scanner(System.in);
        System.out.println("Type a variety of letters to get them compressed via. Run Length Encoding.");
        String lettersTyped = letterInput.nextLine();
        int count;
        for (int i = 0; i < lettersTyped.length(); i++) {
            count = 1;
            while (i < lettersTyped.length() - 1 && lettersTyped.charAt(i) == lettersTyped.charAt(i + 1)) {
                count++;
                i++;
            }
            shortenedLetters.append(lettersTyped.charAt(i)).append(count);
        }
        System.out.println("The compressed version of your letters is : " + shortenedLetters);
        int charDifference = lettersTyped.length() - shortenedLetters.length();
        System.out.println("The difference in characters between the letters you typed and the compressed version is " + charDifference);
    }
}
