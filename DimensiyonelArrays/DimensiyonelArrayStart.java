package DimensiyonelArray;

public class DimensiyonelArray1 {
    public static void main(String[] args) {
        int [][] matris=new int[3][4];
        int nummer=1;
       for (int i=0;i< matris.length;i++){
            for (int j = 0; j < matris[i].length; j++) {
            matris[i][j]=nummer++;


            }
        }
        for (int i=0;i< matris.length;i++){
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println( );
            }

    }

}
