package iterator.modifyArraylist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    /**
     * BookShelf 클래스 검색을 실행하는 클래스
     */

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public Book next() {
         if(!hasNext()){
             throw new NoSuchElementException();
         }
         Book book = bookShelf.getBookAt(index);
         index++;
         return book;
    }
}
