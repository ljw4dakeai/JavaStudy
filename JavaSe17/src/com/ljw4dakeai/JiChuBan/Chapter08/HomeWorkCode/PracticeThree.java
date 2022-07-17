package com.ljw4dakeai.JiChuBan.Chapter08.HomeWorkCode;

import java.util.Arrays;

/**
 * @author ZJH
 * @info 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问第二十个月的兔子对数为多少？
 * <p>
 * 兔子死不死 不死
 * <p>
 * 兔子什么时候开始生第三个月开始
 * <p>
 * <p>
 * <p>
 * 结论: 当月的兔子数= 上个月的兔子数+上上个月的兔子数;
 */
public class PracticeThree {

    public static void main(String[] args) {
        System.out.println(getRabbitNum(100));

        int[] nums = new int[20];

        nums[0] = 1;
        nums[1] =1;
        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i -2] + nums[i-1];
        }

        System.out.println(Arrays.toString(nums));

    }


    public static int getRabbitNum(int month) {
//        int num = 0;
//        if (month == 1) {
//            num =  1;
//        }
//        if (month == 2) {
//            num =  1;
//        }
//        if (month == 3) {
//            num =  1;
//        }
//        if (month >= 4) {
//             num = getRabbitNum(month - 2) + getRabbitNum(month - 1);
//        }
//        return  num;

        int num = 0;
        switch (month) {
            case 1, 2 -> num = 1;
            default -> num = getRabbitNum(month - 2) + getRabbitNum(month - 1);
        }

        return num;
    }
}
