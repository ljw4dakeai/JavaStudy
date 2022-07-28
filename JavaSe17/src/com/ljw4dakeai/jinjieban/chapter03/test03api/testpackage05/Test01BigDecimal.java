package com.ljw4dakeai.jinjieban.chapter03.test03api.testpackage05;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author ZJH
 */
public class Test01BigDecimal {
    public static void main(String[] args) {
        //参与运算的数据都需要封装成BigDecimal对象

        BigDecimal bigDecimalOne = BigDecimal.valueOf(0.1);
        BigDecimal bigDecimalTwo = BigDecimal.valueOf(0.9);

        //加法add
        System.out.println(bigDecimalOne.add(bigDecimalTwo));
        //减法subtract
        System.out.println(bigDecimalOne.subtract(bigDecimalTwo));
        //乘法multiply
        System.out.println(bigDecimalOne.multiply(bigDecimalTwo));
        //除法
        System.out.println(bigDecimalTwo.divide(bigDecimalOne));



        //计算10 除以 3 Non-terminating decimal expansion; no exact representable decimal result.
        BigDecimal bigDecimalThree = BigDecimal.valueOf(10);
        BigDecimal bigDecimalFour = BigDecimal.valueOf(3);
        //保留两位 UP -> 不管满不满5都进1
        System.out.println(bigDecimalThree.divide(bigDecimalFour, 2, RoundingMode.UP));
        //保留两位 UP -> 不管满不满5都舍弃
        System.out.println(bigDecimalThree.divide(bigDecimalFour, 2, RoundingMode.DOWN));
        //保留两位 -> 四舍五入法
        System.out.println(bigDecimalThree.divide(bigDecimalFour, 2, RoundingMode.HALF_UP));
    }
}

