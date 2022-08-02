package com.ljw4dakeai.jinjieban.chapter07.test03exception.testpackage01;

import java.util.ArrayList;

/**
 * @author ZJH
 * @info
 * 在调用一个方法的时候, 方法底层会对用户传递的数据进行合法性校验
 *  如果校验不合法,底层就会通过throw new 关键字产生一个异常对象, 并且把异常对象抛出给调用者
 *
 *  调用者收到这个异常对象之后, 最终会吧这个异常对象抛给JVM
 *
 *  java虚拟机在收到异常之后,就会把异常打印输出, 同时终止程序执行1
 */
public class Test04TestExceptionCreate {
    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("aaa");
//        strings.add("aab");
//        strings.add("aac");
//        strings.get(1000);

        sale(8);
    }

    /**
     *  买东西的方法
     * @param money 传递进来的面值
     * @throws IllegalArgumentException , 在面值不是5或者10的时候
     */
    public static void sale(int money){
        if(money !=5 && money != 10){
            throw new IllegalArgumentException(money + "面值不合法!");
        }else {
            System.out.println("恭喜你购买成功!");
        }
    }

}
