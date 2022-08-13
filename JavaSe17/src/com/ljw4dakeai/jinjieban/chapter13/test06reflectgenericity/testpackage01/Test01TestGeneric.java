package com.ljw4dakeai.jinjieban.chapter13.test06reflectgenericity.testpackage01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author ZJH
 * @info
 * 泛型只在编译阶段有限, 运行阶段无效
 */
public class Test01TestGeneric {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("word");
        strings.add("你好");
        strings.add("世界");

        Method add = strings.getClass().getMethod("add", Object.class);
        add.invoke(strings, "大帅哥");
        add.invoke(strings, 100);
        add.invoke(strings, 100.26);
        add.invoke(strings, true);
        add.invoke(strings, 'c');

        System.out.println(strings);

    }
}
