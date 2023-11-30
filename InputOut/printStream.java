package InputOut;

import java.io.FileNotFoundException;
import java.io.PrintStream;


public class printStream {
    public static void main(String[] args) {
        PrintStream printStream= null;
        try {
            printStream = new PrintStream("kalem.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        printStream.println(1234556);
        printStream.close();

    }
}
