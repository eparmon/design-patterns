package by.eparmon.designpatterns.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int result = in.read();
        return result == -1 ? result : Character.toLowerCase((char) result);
    }

    @Override
    public int read(byte[] bytes, int offset, int length) throws IOException {
        int result = in.read(bytes, offset, length);
        for (int i = offset; i < offset + result; i++) {
            bytes[i] = (byte) Character.toLowerCase((char) bytes[i]);
        }
        return result;
    }

}
