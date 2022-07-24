package com.ljw4dakeai.jinjieban.chapter01.testextends;

/**
 * @author ZJH
 * @info 子父类访问成员变量, 成员方法的原则
 * 遵循就近原则,子类有就使用子类,子类没有就使用父类
 * 子类父类成员变量 成员方法区分
 * this 访问本类成员变量和成员方法(this可以省略)
 * super 访问父类成员变量和成员方法
 */
public class Test03ExtendsSuper {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.test();
    }

}

class Fu {

    String str = "我是父类变量!";

    public void show() {
        System.out.println("我是父类show方法!");
    }
}

class Zi extends Fu {
    String str = "我是子类变量!";


    @Override
    public void show() {
        System.out.println("我是子类show方法!");
    }

    public void test() {
        System.out.println("default");
        /*
        调用子类str
         */
        System.out.println(str);
        /*
        调用子类show方法
         */
        show();

        System.out.println("this");
        /*
        调用子类str
         */
        System.out.println(this.str);
        /*
        调用子类show方法
         */
        this.show();


        System.out.println("super");
        /*
        调用父类str
         */
        System.out.println(super.str);
        /*
        调用父类show方法
         */
        super.show();
    }
}
