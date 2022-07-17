package com.ljw4dakeai.JiChuBan.Pritice713;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author ZJH
 * @info
 * 训练描述
 * 键盘录入一个整数，创建一个该长度的数组，为每一个元素赋值为1-10的随机整数，最后打印数组中所有值大于5且为偶数的元素.
 *
 * 操作步骤描述
 * 1键盘录入一个整数
 * 2定义长度为该整数的数组
 * 3创建Random引用数据类型的变量
 * 4生成5个0-9的随机数,为每一个元素赋值(建议用循环)
 * 5 遍历数组,输出满足条件的元素
 */
public class WorkNine {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数组长度!");
        int[] ints = new int[scanner.nextInt()];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(ints));
        for (int anInt : ints) {
            if (anInt > 5  && anInt % 2 == 0){
                System.out.println(anInt);
            }
        }
    }
}
