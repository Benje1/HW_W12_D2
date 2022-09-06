import java.util.ArrayList;

public class Borrower {

    ArrayList<Book> personalCollection;

    public Borrower(){
        this.personalCollection = new ArrayList<>();
    }

    public int checkBooks() {
        return this.personalCollection.size();
    }

    public void borrowBook(Book book) {
        this.personalCollection.add(book);
    }
}
