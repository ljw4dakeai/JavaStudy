package com.ljw4dakeai.JiChuBan.Practice716.HouseWorkCode;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ZJH
 * @info
 * 1. 键盘录入一个整数，随机生成5个随机数，范围是：1~键盘录入的数（4分）
 * 2. 将5个随机数存入int类型的数组中（2分）
 * 3. 在控制台以例如：`[2,3,4,5,6]`这样的格式打印数组内容（4分）
 * 4. 分别打印数组中最大值、最小值以及总和在控制台（10分）
 */
public class PracticeTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] ints = new int[5];
        System.out.println("请输入一个你想要生成范围内的数!");
        int endNum = scanner.nextInt();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(endNum) + 1;
        }
/**
 *System.out.println(Arrays.toString(ints));
 *
 */
        printArr(ints);
        System.out.println(getMax(ints));
        System.out.println(getMin(ints));
        System.out.println(getSum(ints));
    }

    public static void printArr(int[] ints) {
        System.out.print("[ ");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(i == ints.length - 1 ? ints[i] + "" : ints[i] + " , ");
        }

        System.out.println(" ]");
    }

    public static int getMax(int[] ints){
        int max = ints[0];
        for (int anInt : ints) {
            max = max > anInt ? max : anInt;
            //max = Math.max(max, anInt);
        }
//        for (int i = 0; i < ints.length; i++) {
//            max = max > ints[i] ? max : ints[i];
//            //max = Math.max(max, ints[i]);
//        }

        return max;
    }
    public static int getMin(int[] ints){
        int min = ints[0];
        for (int anInt : ints) {
            min = min < anInt ? min : anInt;
        }

        return min;
    }
    public static int getSum(int[] ints){
        int num = 0;
        for (int anInt : ints) {
            num = num + anInt;
        }

        return num;
    }


}
