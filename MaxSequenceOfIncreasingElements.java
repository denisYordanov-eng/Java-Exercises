package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int currentStart = 0;
        int currentLend = 1;

        int bestStart = 0;
        int bestLend = 1;

        for(int i = 0; i < numbers.length - 1; i++){
            int currentNumber = numbers[i];
            int nextNumber = numbers[i + 1];
            if (nextNumber > currentNumber){
                currentLend++;
            }else{
                currentLend = 1;
                currentStart = i + 1;
            }
            if(currentLend > bestLend){
                bestLend = currentLend;
                bestStart = currentStart;
            }
        }
        for(int j = bestStart; j < bestStart + bestLend; j++){
            System.out.print(numbers[j] + " ");
        }
    }
}
