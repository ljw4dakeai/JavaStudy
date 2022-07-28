package com.ljw4dakeai.jinjieban.chapter03.test03api.testpackage04;

/**
 * @author ZJH
 * @info
 * <p>
 *     装箱 : 把基本类型转化为引用类型
 *     拆箱 : 把引用类型转化为基本类型
 */
public class Test01Binning {
    public static void main(String[] args) {
        //自动装箱
        Integer integerOne = 10;

        //自动装箱
        int anIneOne = integerOne;

        //手动装箱
        Integer integerTwo = Integer.valueOf(10);

        //手动拆箱
        int anIntTwo = integerTwo.intValue();

        //如果 被包装的数据在-128和127不会创建新对象,如果大于或者小于 的都会出创建新对象+
    }
}
