package com.ljw4dakeai.singleton;

/**
 * @author ZJH
 * @info
 * 双判断实现 , 完美的实现, 线程安全, 并且实现单列设计模式
 * 不能避免反序列化
 */
public class Manager06 {
    private Manager06(){}

    /**
     * java 汇编语言优化 , 语句重排JIT
     */
    private static volatile Manager06 INSTANCE;

    public static Manager06 getInstance(){
        if(INSTANCE == null){
            synchronized (Manager06.class){
                if (INSTANCE == null){
                    INSTANCE = new Manager06();
                }
            }
        }
        return  INSTANCE;
    }
}
