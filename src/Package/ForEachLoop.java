package Package;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
         int [] array = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(array));

         for(int number : array){ //: nam govori gdje treba gledati, ovdje prvi put gleda zadnji element

             array[number-1]+= 12;  //-1 da bi se primjenilo na prvi clan array, posto for each petlja broji od 1 a ne od 0.
         }
        System.out.println(Arrays.toString(array));

      //  ArrayList<Integer>list = new ArrayList<>();  ovo jos nismo radili smo je primjer kako izgleda, kod liste je nebitno mjesto na kome se elemnt nalazi
    }
}
