package com.ljw4dakeai.jinjieban.chapter10.HomeWorkMD.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.load(new FileReader("day10_io_properties\\test1.txt"));

        String color = pro.getProperty("颜色");
        String brand = pro.getProperty("品牌");
        String size = pro.getProperty("存储容量");
        String price = pro.getProperty("价格");

        System.out.println(color);
        System.out.println(brand);
        System.out.println(size);
        System.out.println(price);

        //尝试自学：Properties还有一个方法叫stringPropertyNames, 可以获取键的集合；
        //自己尝试一下，能不能获取每个键对应的值
    }
}
