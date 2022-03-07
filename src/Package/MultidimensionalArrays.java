package Package;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        int[][] arrayInception = {
                {1, 1, 1},
                {1, 1, 1},
                {1,1,1}
        };
        printArray(arrayInception);

        System.out.println("----------------------------");

            arrayInception[1][1] = 9;

            arrayInception [0][0] = 3;
            arrayInception [0][2] = 3;
            arrayInception[2][0] = 3;
            arrayInception [2][2]= 3;

             printArray(arrayInception);
            //System.out.print(arrayInception.toString(array)); ovo bi trebalo radizi drugacije

         /*for(int[]array : arrayInception){ //ovo je isto kao gore samo sad sa for each
             for(int element : array){
                 System.out.print(element + " ");
             }
             System.out.println();*/

         }

    private static void printArray(int[][] arrayInception) {
        for(int i = 0; i < arrayInception.length; i++) { //i gleda koliko nizova imamo, j koji je sazaj niza u kojem smo vec unutra
            for (int j = 0; j < arrayInception[i].length; j++) {
                System.out.print(arrayInception[i][j] + " ");
            }
            System.out.println(); //ovo sluzi da nam ne dodje u konzoli sve u jednom redu
        }
    }
}

