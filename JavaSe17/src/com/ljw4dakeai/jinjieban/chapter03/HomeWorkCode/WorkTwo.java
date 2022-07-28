package com.ljw4dakeai.jinjieban.chapter03.HomeWorkCode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author ZJH
 */
public class WorkTwo {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你的生日");
        System.out.println(new SimpleDateFormat("yyyy年MM月dd日").parse(new Scanner(System.in).nextLine()));
    }
}
