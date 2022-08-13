package com.ljw4dakeai.jinjieban.chapter10.test05propertiies.testpackage01;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ZJH
 */
public class Test02TestPropertiesWriter {
    public static void main(String[] args) throws IOException {
//        Properties properties = new Properties();
//        properties.setProperty("datadir", "c:/software/mongodb/data");
//        properties.setProperty("charset", "utf8mb4");
//
//        properties.store(new FileWriter("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test05propertiies/testpackage01/config.properties"), "this is a config fiile");
//

        Properties properties = new Properties();
        properties.load(new FileReader("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test05propertiies/testpackage01/config.properties"));
        properties.forEach((k, v) -> System.out.println(k + "= " + v));
    }
}
