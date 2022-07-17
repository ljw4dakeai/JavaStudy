package com.ljw4dakeai.JiChuBan.Chapter03;

/**
 * @author ZJH
 * 短路逻辑运算符
 */
public class Test09DuanLuYunSuan {
    public static void main(String[] args) {

        //遇见false 就是false 后面不运算
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);


        //遇见true 就是true 后面不运算
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        int b = 10;

        System.out.println(false & b++ > 8);
        System.out.println(b);
        System.out.println(false && b++ > 8);
        System.out.println(b);
    }
}
