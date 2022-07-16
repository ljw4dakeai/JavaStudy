package com.ljw4dakeai.Practice716.HouseWorkCode;

import java.util.Arrays;
import java.util.Random;

/**
 * @author ZJH
 * @info 1，题目要求
 * 1. 产生10个 1-100 之间的随机数并存入数组中，随机数不能重复，随后遍历打印数组（元素都在一行打印）
 * 2. 反转数组中元素，再次遍历打印数组（元素都在一行打印）
 * 3. 找出数组中偶数元素并打印在控制台，要求每行打印两个元素
 * <p>
 * 运行结果（注意：必须按照如下格式进行打印）：
 * <p>
 * 产生的10个随机数为:
 * 79 52 47 1 42 16 87 18 82 2
 * 反转后的数组元素为:
 * 2 82 18 87 16 42 1 47 52 79
 * 数组中偶数元素有:
 * 2 82
 * 18 16
 * 42 52
 * <p>
 * <p>
 * <p>
 * <p>
 */
public class PracticeFour {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; ) {
            int num = random.nextInt(100) + 1;
            if(!findNumInArr(num, ints)) {
                ints[i] = num;
                i++;
            }
        }
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(reverseArr(ints)));
        getNum(ints);
    }

    public static int[] reverseArr(int[] ints) {
        for (int i = 0; i < ints.length / 2; i++) {
            int temp = ints[i];
            ints[i] = ints[ints.length - 1 - i];
            ints[ints.length - 1 - i] = temp;
        }
        return ints;
    }

    public static void getNum(int[] ints){
        for (int i = 0, num =0; i < ints.length; i++, num ++ ) {
            if (num % 2 == 0) {
                System.out.print(ints[i] + " ");
            } else {
                System.out.println(ints[i]);
            }
        }
    }

    public static boolean findNumInArr(int num, int[] ints){
        boolean flag = false;
        for (int anInt : ints) {
            if(anInt == num){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
