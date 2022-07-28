package com.ljw4dakeai.jinjieban.chapter03.test03api.testpackage01;

import java.util.Random;

/**
 * @author ZJH
 * @info API文档的使用
 *
 * 1、查找API文档 找到索引搜索我们想要的类
 * 2、查看构造方法
 * 3、查看成员方法
 */
public class Test01Random {

    public static void main(String[] args) {
        final int loopValue = 10;
        Random random = new Random();

        for (int i = 0; i < loopValue; i++) {
            System.out.println(random.nextInt(10));
        }

        Random randomSeed = new Random(10);
        for (int i = 0; i < loopValue; i++) {
            System.out.println(randomSeed.nextInt(10));
        }
    }

}
