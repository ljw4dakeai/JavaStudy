package com.ljw4dakeai.Chapter08;

import com.ljw4dakeai.Pritice710.Info;

import java.util.Arrays;

/**
 * @author ZJH
 * @info 二维数组
 */
public class Test03ErWeiArray {

    public static void main(String[] args) {
        //二维数组里面的数组长度是可以不一样的
        int[][] ints = new int[][]{
                {10, 20, 40},
                {10, 440, 70, 100}
        };
        System.out.println(Arrays.toString(ints[0]));
        System.out.println(Arrays.toString(ints[1]));


        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println(ints[i][j]);
            }
        }
    }


}
