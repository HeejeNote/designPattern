package iterator.modifyArraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book>{
    /**
     * 책선반 객체 (책장)
     */
    private List<Book> books = new ArrayList<>(); // 책 배열
    private int last = 0; // 책 객체가 선반에 추가될 때 갯수

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        this.books.add(last,book);
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
