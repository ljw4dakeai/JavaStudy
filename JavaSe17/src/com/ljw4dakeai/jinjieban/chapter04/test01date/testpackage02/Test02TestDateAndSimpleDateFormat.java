package com.ljw4dakeai.jinjieban.chapter04.test01date.testpackage02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZJH
 */
public class Test02TestDateAndSimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        Date date = simpleDateFormat.parse("2021年08月06日11时10分20秒");
        date.setTime(date.getTime() + 62 * 60 *60 *1000L);
        System.out.println(simpleDateFormat.format(date.getTime()));
    }
}
