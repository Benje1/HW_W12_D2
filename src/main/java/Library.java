import java.util.ArrayList;
import java.util.HashMap;

public class Library {


    HashMap<String, Book> shelf;
    private int capacity;


    public Library(int capacity){
        this.shelf = new HashMap<>();
        this.capacity = capacity;
    }

    public int checkStock() {
        return this.shelf.size();
    }

    public void addBook(Book book) {
        if(this.shelf.size() < capacity){
           this.shelf.put(book.getGenre(), book);
        }

    }

    public Book lendBook(Book book) {
        this.shelf.remove(book.getGenre(), book);
        return book;
    }

    public int checkNumberOfGenres(){
        ArrayList<String> keys = new ArrayList(shelf.keySet());
        return keys.size();
    }
//    public int checkByGenre(String genre) {
}
