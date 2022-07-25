package com.ljw4dakeai.jinjieban.chapter01.test01extends;

/**
 * @author ZJH
 * @info 共性抽取 extends 继承,提高代码复用性
 * 不带有参够着的够着方法的继承类的实现!
 * class{
 * 成员变量
 * 构造方法(无参构造)
 * 构造方法(有参构造){
 * super(参数)
 * 自己特有的成员变量构造
 * }
 * 成员方法
 * }
 * public class 子类 extends 父类{}
 */
public class Test01Extends {
    public static void main(String[] args) {

        /*
           创建学生对象
         */

        Student student = new Student();
        student.setName("邹家豪");
        student.setAge(21);
        student.setClasses("Java151期就业班!");
        student.queryCourse();
        student.writeFeedback();

        /**
         *有参构造构造学生
         */
        Student lijingwen = new Student("李静雯", 20, "HBPU");
        lijingwen.queryCourse();
        lijingwen.writeFeedback();


        /*
          创建老师对象
         */
        Teacher teacher = new Teacher();
        teacher.setName("小王");
        teacher.setAge(18);
        teacher.setDeptName("Java教研部!");
        teacher.queryCourse();
        teacher.releaseFeedback();


        /**
         * 有参数构造老师
         */
        Teacher xiaoMing = new Teacher("小明", 30, "Java151期班主任");
        xiaoMing.queryCourse();
        xiaoMing.releaseFeedback();


    }
}

class Person {
    /**
     * 老师和学生共有的属性和行为 姓名 年龄 和查看课表
     */
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void queryCourse() {
        System.out.println(getName() + "查看课表!");
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
}

class Teacher extends Person {
    /**
     * 老师特有属性 部门名称,发布反馈
     */
    private String deptName;

    public void releaseFeedback() {
        System.out.println(getName() + "老师发布反馈!");
    }

    public Teacher() {
    }


    public Teacher(String name, int age, String deptName) {
        super(name, age);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}

class Student extends Person {
    /**
     * 学生特有的属性和行为,班级名称,填写反馈!
     */
    private String classes;

    /**
     * 学生特有方法
     * 填写反馈
     */
    public void writeFeedback() {
        System.out.println(getName() + "学生填写反馈!");
    }


    public Student() {
    }

    public Student(String name, int age, String classes) {
        super(name, age);
        this.classes = classes;
    }

    /**
     * 自己属性自己添加get和set方法
     */
    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

}