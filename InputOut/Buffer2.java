package InputOut;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Buffer2 {
            public static void main(String[] args) {
            String str="Java ögreniyorum iste bu!";

            try {
                FileWriter fileWriter=new FileWriter("output.txt");
                BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

                bufferedWriter.write(str);



                bufferedWriter.close();
                fileWriter.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }


