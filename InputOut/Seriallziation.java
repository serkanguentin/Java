package InputOut;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Seriallziation {

        public static void main(String[] args) {

            Car c1=new Car("Audi","A3");
            try {
                FileOutputStream fileOutputStream=new FileOutputStream("araba.txt");
                ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(c1);
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }


