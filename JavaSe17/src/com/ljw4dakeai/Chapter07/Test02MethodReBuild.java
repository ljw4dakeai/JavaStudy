package com.ljw4dakeai.Chapter07;

/**
 * @author ZJH
 * @info 方法重载
 */
public class Test02MethodReBuild {
    public static void main(String[] args) {


    }

    //方法不允许重复定义
    public static void sing() {
        System.out.println("sing");
    }

    /*public static void sing(){
       System.out.println("sing");
     }*/

    /**
     * 允许方法重载
     * 只要能区分调用  方法就能重名
     * 方法重名,但是能区分调用,就是方法重载
     */
    public static void sing(int num) {
        System.out.println("sing" + num);
    }

    public static void sing(int num, String string) {

    }

    public static void sing(String string, int num) {

    }

}
