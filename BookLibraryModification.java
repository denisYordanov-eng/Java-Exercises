package Exercises;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class BookLibraryModification {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Book> books = new ArrayList<Book>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            String title = tokens[0];
            String author = tokens[1];
            String publisher = tokens[2];
            String givenDate = tokens[3];
            DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            Date date = format.parse(givenDate);
            double price = Double.parseDouble(tokens[5]);

            Book book = new Book();
            book.setTitle(title);
            book.setAuthor(author);
            book.setPublisher(publisher);
            book.setRelieasedDate(date);
            book.setPrice(price);
            books.add(book);
        }

        String date = scanner.nextLine();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date finalWantedDate = dateFormat.parse(date);

        books.stream().filter(b -> b.getRelieasedDate().after(finalWantedDate))
                .sorted(Comparator.comparing(Book::getReleasedDate).thenComparing(Book::getTitle))
                .forEach(b -> System.out.printf("%s -> %td.%tm.%tY%n", b.getTitle(),
                        b.getRelieasedDate(), b.getRelieasedDate(), b.getRelieasedDate()));
    }
}


class Book {
    String title;
    String author;
    String publisher;
    double price;
    Date relieasedDate;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getRelieasedDate() {
        return relieasedDate;
    }

    public void setRelieasedDate(Date relieasedDate) {
        this.relieasedDate = relieasedDate;
    }
}

