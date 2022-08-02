package com.ljw4dakeai.jinjieban.chapter07.test02stream.testpackage01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * @author ZJH
 * @info stream 流的收集器
 */
public class Test06TestStreamCollector {
    public static void main(String[] args) {
        ArrayList<Employee> employeesOne = new ArrayList<>();
        Collections.addAll(employeesOne,
                new Employee("孙悟空", "猴", 30000.0, 5000.0, "大闹天宫"),
                new Employee("唐僧", "男", 40000.0, 10000.0, "无"),
                new Employee("猪八戒", "猪", 3000.0, 3000.0, "调戏妇女"),
                new Employee("沙和尚", "男", 18000.0, 8000.0, "打碎琉璃盏"),
                new Employee("白龙马", "龙", 14000.0, 6000.0, "杀生")
        );


        //把流中的数据收集成List集合
        System.out.println(
                employeesOne
                        .stream()
                        .filter(val -> val.getSalary() >= 20000.0)
                        .collect(Collectors.toList())
        );


        //把流中的数据收集成Set集合
        System.out.println(
                employeesOne
                        .stream()
                        .filter(val -> val.getSalary() >= 20000.0)
                        .collect(Collectors.toSet())
        );

        //把流中的数据收集成Map集合
        System.out.println(
                employeesOne
                        .stream()
                        .filter(val -> val.getSalary() >= 20000.0)
                        .collect(Collectors.toMap(Employee::getName, Employee::getAllSalary))
        );

        //把流中的数据收集成Array数组
        System.out.println(
                Arrays.toString(
                        employeesOne
                                .stream()
                                .filter(val -> val.getSalary() >= 20000.0)
                                .toArray(Employee[]::new)
                )
        );


    }
}
