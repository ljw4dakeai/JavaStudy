package com.ljw4dakeai.jinjieban.chapter06.HomeWorkCode;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author ZJH
 * @info
 *
- 定义一个学生类，要求有姓名、语文成绩、数学成绩、英语成绩
- 选择合适的集合，往集合中添加3个学生对象，并按照总分从高到低输出到控制台
- 如果总分相同，按照数学成绩排序
 */
public class WorkTwo {
    public static void main(String[] args) {
        Student xiaoming = new Student("小明", 90.5, 80.0, 69.5);
        Student xiaohong = new Student("小红", 85.5, 85.5, 92.5);
        Student xiaobai = new Student("小白", 90.0, 75.0, 87.5);
        Student xiaolan = new Student("小兰", 89.0, 81.0, 70.0);

        ArrayList<Student> students = new ArrayList<>();
        students.add(xiaoming);
        students.add(xiaohong);
        students.add(xiaobai);
        students.add(xiaolan);

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                Double o1allScore = o1.getChinese() + o1.getMath() + o1.getEnglish();
//                Double o2allScore = o2.getChinese() + o2.getMath() + o2.getEnglish();
//                if(o1allScore.equals(o2allScore)){
//                    return (int) (o2.getMath() - o1.getMath());
//                }else {
//                    return (int)(o2allScore - o1allScore);
//                }
//            }
//        });

        students.sort((o1, o2) -> {
            Double o1allScore = o1.getChinese() + o1.getMath() + o1.getEnglish();
            Double o2allScore = o2.getChinese() + o2.getMath() + o2.getEnglish();
            if (o1allScore.equals(o2allScore)) {
                return (int) (o2.getMath() - o1.getMath());
            } else {
                return (int) (o2allScore - o1allScore);
            }
        });

        students.forEach(System.out :: println);
    }
}


class Student{
    private String name;
    private Double chinese;
    private Double math;
    private Double english;


    public Student() {
    }

    public Student(String name, Double chinese, Double math, Double english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student student)) {
            return false;
        }
        return Objects.equals(getName(), student.getName()) && Objects.equals(getChinese(), student.getChinese()) && Objects.equals(getMath(), student.getMath()) && Objects.equals(getEnglish(), student.getEnglish());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getChinese(), getMath(), getEnglish());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getChinese() {
        return chinese;
    }

    public void setChinese(Double chinese) {
        this.chinese = chinese;
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    public Double getEnglish() {
        return english;
    }

    public void setEnglish(Double english) {
        this.english = english;
    }
}