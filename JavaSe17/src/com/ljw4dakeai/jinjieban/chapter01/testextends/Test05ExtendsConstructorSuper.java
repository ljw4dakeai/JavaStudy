package com.ljw4dakeai.jinjieban.chapter01.testextends;

/**
 * @author ZJH
 */
public class Test05ExtendsConstructorSuper {
    public static void main(String[] args) {
        SonS sonS = new SonS();
        int num = sonS.num;
        System.out.println(num);

        SonS sonS1 = new SonS(100);
        System.out.println(sonS1.num);
    }
}

class Father{
    int num = 10;

    public Father() {
        System.out.println("父类无参构造器!");
    }

    public Father(int num) {
        this.num = num;
    }
}

class SonS extends Father{
    public SonS() {
        //super();
        System.out.println("子类无参构造器!");
    }

    public SonS(int num) {
        super(num); //访问父类的有参构造
    }
}
