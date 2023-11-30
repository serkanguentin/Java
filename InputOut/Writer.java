package InputOut;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {


        public static void main(String[] args) {
            String data="java ögreniyorum";
            try {

                FileWriter fileWriter=new FileWriter("Student.txt");
                fileWriter.write(data);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }


