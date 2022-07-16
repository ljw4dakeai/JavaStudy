package com.ljw4dakeai.Chapter03;

/**
 * @author ZJH
 * info 自动类型转换 隐式转换
 */
public class Test01YinshiTrans {
    public static void main(String[] args) {
        int a = 10;
        byte b = 20;
        //隐式转换
        int i = a + b;
        System.out.println(i);


        byte c = 127;
        byte d = 1;

        int e = c + d;
        System.out.println(e);


    }
}
