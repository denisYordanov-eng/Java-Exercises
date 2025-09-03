package Exercises;

import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int indexChar = currentChar - 'a';
            System.out.printf("%c -> %d\n", currentChar, indexChar );
        }
    }
}
