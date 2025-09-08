package Exercises;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class BookLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Book> books = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String[] tokens = (scanner.nextLine().split(" "));

            String title = tokens[0];
            String  author = tokens[1];
            String  release = tokens[3];
            double price = Double.parseDouble(tokens[5]);

            Book book = new Book();
            book.setTitle(title);
            book.setAuthor(author);
            book.setPrice(price);
            book.setReleasedDate(release);

            books.add(book);
        }
        Library library = new Library();
        library.setName("Kalinka");
        library.setBooks(library.getBooks(books));

        Map<String,Double> map = new HashMap<>();
      for (Book book : books) {
              map.put(book.getAuthor(), map.getOrDefault(book.getAuthor(),0.0) + book.getPrice());

      }

      Map<String,Double> sort = map.entrySet().stream()
              .sorted((e1, e2)-> {
                  int cmp = e2.getValue().compareTo(e1.getValue());
                  if(cmp == 0){
                      return e1.getKey().compareTo(e2.getKey());
                  }
                  return cmp;
              }
      ).collect(Collectors.toMap(
              Map.Entry::getKey,
                      Map.Entry::getValue,
                      (a,b)-> a,
                      LinkedHashMap::new
              ));
      for (Map.Entry<String, Double> entry : sort.entrySet()) {
          System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue());
      }
    }
    public static class Book {
        private String title;
        private String author;
        private double price;

        public String getReleasedDate() {
            return releasedDate;
        }

        public void setReleasedDate(String releasedDate) {
            this.releasedDate = releasedDate;
        }

        private  String releasedDate;


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }
    public static class Library{
        private String name;
        private List<Book> books;

        public List<Book> getBooks(List<Book> books) {
            return this.books;
        }

        public void setBooks(List<Book> books) {
            this.books = books;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}



