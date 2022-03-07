package Package;

public class RecursionBeispiel {
    public static void main(String[] args) {

        countDown(10, 0);
        countDown2(20,2);

       // for(int i=20; i>=2; i--) {  Isto radi i for petlja
          //  System.out.println(i);
       // }
    }

    public static void countDown(int start, int stop) {
        System.out.println(start);

        start--;
        if (start < stop) {
            return;
        } else {
            countDown(start, stop);
        }
    }

        public static void countDown2(int start, int stop){
            System.out.println(start);

            start --;
            if(start>=stop) {
                countDown2(start, stop);
            }
    }
}

