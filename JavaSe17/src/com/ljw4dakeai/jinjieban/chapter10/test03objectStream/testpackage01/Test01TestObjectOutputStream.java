package com.ljw4dakeai.jinjieban.chapter10.test03objectStream.testpackage01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author ZJH
 */
public class Test01TestObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test03objectStream/objectFile.txt"));

        ArrayList<Student> students = new ArrayList<>();
        Collections.addAll(students,
                new Student("邹家豪", 20),
                new Student("李静雯", 21));
        objectOutputStream.writeObject(students);


        objectOutputStream.close();
    }
}
