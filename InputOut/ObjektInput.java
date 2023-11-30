package InputOut;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjektInput {

        public static void main(String[] args) {

            Car c1=new Car("Audi","Gelb");
            try {
                FileInputStream fileInputStream=new FileInputStream("araba.txt");
                ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
                Car newcar=(Car) objectInputStream.readObject();
                System.out.println((newcar.getBrand()));

                fileInputStream.close();
                objectInputStream.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }

