package com.ljw4dakeai.jinjieban.chapter03.HomeWorkCode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

/**
 * @author ZJH
 */
public class WorkFour {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你的生日");
        Duration days = Duration.between(
                new SimpleDateFormat("yyyy年MM月dd日")
                        .parse(new Scanner(System.in)
                                .nextLine()
                        )
                        .toInstant()
                ,Instant.now()
        );
        System.out.println("你离出生已经" + days.toDays() + "天啦");
        System.out.println("你离出生已经" + days.toHours() + "小时啦");
    }
}
