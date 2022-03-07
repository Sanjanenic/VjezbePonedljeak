package Package;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        int[][] arrayInception = {
                {1, 1, 1},
                {1, 1, 1},
                {1,1,1}
        };

        for(int i =0; i <arrayInception.length; i++){ //i gleda olio nizova imamo, j koji je sazaj niza u kojem smo vec unutra
            for(int j =0; j<arrayInception[i].length; j++){
                System.out.print(arrayInception[i][j] + " ");
            }
            System.out.println(); //ovo sluzi da nam ne dodje u konzoli sve u jednom redu
        }


    }
}
