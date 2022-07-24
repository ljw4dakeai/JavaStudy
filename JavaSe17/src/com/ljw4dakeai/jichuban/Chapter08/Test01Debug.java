package com.ljw4dakeai.jichuban.Chapter08;

/**
 * @author ZJH
 * @info debug的使用
 * 步入 一行的运行,如果遇到方法入方法 f7
 * 步过, 一行的运行,遇见方法直接运行方法结束 f8
 * 恢复程序, 有断点 直接到下一个断点,没有就结束 f9
 */
public class Test01Debug {
    public static void main(String[] args) {

        System.out.println("你好!");
        System.out.println("你好!");
        System.out.println("你好!");
        System.out.println("你好!");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        int sum=0;
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                i+=sum;
            }
        }
        System.out.println(sum);

    }
}
