package a_Zadania.a_Dzien_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();

        int someInt = 321;
        list2.add(123);
        list2.add(someInt);

        list.add("Some String");

        System.out.println(list.size());



        String[] stringArrays = new String[1];

        System.out.println(stringArrays.length);


        List<Book> books = new ArrayList<>();
        books.add(new Book("Thinking in Java", "Bruce Eckel", 900));
        books.add(new Book("Java 2 Paodtawy", "Some other", 900));

        for (Book book : books) {
            System.out.println(book.getAuthor() + " " + book.getTitle());


        }


        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book);
        }

        ListIterator<Book> bookListIterator = books.listIterator(books.size());
        while (bookListIterator.hasPrevious()){

        }


    }
}
