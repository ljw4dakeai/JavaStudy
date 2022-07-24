package com.ljw4dakeai.jichuban.Chapter03;

/**
 * @author ZJH
 * 强制转化 尽量不要使用强制类型转换
 */
public class Test02QiangZhiTrans {
    public static void main(String[] args) {
        int i = 300;
        System.out.println(i);
        byte b = (byte) i;
        System.out.println(b);


        byte a = 3;
        byte c = 4;
        int d = a + c;
//error byte d = a + c;
// byte d = 3 + 4; 常量计算, 是先计算 再赋值
        System.out.println(d);


    }
}
