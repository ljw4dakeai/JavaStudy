package com.ljw4dakeai.jinjieban.chapter10.HomeWorkCode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ZJH
 *
 */
public class WorkOne {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("品名","Iphone11 Pro Max");
        properties.setProperty("颜色","暗夜绿");
        properties.setProperty("存储容量","256G");
        properties.setProperty("价格","10899");


        properties.store(new FileWriter("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/HomeWorkCode/config.properties"), "iphone11 pro max 详细参数");
    }
}
