package com.ljw4dakeai.JiChuBan.Chapter06;

import java.util.Arrays;

/**
 * @author ZJH
 * @info 数组的定义和使用
 */
public class Test01Array {
    public static void main(String[] args) {
        //动态初始化一个定长数组,长度为10
        //推荐
        int[] array1 = new int[10];
        //地址值[I@776ec8df
        // @是一个分割符 没有任何含义 左边声明数据类型, 右边表示地址值(16进制)
        //[ 声明一个数组
        // I 表示是一个INT 型

        //不推荐  不推荐使用!
        int array2[] = new int[10];

        //数组的静态初始化
        int[] array4 = new int[]{10, 20, 40, 50};
        int[] array5 = {10, 20, 30, 50,};

        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array5));

        //没有赋初始值是没办法使用的
        double[] array3;

        System.out.println(array1);

        for (int i : array1) {
            System.out.println(i);
            //默认值是0
        }
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i;
        }

        for (int i : array1) {
            System.out.println(i);
        }


    }
}
