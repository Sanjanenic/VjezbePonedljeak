package Package;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
         int [] array = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(array));
         for(int number : array){ //: nam govori gdje treba gledati, ovdje prvi put gleda zadnji element

             array[number-1]+= 12;
         }
        System.out.println(Arrays.toString(array));
    }
}