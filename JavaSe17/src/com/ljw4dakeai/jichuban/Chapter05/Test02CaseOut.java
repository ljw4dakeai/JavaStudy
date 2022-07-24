package com.ljw4dakeai.jichuban.Chapter05;

import java.util.Scanner;

/**
 * @author ZJH
 * @info case 穿透 可以合并多个相同的case
 */
public class Test02CaseOut {
    public static void main(String[] args) {
        System.out.println("请输入今天是周几!");
        String day = new Scanner(System.in).nextLine();

        switch (day) {
            case "周一":
                System.out.println("今天是工作日!");
                break;
            case "周二":
                System.out.println("今天是工作日!");
                break;
            case "周三":
                System.out.println("今天是工作日!");
                break;
            case "周四":
                System.out.println("今天是工作日!");
                break;
            case "周五":
                System.out.println("今天是工作日!");
                break;
            case "周六":
                System.out.println("今天是休息日!");
                break;
            case "周日":
                System.out.println("今天是休息日!");
                break;
            default:
                System.out.println("输入有误!");
                break;
        }


        //case 穿透
        switch (day) {
            case "周一":
            case "周二":
            case "周三":
            case "周四":
            case "周五":
                System.out.println("今天是工作日!");
                break;
            case "周六":
            case "周日":
                System.out.println("今天是休息日!");
                break;
            default:
                System.out.println("输入有误!");
                break;
        }


        switch (day) {
            case "周一", "周二", "周三", "周四", "周五" -> System.out.println("今天是工作日!");
            case "周六", "周日" -> System.out.println("今天是休息日!");
            default -> System.out.println("输入有误!");
        }


    }
}
