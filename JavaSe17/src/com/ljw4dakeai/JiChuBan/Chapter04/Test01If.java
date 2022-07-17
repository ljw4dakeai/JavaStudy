package com.ljw4dakeai.JiChuBan.Chapter04;

import java.util.Scanner;

/**
 * @author ZJH
 */
public class Test01If {

    public static void main(String[] args) {
        System.out.println("请输入你的年龄:");
        int age = new Scanner(System.in).nextInt();
/*        //三元运算符实现
          //System.out.println(age > 18 ? "可以去网吧" : "不可以去网吧");*/

        if (age < 0 || age >= 100) {
            System.out.println("请输入正确的年龄");
        } else {
            if (age > 18) {
                System.out.println("可以去网吧!");
            } else {
                System.out.println("不可以去网吧!");
            }
        }
    }
}
