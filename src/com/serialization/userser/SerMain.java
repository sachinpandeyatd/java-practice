package com.serialization.userser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.security.MessageDigest;

public class SerMain {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.name = "Tony Stark";
        user.password = "justaratherveryintelligentsystem";

        FileOutputStream fileOutputStream = new FileOutputStream("user.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(user);
        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("User saved.");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println("SerialVersionUID: " + serialVersionUID);
    }
}
