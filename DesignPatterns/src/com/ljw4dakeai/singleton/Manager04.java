package com.ljw4dakeai.singleton;

/**
 * @author ZJH
 * @info
 *  懒汉式 : 通过给线程加上锁实现线程安全
 *  但是速度会很慢
 */
public class Manager04 {
    private  Manager04(){}
    private static Manager04 INSTANCE;

    public static synchronized Manager04 getInstance(){
        if (INSTANCE == null){
            INSTANCE  = new Manager04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Manager04.getInstance().hashCode());
            }).start();
        }
    }




}
