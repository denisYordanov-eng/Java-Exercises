package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] elements = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bestStart = 0;
        int bestLen = 1;

        int currentStart = 0;
        int currentLen = 1;


        for (int i = 1; i < elements.length; i++) {
            int previousElement = elements[i - 1];
            if (elements[i] == previousElement) {
                currentLen++;
            } else {
                currentLen = 1;
                currentStart = i;
            }
            if (currentLen > bestLen) {
                bestLen = currentLen;
                bestStart = currentStart;
            }

        }

        for (int i = bestStart; i < bestStart + bestLen; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}
