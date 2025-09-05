package Exercises;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<String, String> phoneBook = new TreeMap<>();
        while (!inputLine.equals("END")) {
            String[] currentInput = inputLine.split("\\s+");

            String command = currentInput[0];
            String name = currentInput[1];

            if (command.equals("A")) {
                String phoneNumber = currentInput[2];
                if(!phoneBook.containsKey(name)){
                    phoneBook.put(name, "");
                }
                phoneBook.put(name, phoneNumber);
            }else if (command.equals("S")) {
                if(!phoneBook.containsKey(name)){
                    System.out.printf("Contact %s does not exist.%n", name);
                    inputLine = scanner.nextLine();
                    continue;
                }else {

                    System.out.printf("%s -> %s%n", name, phoneBook.get(name));
                }
            }


            inputLine = scanner.nextLine();
        }
    }
}
