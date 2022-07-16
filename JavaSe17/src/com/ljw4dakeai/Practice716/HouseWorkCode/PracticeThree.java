package com.ljw4dakeai.Practice716.HouseWorkCode;

import java.util.Arrays;
import java.util.Random;

/**
 * @author ZJH
 * @info 1. 定义返回值类型为int类型，名为 getScore(int[] arr)的静态方法，方法内完成：
 * - 获取指定数组arr中小于平均值的元素的个数，并返回（10分）
 * 2. 定义main方法，方法内完成：
 * - 定义一个长度为5的int数组arr（2分）
 * - 使用随机数生成5个范围为1-99的数字存入arr中（包含1和99），之后打印数组（5分）
 * - 传递arr调用getScore(int[] arr)方法，获取方法返回值并在控制台打印输出该返回值（3分）
 */
public class PracticeThree {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ints = new int[5];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1, 100);
        }

        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(booSort(ints)));
        System.out.println(getScoreAvg(ints));
        System.out.println(getScore(ints));
    }

    public static int getScore(int[] ints) {
        int num = 0;
        for (int anInt : ints) {
            num += anInt < getScoreAvg(ints) ? 1 : 0;
        }

        return num;

    }


    public static double getScoreAvg(int[] ints) {
        int sum = 0;
        for (int anInt : ints) {
            sum += anInt;
        }
        return (double) sum / (double) ints.length;
    }


    //排序
    public static int[] booSort(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < i; j++) {
                if (ints[i] > ints[j]) {
                    ints[i] = ints[i] ^ ints[j];
                    ints[j] = ints[i] ^ ints[j];
                    ints[i] = ints[i] ^ ints[j];
                }
            }
        }

        return ints;
    }

}
