package Exercises;

import java.util.Scanner;

public class FitStringInTwentyChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(20);
      if (input.length() < 20) {
          sb.append(input);
          for (int i = input.length() ; i < 20; i++) {
              sb.append('*');
          }
          System.out.println(sb.toString());
      }else {
          for (int i = 0; i < 20; i++) {
              sb.append(input.charAt(i));
          }
          System.out.println(sb.toString());
      }
    }
}
