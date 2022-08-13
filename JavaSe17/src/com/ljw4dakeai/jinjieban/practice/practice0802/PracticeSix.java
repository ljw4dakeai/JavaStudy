package com.ljw4dakeai.jinjieban.practice.practice0802;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZJH
 * @info
 * 写一个工具类DateUtils，有一个把Date转换为String的方法，
 * 有一个把String转换为Date的方法，
 * 转换格式都是yyyy-MM-dd HH:mm:ss，并在测试类中测试。
 */
public class PracticeSix {
    public static void main(String[] args) throws ParseException {
        System.out.println(DateUtils.dateFormatString(new Date(System.currentTimeMillis())));
        System.out.println(DateUtils.stringParseDate("2001-11-20 06:20:20"));
    }

}

class DateUtils{
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static String dateFormatString(Date date){
        return SIMPLE_DATE_FORMAT.format(date);
    }

    public static Date stringParseDate(String time) throws ParseException {
        return SIMPLE_DATE_FORMAT.parse(time);
    }
}
