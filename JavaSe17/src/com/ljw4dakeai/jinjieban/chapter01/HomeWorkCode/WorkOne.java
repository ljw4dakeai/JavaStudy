package com.ljw4dakeai.jinjieban.chapter01.HomeWorkCode;

/**
 * @author ZJH
 * @info
 * - 1. 定义项目经理类
 *   属性：
 *   	姓名 工号 工资 奖金
 *   行为：
 *   	工作work
 * - 2. 定义程序员类
 *   属性：
 *   	姓名 工号 工资
 *   行为：
 *   	工作work
 * - 3. 向上抽取一个父类，共有成员放父类，特有成员放子类
 * - 4. 编写测试类:完成这两个类的测试
 */
public class WorkOne {
    public static void main(String[] args) {
        Programmer zoujiahao = new Programmer("邹家豪", 21, 10086);
        ProductManager lijingwen = new ProductManager("李静雯", 21, 10010, 500);

        System.out.println(zoujiahao);
        zoujiahao.work();

        System.out.println(lijingwen);
        lijingwen.work();
    }
}


class Employee{
    private String name;
    private int num;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int num, double salary) {
        this.name = name;
        this.num = num;
        this.salary = salary;
    }

     public void work(){

     }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Programmer extends Employee{
    public Programmer() {
    }

    public Programmer(String name, int num, double salary) {
        super(name, num, salary);
    }

    @Override
    public void work() {

        System.out.println(getName() + "程序员疯狂撸代码ing!");
    }
}

class ProductManager extends Employee{
    private double bounds;

    public ProductManager(String name, int num, double salary, double bounds) {
        super(name, num, salary);
        this.bounds = bounds;
    }

    public ProductManager() {
    }

    public double getBounds() {
        return bounds;
    }

    public void setBounds(double bounds) {
        this.bounds = bounds;
    }


    @Override
    public void work() {
        System.out.println(getName() + "疯狂设计产品, 让程序员疯狂写代码!");
    }
}