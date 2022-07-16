package com.ljw4dakeai.Chapter03;

import java.util.Scanner;

/**
 * @author ZJH
 */
public class Test05SelfAdd {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        i += 1;
        System.out.println(i);
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        //单独使用 ++ 在前和在后没有区别

        int j = i++;
        System.out.println(j);
        System.out.println(i);

        j = ++i;
        System.out.println(j);
        System.out.println(i);

        //口诀
        //      ++ 在前  先++ 再参与运算
        //      ++ 在后 先参与运算再 ++
        //      ++ 在前 移动到上一行
        //      ++ 在后 移动到下一行

        int x = 100;
        System.out.println(i++);
        //100
        System.out.println(++i);
        //102





        i -= 1;
        System.out.println(i);
        i--;
        System.out.println(i);
        --i;
        System.out.println(i);

    }
}
