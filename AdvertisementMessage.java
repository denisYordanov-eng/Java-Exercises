package Exercises;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Random rnd = new Random();
      //  {"Excellent product.",
        //  "Such a great product.",
        //  "I always use that product.",
        //  "Best product of its category.",
        //  "Exceptional product.",
        //  "I can't live without this product."}
        String[] phrases =  {"Excellent product.",
                "I always use that product.",
        "Best product of its category.",
        "Exceptional product.",
        "I can't live without this product."
        };

        //{"Now I feel good.",
        // "I have succeeded with this product.",
        // "Makes miracles. I am happy of the results!",
        // "I cannot believe but now I feel awesome.",
        // "Try it yourself,
        // I am very satisfied.",
        // "I feel great!"}
        String[] events = {"Now I feel good.",
        "I have succeeded with this product.",
        "Makes miracles. I am happy of the results!",
        "I cannot believe but now I feel awesome.",
        "Try it yourself",
       "I am very satisfied.",
        "I feel great!"
        };

        // {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"}
        String[] author = {"Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"
        };

        // •	Cities – {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"}

        String[] city ={"Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"
        };

        for (int i = 1; i <= n; i++) {
            String rndmPhrace = phrases[rnd.nextInt(phrases.length)];
            String rndmEvent = events[rnd.nextInt(events.length)];
            String rndmAuthor = author[rnd.nextInt(author.length)];
            String rndmCity = city[rnd.nextInt(city.length)];

            // Such a great product. Now I feel good. Elena – Ruse
            System.out.println(rndmPhrace + rndmEvent + rndmAuthor + "-" + rndmCity);
        }
    }
}
