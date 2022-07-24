package com.ljw4dakeai.jichuban.Chapter08.HomeWorkCode;

import java.util.Scanner;

/**
 * @author ZJH
 * @info 在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。
 * <p>
 * ### 操作步骤
 * <p>
 * 1. 1:定义一个数组，用动态初始化完成数组元素的初始化，长度为6
 * 2. 键盘录入评委分数
 * 3. 由于是6个评委打分，所以，接收评委分数的操作，用循环改进
 * 4. 定义方法实现获取数组中的最高分(数组最大值)，调用方法
 * 5. 定义方法实现获取数组中的最低分(数组最小值) ，调用方法
 * 6. 定义方法实现获取数组中的所有元素的和(数组元素求和) ，调用方法
 * 7. 按照计算规则进行计算得到平均分
 * 8. 输出平均分
 */
public class PracticeSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("评委打分系统!");
        System.out.println("请输入评委个数!");
        int[] scores = new int[scanner.nextInt()];

        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入第" + (i + 1) + "评委分数!");
            int score = scanner.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;

            }
        }

        double sum_ = (getSum(scores) - getMin(scores) - getMax(scores));
        double num = (scores.length - 2);
        double avg = sum_ / num;
        System.out.println("平均分是" + avg);


    }

    public static int getMax(int[] ints) {
        int max = ints[0];
        for (int anInt : ints) {
            max = Math.max(max, anInt);
        }

        return max;
    }

    public static int getMin(int[] ints) {
        int min = ints[0];
        for (int anInt : ints) {
            min = Math.min(min, anInt);
        }

        return min;
    }

    public static int getSum(int[] ints) {
        int sum = 0;
        for (int anInt : ints) {
            sum += anInt;
        }

        return sum;
    }

}
