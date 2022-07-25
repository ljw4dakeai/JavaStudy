package com.ljw4dakeai.jinjieban.chapter01.test03static;

/**
 * @author ZJH
 * @info
 * 静态方法 : 被static修饰的方法(类名调用 类.方法)
 * 实例方法 :没有被static修饰的方法(对象调用 对象.方法)
 */
public class Test04StaticImportant {
}

class Person {

    private String name = "邹家豪";
    private int age = 20;
    private static String country = "中国";

    //静态方法可以访问静态变量和静态方法, 不能访问实例方法,和实例变量
    public static void func1() {
        //System.out.println(name);
        //System.out.println(age); 不可访问
        //func2();
        func3();
        System.out.println(country);
    }


    //实例方法可以访问静态变量和静态方法,也能访问实例方法和实例变量
    public void func2() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(country);
        func1();
        func4();
    }


    //静态方法中不能有this关键字
    //静态方法随类的加载而加载,加载类的时候对象还不存在, this表示对象本身
    public static void func3() {
        //System.out.println(this.name);
    }

    //实例方法中有this关键字
    //静态方法随类的加载而加载,创建对象时静态方法早已加载, this表示对象本身
    public void func4() {
        System.out.println(this.name);
    }
}