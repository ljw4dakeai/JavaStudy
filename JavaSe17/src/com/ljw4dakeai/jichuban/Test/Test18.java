package com.ljw4dakeai.jichuban.Test;

import java.util.Arrays;

/**
 * @author ZJH
 * @info 数组数据交换
 */
public class Test18 {
    public static void main(String[] args) {
        int[] ints = new int[]{10, 20, 40, 50};
        System.out.println(Arrays.toString(ints));

        //择半交换
        for (int i = 0; i < ints.length / 2; i++) {
            int temp = ints[i];
            ints[i] = ints[ints.length - 1 - i];
            ints[ints.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(ints));


        //新数组和旧数组交换
        int[] temps = new int[ints.length];
        for (int i = ints.length - 1, j = 0; i >= 0; i--, j++) {
            temps[j] = ints[i];
        }
        ints = temps;
        System.out.println(Arrays.toString(ints));

        //双指针
        int start = 0;
        int end = ints.length - 1;
        while (start < end) {
            int temp = ints[start];
            ints[start] = ints[end];
            ints[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(ints));

        for (int start_ = 0, end_ = ints.length - 1; start_ < end_; start_++, end_--) {
            int temp = ints[start_];
            ints[start_] = ints[end_];
            ints[end_] = temp;
            start_++;
            end_--;
        }
        System.out.println(Arrays.toString(ints));


    }
}
