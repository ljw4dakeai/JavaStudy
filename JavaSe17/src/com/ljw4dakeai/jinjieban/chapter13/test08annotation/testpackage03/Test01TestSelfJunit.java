package com.ljw4dakeai.jinjieban.chapter13.test08annotation.testpackage03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ZJH
 */
public class Test01TestSelfJunit {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.ljw4dakeai.jinjieban.chapter13.test08annotation.testpackage03.Test01TestSelfJunit");
        Object o = aClass.getConstructor().newInstance();
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(Start.class)){
                method.invoke(o);
            }
        }
    }

    @Start
    public void funcOne() {
        System.out.println("startOne");
    }

    public void funcTwo() {
        System.out.println("startTwo");
    }

    @Start
    public void funcThree() {
        System.out.println("startThree");
    }

    public void funcFour() {
        System.out.println("startFour");
    }

    @Start
    public void funcFive() {
        System.out.println("startFive");
    }
}
