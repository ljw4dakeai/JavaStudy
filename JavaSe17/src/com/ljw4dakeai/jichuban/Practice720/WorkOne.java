package com.ljw4dakeai.jichuban.Practice720;

import java.util.Random;

/**
 * @author ZJH
 * @info 1. 产生10个 1-100 之间的随机数并存入数组中，随机数不能重复，随后遍历打印数组（元素都在一行打印）
 * 2. 反转数组中元素，再次遍历打印数组（元素都在一行打印）
 * 3. 求出数组的最大值和最小值以及元素和并打印
 */
 public class WorkOne {
    public static void main(String[] args) {
        int[] ints = new int[10];
        Random random = new Random();
        for (int i = 0; i < ints.length;) {
            int num = random.nextInt(100) + 1;
            if(!judgeNumInArr(num, ints)){
                ints[i] = num;
                i ++;
            }
        }

        printArr(ints);
        printArr(reverseArr(ints));
        printArr(getMaxMinSum(ints));
    }

    public static boolean judgeNumInArr(int num, int[] ints) {
        boolean flag = false;
        for (int anInt : ints) {
            if (anInt == num) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void printArr(int[] ints) {
        System.out.print("[ ");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(i != ints.length - 1 ? ints[i] + " , " : ints[i] + "");
        }
        System.out.println(" ]");
    }


    public static int[] reverseArr(int[] ints) {
        for (int i = 0; i < ints.length / 2; i++) {
            ints[i] = ints[ints.length - 1 - i] ^ ints[i];
            ints[ints.length - 1 - i] = ints[ints.length - 1 - i] ^ ints[i];
            ints[i] = ints[ints.length - 1 - i] ^ ints[i];
        }

        return ints;
    }

    public static int[] getMaxMinSum(int[] ints){
        int max = ints[0];
        int min = ints[0];
        int sum = 0;
        for (int anInt : ints) {
            max = Math.max(max, anInt);
            min = Math.min(min, anInt);
            sum += anInt;
        }

        return new int[]{max, min, sum};
    }
}
