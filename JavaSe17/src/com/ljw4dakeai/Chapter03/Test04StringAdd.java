package com.ljw4dakeai.Chapter03;

/**
 * @author ZJH
 */
public class Test04StringAdd {
    public static void main(String[] args) {
        String chiMeiWangLiang = "魑魅魍魉";
        String wuQianQian = "吴签签";

        System.out.println(chiMeiWangLiang + wuQianQian);

        //字符串 + 不是算术运算法而是连接运算法

        System.out.println( 3 + 4 + "5" + 4 +3 );

        //7543
        System.out.println(3 + 4 + "5" + (4 + 3));
        //757
    }
}
