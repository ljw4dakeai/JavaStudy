package com.ljw4dakeai.jinjieban.chapter13.test04reflectfield.testpackage01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ZJH
 */
public class Test01TestGetField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> aClass = Class.forName("com.ljw4dakeai.jinjieban.chapter13.test04reflectfield.testpackage01.Student");
        getField(aClass);


    }

    private static void getField(Class<?> aClass) throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取成员变量列表(无法获取私有)
        System.out.println("获取成员变量列表(只能获取共有的)");
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        //获取成员变量列表
        System.out.println("获取成员变量列表(可以获取全部)");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        //获取单个成员变量
        //获取非私有的成员变量
        System.out.println("获取非私有的成员变量");
        Field country = aClass.getField("country");
        System.out.println(country);


        //获取任意成员变量
        System.out.println("获取任意成员变量");
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        System.out.println(name);

        Field age = aClass.getDeclaredField("age");
        age.setAccessible(true);
        System.out.println(age);


        //通过反射构造一个对象
        Constructor<?> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Student student = (Student) constructor.newInstance();

        //反射获取成员变量赋值
        name.set(student, "邹家豪");
        age.set(student, 20);
        System.out.println(student);

        //反射获取的成员变量获取值
        System.out.println(country.get(student));


    }
}
