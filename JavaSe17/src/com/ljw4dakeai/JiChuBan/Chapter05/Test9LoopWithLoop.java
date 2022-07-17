package com.ljw4dakeai.JiChuBan.Chapter05;

/**
 * @author ZJH
 * @info 循环嵌套
 */
public class Test9LoopWithLoop {
    public static void main(String[] args) {

        loop:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 2) {
                    break loop;
                }
                System.out.println("i = " + i + "j = " + j);
            }
        }


        System.out.println("====================================");

        loop:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 2) {
                    continue loop;
                }
                System.out.println("i = " + i + "j = " + j);
            }
        }


    }
}
