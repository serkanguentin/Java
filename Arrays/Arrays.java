package Arrays;

public class Arrays {
    public static void main(String[] args) {
       int[] myIntArray=new int[10];
       myIntArray[0]=42;
     /*  for(int i=0 ; i<11;i++){
           myIntArray[i]=i+1;
           System.out.println(arr[i]);

       }*/
       myIntArray=new int[]{1,2,3,4,5};
        System.out.println(myIntArray.length);

        for(int i=0 ; i<myIntArray.length;i++){
            System.out.println(myIntArray[i]);
        }
        for (int i:
             myIntArray) {
            System.out.println(i);

        }

    }
}
