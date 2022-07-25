package com.ljw4dakeai.jinjieban.chapter02.test02modifyer.testpackage01;

/**
 * @author ZJH
 */
public class Test01TestModifyer {
    public static void main(String[] args) {
        //当前包中访问!
        GrandFather grandFather = new GrandFather();
        grandFather.publicModify();
        grandFather.protectedModify();
        grandFather.defaultModify();
        //无法访问
        //grandFather.privateModify();
    }
}
