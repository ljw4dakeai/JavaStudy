package com.ljw4dakeai.jichuban.Practice721;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author ZJH
 * @info TLIAS·学习中心
 * 您好，邹家豪
 * A220605001
 * 课程/考试
 * 返回
 * 01:53:32
 * 代码题
 * 22
 * 定义一个int类型数组,
 * 1.键盘录入数组的长度和随机数的范围（范围区间要大于数组长度），在数组中存储指定范围的随机数，并且随机数不能重复
 * 2. 找出数组中偶数元素并打印在控制台，要求两个打印一行
 * 运行结果（注意：需要满足如下打印格式）
 * 产生的10个随机数为:
 * 79 52 47 1 42 16 87 18 82 2
 * 数组中偶数元素有:
 * 2 82
 * 18 16
 * 42 52
 * 22  24
 */
public class WorkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数组长度!");
            int length = scanner.nextInt();
            System.out.println("请输入随机数开始值!");
            int start = scanner.nextInt();
            System.out.println("请输入随机数结束值!");
            int end = scanner.nextInt();
            if (length > end - start) {
                System.out.println("请重新输入!");
            } else {
                printArr(getRandomArr(length, start, end));
                break;
            }
        }


    }

    public static void printArr(int[] ints) {
        System.out.println(Arrays.toString(ints));
        int num = 0;
        for (int anInt : ints) {
            if (anInt % 2 == 0) {
                num++;
                System.out.print(num % 2 == 0 ? anInt + "\n" : anInt + " ");
            }
        }
    }

    public static int[] getRandomArr(int length, int randomStart, int randomEnd) {
        Random random = new Random();
        int[] ints = new int[length];
        for (int i = 0; i < ints.length; ) {
            int num = random.nextInt(randomEnd - randomStart + 1) + randomStart;
            if (!judgeSameNum(num, ints)) {
                ints[i] = num;
                i++;
            }
        }
        return ints;
    }

    public static boolean judgeSameNum(int num, int[] ints) {
        boolean flag = false;
        for (int anInt : ints) {
            if (anInt == num) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
