package InputOut;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteOut {

        public static void main(String[] args) {
            String data="java 102 dersleri";
            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();

            byte [] arr=data.getBytes();
            try {
                byteArrayOutputStream.write(arr);
            } catch (IOException e) {

                String newdata=byteArrayOutputStream.toString();
                System.out.println(newdata);
            }

        }
    }

