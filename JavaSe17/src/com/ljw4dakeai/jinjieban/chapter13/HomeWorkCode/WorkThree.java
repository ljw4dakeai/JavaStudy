package com.ljw4dakeai.jinjieban.chapter13.HomeWorkCode;

import java.lang.reflect.InvocationTargetException;

/**
 * @author ZJH
 */
@Configuration(className = "com.ljw4dakeai.jinjieban.chapter13.HomeWorkCode.Cat", methodName = "catchMouse")
public class WorkThree {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取注解
        Class<?> selfClass = Class.forName("com.ljw4dakeai.jinjieban.chapter13.HomeWorkCode.WorkThree");
        Configuration configuration = selfClass.getAnnotation(Configuration.class);

        //通过注解获取注解中的类的字节码
        Class<?> aClass = Class.forName(configuration.className());

        //运行方法
        aClass.getMethod(configuration.methodName()).invoke(aClass.getConstructor().newInstance());
    }
}
