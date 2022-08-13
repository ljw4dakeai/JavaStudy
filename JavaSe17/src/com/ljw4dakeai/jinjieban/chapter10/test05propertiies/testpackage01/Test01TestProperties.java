package com.ljw4dakeai.jinjieban.chapter10.test05propertiies.testpackage01;

import java.util.Properties;
/**
 * @author ZJH
 * properties是一个map集合的子类`, 是一个双列集合, 所有Map的方法他都可以使用
 * properties在添加键和值的时候, [规范要求键值对都是String], 使用Map的put方法并不好,
 * 所以使用自己的setProperty()方法
 */
public class Test01TestProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();

        //设置键值对
        properties.setProperty("你好", "世界");
        properties.setProperty("Hello", "Word");

        //通过键获取值
        System.out.println(properties.getProperty("你好"));

        //拿到所有的键集合
        System.out.println(properties.stringPropertyNames());

        //遍历properties集合
        properties.stringPropertyNames().forEach(key -> {
            System.out.println(key + " : " + properties.getProperty(key));
        });

        properties.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

    }
}
