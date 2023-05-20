package com.serialization.userser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;

        FileInputStream fileInputStream = new FileInputStream("user.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        user = (User) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();

        user.greeting();
    }
}
