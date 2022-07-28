package com.ljw4dakeai.jinjieban.chapter03.test03api.testpackage07;

import java.util.Arrays;

/**
 * @author ZJH
 */
public class Test02TestSystemCopyArray {
    public static void main(String[] args) {
        int[] ints = {10, 20, 30, 40, 50};
        int[] intsCopyAll = new int[5];
        //数组中的数据全部赋值
        //参数(原数组, 原数组的起始索引, 目标数组, 目标数组的起始位置,赋值数据的个数)
        System.arraycopy(ints, 0, intsCopyAll, 0, 5);
        System.out.println(Arrays.toString(intsCopyAll));
        int[] intsCopySome = new int[5];
        //数组中的数据部分赋值
        System.arraycopy(ints, 1, intsCopySome, 2, 3);
        System.out.println(Arrays.toString(intsCopySome));
    }
}
