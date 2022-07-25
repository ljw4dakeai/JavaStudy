package com.ljw4dakeai.jinjieban.chapter02.test02modifyer.testpackage01;

/**
 * @author ZJH
 */
public class GrandFather {
    private void privateModify(){
        System.out.println("private : 当前类访问");
    }

    public void publicModify(){
        System.out.println("public : 所有地方都能访问");
    }

    void defaultModify(){
        System.out.println("default : 当前包的所有地方");
    }

    protected void protectedModify(){
        System.out.println("protect : 其他包的子类可以访问");
    }
}
