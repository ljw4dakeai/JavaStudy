package com.ljw4dakeai.jinjieban.chapter10.test03objectStream.testpackage01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author ZJH
 */
public class Test02TestObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectinputStream = new ObjectInputStream(new FileInputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test03objectStream/objectFile.txt"));
        @SuppressWarnings("unchecked")
        ArrayList<Student> students = (ArrayList<Student>) objectinputStream.readObject();

        students.forEach(System.out::println);

        objectinputStream.close();
    }
}
