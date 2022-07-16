package com.ljw4dakeai.Test;

/**
 * @author ZJH
 * @info 全年销售额度
 */
public class Test20 {
    public static void main(String[] args) {
        int[][] output = new int[][]{
                {22, 66, 44, 80},
                {90, 55, 20, 70},
                {72, 18, 61, 15},
                {70, 50, 80, 100}
        };

        int sum = 0;
        for (int i = 0; i < output.length; i++) {
            for (int anInt : output[i]) {
                sum += anInt;
            }
        }

        System.out.println("今年的销售总额: " + sum);
    }
}
