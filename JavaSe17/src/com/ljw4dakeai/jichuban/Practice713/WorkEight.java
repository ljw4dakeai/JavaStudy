package com.ljw4dakeai.jichuban.Practice713;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author ZJH
 * @info
 * 训练描述
 *
 * 定义一个长度为3的一维数组,给每个元素赋值. (要求数组中每个元素的值是0-9的随机数)
 * 遍历数组打印每个元素的值
 * 操作步骤描述
 *
 * 1.定义长度为3的数组
 * 2.创建Random引用数据类型的变量
 * 3.生成3个0-9的随机数,为每一个元素赋值(用循环)
 * 遍历数组，并打印每一个元素
 */
public class WorkEight {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数组长度!");
        int[] ints = new int[scanner.nextInt()];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(ints));



    }
}
