package InputOut;

import java.io.FileInputStream;

public class InputFileStream {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream=new FileInputStream("kalem.txt");

            int i=fileInputStream.read();
            while(i !=-1){
                System.out.print((char) i);
                i=fileInputStream.read();
            }
            fileInputStream.close();
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }


    }
}



