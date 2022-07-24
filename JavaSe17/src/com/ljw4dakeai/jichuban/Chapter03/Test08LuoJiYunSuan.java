package com.ljw4dakeai.jichuban.Chapter03;

/**
 * @author ZJH
 * 逻辑运算符
 */
public class Test08LuoJiYunSuan {
    public static void main(String[] args) {
        //并且的意思  全部成立才成立 只要有不成立就不成立 遇false则为false(and)
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);
        //或者的意思 有一个成立就成立, 全部不成立才不成立,遇true 则true(or)
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);

        System.out.println(!false);
        System.out.println(!true);
        System.out.println(!!false);

        //相同的就为false ,不一样就为true
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);




    }
}
