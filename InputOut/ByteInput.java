package InputOut;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteInput {
        public static void main(String[] args) {

            byte []arr={1,3,65,75,12,34};

            ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(arr);
            int i=byteArrayInputStream.read();
            while(i!=-1){
                System.out.println(i);
                i=byteArrayInputStream.read();
            }
            try {
                byteArrayInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }


