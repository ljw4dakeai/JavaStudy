package com.ljw4dakeai.jinjieban.chapter04.test02calendar.testpackage01;

import java.util.Calendar;

/**
 * @author ZJH
 */
public class Test01TestCalendar {
    public static void main(String[] args) {
        //获取calendar 子类对象
        Calendar instance = Calendar.getInstance();

        System.out.println(instance);
        //设置年月日
        instance.set(Calendar.YEAR, 2001);
        //月份是从0开始的(  JANUARY which is 0)
        instance.set(Calendar.MONTH, 10);
        //first day of the month has value 1
        instance.set(Calendar.DAY_OF_MONTH, 22);


        //年月日的加减

        instance.add(Calendar.DAY_OF_MONTH, -2);


        //获取年月日
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH) + 1;
        int dayOfMonth = instance.get(Calendar.DAY_OF_MONTH) ;
        System.out.println("birthday : " + year + "年" + month + "月" + dayOfMonth + "日");


        //获取日期时间是周几
        //星期中的第一天是星期日
        //星期日, 星期一,星期二,星期三,星期四,星期五,星期六
        //1           2          3         4          5         6          7
        int dayOfWeek = instance.get(Calendar.DAY_OF_WEEK);
        String[] weeks = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        System.out.println(weeks[dayOfWeek]);

    }
}
