package com.ljw4dakeai.jinjieban.chapter02.test04interface.testpackage03;

/**
 * @author ZJH
 */
public interface Inter {
    public abstract void interOne(); //抽象方法 (必须重写)

    public default void interTwo(){
        System.out.println("这是接口的默认方法 jdk8以后");
    } //默认方法(可以重写, 也可以不重写)

    public static void interThree(){
        System.out.println("这是接口的静态方法 jdk8 以后");
    }//静态方法 接口名.方法 调用

    private void interFour(){
        System.out.println("这是接口的私有方法 jdk 9 以后");
    }//只能接口中使用
}
