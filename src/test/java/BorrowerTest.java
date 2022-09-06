import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(5);
        book = new Book("A Book", "An Author", "Typical");
    }

    @Test
    public void checkPersonalCollectionIsEmpty(){
        assertEquals(0, borrower.checkBooks());
    }

    @Test
    public void borrowBook(){
        library.addBook(book);
        borrower.borrowBook(library.lendBook(book));
        assertEquals(1, borrower.checkBooks());
    }
}
