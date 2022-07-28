package com.ljw4dakeai.jinjieban.chapter03.test02innerclass.testpackage03;

/**
 * @author ZJH
 */
public class Outer {
    public  void method() {
        class Inner {
            /*
            局部内部类 方法中可以使用
            */
            public void show() {
                System.out.println("这是一个局部内部类非静态方法!");
            }

            public static void staticShow() {
                System.out.println("这是一个局部内部类静态方法!");
            }
        }

        //本类中访问内部内直接用 不需要引用外部类 创建!
        Inner inner = new Inner();
        inner.show();
        Inner.staticShow();
    }
}
