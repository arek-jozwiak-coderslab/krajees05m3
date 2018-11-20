package a_Zadania.a_Dzien_1;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Thinking in Java", "Bruce Eckel", 900));
        books.add(new Book("Java 2 Paodtawy", "Some other", 900));


        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
