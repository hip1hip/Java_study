package Test;

// p302 문제 03 개발자 홍인표

import java.util.*;

class Book implements Comparable {
    int price;

    public Book(int price) {
        this.price = price;
    }

    public int compareTo(Object o) {
        Book b = (Book) o;

        return this.price < b.price ? -1 : (this.price == b.price ? 0 : 1);
    }

    public String toString() {
        return "Book [price=" + price + "]";
    }

}

public class BookTest {
    public static void main(String[] args) {
        Book[] books = { new Book(15000), new Book(50000), new Book(20000) };

        System.out.println("정렬 전");
        for (Book book : books)
            System.out.println(book);

        Arrays.sort(books);

        System.out.println("정렬 후");
        for (Book book : books)
            System.out.println(book);
    }
}
