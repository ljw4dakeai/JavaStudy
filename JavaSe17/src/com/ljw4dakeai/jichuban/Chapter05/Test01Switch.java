package com.ljw4dakeai.jichuban.Chapter05;

import java.util.Scanner;

/**
 * @author ZJH
 * @info switch 使用
 */
public class Test01Switch {
    public static void main(String[] args) {
        System.out.println("请输入一个数让我识别!");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                System.out.println("你输入的是1");
                break;
            case 2:
                System.out.println("你输入的是2");
                break;
            case 3:
                System.out.println("你输入的是3");
                break;
            case 4:
                System.out.println("你输入的是4");
                break;
            default:
                System.out.println("你输入的数不在我识别的范围内呢!");
                break;
        }


        switch (choice) {
            case 1 -> System.out.println("春天");
            case 2 -> System.out.println("夏天");
            case 3 -> System.out.println("秋天");
            case 4 -> System.out.println("冬天");
            default -> System.out.println("你输入的数不在我识别的范围内呢!");
        }


    }
}
