package com.ljw4dakeai.JiChuBan.Chapter10;

import java.util.Scanner;

/**
 * @author ZJH
 * @info String 类中CharAt的使用
 */
public class Test05StringCharAtAndToCharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串!");
        String strings = scanner.nextLine();
        forEach(strings);
        forEach_(strings);
    }

    private static void forEach_(String strings) {
        for(char c : strings.toCharArray()){
            System.out.println(c);
        }
    }

    private static void forEach(String strings) {
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(strings.charAt(i));
        }
    }
}
