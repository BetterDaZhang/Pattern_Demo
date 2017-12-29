package com.example.Observer.BeanIO;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by camdora on 17-12-12.
 */

public class LowerCaseInputStream extends FilterInputStream {

    protected LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int read = super.read();

        return read == -1 ? read : Character.toLowerCase((char)read);
    }


    @Override
    public int read(byte[] bytes, int offset, int len) throws IOException {

        int result = super.read(bytes, offset, len);
        for(int i = offset; i < offset + result; i++){
            bytes[i] = (byte) Character.toLowerCase((char) bytes[i]);
        }
        return result;
    }
}
