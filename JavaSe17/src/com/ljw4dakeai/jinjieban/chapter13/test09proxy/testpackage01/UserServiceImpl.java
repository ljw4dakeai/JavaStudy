package com.ljw4dakeai.jinjieban.chapter13.test09proxy.testpackage01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ZJH
 */
public class UserServiceImpl implements UserService {
    @Override
    public void login(String userName, String pwd) {
        System.out.println("admin".equals(userName) && "123456".equals(pwd) ? "登录成功!" : "登录失败!");
    }

    @Override
    public void add() {
        System.out.println("添加成功!");
    }

    @Override
    public void query() {
        System.out.println("查询成功!");
    }

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserService userServiceProxy = UserServiceProxy.gteProxy(userService);

        userServiceProxy.login("admin", "123456");
    }


}
