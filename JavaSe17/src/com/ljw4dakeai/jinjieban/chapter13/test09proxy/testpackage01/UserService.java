package com.ljw4dakeai.jinjieban.chapter13.test09proxy.testpackage01;

/**
 * @author ZJH
 */
public interface UserService {
    /**
     * 登录方法
     * @param userName 用户名
     * @param pwd 用户密码
     */
    void login(String userName, String pwd);

    /**
     * 添加方法
     */
    void add();


    /**
     * 查询方法
     */
    void query();
}
