import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String genre;

    private ArrayList<Library> books;

    public Book(String title, String author, String genre){
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.books= new ArrayList<Library>();
    }

    public int bookCount(){
        return books.size();
    }

    public void addBook(Library book){
        this.books.add(book);
    }




}
