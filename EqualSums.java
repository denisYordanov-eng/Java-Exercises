package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (numbers.length <= 1) {
            System.out.println("0");
            return;
        }
        for (int index = 0; index < numbers.length ; index++) {
            int leftSum = calcLeftSum(numbers,index);
            int rightSum = calcRightSum(numbers,index);
            if (leftSum == rightSum) {
                System.out.println(index);
                return;
            }
        }
        System.out.println("no");
    }

    private static int calcRightSum(int[] numbers, int index) {
        int sum2 = 0;
        for (int j = index + 1 ; j < numbers.length; j++) {
        sum2 += numbers[j];
        }
        return sum2;
    }

    private static int calcLeftSum(int[] numbers, int index) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
