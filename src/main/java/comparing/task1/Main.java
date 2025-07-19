package comparing.task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K.Rowling", 1998);
        Book book2 = new Book("Harry Potter", "J.K.Rowling", 2020);
        Book book3 = new Book("The Casual Vacancy", "J.K.Rowling", 2020);
        Book book4 = new Book("Harry Potter", "J.K.Rowling", 2015);

        // should return true
        System.out.println(book1.equals(book2));

        //should return false
        System.out.println(book1.equals(book3));

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for (Book b : books) {
            System.out.println(b);
        }

        // should print 2
        System.out.println("The number of unique books: " + books.size());
    }
}
