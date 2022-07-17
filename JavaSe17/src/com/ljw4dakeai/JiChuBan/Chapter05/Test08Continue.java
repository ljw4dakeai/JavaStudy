package com.ljw4dakeai.JiChuBan.Chapter05;

/**
 * @author ZJH
 * @info continue实现
 */
public class Test08Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i == 4 || i == 13) {
                continue; //条件成立 , 跳过, 继续执行循环
            }
            System.out.println("当前楼层是第" + i + "层");
        }
    }
}
