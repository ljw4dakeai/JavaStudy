package com.ljw4dakeai.jichuban.Chapter05.HomeWorkCode;

import java.util.Scanner;

/**
 * @author ZJH
 */
public class WorkFive {
    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入一个数:(输入0退出)");
            int num = new Scanner(System.in).nextInt();
            System.out.println("num = " + num);
            if (num == 0) {
               break;
            }
        }
    }
}
