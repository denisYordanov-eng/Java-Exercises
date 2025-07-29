import java.util.*;

public class SantaNewListJavaFundamentalsExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        Map<String, Integer> goodKidPoints = new Hashtable<>();
        Map<String, Integer> presentsQuantity = new LinkedHashMap<>();
        while (!inputLine.equals("END")) {
            String[] input = (inputLine.split("->"));

            if (input[0].equals("Remove")) {
                String childToRemove = input[1];
                goodKidPoints.remove(childToRemove);
                inputLine = scanner.nextLine();
                continue;
            }

            String kidName = input[0];
            String present = input[1];
            int quantity = Integer.parseInt(input[2]);

            if (!goodKidPoints.containsKey(kidName)) {
                goodKidPoints.put(kidName, 0);
            }
            goodKidPoints.put(kidName, goodKidPoints.getOrDefault(kidName, 0) + quantity);

            if (!presentsQuantity.containsKey(present)) {
                presentsQuantity.put(present, 0);
            }
            presentsQuantity.put(present, presentsQuantity.getOrDefault(present, 0) + quantity);
            inputLine = scanner.nextLine();
        }
        System.out.println("Children:");
        goodKidPoints.entrySet()
                .stream()
                .sorted((Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) -> {
                    int result = b.getValue().compareTo(a.getValue());
                    if (result == 0) {
                        result = a.getKey().compareTo(b.getKey());
                    }
                    return result;
                })
                .forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));

        System.out.println("Presents:");

        presentsQuantity.forEach((present,quantity) ->
                System.out.printf("%s -> %d%n",present, quantity));

    }
}
