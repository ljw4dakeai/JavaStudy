package com.ljw4dakeai.jichuban.Chapter07.HomeWorkCode;

/**
 * @author ZJH
 * @info
 * ### 训练提示
 * 1. 根据方法的功能描述，方法的参数应该接收一个double类型数据。
 * 2. 小数的绝对值也是double，所以返回值类型也是double类型。
 *
 * ### 操作步骤
 *
 * 1. 定义一个小数变量num。
 *
 * 2. 定义获取绝对值的方法，方法的参数是一个double类型，返回值类型是double。
 *
 * 3. 在方法内部使用if..else..判断。
 *
 *    3.1. 如果是负数则对负数取反并返回。
 *
 *    3.2. 如果不是负数则直接返回数字本身。
 *
 * 4. 在主方法中调用绝对值方法，传入参数num,并接受返回值。
 *
 * 5. 打印返回的结果。
 */
public class PracticeOne {
    public static void main(String[] args) {
        System.out.println(getAbs(-20));
    }
    public static double getAbs(double num){
        return num < 0 ? -num :num;
    }
}
