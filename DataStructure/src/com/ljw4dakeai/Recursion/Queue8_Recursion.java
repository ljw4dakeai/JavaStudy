package com.ljw4dakeai.Recursion;

public class Queue8_Recursion {
    //定义一个max表示共有多少个皇后
    int max = 8;
    //定义一个数组，保存皇后的位置
    int[] array = new int[max];
    static int count = 0;
    static int judgecount = 0;

    public static void main(String[] args) {
        //测试
        Queue8_Recursion Queue = new Queue8_Recursion();
        Queue.check(0);
        System.out.println();
        System.out.printf("一共有%d种解法", count);
        System.out.println();
        System.out.printf("一共判断了%d次", judgecount);
    }

    //将皇后摆放的位置输出
    private void print() {
        count++;
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //当我们放置第n个皇后，是不是和以前的皇后冲突
    private boolean judge(int n) {
        judgecount++;
        for (int i = 0; i < n; i++) {
            //冲突,再同一列（同一行不可能出现）  冲突，再同一斜线
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }

    //编写一个方法，放置第n个皇后
    private void check(int n) {
        //第八个皇后放好了
        if (n == max) {
            print();
            return;
        }
        //没有放到第八个，依次放入并且判断（递归）；
        for (int i = 0; i < max; i++) {
            //先把该皇后放在第一列
            array[n] = i;
            //判断放防止第n个皇后到i列时是否冲突
            if (judge(n)) {
                //不冲突
                check(n + 1);
            }
            //如果冲突，就继续执行
            //第n个皇后再本行后移
        }
    }
}
