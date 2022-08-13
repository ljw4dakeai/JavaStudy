package com.ljw4dakeai.jinjieban.chapter13.test05reflectmethod.testpackage01;

import com.ljw4dakeai.jinjieban.chapter13.test04reflectfield.testpackage01.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ZJH
 */
public class Test01TestGetMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> aClass = Class.forName("com.ljw4dakeai.jinjieban.chapter13.test05reflectmethod.testpackage01.Dog");
        getMethod(aClass);


    }

    private static void getMethod(Class<?> aClass) throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取成员方法列表(包含父类)
        System.out.println("获取成员方法列表(包含父类)");
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        //获取成员方法列表(不包含父类)
        System.out.println("获取成员方法列表(不包含父类)");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }


        //获取无参数无返回值公有方法
        System.out.println("获取无参数无返回值公有方法");
        Method run = aClass.getMethod("run");
        System.out.println(run);

        //获取无参无返回的私有方法
        System.out.println("获取无参无返回的私有方法");
        Method eat = aClass.getDeclaredMethod("eat");
        eat.setAccessible(true);
        System.out.println(eat);

        //获取有参又返回的私有方法
        System.out.println("获取有参又返回的私有方法");
        Method eatWithArgs = aClass.getDeclaredMethod("eat", String.class);
        eatWithArgs.setAccessible(true);
        System.out.println(eatWithArgs);


        //通过反射构造一个对象
        Dog dog = (Dog) aClass.getConstructor().newInstance();

        System.out.println("无参数无返回值公有方法运行");
        run.invoke(dog);


        System.out.println("无参数无返回值私有方法运行");
        eat.invoke(dog);

        System.out.println("有参数有返回值私有方法运行");
        String result =(String) eatWithArgs.invoke(dog, "狗粮");
        System.out.println(result);
    }
}
