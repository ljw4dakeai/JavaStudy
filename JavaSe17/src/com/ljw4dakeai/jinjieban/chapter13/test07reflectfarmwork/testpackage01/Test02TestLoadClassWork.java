package com.ljw4dakeai.jinjieban.chapter13.test07reflectfarmwork.testpackage01;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author ZJH
 */
public class Test02TestLoadClassWork {
    private static Method method;
    private static Object object;

    /**
     * 加载中的配置信息
     */
    static {
        Properties properties = new Properties();
        try {
            properties.load(
                    new FileReader("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter13/test07reflectfarmwork/testpackage01/config.properties"));
            //读取字节码
            Class<?> aClass = Class.forName(properties.getProperty("className"));
            //通过类获取字节码
            method = aClass.getMethod(properties.getProperty("method"));
            object = aClass.getConstructor().newInstance();
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        method.invoke(object);
    }
}
