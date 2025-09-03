package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int counter = 0;
        int elementIndex = 0;

        int bestLen = 1;

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            int nextNumber = numbers[i + 1];
            if (currentNumber == nextNumber) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter > bestLen) {
                bestLen = counter;
                elementIndex = i - 1;
            }
        }
        int numberToPrint = numbers[elementIndex];
        System.out.println(numberToPrint);
    }
}