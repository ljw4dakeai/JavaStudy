package com.ljw4dakeai.jinjieban.chapter04.HomeWorkCode;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.Scanner;

/**
 * @author ZJH
 * @info
 * - 键盘录入你的生日字符串 （如：”1998年08月08日“）
 * - 将生日字符串使用SimpleDateFormat解析为Date对象
 * - 计算当前日期距离生日那天有多少天？
 */
public class WorkThree {
    public static void main(String[] args) throws ParseException {
        //你的生日
        System.out.println("请输入你的生日！");
        Instant birthDay = new SimpleDateFormat("yyyy年MM月dd日")
                .parse(
                        new Scanner(System.in).nextLine())
                .toInstant();

        long duration = Duration.between(birthDay, Instant.now()).toDays();
        System.out.println(duration);

        System.out.println("----------------------------------------------");

        //other
        //生日
        System.out.println("请输入你的生日！");
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date parse = simpleDateFormat.parse(scanner.nextLine());
        System.out.println(date);
        System.out.println(parse);
        System.out.println("day = " + (date.getTime() - parse.getTime()) / (24 * 60 * 60 * 1000L));


    }

}
