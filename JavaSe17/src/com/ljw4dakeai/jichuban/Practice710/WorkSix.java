package com.ljw4dakeai.jichuban.Practice710;

/**
 * @author ZJH
 * @info
 *  定义int类型的变量i,初始化值为5, 再定义double类型的变量d ,初始化值为3.14.,将变量i和变量d相加再赋值给另一个short类型的变量s.输出s的值.
 */
public class WorkSix {
    public static void main(String[] args) {
        int i = 5;
        double d = 3.14;
        short s = (short) ((short) i + d);
        System.out.println(s);

    }
}
