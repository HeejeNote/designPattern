package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Spring boot"));
        bookShelf.appendBook(new Book("Spring JPA"));
        bookShelf.appendBook(new Book("Spring Batch"));
        bookShelf.appendBook(new Book("Spring Security"));

        // iterator
        Iterator<Book> it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // for each
        for(Book book : bookShelf){
            System.out.println(book.getName());
        }
        System.out.println();
    }
}