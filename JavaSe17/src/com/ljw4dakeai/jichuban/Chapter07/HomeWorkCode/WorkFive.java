package com.ljw4dakeai.jichuban.Chapter07.HomeWorkCode;

import java.util.Arrays;

/**
 * @author ZJH
 */
public class WorkFive {
    public static void main(String[] args) {
        System.out.println(listAdd(new int[]{10, 20}));
        System.out.println(listAdd_(new int[]{10, 20, 40}));
    }

    public static int listAdd(int[] nums) {
        return Arrays.stream(nums).sum();
    }


    public static int listAdd_(int[] nums) {
        int num = 0;
        for (int i : nums) {
            num += i;
        }

        return num;
    }


}
