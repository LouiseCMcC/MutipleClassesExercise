import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;
    private Library library;
    @Before
    public void before(){
        book = new Book("Odyssey", "Homer", "Epic");
        library = new Library(3);
    }

    @Test
    public void canCountBooks (){
        assertEquals(0, book.bookCount());
    }

    @Test
    public void canAddBook (){
        book.addBook(library);
        assertEquals(1, book.bookCount());
    }



}
