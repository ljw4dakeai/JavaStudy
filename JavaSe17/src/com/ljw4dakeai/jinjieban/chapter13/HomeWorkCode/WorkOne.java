package com.ljw4dakeai.jinjieban.chapter13.HomeWorkCode;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ZJH
 */
public class WorkOne {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.ljw4dakeai.jinjieban.chapter13.HomeWorkCode.UserOption");
        Object o = aClass.getConstructor().newInstance();
        for (Method method : aClass.getMethods()) {
            if (method.isAnnotationPresent(StartTest.class)) {
                method.invoke(o);
            }
        }
    }
}
