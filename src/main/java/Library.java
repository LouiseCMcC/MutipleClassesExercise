import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Library> books;

    public Library(int capacity){
        this.capacity=capacity;
        this.books = new ArrayList<>();
    }

    public int checkStock(){
        return books.size();
    }

    public void addStock(Library book){
        this.books.add(book);
    }

    public void checkAndAddStock(Library book){
        int fullCapacity = 5;
        if(this.capacity <= fullCapacity){
            this.books.add(book);
        }
    }

    public Library removeStock(Library book){
        return this.books.remove(0);
    }


}
