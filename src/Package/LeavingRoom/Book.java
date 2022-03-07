package Package.LeavingRoom;

public class Book {
    private  String author; //ovdje se samo radi deklaracija
    private  String title;
    private  int pages;

    //Objekt braucht Konstruktor!!!!


    public Book(String author, String title, int pages) {  //ovo je konstruktor klase
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public String getAuthor() { //Getter metode
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public void setAuthor(String author) { //Setter metode ovo ide automatski
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
