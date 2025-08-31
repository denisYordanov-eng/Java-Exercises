package Exercises;

import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char inputCh = scanner.next().charAt(0);
        inputCh = Character.toLowerCase(inputCh);

        if (Character.isDigit(inputCh)) {
            System.out.println("digit");
        } else if (Character.isAlphabetic(inputCh) &&
                (inputCh == 'a' || inputCh == 'e' || inputCh == 'i' ||
                        inputCh == 'o' || inputCh == 'u' || inputCh == 'y')) {
            System.out.println("vowel");
        } else {
            System.out.println("other");
        }
    }
}
