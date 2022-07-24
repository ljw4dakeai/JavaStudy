package com.ljw4dakeai.jinjieban.chapter01.HomeWorkCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author ZJH
 * @info 完成课堂上斗地主准备54张牌的案例，要求使用静态代码块
 */
public class WorkFour {
    public static final ArrayList<String> CARDS = new ArrayList<>();

    //静态代码段
    static {
        char[] colors = {'♠', '♣', '♥', '♦'};
        String[] nums = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        //存放所有牌
        CARDS.add("大王");
        CARDS.add("小王");

        for (char color : colors) {
            for (String num : nums) {
                CARDS.add(color + num);
            }
        }
    }

    public static void main(String[] args) {
        CARDS.forEach(card -> System.out.print(card + ", "));
        System.out.println();
        System.out.println(CARDS.size());
    }
}
