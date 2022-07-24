package com.ljw4dakeai.jichuban.Practice716.HouseWorkCode;

/**
 * @author ZJH
 * @info 1. 在控制台打印1~100以内，可以被3和7同时整除的数，两个一行打印（10分）
 */
public class PracticeOne {
    public static void main(String[] args) {
        getNum();
    }
    public static void getNum() {
        for (int i = 1, num = 0; i < 100; i++, num++) {
            if (i % 3 == 0 && i % 7 == 0) {
                if (num % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
