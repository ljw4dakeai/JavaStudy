package com.ljw4dakeai.jinjieban.chapter13.test03reflectconstructor.testpackage01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ZJH
 */
public class Test01TestGetConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.ljw4dakeai.jinjieban.chapter13.test03reflectconstructor.testpackage01.Student");

        //通过获取的构造方法构造
        //对于私有构造方法
        System.out.println("对于私有构造方法");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance();
        System.out.println(o);


        //对于非私有构造方法
        System.out.println("对于非私有构造方法");
        Constructor<?> constructor = aClass.getConstructor(String.class, int.class);
        Object instance = constructor.newInstance("邹家豪", 18);
        System.out.println(instance);
        Student student = (Student) instance;

        Class<? extends Student> studentClass = student.getClass();
        Constructor<? extends Student> studentClassConstructor = studentClass.getConstructor(String.class, int.class);
        Student newStudentInstance = studentClassConstructor.newInstance("邹家豪", 21);
        System.out.println(newStudentInstance);

//        getConstructor(aClass);
    }

    private static void getConstructor(Class<?> aClass) throws NoSuchMethodException {
        //获取构造方法列表(无法获取私有)
        System.out.println("获取构造方法列表(无法获取私有)");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        //暴力获取构造方法(可以获取私有)
        System.out.println("暴力获取构造方法(可以获取私有)");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

//        //获取单个无参数构造方法(非私有)
//        Constructor<?> constructor = aClass.getConstructor();

        //获取单个无参构造方法(私有)
        System.out.println("获取单个无参构造方法(私有)");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        System.out.println(declaredConstructor);


        //获取有参数构造方法(非私有)
        System.out.println("获取有参数构造方法(非私有)");
        Constructor<?> classConstructor = aClass.getConstructor(String.class, int.class);
        System.out.println(classConstructor);

        //获取有参数构造方法(私有)
        System.out.println("获取有参数构造方法(私有)");
        Constructor<?> classDeclaredConstructor = aClass.getDeclaredConstructor(String.class, int.class);
        System.out.println(classDeclaredConstructor);
    }
}
