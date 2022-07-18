package com.ljw4dakeai.JiChuBan.Test;


import java.util.Scanner;

/**
 * @author ZJH
 * @info 回文串的判定
 */
public class Test22 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串!");
        String string = new Scanner(System.in).nextLine();
        String reverseString = new StringBuilder(string).reverse().toString();
        //String不可以和StringBuilder比较!
        System.out.println(string.equals(reverseString) ? "是回文串!" : "不是回文串!");
    }
}
