package com.ljw4dakeai.jichuban.Practice720;

import java.util.Scanner;

/**
 * @author ZJH
 * @info *     我国手机号码都是11位的，现在需要定义一个方法，方法名称为checkPhone，方法内需要实现判断手机号码是否合法。
 * *     规定：
 * *       1) 手机号码长度必须为11位数字;
 * *     2) 手机号码第一位必须要是1;
 * *   键盘录入一个手机号码，在main方法中调用checkPhone方法，如果手机号符合要求，则输出手机号码的后四位。如果不符合要求，则提示手机号码错误。
 */
public class WorkThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的手机号！");
            String phoneNumber = scanner.nextLine();
            String number = checkPhone(phoneNumber);
            if (number == null) {
                System.out.println("手机号输入错误,请重新输入!");

            } else {
                System.out.println("手机号的后面四位是 :  " + number);
                break;
            }
        }
    }

    public static String checkPhone(String phoneNumber) {
        char[] chars = phoneNumber.toCharArray();
        char firstNum = '1';
        if (chars[0] == firstNum && !checkPhoneChar(chars)) {
            return new String(chars).substring(chars.length - 4, 11);
        } else {
            return null;
        }
    }

    public static boolean checkPhoneChar(char[] chars) {
        boolean flag = false;
        for (char aChar : chars) {
            if (aChar < '0' || aChar > '9' || chars.length != 11) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}
