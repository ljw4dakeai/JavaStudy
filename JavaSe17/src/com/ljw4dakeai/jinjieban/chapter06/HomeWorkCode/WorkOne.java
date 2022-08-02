package com.ljw4dakeai.jinjieban.chapter06.HomeWorkCode;

import java.util.Objects;
import java.util.TreeSet;

/**
 * @author ZJH
 * @info
 * - 创建一个员工类Employee，有姓名name、年龄age、工资salary属性
 * - 创建3个员工对象，添加到TreeSet集合中
 * - 要求按照员工的工资排序；如果工资相同，按照年龄排序；如果年龄也相同，再按照姓名的字典顺序排序；
 */
public class WorkOne {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>((empOne, empTwo) -> {
            if(empOne.getSalary() == empOne.getSalary()){
                if (empOne.getAge() == empTwo.getAge()){
                    return empTwo.getName().compareTo(empOne.getName());
                }else {
                    return empTwo.getAge() - empOne.getAge();
                }
            }else {
                return (int)(empTwo.getSalary() - empOne.getSalary());
            }
        });
        employees.add(new Employee("邹家豪", 21, 5000));
        employees.add(new Employee("邹家豪", 21, 4000));
        employees.add(new Employee("b邹家豪", 20, 4000));
        employees.add(new Employee("a邹家豪", 20, 4000));

        employees.forEach(System.out :: println);
    }

}
class Employee{
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee employee)) {
            return false;
        }
        return age == employee.age && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}