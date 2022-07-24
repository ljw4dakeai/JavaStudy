package com.ljw4dakeai.jichuban.Practice716.HouseWorkCode;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author ZJH
 * @info 3，题目要求
 * <p>
 * 1. 定义一个方法实现获取一个int数组：键盘录入数组的长度和随机数的范围（范围区间要大于数组长度），在数组中存储指定范围的随机数，并且随机数不能重复
 * 2. 定义一个方式实现查找索引：键盘录入一个数，在指定的数组中获取该数在数组中的索引，如果没有则返回-1。有，有几个索引返回几个索引
 */

public class PracticeSix {
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
                System.out.println("数据输入成功!");
                int[] ints = getRandomArr(length, start, end);
                System.out.println("请输入一个数查找索引");
                int findIndex = scanner.nextInt();
                System.out.println(Arrays.toString(ints));
                    System.out.println("查找的索引为 : " + Arrays.toString(findIndex(ints, findIndex)));
                break;
            }
        }


    }

    public static int[] getRandomArr(int length, int randomStart, int randomEnd) {
        Random random = new Random();
        int[] ints = new int[length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(randomEnd - randomStart + 1) + randomStart;
        }

        return ints;
    }

    public static int[] findIndex(int[] ints, int findNum) {
        int[] index;
        int numNumber = findNumNumber(ints, findNum);
        int[] numNumberIndex = new int[numNumber];
        if(numNumber == 0){
            index = new int[]{-1};
        }else {
            for (int i = 0, j=0; i < ints.length; i++) {
                if(findNum == ints[i]){
                    numNumberIndex[j] = i;
                    j ++ ;
                }
            }
            index = numNumberIndex;
        }
        return index;
    }

    public static int findNumNumber(int[] ints, int findNum){
        int num = 0;
        for (int anInt : ints) {
            if(findNum == anInt){
                num ++;
            }
        }
        return num;
    }
}
