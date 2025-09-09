package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.StreamSupport.stream;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = new ArrayList<>(Arrays.stream((scanner.nextLine().split("\\s+")))
                .map(Integer::parseInt)
                .toList());
                //.collect(Collectors.toList()));

        int[] bombPower = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bomb = bombPower[0];
        int power = bombPower[1];


        while ((numbersList.contains(bomb))) {
            int bombIndex = numbersList.indexOf(bomb);

            int leftIndex = Math.max(0, bombIndex - power);
            int rightIndex = Math.min(numbersList.size() - 1, bombIndex + power);

           numbersList.subList(leftIndex, rightIndex + 1).clear();
        }

        long sum = 0L;
        for (Integer integer : numbersList) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
