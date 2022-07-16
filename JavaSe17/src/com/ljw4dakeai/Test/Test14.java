package com.ljw4dakeai.Test;

/**
 * @author ZJH
 * @info 求两个数的最大值
 * 求数组中的最大值
 */
public class Test14 {
    public static void main(String[] args) {
        System.out.println(getArrMax(new int[]{10, 20, 40, 80}));
    }


    public static int getMax(int a, int b) {
        return Math.max(a, b);
//        return a > b ? a : b;
    }

    public static int getArrMax(int[] ints) {
        int max = ints[0];
        for (int anInt : ints) {
            max = max > anInt ? max : anInt;
            //max = getMax(max, anInt )
        }
        return max;
    }

}
