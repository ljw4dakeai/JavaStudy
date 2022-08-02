package com.ljw4dakeai.jinjieban.chapter07.test02stream.testpackage01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * @author ZJH
 */
public class Test05TestEmployeeStream {
    public static void main(String[] args) {
        ArrayList<Employee> employeesOne = new ArrayList<>();
        ArrayList<Employee> employeesTwo = new ArrayList<>();
        Collections.addAll(employeesOne,
                new Employee("孙悟空", "猴", 30000.0, 5000.0, "大闹天宫"),
                new Employee("唐僧", "男", 40000.0, 10000.0, "无"),
                new Employee("猪八戒", "猪", 3000.0, 3000.0, "调戏妇女"),
                new Employee("沙和尚", "男", 18000.0, 8000.0, "打碎琉璃盏"),
                new Employee("白龙马", "龙", 14000.0, 6000.0, "杀生")
        );

        Collections.addAll(employeesTwo,
                new Employee("武松", "男", 17000.0, 5000.0, "危害国家保护动物"),
                new Employee("西门庆", "男", 30000.0, 10000.0, "嫖娼, 强奸"),
                new Employee("宋江", "男", 50000.0, 2000.0, "危害社会稳定"),
                new Employee("潘金莲", "女", 3000.0, 2000.0, "不守妇道"),
                new Employee("孙二娘", "女", 17000.0, 6000.0, "无")
        );

        //两个部门最高工资的员工
        Employee employeeOneMax =
                employeesOne
                        .stream()
                        .max((valOne, valTwo) -> valOne.getAllSalary() - valTwo.getAllSalary() >0 ? 1 : (valOne.getAllSalary() - valTwo.getAllSalary() == 0? 0 : -1 ))
                        .get();
        Employee employeeTwoMax =
                employeesTwo
                        .stream()
                        .max((valOne, valTwo) -> valOne.getAllSalary() - valTwo.getAllSalary() >0 ? 1 : (valOne.getAllSalary() - valTwo.getAllSalary() == 0? 0 : -1 ))
                        .get();

        System.out.println("部门1工资最高的员工" + new TopPerformer(employeeOneMax.getName(), employeeOneMax.getAllSalary()));
        System.out.println("部门2工资最高的员工" + new TopPerformer(employeeTwoMax.getName(), employeeTwoMax.getAllSalary()));

        //去掉最高工资和最低工资后两个部门的平均工资
        double employeeOneAvg =
                employeesOne
                        .stream()
                        .sorted((valOne, valTwo) -> valOne.getAllSalary() - valTwo.getAllSalary() >0 ? 1 : (valOne.getAllSalary() - valTwo.getAllSalary() == 0? 0 : -1 ))
                        .skip(1)
                        .limit(employeesOne.size() - 2)
                        .mapToDouble(Employee::getAllSalary)
                        .average()
                        .getAsDouble();

        System.out.println("部门1去掉最高工资和最低工资的平均工资是" + employeeOneAvg);

        double employeeTwoAvg =
                employeesTwo
                        .stream()
                        .sorted((valOne, valTwo) -> valOne.getAllSalary() - valTwo.getAllSalary() >0 ? 1 : (valOne.getAllSalary() - valTwo.getAllSalary() == 0? 0 : -1 ))
                        .skip(1)
                        .limit(employeesOne.size() - 2)
                        .mapToDouble(Employee::getAllSalary)
                        .average()
                        .getAsDouble();


        System.out.println("部门2去掉最高工资和最低工资的平均工资是" + employeeTwoAvg);


        //统计2个开发部门整体的平均月收入，要求去掉最高收入和最低收入
        Double allEmployeeSalaryOne =
                Stream
                        .concat(employeesOne.stream(), employeesTwo.stream())
                        .sorted((valOne, valTwo) -> valOne.getAllSalary() - valTwo.getAllSalary() >0 ? 1 : (valOne.getAllSalary() - valTwo.getAllSalary() == 0? 0 : -1 ))
                        .skip(1)
                        .limit(employeesOne.size() + employeesTwo.size() - 2)
                        .map(Employee::getAllSalary)
                        .reduce(Double::sum)
                        .map(val -> val / (employeesOne.size() + employeesTwo.size() - 2))
                        .get();
        System.out.println("两个部门的平均工资是 " +  allEmployeeSalaryOne);

        double allEmployeeSalaryTwo =
                Stream
                        .concat(employeesOne.stream(), employeesTwo.stream())
                        .sorted((valOne, valTwo) -> valOne.getAllSalary() - valTwo.getAllSalary() >0 ? 1 : (valOne.getAllSalary() - valTwo.getAllSalary() == 0? 0 : -1 ))
                        .skip(1)
                        .limit(employeesOne.size() + employeesTwo.size() - 2)
                        .mapToDouble(Employee::getAllSalary)
                        .average()
                        .getAsDouble();
        System.out.println("两个部门的平均工资是 " +  allEmployeeSalaryTwo);

    }
}

class Employee {
    private String name;
    private String sex;
    private double salary;
    private double bounds;
    private String punish;


    public Employee() {
    }

    public Employee(String name, String sex, double salary, double bounds, String punish) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.bounds = bounds;
        this.punish = punish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee employee)) {
            return false;
        }
        return Double.compare(employee.salary, salary) == 0 && Double.compare(employee.bounds, bounds) == 0 && name.equals(employee.name) && sex.equals(employee.sex) && punish.equals(employee.punish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, salary, bounds, punish);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", salary=" + salary +
                ", bounds=" + bounds +
                ", punish='" + punish + '\'' +
                '}';
    }

    public double getAllSalary() {
        return getSalary() + getBounds();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBounds() {
        return bounds;
    }

    public void setBounds(double bounds) {
        this.bounds = bounds;
    }

    public String getPunish() {
        return punish;
    }

    public void setPunish(String punish) {
        this.punish = punish;
    }
}

class TopPerformer {
    private String name;
    private double allSalary;

    public TopPerformer() {
    }

    public TopPerformer(String name, double allSalary) {
        this.name = name;
        this.allSalary = allSalary;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (!(o instanceof TopPerformer that)) {
            return false;
        }
        return Double.compare(that.allSalary, allSalary) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, allSalary);
    }

    @Override
    public String toString() {
        return "TopPerformer{" +
                "name='" + name + '\'' +
                ", allSalary=" + allSalary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAllSalary() {
        return allSalary;
    }

    public void setAllSalary(double allSalary) {
        this.allSalary = allSalary;
    }
}