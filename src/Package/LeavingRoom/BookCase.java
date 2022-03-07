package Package.LeavingRoom;

public class BookCase {
    private int shelves;  //protected nur in pakage, private _ nur in Class
    private  String genre;
    private Book[] books;


    public void store(){
        System.out.println("I store books!");
    }
    //objekt metoda ne treba static!!!

    public BookCase(int shelves, String genre, LeavingRoom.Book[] books) {
        this.shelves = shelves;
        this.genre = genre;
        this.books = books;
    }

    public int getShelves() {
        return shelves;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LeavingRoom.Book[] getBooks() {
        return books;
    }

    public void setBooks(LeavingRoom.Book[] books) {
        this.books = books;
    }
}
