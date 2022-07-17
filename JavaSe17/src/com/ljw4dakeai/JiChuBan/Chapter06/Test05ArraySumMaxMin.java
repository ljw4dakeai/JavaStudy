package com.ljw4dakeai.JiChuBan.Chapter06;

/**
 * @author ZJH
 * @info com.ljw4dakeai.Array 的最大值  最小值 和 平均值
 */
public class Test05ArraySumMaxMin {
    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 10, -1, 15};


        int max = ints[0];
        int min = ints[0];
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
            }
            // max = ints[i] > max ? ints[i] : max;
            if (ints[i] < min) {
                min = ints[i];
            }
            //min = ints[i] < min ? ints[i] : min;
            sum += ints[i];
        }

        System.out.println("max = " + max + ",min = " + min + ",sum = " + sum + ",avg = " + (sum / ints.length));
    }
}
