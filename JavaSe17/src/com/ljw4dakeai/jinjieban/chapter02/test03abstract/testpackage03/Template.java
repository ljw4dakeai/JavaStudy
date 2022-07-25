package com.ljw4dakeai.jinjieban.chapter02.test03abstract.testpackage03;

/**
 * @author ZJH
 * @info 模本类
 * 开头固定,结尾固定, 正文不是一样的
 * 模版方法模式的实现
 */
public abstract class Template {
    public void began(){
        System.out.println("这是作文的开头!");
    }
    public abstract void body();

    public void end(){
        System.out.println("这是作文的结尾!");
    }

    //规定执行顺序  防止子类修改设置为final
    public final void write(){
        began();
        body();
        end();
    }
}
