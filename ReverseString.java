package Exercises;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString =  scanner.nextLine();
    StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputString.length() ; i++) {
            sb.append(inputString.charAt(i));
        }
        sb.reverse();
        System.out.println(sb.toString());
    }
}
