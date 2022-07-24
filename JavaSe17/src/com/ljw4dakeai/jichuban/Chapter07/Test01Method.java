package com.ljw4dakeai.jichuban.Chapter07;

/**
 * @author ZJH
 * @info  方法的调用
 */
public class Test01Method {
    public static void main(String[] args) {

        sing();
        rap();

    }

    public static void sing(){
        System.out.println("唱!");
        dance();
        rap();
    }

    public static void dance(){
        System.out.println("跳");
        rap();
    }

    public static void rap(){
        System.out.println("你有freestyle吗?");
    }


}
