package com.ljw4dakeai.jinjieban.chapter03.test03api.testpackage03;

/**
 * @author ZJH
 */
public class Test01Integer {
    public static void main(String[] args) {
        Integer integer = 10;
        integer ++ ;
        //整形转化为String
        //方式1
        String integerToString = Integer.toString(integer);
        System.out.println(integer);
        System.out.println(integer.getClass().getSimpleName());
        System.out.println("---------------------------------------------");
        System.out.println(integerToString);
        System.out.println(integerToString.getClass().getSimpleName());
        System.out.println("---------------------------------------------");
        //方式二
        String integerValueOfString = String.valueOf(integer);
        System.out.println(integerValueOfString);
        System.out.println(integerValueOfString.getClass().getSimpleName());
        System.out.println("---------------------------------------------");

        //String转化为整型
        Integer integerToStringParseInt =Integer.parseInt(integerToString);
        System.out.println(integerToStringParseInt);
        System.out.println(integerToStringParseInt.getClass().getSimpleName());
        System.out.println("---------------------------------------------");

        //String转化为Float
        Float integerToStringParseFloat =Float.parseFloat(integerToString);
        System.out.println(integerToStringParseFloat);
        System.out.println(integerToStringParseFloat.getClass().getSimpleName());

    }
}
