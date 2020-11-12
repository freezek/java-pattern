package com.ikaimen.protostuff;


import java.io.FileOutputStream;
import java.io.IOException;

public class Wq {

    public static void main(String[] args) throws IOException {

        String file = "./test.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        for (int i = 0; i < 1000000000; i++) {
            fileOutputStream.write(file.getBytes());
            fileOutputStream.flush();
        }
    }

}
