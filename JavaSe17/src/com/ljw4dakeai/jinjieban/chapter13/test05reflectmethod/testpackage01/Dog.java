package com.ljw4dakeai.jinjieban.chapter13.test05reflectmethod.testpackage01;

/**
 * @author ZJH
 */
public class Dog {
    private String name;

    public void run() {
        System.out.println("小狗狗跑得飞快!");
    }


    private void eat() {
        System.out.println("小狗狗吃小骨头!");
    }

    private String eat(String foodName) {
        System.out.println("小狗狗吃" + foodName);
        return "小狗狗吃" + foodName + "非常开心";
    }

    public static void iAddress(){
        System.out.println("小狗狗住在英国皇家学院!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
