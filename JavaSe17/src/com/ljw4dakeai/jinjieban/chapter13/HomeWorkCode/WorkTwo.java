package com.ljw4dakeai.jinjieban.chapter13.HomeWorkCode;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author ZJH
 */
public class WorkTwo {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        method.invoke(object);
    }

    private static  Object object;

    private static  Method method;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter13/HomeWorkCode/config.properties"));
            Class<?> aClass = Class.forName(properties.getProperty("className"));
            object =aClass.getConstructor().newInstance();
            method = aClass.getMethod(properties.getProperty("method"));
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

