package com.ljw4dakeai.jichuban.Test;

/**
 * @author ZJH
 * @info 方法实现查找数组Index
 */
public class Test15 {
    public static void main(String[] args) {
        System.out.println(getIndex(100, new int[]{10, 20, 40, 100}));
        System.out.println();

    }


    //

    public static int  getIndex(int n, int[] ints) {
        int index = -1;
        for (int i = 0; i < ints.length; i++) {
            if (n == ints[i]) {
                index = i;
            }
        }
        return index;
    }
}
