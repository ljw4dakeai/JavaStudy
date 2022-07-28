package com.ljw4dakeai.jinjieban.chapter03.test02innerclass.testpackage01;

/**
 * @author ZJH
 * <p>
 *定义格式
 * <p>
 * 外部类.内部类 变量名 = new 外部类().new 内部类();
 */
public class Test01TestInnerClass {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
