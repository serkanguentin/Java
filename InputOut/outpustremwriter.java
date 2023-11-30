package InputOut;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class outpustremwriter {
        public static void main(String[] args) {
            String data="Kendi kaderimi  jksldla";
            try {
                FileOutputStream fileOutputStream=new FileOutputStream("kalem.txt");
                OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);
                outputStreamWriter.write(data);



            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        }
    }

