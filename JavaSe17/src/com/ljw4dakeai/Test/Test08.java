package com.ljw4dakeai.Test;

import java.util.Scanner;

/**
 * @author ZJH
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入今天是周几!");
            String day = scanner.nextLine();
            if (!day.equals("退出")) {
                switch (day) {
                    case "周一":
                        System.out.println("今天的计划是跑步!");
                        break;
                    case "周二":
                        System.out.println("今天的计划是跳绳!");
                        break;
                    case "周三":
                        System.out.println("今天的计划是游泳!");
                        break;
                    case "周四":
                        System.out.println("今天的计划是健身!");
                        break;
                    case "周五":
                        System.out.println("今天的计划是划船!");
                        break;
                    case "周六":
                        System.out.println("今天的计划是瑜伽!");
                        break;
                    case "周日":
                        System.out.println("今天的计划是摆烂!");
                        break;
                    default:
                        System.out.println("你输入的日期是错误的!");
                        break;
                }

                switch (day) {
                    case "周一" -> System.out.println("今天的计划是跑步!");
                    case "周二" -> System.out.println("今天的计划是跳绳!");
                    case "周三" -> System.out.println("今天的计划是游泳!");
                    case "周四" -> System.out.println("今天的计划是健身!");
                    case "周五" -> System.out.println("今天的计划是划船!");
                    case "周六" -> System.out.println("今天的计划是瑜伽!");
                    case "周日" -> System.out.println("今天的计划是摆烂!");
                    default -> System.out.println("你输入的日期是错误的!");
                }
            } else {
                break;
            }
        }

        loop:
        while (true) {
            System.out.println("请输入今天是周几!");
            String day = scanner.nextLine();
            if (!"退出".equals(day)) {
                switch (day) {
                    case "周一" -> System.out.println("今天的计划是跑步!");
                    case "周二" -> System.out.println("今天的计划是跳绳!");
                    case "周三" -> System.out.println("今天的计划是游泳!");
                    case "周四" -> System.out.println("今天的计划是健身!");
                    case "周五" -> System.out.println("今天的计划是划船!");
                    case "周六" -> System.out.println("今天的计划是瑜伽!");
                    case "周日" -> System.out.println("今天的计划是摆烂!");
                    default -> {
                        System.out.println("你输入的日期是错误的!");
                        break loop;
                    }
                }
            } else {
                break;
            }
        }
    }
}
