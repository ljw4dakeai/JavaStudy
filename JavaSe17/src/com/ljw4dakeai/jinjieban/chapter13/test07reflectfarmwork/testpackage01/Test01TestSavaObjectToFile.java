package com.ljw4dakeai.jinjieban.chapter13.test07reflectfarmwork.testpackage01;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;

/**
 * @author ZJH
 */
public class Test01TestSavaObjectToFile {

    public static void main(String[] args) throws IOException, IllegalAccessException {
        Teacher teacherOne = new Teacher("老王", 30);
        saveObjectToFile(teacherOne);
        Student studentOne = new Student("小王", 20, "黑马程序员", "男");
        saveObjectToFile(studentOne);
    }

    public static void saveObjectToFile(Object object) throws IOException, IllegalAccessException {
        Class<?> aClass = object.getClass();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter13/test07reflectfarmwork/testpackage01/config.txt", true));


        bufferedWriter.write(object.getClass().getSimpleName() + "->" + object.getClass().getName());

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            bufferedWriter.write(declaredField.getName() + "->" + declaredField.get(object));
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
    }
}
