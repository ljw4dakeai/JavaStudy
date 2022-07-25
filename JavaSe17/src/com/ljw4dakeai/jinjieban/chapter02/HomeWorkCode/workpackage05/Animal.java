package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage05;

/**
 * @author ZJH
 * @info 1.定义动物类：
 * 行为：
 * 吼叫 bellow；没有具体的吼叫行为
 * 吃饭 eat:没有具体的吃饭行为
 * 2.定义缉毒接口 Drugs
 * 行为:
 * 缉毒
 * 3.定义缉毒狗:犬的一种
 * 行为：
 * 吼叫:汪汪叫
 * 吃饭:狗啃骨头
 * 缉毒:用鼻子侦测毒
 */
public abstract class Animal {
    /**
     * 为动物实现吼叫行为
     */
    public abstract void bellow();

    /**
     * 为动物实现嗅的行为
     */
    public abstract void eat();

}
