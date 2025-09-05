package Exercises;

import java.util.Scanner;

public class CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] email = scanner.nextLine().split("@");
        String text  = scanner.nextLine();

        String username = email[0];
        String domain =  email[1];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < username.length(); i++) {
            sb.append('*');
        }
        sb.append('@');
        sb.append(domain);

        String replace = sb.toString();
        String matcher =  username + '@' + domain;

        for (int i = 0; i <= text.length(); i++) {
            if (text.contains(matcher)) {
                text = text.replace(matcher, replace);
            }
        }
        System.out.println(text);
    }
}
