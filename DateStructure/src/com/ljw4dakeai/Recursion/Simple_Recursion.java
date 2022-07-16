package com.ljw4dakeai.Recursion;


//简单的递归调用


public class Simple_Recursion {
    public static void main(String[] args) {
        test1(4);
        System.out.println();
        test2(4);
        System.out.println();
        System.out.printf("%d的阶乘为:%d\n", 1, test3(1));
        System.out.printf("%d的阶乘为:%d\n", 3, test3(3));

    }

    //打印问题
    public static void test1(int n) {
        if (n > 2) {
            test1(n - 1);
        }
        System.out.println("n=" + n);
    }

    public static void test2(int n) {
        if (n > 2) {
            test2(n - 1);
        } else {
            System.out.println("n=" + n);
        }
    }

    //阶乘问题
    public static int test3(int n) {
        if (n == 1) {
            return 1;
        } else {
            return test3(n - 1) * n;
        }
    }

}
