package com.ljw4dakeai.jichuban.Chapter02.HomeWorkCode;

import java.util.Scanner;

/**
 * @author ZJH
 */
public class WorkSix {
    public static void main(String[] args) {


        while(true){
            System.out.println("欢迎来到xxx管理系统");
            System.out.println("输入1 新增xx");
            System.out.println("输入2 删除xx");
            System.out.println("输入3 修改xx");
            System.out.println("输入4 查看xx");
            System.out.println("输入5 退出再见");
            System.out.println("=======================================================");
            System.out.println("请输入一个数");
            int i = new Scanner(System.in).nextInt();
            switch (i){
                case 1 :
                    System.out.println("1");
                    break;
                case 2 :
                    System.out.println(2);
                    break;
                case 3 :
                    System.out.println(3);
                    break;
                case 4 :
                    System.out.println(4);
                    break;
                case 5:
                    System.exit(1);
                default:
                    break;
            }
        }

    }
}
