package com.ljw4dakeai.jinjieban.chapter10.HomeWorkMD.homework;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test5 {
    private static int speedValue = 0;

    //当前游戏启动时，就读取配置文件
    static {
        try {
            Properties pro = new Properties();
            pro.load(new FileReader("day10_io_properties\\config.properties"));
            //读取配置文件中小蛇的速度
            String speed = pro.getProperty("speed");
            speedValue = Integer.parseInt(speed);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("游戏开始");
        System.out.println("小蛇的奔跑速度是："+speedValue+"毫秒刷新一次");
        System.out.println("游戏结束");
    }
}