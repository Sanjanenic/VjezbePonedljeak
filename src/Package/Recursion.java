package Package;

public class Recursion {
    public static void main(String[] args) {
        read(0,10);
    }

    public static void read(int from , int until){
        System.out.println("The penguin opened he newpaper, and thay read: ");
        from ++;
        if(from <= until){
            read (from, until);
        }

    }
}
