package com.ljw4dakeai.jinjieban.chapter04.test05lambda.testpackage02;

import java.util.Arrays;

/**
 * @author ZJH
 */
@FunctionalInterface
public interface Swimming {
    /**
     * @param name 游泳方式
     */
    void swim(String name);


    static void method(Swimming swimming) {
        swimming.swim("仰泳");
    }

    public static void main(String[] args) {
        //标准格式
        method(new Swimming() {
            @Override
            public void swim(String name) {
                System.out.println("游泳姿势是" + name);
            }
        });

        //简化格式 省略数据类型
        method((name) -> {
                    System.out.println("游泳姿势是" + name);
                }
        );

        //当语句自由一条的时候 省略大括号
        method(( name) -> System.out.println("游泳姿势是" + name));

        //当参数自由一个的时候 省略小括号
        method(name -> System.out.println("游泳姿势是" + name));


        //方法引用
        method(System.out::println);

    }
}
