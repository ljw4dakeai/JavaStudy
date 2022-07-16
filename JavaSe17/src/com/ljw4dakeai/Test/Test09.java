package com.ljw4dakeai.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author ZJH
 * @info 数字爆炸游戏 (0-100)
 */
public class Test09 {
    public static void main(String[] args) {


        findNum();
        System.out.println("请输入是否继续游戏！");
        while (true){
            String continueYorN = new Scanner(System.in).nextLine();
            if ("是".equals(continueYorN)){
                findNum();
            }else {
                System.out.println("游戏结束！");
                break;
            }
        }

    }

    public static void findNum() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int i = random.nextInt(100);

        while (true) {
            System.out.println("请输入一个数字");
            int input = scanner.nextInt();
/*         System.out.println(input == i ? "猜中啦" : (input > i ? "猜大了" : "猜小了"));*/
            if (input == i){
                System.out.println("猜中啦!");
                break;
            }else if (input > i){
                System.out.println("猜大了!");
            }else {
                System.out.println("猜小了!");
            }
        }
    }
}
