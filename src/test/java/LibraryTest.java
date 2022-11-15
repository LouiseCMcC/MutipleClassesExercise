import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;

    @Before
    public void before(){
        library = new Library(3);
    }

    @Test
    public void canCheckStock(){
        assertEquals(0, library.checkStock());
    }

    @Test
    public void canAddStock(){
        library.addStock(library);
        assertEquals(1, library.checkStock());
    }

    @Test
    public void canCheckStockThenAddBook(){
        library.checkAndAddStock(library);
        assertEquals(1, library.checkStock());
    }
}
