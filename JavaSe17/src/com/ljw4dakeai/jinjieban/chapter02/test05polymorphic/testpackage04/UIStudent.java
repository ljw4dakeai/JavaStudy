package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage04;

/**
 * @author ZJH
 * @info UI学生类
 */
public class UIStudent extends Student {
    public UIStudent(String name, int num) {
        super(name, num);
    }

    public UIStudent() {
    }

    @Override
    public void study() {
        System.out.println("学生" + getName() + "学习UI设计!");
    }
}
