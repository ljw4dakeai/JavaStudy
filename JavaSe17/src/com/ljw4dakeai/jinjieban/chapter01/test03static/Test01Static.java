package com.ljw4dakeai.jinjieban.chapter01.test03static;

/**
 * @author ZJH
 * @info
 * static  修饰 静态属性 和静态方法
 * 1、随着类的加载而加载,优先于对象的
 * 2、类名.方法 类名.成员调用 （强行推荐使用 类.变量调用!）
 * 3、static修饰的变量 可以使用对象.方法调用但是不推荐使用 (没有意义,并且多此一举!)
 */
public class Test01Static {

    public static void main(String[] args) {
        System.out.println(Student.schoolName);
        //static 可以使用对象.方法调用但是不推荐使用 (没有意义,并且多此一举!)
        System.out.println(new Student().schoolName);
    }
}

class Student {
    public static String schoolName = "黑马程序员";
}
