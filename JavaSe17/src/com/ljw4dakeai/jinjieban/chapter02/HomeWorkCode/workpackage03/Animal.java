package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage03;

/**
 * @author ZJH
 * @info
 * 1.定义动物类
 *                行为:
 *  			eat方法(无具体行为,不同动物吃的不一样)
 *
 * 2.定义狗类继承动物类
 * 	行为:
 * 		eat方法(啃骨头),看家方法
 *
 * 3.定义猫类继承动物类
 * 	行为:
 * 		eat方法(吃鱼),抓老鼠方法
 *
 * 4.测试类:
 * 	以多态的形式创建猫和狗的对象，调用公共的方法，和特有的方法
 */
public abstract class Animal {
    /**
     * 动物事先eat 方法
     */
    public abstract void eat();
}
