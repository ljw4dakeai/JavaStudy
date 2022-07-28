package com.ljw4dakeai.jinjieban.chapter03.test03api.testpackage03;

/**
 * @author ZJH
 */
public class Test02Double {
    public static void main(String[] args) {
        Double doubleValue = 3.14;

        //两种转换为String的方法
        String s =doubleValue +  "";
        System.out.println(s);
        System.out.println(s.getClass().getSimpleName());

        String doubleValueToString = doubleValue.toString();
        System.out.println(doubleValueToString);


        //字符串转化为Double
        Double doubleValueToStringParseDouble = Double.parseDouble(doubleValueToString);
        System.out.println(doubleValueToStringParseDouble);
        System.out.println(doubleValueToStringParseDouble.getClass().getSimpleName());
    }
}
