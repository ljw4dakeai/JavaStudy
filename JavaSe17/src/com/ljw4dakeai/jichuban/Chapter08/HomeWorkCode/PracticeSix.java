package com.ljw4dakeai.jichuban.Chapter08.HomeWorkCode;

import java.util.Arrays;

/**
 * @author ZJH
 * @info 已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现把数组中的元素值交换，
 * 交换后的数组 arr = {50, 46, 37, 28, 19}; 并在控制台输出交换后的数组元素。
 * <p>
 * ### 操作步骤
 * <p>
 * 1. 定义一个数组，用静态初始化完成数组元素的初始化
 * 2. 循环遍历数组，这一次初始化语句定义两个索引变量，判断条件是开始索引小于等于结束索引
 * 3. 变量交换
 * 4. 遍历数组
 * <p>
 * ### 参考代码
 */
public class PracticeSix {
    public static void main(String[] args) {
        int[] ints = new int[]{19, 28, 37, 46, 50}
                ;
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
