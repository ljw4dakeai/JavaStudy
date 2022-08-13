package com.ljw4dakeai.jinjieban.chapter10.HomeWorkCode;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ZJH
 */
public class WorkTwo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        properties.load(new FileReader("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/HomeWorkCode/config.properties"));

        properties.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
