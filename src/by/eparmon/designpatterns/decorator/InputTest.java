package by.eparmon.designpatterns.decorator;

import java.io.*;

public class InputTest {

    public static void main(String[] args) {
        int c;

        try {
            InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(
                    new FileInputStream("src/by/eparmon/designpatterns/decorator/text.txt")));
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
