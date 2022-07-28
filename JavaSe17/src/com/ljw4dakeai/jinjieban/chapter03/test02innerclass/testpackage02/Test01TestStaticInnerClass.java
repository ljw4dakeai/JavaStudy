package com.ljw4dakeai.jinjieban.chapter03.test02innerclass.testpackage02;

/**
 * @author ZJH
 * <p>
 * 定义格式
 * <p>
 * 外部类.内部类 变量名 = new 外部类.内部类();
 */
public class Test01TestStaticInnerClass {
    public static void main(String[] args) {

        Outer.Inner inner = new Outer.Inner();
        inner.show();

        Outer.Inner.staticShow();
    }
}
