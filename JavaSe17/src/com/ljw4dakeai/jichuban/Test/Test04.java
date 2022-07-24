package com.ljw4dakeai.jichuban.Test;

import java.util.Scanner;

/**
 * @author ZJH
 * @info 三个和尚身高判断
 */
public class Test04 {
    public static void main(String[] args) {

        System.out.println("请输入三个和尚的身高！(空格分开)");

        String[] peoples = new Scanner(System.in).nextLine().split(" ");

        int people1 = Integer.parseInt(peoples[0]);
        int people2 = Integer.parseInt(peoples[1]);
        int people3 = Integer.parseInt(peoples[2]);

        int maxTemp = people1 > people2 ? people1 : people2;

        int max = people3 > maxTemp ? people3 : maxTemp;

        int max_ = people1 > people2 && people1 > people3 ? people1 : (people2 >people3?people2:people3);

        System.out.println("身高最高的一个和尚的身高是" + max_);


    }
}
