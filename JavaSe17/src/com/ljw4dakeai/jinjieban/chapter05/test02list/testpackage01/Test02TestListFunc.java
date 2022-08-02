package com.ljw4dakeai.jinjieban.chapter05.test02list.testpackage01;

import java.util.ArrayList;

/**
 * @author ZJH
 */
public class Test02TestListFunc {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("孙悟空");
        strings.add("猪八戒");
        strings.add("沙和尚");
        strings.add("小白龙");
        strings.add("小白龙");

        System.out.println(strings);


        strings.set(strings.size() - 1, "唐僧");
        strings.add(0, strings.remove(strings.size() - 1));
        System.out.println(strings);
    }
}
