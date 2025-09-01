package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstName = scanner.nextLine().split("\\s+");
        String[] secondName = scanner.nextLine().split("\\s+");

        int length = Math.min(firstName.length, secondName.length);

        boolean areEqual = true;

        for (int i = 0; i < length; i++) {
            char firstChar =  firstName[i].charAt(0);
            char secondChar =  secondName[i].charAt(0);

            if (firstChar < secondChar) {
                System.out.println(String.join("",firstName));
                System.out.println(String.join("",secondName));
                areEqual = false;
                break;
            }else if (firstChar > secondChar) {
                System.out.println(String.join("",secondName));
                System.out.println(String.join("",firstName));
                areEqual = false;
                break;
            }
        }
        if (areEqual) {
            if(firstName.length <= secondName.length){
                System.out.println(String.join("",firstName));
                System.out.println(String.join("",secondName));
            }else {
                System.out.println(String.join("",secondName));
                System.out.println(String.join("",firstName));
            }
        }
    }
}
