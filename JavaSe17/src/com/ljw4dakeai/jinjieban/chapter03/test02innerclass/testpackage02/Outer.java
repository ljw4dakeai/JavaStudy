package com.ljw4dakeai.jinjieban.chapter03.test02innerclass.testpackage02;

/**
 * @author ZJH
 */
public class Outer {
    public static class Inner {
        public void show() {
            System.out.println("这是一个静态内部类非静态方法!");
        }

        public static void staticShow() {
            System.out.println("这是一个静态内部类非静态方法!");
        }
    }

    public static void method() {
        //本类中访问内部内直接用 不需要引用外部类 创建!
        Inner inner = new Inner();
        inner.show();

        Inner.staticShow();
    }
}
