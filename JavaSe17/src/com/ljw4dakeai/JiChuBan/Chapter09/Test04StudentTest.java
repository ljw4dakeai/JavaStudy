package com.ljw4dakeai.JiChuBan.Chapter09;

/**
 * @author ZJH
 * @info 学生类的实现 , private
 * java 使用就近原则
 * this 是一个对象, 谁调用方法 , this 就是谁
 * 成员方法都有this 这个空间
 * this 表示调用方法的值
 * <p>
 * <p>
 * 系统会默认提供一个空构造方法
 * 创建对象是,就会调用构造方法
 */
public class Test04StudentTest {
    public static void main(String[] args) {
        //方法名和类名一模一样
        Student student = new Student();
        System.out.println(student.toString());
        student.thisUse();
        Student.method();


        Student student1 = new Student("邹家豪", 21, "武汉轻工大学!");
        System.out.println(student1.toString());

//        student.name = "邹家豪";
//        student.age = 20;
//        student.school = "WHPU"
//
//        System.out.println(student.age);
//
//        student.age = -25;
//        System.out.println(student.age);


    }

}

class Student {
    /**
     * 被private 修饰的方法只能在本类中使用
     */
    private String name;
    private int age;
    private String school;

    public Student() {
        System.out.println("无参构造方法执行了!~~");
    }

    public Student(String name, int age, String school) {
        System.out.println("带参够着方法执行了!~~");
        this.name = name;
        this.age = age;
        this.school = school;
    }

    private void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
        eat();
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void thisUse() {
        String name = "这是一个测试name";
        System.out.println(name);
        System.out.println(this);
        System.out.println(this.name);
    }

    public static void method() {
        System.out.println("类方法的直接使用!");
    }
}

