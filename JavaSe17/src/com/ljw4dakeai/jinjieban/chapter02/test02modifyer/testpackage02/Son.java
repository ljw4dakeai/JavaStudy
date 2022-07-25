package com.ljw4dakeai.jinjieban.chapter02.test02modifyer.testpackage02;

import com.ljw4dakeai.jinjieban.chapter02.test02modifyer.testpackage01.GrandFather;

/**
 * @author ZJH
 */
public class Son extends GrandFather {
    @Override
    public void publicModify() {
        super.publicModify();
    }

    @Override
    protected void protectedModify() {
        super.protectedModify();
    }

    //无法访问default 和 private
}
