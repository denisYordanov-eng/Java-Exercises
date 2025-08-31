package Exercises;

import java.util.Scanner;

public class ReverseCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        String firstLetter = scanner.nextLine();
        String secondLetter = scanner.nextLine();
         String thirdLetter = scanner.nextLine();

         sb.append(thirdLetter);
         sb.append(secondLetter);
         sb.append(firstLetter);
         System.out.println(sb.toString());
    }
}
