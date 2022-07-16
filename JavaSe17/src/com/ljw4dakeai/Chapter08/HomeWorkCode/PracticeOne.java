package com.ljw4dakeai.Chapter08.HomeWorkCode;

import java.util.Scanner;

/**
 * @author ZJH
 * @info
 * ### 题目1:
 *
 * 输入星期数，显示今天的减肥活动
 *           周一：跑步
 *           周二：游泳
 *           周三：慢走
 *           周四：动感单车
 *           周五：拳击
 *           周六：爬山
 *           周日：好好吃一顿
 *
 * ### 操作步骤
 *
 * 1. 键盘录入一个星期数，用一个变量接收
 *
 * 2. 对星期数进行判断，这里用 switch 语句实现
 *
 * 3. 在对应的语句控制中输出对应的减肥活动
 */
public class PracticeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("减肥计划!");
        System.out.println("请输入今天是周几!");
        while(true){
            System.out.println("请输入今天是周几!");
            String weekDay = scanner.nextLine();

            switch (weekDay){
                case "周一" -> System.out.println("跑步");
                case "周二" -> System.out.println("游泳");
                case "周三" -> System.out.println("慢走");
                case "周四" -> System.out.println("动感单车");
                case "周五" -> System.out.println("拳击");
                case "周六" -> System.out.println("爬山");
                case "周天" -> System.out.println("摆烂一天吃吃吃!");
                default -> System.out.println("没有这一天呀!") ;
            }

        }
    }
}
