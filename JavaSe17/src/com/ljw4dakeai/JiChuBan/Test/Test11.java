package com.ljw4dakeai.JiChuBan.Test;

import java.util.Scanner;

/**
 * @author ZJH
 * @info 评委评分问题！ 去掉一个最高分， 去掉一个最低分  求avg
 */
public class Test11 {
    public static void main(String[] args) {
        System.out.println("评委打分系统！");
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入评委个数！");
        int scorePeople = scanner.nextInt();

        int[] scores = new int[scorePeople];


        // 两种解决方法！
        //方法1
        for (int i = 0; i < scores.length; i++) {
            while (true) {
                System.out.println("请第" + (i + 1) + "评委打分！");
                int input = scanner.nextInt();
                if (input >= 0 && input <= 100) {
                    scores[i] = input;
                    break;
                } else {
                    System.out.println("请重新输入分数！");
                }
            }
        }

/*
        //方法二
        for (int i = 0; i < scores.length; ) {
            System.out.println("请第" + (i + 1) + "评委打分！");
            int input = scanner.nextInt();
            if (input >= 0 && input <= 100) {
                scores[i] = input;
                i++;
            } else {
                System.out.println("请重新输入分数！");
            }

        }*/


        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int score : scores) {
            max = Math.max(max, score);
            //max = max > score ? max : score; 等价于上面的表达式！
            min = Math.min(min, score);
            //min = min < score ? min : score; //等价于上面的表达式！
            sum += score;
        }

        System.out.println("去掉最高分和最低分的平均分是 ： " + ((sum - min - max) / (scores.length - 2)));

        System.out.println();

    }
}
