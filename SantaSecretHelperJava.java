import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantaSecretHelperJava {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int decriptNumber = Integer.parseInt(scanner.nextLine());

        String inputLine = scanner.nextLine();
        Pattern pattern = Pattern.compile("@([A-Za-z]+)[^@\\-!:>]*!(G)!");
        ArrayList goodKids = new ArrayList<String>();

        while (!inputLine.equals("end")){
            String decodedMessage = decodeInput(decriptNumber, inputLine);
            Matcher matcher = pattern.matcher(decodedMessage);
            if (matcher.find()){
                String goodChild = matcher.group(1);
                goodKids.add(goodChild);
            }
            inputLine = scanner.nextLine();

        }
        for (int i = 0; i < goodKids.size(); i++) {
            System.out.printf("%s%n",goodKids.get(i));
        }
    }
    private static  String decodeInput(int decriptNumber, String inputLine){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputLine.length() ; i++) {
            char currentChar = inputLine.charAt(i);
            int decodedNumber = (int)currentChar - decriptNumber;
            char newChar = (char) decodedNumber;
            sb.append(newChar);

        }
        return sb.toString();
    }
}
