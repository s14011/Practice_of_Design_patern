package iterator.pdp.jp.ac.it_college.std.s14011.pdp.iterator;


/**
 * Created by s14011 on 15/06/02.
 */
public class BookShelfIterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    public boolean hasNext(){
        if (index < bookShelf.getLength()){
            return true;
        }else {
            return false;
        }
    }
    public Object next(){
        Book book = bookShelf.getBookAt(index);
        index ++;
        return book;
    }

}
