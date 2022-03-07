package Package.LeavingRoom;

public class LeavingRoom {
    public static void main(String[] args) {
        Book orwell1984 = new Book("George Orvel", "1984", 320); //sada imamo konkretnu knjigu
        Book annaKarenina = new Book("Leo Tolstoy", "Anna Karenina", 1300);// druga knjiga po sitom sablonu napravljena, instanca objekta

        BookCase bookCase = new BookCase(8,"Classic",new Book[]{orwell1984, annaKarenina});
        bookCase.store();
    }
}
