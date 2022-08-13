package com.ljw4dakeai.jinjieban.chapter10.HomeWorkCode;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ZJH
 */
public class WorkSix {
    private static final Properties SPEED_PROPERTIES = new Properties();
    static {
        try {
            SPEED_PROPERTIES.load(new FileReader("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/HomeWorkCode/speed.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("当前小蛇的移动速度是 : " + SPEED_PROPERTIES.getProperty("speed"));


    }
}
