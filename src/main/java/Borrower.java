import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<BorrowedBooks> borrowedBooks;

    public Borrower(String name){
        this.name=name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void addBorrowedBook(BorrowedBooks book){
        this.borrowedBooks.add(book);
    }

    public int borrowedBookCount(){
        return this.borrowedBooks.size();
    }

//    public Library moveBookToBorrowedCollection(Library library){
//        Book book = Library.removeStock(0);
//        this.borrowedBooks.addBorrowedBook(book);
//    }


}
