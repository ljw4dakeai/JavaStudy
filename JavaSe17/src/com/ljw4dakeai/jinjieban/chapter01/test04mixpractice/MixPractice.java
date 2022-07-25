package com.ljw4dakeai.jinjieban.chapter01.test04mixpractice;

/**
 * @author ZJH
 * @info 综合案例
 */
public class MixPractice {
    public static void main(String[] args) {
        System.out.println("我是" + Employee.COMPANY + "的员工");
        Programmer programmer = new Programmer("邹家豪", 21, "研发部");
        System.out.println(programmer);
        programmer.work();

        System.out.println("==========================================================");
        System.out.println("我是" + Employee.COMPANY + "的员工");
        ProductManager productManager = new ProductManager("李静雯", 21, "产品部");
        System.out.println(productManager);
        productManager.work();
    }
}


class Employee {

    private String name;
    private int age;
    private String deptName;
    public static final String COMPANY = "黑马头条科技有限公司";
    //访问修饰符没有先后顺序!



    public Employee() {
    }

    public Employee(String name, int age, String deptName) {
        this.name = name;
        this.age = age;
        this.deptName = deptName;
    }

    public void work() {
        //不同员工做的工作不一样 不能写死
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}


class Programmer extends Employee {

    /**
     * 调用父类空参构造
     */
    public Programmer() {
        super();
    }

    //调用父类有参构造
    public Programmer(String name, int age, String deptName) {
        super(name, age, deptName);
    }



    @Override
    public void work() {
        System.out.println(getName() + "程序员在拼命敲代码!");
    }

}


class ProductManager extends Employee {
    public ProductManager() {
        super();
    }

    public ProductManager(String name, int age, String deptName) {
        super(name, age, deptName);
    }

    @Override
    public void work() {
        System.out.println(getName() + "产品经理疯狂编写需求文档, 让程序员拼命写代码!");
    }
}
