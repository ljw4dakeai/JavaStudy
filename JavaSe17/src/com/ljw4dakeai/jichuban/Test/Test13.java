package com.ljw4dakeai.jichuban.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ZJH
 */
public class Test13 {
    public static void main(String[] args) {
//        method(10);
//        method_();
//        sum(10, 20);
        printSingleNum(10, 20);
        System.out.println(getSingleNum(10, 20));
        System.out.println(getSum(10, 20));
    }

    //有参数无返回
    public static void method(int i) {
        System.out.println(i % 2 == 0 ? "偶数" : "奇数");
    }


    //无参数无返回
    public static void method_() {
        System.out.println("情输入一个数字!");
        int i = new Scanner(System.in).nextInt();

        System.out.println((i % 2) == 0 ? "偶数" : "奇数");
    }


    //有参数无返回
    public static void sum(int i, int j) {
        System.out.println(i + j);
    }

    //有参数又返回
    public static int getSum(int i, int j){
        return i + j;
    }


    public static void printSingleNum(int n, int m) {
        if (n <= m) {
            for (int i = n; i < m; i++) {
                if (i % 2 == 1) {
                    System.out.println(i + "是奇数!");
                }
            }
        } else {
            System.out.println("请输入正确的数字");
        }
    }


    public static List<Integer> getSingleNum(int n, int m) {
        List<Integer> ints = new ArrayList<>();
        if (n <= m) {
            for (int i = n; i < m; i++) {
                if (i % 2 == 1) {
                    ints.add(i);
                }
            }
        } else {
            System.out.println("请输入正确的数字");
        }
        return ints;
    }
}
