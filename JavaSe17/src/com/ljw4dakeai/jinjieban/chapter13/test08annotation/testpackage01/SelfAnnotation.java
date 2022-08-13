package com.ljw4dakeai.jinjieban.chapter13.test08annotation.testpackage01;

/**
 * @author ZJH
 * @info 注解类中可以写属性
 *
 * 元注解 : 给自定义的注解加上一些限定信息!
 *        target : 限定注解的使用位置
 *              ElementType.METHOD 可以使用过在方法上
 *              ElementType.Type 可以使用过在类上
 *              ElementType.FIELD 可以使用过在成员变量上
 *        Retention: 表示注解的生命周期
 *              Retention.SOURCE 注解在源代码有效
 *              Retention.ClASS 注解在字节码有效
 *              Retention.RUNTIME 注解在运行阶段有效
 */
public @interface SelfAnnotation {

    public String name() default "邹家豪";

    int age() default 20;


    String value();

    //如果没有给value 赋值,  那么给value 复制的时候可以不用写value
}
