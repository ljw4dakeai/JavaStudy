package com.ljw4dakeai.jinjieban.chapter03.test02innerclass.testpackage04;

/**
 * @author ZJH
 */
public class Outer {
    private int num = 100;

    public  class Inner {
        int num =110;
        public void show() {
            int num = 90;
            System.out.println(num);//90
            System.out.println(Inner.this.num);//110
            System.out.println(Outer.this.num);//100
        }
    }

}
