package com.ljw4dakeai.jichuban.Chapter05;

import java.util.Random;

/**
 * @author ZJH
 * @info random 的使用!
 */
public class Test08Random {
    public static void main(String[] args) {
        //种子确定 随机数就是一定的
        Random random = new Random(10);
        //10, 表示 生成一个0-9 的随机数  包头不包尾
        int i = random.nextInt(10);
        int num = random.nextInt(11) + 90;
        //生成 X-Y的随机数!
//        random.nextInt(Y-X + 1) + X;
        System.out.println(i);
    }
}
