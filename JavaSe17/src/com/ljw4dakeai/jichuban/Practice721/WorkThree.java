package com.ljw4dakeai.jichuban.Practice721;

import java.util.Scanner;

/**
 * @author ZJH
 * @info 我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。请定义方法判断用户输入的身份证号码是否合法，
 * 并在主方法中调用方法测试结果。规则为：号码为18位，不能以数字0开头，18位数必须是数字组成
 * 不满足条件,提示用户输入错误,请重新输入
 * 满足条件,截取身份证后6位数字
 */
public class WorkThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的身份证号码!");
            String idCard = scanner.nextLine();
            if (!judgeIdCard(idCard)) {
                printIdCard(idCard);
                break;
            } else {
                System.out.println("请重新输入!");

            }
        }

    }


    public static boolean judgeIdCard(String idCard) {
        char[] chars = idCard.toCharArray();
        boolean flag = false;
        if (chars[0] == '0' || chars.length != 18) {
            flag = true;
        } else {
            for (char aChar : chars) {
                if (aChar < '0' || aChar > '9') {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public static void printIdCard(String idCard) {
        System.out.println("身份证后面六位是 : " + idCard.substring(12, 18));
    }
}
