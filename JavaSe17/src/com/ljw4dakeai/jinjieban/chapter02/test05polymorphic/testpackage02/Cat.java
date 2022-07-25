package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage02;

/**
 * @author ZJH
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("小猫吃鱼干!");
    }

    public void catchMouse(){
        System.out.println("小猫在抓老鼠!");
    }
}
