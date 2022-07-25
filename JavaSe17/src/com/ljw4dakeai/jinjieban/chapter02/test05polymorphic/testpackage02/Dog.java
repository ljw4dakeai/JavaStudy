package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage02;

/**
 * @author ZJH
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("小狗吃骨头!");
    }

    public void lookHome(){
        System.out.println("小狗在看家!");
    }
}
