package Exercises;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<String, String> phoneBook = new TreeMap<>();
        while (!inputLine.equals("END")) {
            String[] currentInput = inputLine.split("\\s+");

            String command = currentInput[0];
            String name = "";
           if (currentInput.length > 1) {
               name = currentInput[1];
           }


            switch (command) {
                case "A" :
                    name = currentInput[1];
                    String phoneNumber = currentInput[2];
                    if (!phoneBook.containsKey(name)) {
                        phoneBook.put(name, "");
                    }
                    phoneBook.put(name, phoneNumber);
                break;
                case "S" :
                    name = currentInput[1];
                    if (!phoneBook.containsKey(name)) {
                        System.out.printf("Contact %s does not exist.%n", name);
                    } else {
                        System.out.printf("%s -> %s%n", name, phoneBook.get(name));
                    }
                break;
                case "ListAll" :
                    for (Map.Entry<String, String> contact : phoneBook.entrySet()) {
                        System.out.println(contact.getKey() + " -> " + contact.getValue());
                    }
                break;
            }
            inputLine = scanner.nextLine();
        }
    }
}


