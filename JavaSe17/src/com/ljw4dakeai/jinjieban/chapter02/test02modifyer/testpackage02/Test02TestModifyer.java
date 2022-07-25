package com.ljw4dakeai.jinjieban.chapter02.test02modifyer.testpackage02;

import com.ljw4dakeai.jinjieban.chapter02.test02modifyer.testpackage01.GrandFather;

/**
 * @author ZJH
 */
public class Test02TestModifyer {
    public static void main(String[] args) {
        //其他包中访问!
        GrandFather grandFather = new GrandFather();
        grandFather.publicModify();
        //无法访问!
        //grandFather.protectedModify();
        //grandFather.defaultModify();
        //grandFather.privateModify();
    }
}
