package com.ljw4dakeai.jinjieban.chapter02.test02modifyer.testpackage01;

/**
 * @author ZJH
 */
public class Feather  extends GrandFather{
    @Override
    protected void protectedModify() {
        super.protectedModify();
    }

    @Override
    public void publicModify() {
        super.publicModify();
    }

    @Override
    void defaultModify() {
        super.defaultModify();
    }

    //无法访问private
}
