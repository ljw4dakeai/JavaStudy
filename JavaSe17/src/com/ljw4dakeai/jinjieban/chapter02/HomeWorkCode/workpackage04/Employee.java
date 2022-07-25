package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage04;

/**
 * @author ZJH
 * @info
 * 1.定义员工类Employee:
 * 	属性:
 * 		工号,姓名
 * 	行为:
 * 		工作方法
 * 2.定义经理类:
 * 	属性:
 * 		工号,姓名,奖金
 * 	行为:
 * 		工作方法(管理员工,简单输出语句模拟)
 * 3.定义服务员类:waiter
 * 	属性:
 * 		工号,姓名
 * 	行为:
 * 		工作方法(为客户服务,简单输出语句模拟)
 * 4.定义测试类:
 * 	分别创建经理类对象和服务员类对象
 * 	调用各自的工作方法
 */
public abstract class Employee {
    private int num;
    private String name;

    public Employee() {
    }

    public Employee(int num, String name) {
        this.num = num;
        this.name = name;
    }

    /**
     * 为雇员实现工作方法!
     */
    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
