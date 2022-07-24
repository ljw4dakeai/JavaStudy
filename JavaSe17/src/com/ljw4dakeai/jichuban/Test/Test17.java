package com.ljw4dakeai.jichuban.Test;

import java.util.Arrays;

/**
 * @author ZJH
 * @info 遍历数组 求出index
 * 遍历数组求出 最大值
 * 获取数组中的最大值和最小值
 */
public class Test17 {
    public static void main(String[] args) {
        forEachArr(new int[]{10, 20, 40});
        int[] ints = {10, 20, 30};
        System.out.println(Arrays.toString(getMaxMin(ints)));

    }

    public static int[] getMaxMin(int[] ints) {
        int max = ints[0];
        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            max = Math.max(max, ints[i]);
            min = Math.max(min, ints[i]);
        }
        return new int[]{max, min};
    }

//    //java 中不允许返回多个返回值
//    private static void getMaxMin(int[] ints) {
//        int max = ints[0];
//        int min = ints[0];
//        for (int i = 0; i < ints.length; i++) {
//            max = Math.max(max, ints[i]);
//            min = Math.max(min, ints[i]);
//        }
//        System.out.println("max = " + max + "min = " + min);
//    }

    public static int getMax(int[] ints) {
        int max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            max = max > ints[i] ? max : ints[i];
        }
        return max;
    }

    public static void forEachArr(int[] ints) {
        System.out.print("[ ");
        for (int i = 0; i < ints.length; i++) {
            if (i == ints.length - 1) {
                System.out.print(ints[i]);
            } else {
                System.out.print(ints[i] + " , ");
            }
        }

        System.out.println(" ]");
    }
}
