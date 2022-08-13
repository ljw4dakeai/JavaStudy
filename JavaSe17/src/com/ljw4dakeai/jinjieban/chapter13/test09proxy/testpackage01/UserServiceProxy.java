package com.ljw4dakeai.jinjieban.chapter13.test09proxy.testpackage01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ZJH
 */
public class UserServiceProxy {
    /**
     * 生成代理对象必须是实现了该接口才能实现(生成某一接口的代理对象)
     * @param us 实例
     * @return 代理对象
     * loader:类加载器, 把类字节码加载到内存
     * interfaces 是实现类实现了那些接口, 所有接口的字节码文件
     * h : 代理对象, 对方法进行增强的处理方式
     */
    public static UserService gteProxy(UserService us){
        UserService userService = (UserService) Proxy.newProxyInstance(
                UserService.class.getClassLoader(),
                new Class[]{UserService.class},
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy : 代理对象
                     * @param method : 要执行的目标方法
                     * @param args : 目标方法执行的参数书
                     * @return ?
                     * @throws Throwable 未知
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("执行目标方法之前可以做的事");
                        Object result = method.invoke(us, args);
                        System.out.println("执行目标方法之后可以做的事");
                        return result;
                    }
                });

        return userService;
    }
}
