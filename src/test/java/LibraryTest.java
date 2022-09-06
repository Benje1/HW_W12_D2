import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book otherBook;
    Book differentBook;
    Book yetAnotherBook;

    @Before
    public void before(){
        library = new Library(3);
        book = new Book("A Book", "An Author", "Typical");
        otherBook = new Book("Other Book", "Different Author", "Typical");
        differentBook = new Book("Different Book", "Imaginative Author", "Generic");
        yetAnotherBook = new Book("Another Book", "Imaginative Author", "Generic");
    }

    @Test
    public void shelfStartsEmpty(){
        assertEquals(0, library.checkStock());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.checkStock());
    }

    @Test
    public void willNotAddBeyondCapacity(){
        library.addBook(book);
        library.addBook(otherBook);
        library.addBook(differentBook);
        library.addBook(yetAnotherBook);
        assertEquals(3, library.checkStock());
    }

    @Test
    public void letOutBook(){
        library.addBook(book);
        library.lendBook(book);
        assertEquals(0, library.checkStock());
    }

    @Test
    public void separeteIntoGenre(){
        library.addBook(book);
        library.addBook(otherBook);
        library.addBook(differentBook);
        assertEquals(2, library.checkNumberOfGenres());
    }


}
