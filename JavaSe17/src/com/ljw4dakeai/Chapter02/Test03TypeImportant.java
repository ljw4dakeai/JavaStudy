package com.ljw4dakeai.Chapter02;

/**
 * @author ZJH
 * info : 变量定义的注意
 */
public class Test03TypeImportant {
    public static void main(String[] args) {
        //变量名不允许重复

        //一行允许定义多个同类型变量

        int a, b = 1020;
        int c = 100, d = 200;
        a = 20;

        int e;
        //变量的声明, 光声明不赋值是没办法使用的
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        //定义float 变量后面一定要叫上f 或者类型强转
        float f = (float) 10.4;
        float f_ = 10.4f;

        //定义long
        long l = 10000L;

        {
            //变量只在自己的代码块中 起作用
        }



        //java 中区分一行的依据是分好 ;


    }
}
