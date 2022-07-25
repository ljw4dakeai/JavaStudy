package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage04;

/**
 * @author ZJH
 * @info java学生类
 */
public class JavaStudent extends Student implements JavaScriptCourse {

    public JavaStudent(String name, int num) {
        super(name, num);
    }

    public JavaStudent() {
    }

    @Override
    public void study() {
        System.out.println("学生" + getName() + "学习Java课程!");
    }

    @Override
    public void studyJs() {
        System.out.println("学生" + getName() + "学习JavaScript课程!");
    }
}
