package com.ljw4dakeai.jinjieban.practice.practice0802;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.TimerTask;

/**
 * @author ZJH
 * @info 计算现在距离今年大年初一（2023年1月22日0点0分0秒）还有多少天，多少小时，多少分钟，多少秒？
 */
public class PracticeTwo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日HH点mm分ss秒");
        Instant yearDate = simpleDateFormat.parse("2023年1月22日0点0分0秒").toInstant();
        long seconds = Duration.between(date.toInstant(), yearDate).toSeconds();
        long minutes = Duration.between(date.toInstant(), yearDate).toMinutes();
        long hours = Duration.between(date.toInstant(), yearDate).toHours();
        long days = Duration.between(date.toInstant(), yearDate).toDays();




        long nowTime = date.getTime();
        long yearTime =  simpleDateFormat.parse("2023年1月22日0点0分0秒").getTime();

        long aSeconds = (yearTime - nowTime) / 1000L;
        long aMinutes = (yearTime - nowTime) / (1000L * 60);
        long aHours = (yearTime - nowTime) / (1000L * 60 * 60);
        long aDays = (yearTime - nowTime) / (1000L * 60 * 60 *24);




        System.out.println(
                "当前时间是" + simpleDateFormat.format(date.getTime()) + "\n" +
                        "距离过年还有" + days + "天" + "\n" +
                        "距离过年还有" + hours + "时" + "\n" +
                        "距离过年还有" + minutes + "分" + "\n" +
                        "距离过年还有" + seconds + "秒"
        );

        System.out.println("-------------------------------------------------------");

        System.out.println(
                "当前时间是" + simpleDateFormat.format(nowTime)+ "\n" +
                        "距离过年还有" +aDays + "天" + "\n" +
                        "距离过年还有" + aHours + "时" + "\n" +
                        "距离过年还有" + aMinutes + "分" + "\n" +
                        "距离过年还有" + aSeconds + "秒"
        );
    }
}
