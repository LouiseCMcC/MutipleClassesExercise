import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;

    private BorrowedBooks borrowedBooks;

    private Library library;

    @Before
    public void before(){
        borrower = new Borrower("John");
        borrowedBooks =  new BorrowedBooks();
//        library = new Library();
        library.addStock(library);
    }

    @Test
    public void canBorrowBook(){
        borrower.addBorrowedBook(borrowedBooks);
        assertEquals(1, borrower.borrowedBookCount());
    }

//    @Test
//    public void canMoveBookToBorrowedCollection(){
//        borrower.moveBookToBorrowedCollection(borrowedBooks);
//        assertEquals(1, borrower.borrowedBookCount());
//    }
}
