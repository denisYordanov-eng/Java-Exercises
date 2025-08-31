package Exercises;

import java.util.Scanner;

public class VariableInHexFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hex = scanner.nextLine();
        int num = Integer.parseInt(hex,16);
        System.out.println(num);
    }
}
