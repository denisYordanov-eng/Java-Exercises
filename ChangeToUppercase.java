package Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangeToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?is)<upcase>(.*?)</upcase>");
        Matcher matcher = pattern.matcher(text);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            String upper = matcher.group(1).toUpperCase();
            matcher.appendReplacement(sb, Matcher.quoteReplacement(upper));
        }
        matcher.appendTail(sb);
        System.out.println(sb.toString());
    }
}
