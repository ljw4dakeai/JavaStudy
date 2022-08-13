package com.ljw4dakeai.jinjieban.chapter10.HomeWorkCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author ZJH
 */
public class WorkFour {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/HomeWorkCode/Students.txt"));
        ArrayList<Student> students = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null){
            String[] values = line.split(",");
            students.add(new Student(values[0], values[1], Integer.parseInt(values[2]), Integer.parseInt(values[3] )));
        }

        students.forEach(System.out::println);
        bufferedReader.close();
    }
}
