import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("A Book", "An Author", "Generic");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("A Book", book.getTitle());
    }
    @Test
    public void bookHasAnAuthor(){
        assertEquals("An Author", book.getAuthor());
    }
    @Test
    public void bookHasGenre(){
        assertEquals("Generic", book.getGenre());
    }



}
