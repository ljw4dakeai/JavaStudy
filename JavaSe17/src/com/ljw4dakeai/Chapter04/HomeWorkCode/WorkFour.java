package com.ljw4dakeai.Chapter04.HomeWorkCode;

import java.util.Scanner;

/**
 * @author ZJH
 */
public class WorkFour {
    public static void main(String[] args) {
        System.out.println("请输入一个数,判断和20的关系");
        int num = new Scanner(System.in).nextInt();

        int i = 20;
        if (num > i){
            System.out.println("大于20");
        }else if (num == i){
            System.out.println("等于20");
        }else {
            System.out.println("小于20");
        }

    }
}
