package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage04;


/**
 * @author ZJH
 * @info
 *        属性:
 * 		工号,姓名,奖金
 * 	行为:
 * 		工作方法(管理员工,简单输出语句模拟)
 */
public class Manager extends Employee{
    private double bounds;

    public Manager() {
    }

    public Manager(double bounds) {
        this.bounds = bounds;
    }

    public Manager(int num, String name, double bounds) {
        super(num, name);
        this.bounds = bounds;
    }

    public double getBounds() {
        return bounds;
    }

    public void setBounds(double bounds) {
        this.bounds = bounds;
    }


    @Override
    public void work() {
        System.out.println(getName() + "是管理者, 管理其他员工!");
    }
}
