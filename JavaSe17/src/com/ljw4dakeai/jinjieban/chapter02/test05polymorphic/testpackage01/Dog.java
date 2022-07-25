package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage01;

public class Dog extends Animal implements Sleep{
    @Override
    public void eat() {
        System.out.println("小狗在吃骨头!");
    }

    @Override
    public void sleep() {
        System.out.println("小狗在睡觉!");
    }
}
