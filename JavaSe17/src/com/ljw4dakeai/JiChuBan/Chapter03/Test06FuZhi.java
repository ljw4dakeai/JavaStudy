package com.ljw4dakeai.JiChuBan.Chapter03;

/**
 * @author ZJH
 * 赋值运算符 ,都包含了强制类型转换
 */
public class Test06FuZhi {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int h = 0;
        int x = 1;
        int y = 100;
        int z = 1002;
        j += i;
        h -= i;
        x *= i;
        y /= i;
        z %= i;


        System.out.println(i);
        System.out.println(j);
        System.out.println(h);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
