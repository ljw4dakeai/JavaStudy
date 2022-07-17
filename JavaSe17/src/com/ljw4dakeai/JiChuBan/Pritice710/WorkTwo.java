package com.ljw4dakeai.JiChuBan.Pritice710;


import java.util.Scanner;

/**
 * @author ZJH
 * @info 键盘录入一个学生成绩(int类型), 如果成绩大于等于60输出”及格”,如果成绩小于60输出”不及格”
 */
public class WorkTwo {
    public static void main(String[] args) {
        System.out.println("请输入一个学生的成绩");

        int score = new Scanner(System.in).nextInt();
        System.out.println(score < 0 || score > 100 ? "请输入一个正确的成绩" : (score < 60 ? "不及格" : "及格"));

    }
}
