package iterator;

import java.util.Iterator;

public class BookShelf implements Iterable<Book>{
    /**
     * 책선반 객체 (책장)
     */
    private Book[] books; // 책 배열
    private int last = 0; // 책 객체가 선반에 추가될 때 갯수

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }


    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
