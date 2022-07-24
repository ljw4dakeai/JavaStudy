package com.ljw4dakeai.jinjieban.chapter01.testextends;

/**
 * @author ZJH
 */
public class Test06ExtendsConstructorThis {
    public static void main(String[] args) {
        Students zoujiahao = new Students("邹家豪", "黑马程序员");
        Students lijingwen = new Students("李静雯");
        System.out.println(zoujiahao);
        System.out.println(lijingwen);

        System.out.println("成员变量带上参数也可以实现默认值!");
        Students_ zoujiahao_ = new Students_("邹家豪", "黑马程序员");
        Students_ lijingwen_ = new Students_("李静雯");
        System.out.println(zoujiahao_);
        System.out.println(lijingwen_);
    }
}
class Students{
    private String name;
    private String school;

    public Students(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public Students(String name) {
        this(name, "黑马程序员");
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}

class Students_{
    private String name;
    private String school = "黑马程序员";

    public Students_(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public Students_(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
