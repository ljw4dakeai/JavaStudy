package com.ljw4dakeai.jinjieban.chapter10.test05propertiies.testpackage02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

/**
 * @author ZJH
 */
public class Test01TestGussetNumber {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test05propertiies/testpackage02/config.properties"));
        int count = Integer.parseInt(properties.getProperty("count"));
        if (count <= 100) {
            gussetNumber();
            count ++;
            properties.setProperty("count", String.valueOf(count));
            properties.store(new FileWriter("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test05propertiies/testpackage02/config.properties"), "");
        }else {
            System.out.println("游戏次数不足, 请充值!");
        }
    }


    public static void gussetNumber() {
        System.out.println("猜数字游戏0 -100之间的数, 包含0 - 100");
        Scanner scanner = new Scanner(System.in);
        int value = new Random().nextInt(101);
        while (true) {
            System.out.println("请输入猜的数字");
            int gussetNumber = scanner.nextInt();
            if (gussetNumber >= 0 && gussetNumber <= 100) {
                if (gussetNumber > value) {
                    System.out.println("你猜大了!");
                } else if (gussetNumber < value) {
                    System.out.println("你猜小了!");
                } else {
                    System.out.println("恭喜你猜中啦!");
                    break;
                }
            } else {
                System.out.println("请输入正确的数字!");
            }
        }
    }
}
