package Arrays;

import java.util.Arrays;

public class SucheArray {
    public static void main(String[] args) {
        int[] suchArray={1,2,9,7,8,3,4,6};
        java.util.Arrays.sort(suchArray);
        int suche=6;
        int ergebnisIndex= java.util.Arrays.binarySearch(suchArray,suche);
        System.out.println("suche : "+suche+" "+ Arrays.toString(suchArray)+"index"+ergebnisIndex);
    }
}
