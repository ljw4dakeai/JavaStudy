package com.ljw4dakeai.jinjieban.chapter07.test03exception.testpackage01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author ZJH
 * @info 解决编译时异常
 *
 * 遇到编译时异常可以抛出给下一个调用者
 * 也可以使用 try()  catch(){} 处理
 */
public class Test06TestDisposeExceptionCompiling {
    public static void main(String[] args) throws ParseException /*第二种方法 抛出给下一个调用者*/{
//        第一种方法 使用try catch解决
//        try {
//            System.out.println("请输入你的生日!");
//            System.out.println(func(new Scanner(System.in).nextLine()));
//        } catch (ParseException e) {
//            System.out.println("输入错误,请重新输入");
//        }

        System.out.println(func(new Scanner(System.in).nextLine()));
    }

    /**
     * 给定生日字符串, 返回对应的日期对象
     * @param birthday 用户传进来的生日字符串
     * @return 用户生日对应的Date对象
     * @throws ParseException 转换异常
     */
    public static Date func(String birthday) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return  simpleDateFormat.parse(birthday);
    }
}
