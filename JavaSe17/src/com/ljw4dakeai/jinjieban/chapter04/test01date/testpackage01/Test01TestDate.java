package com.ljw4dakeai.jinjieban.chapter04.test01date.testpackage01;

import java.util.Date;

/**
 * @author ZJH
 * @info 当前时间往后一个小时26分钟后的时间
 */
public class Test01TestDate {
    public static void main(String[] args) {
        long nowSystemTime = System.currentTimeMillis();
        //获取当前时间
        Date date = new Date();
        //获取的当前时间的ms值
        long nowTime = date.getTime();
        //1小时26分钟对应的ms值
        long ms = 86L * 60 * 1000;
        //相加后的时间
        long addTime = nowTime + ms;
        //设置相加后的时间
        date.setTime(addTime);
        System.out.println(date);
    }
}
