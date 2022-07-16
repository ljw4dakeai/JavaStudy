package com.ljw4dakeai.Test;

import java.util.Scanner;

/**
 * @author ZJH
 * @info 成绩奖励
 */
public class Test03 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("请输入小明的成绩:");
            int score = new Scanner(System.in).nextInt();

            if (score < 0 || score > 100) {
                System.out.println("成绩不合理！请重新输入!");
            } else {
                if (score >= 95) {
                    System.out.println("奖励一次自行车！");
                } else if (score >= 90) {
                    System.out.println("奖励一次游乐园！");
                } else if (score >= 85) {
                    System.out.println("奖励一个变形金刚！");
                } else {
                    System.out.println("挨了一个大逼窦，这个城市多了一个伤心的人！");
                }
            }
        }

    }
}

