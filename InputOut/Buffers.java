package InputOut;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffers {

        public static void main(String[] args) {

       /*try {
            FileInputStream fileInputStream=new FileInputStream("a.txt");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
            int i=fileInputStream.read();
            while(i!=-1){
                System.out.print((char)i);
                i=fileInputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

            String data = "Java 102 patika";
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("kalem.txt");
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

                byte[] arr = data.getBytes();
                try {
                    bufferedOutputStream.write(arr);
                    bufferedOutputStream.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }


        }}
