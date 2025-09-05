package Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class UrlParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        String protocol = "";
        String rest = url;

        if (url.contains("://")) {
            String[] http = url.split("://");
            protocol = http[0];
            rest = http[1];
        }

        String server;
        String resource = "";

        if (rest.contains("/")) {
            int index = rest.indexOf("/");
            server = rest.substring(0, index);
            resource = rest.substring(index + 1);
        }else  {
            server = rest;
        }
        System.out.printf("[protocol] = \"%s\"%n", protocol);
        System.out.printf("[server] = \"%s\"%n", server);
        System.out.printf("[resource] = \"%s\"%n", resource);
    }
}
