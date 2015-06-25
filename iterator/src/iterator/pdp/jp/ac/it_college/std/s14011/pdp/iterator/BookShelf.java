package iterator.pdp.jp.ac.it_college.std.s14011.pdp.iterator;

/**
 * Created by s14011 on 15/06/02.
 */
public class BookShelf {
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }
    public Book getBookAt(int index) {
        return books[index];
    }
    public void appendBook(Book book){
        this.books[last] = book;
        last ++;
    }
    public int getLength(){
        return last;
    }

    public Iterator iterator() {
        return null;
    }
}
