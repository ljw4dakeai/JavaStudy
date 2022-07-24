package com.ljw4dakeai.jinjieban.chapter01.testextends;

/**
 * @author ZJH
 * @info
 * 子类和父类有一样的方法声明但是方法体不一样
 * 1. @Override 语法检查功能!
 *2. 重写方法的名称,形参列表,返回值类型必须一样
 * 3.重写方法的权限必须大于等于父类的权限(private -> 缺省(不带访问修饰符default) ->protect -> public)
 * 权限有小到大 private  < default < protect < public
 * 4.私有方法不能重写(但是子类中可以有重名方法 ,但是不能访问父类中的同名方法!)
 *
 */
public class Test04ExtendsOverride {
    public static void main(String[] args) {
        System.out.println("这是旧手机的功能!");
        Phone phone = new Phone();
        phone.sendShortMessage();
        phone.call();

        System.out.println("这是新手机的功能!");

        NewPhone newPhone = new NewPhone();
        newPhone.sendShortMessage();
        newPhone.call();



    }
}

class Phone{
    public void sendShortMessage(){
        System.out.println("发短信!");
    }

    public void call(){
        System.out.println("打电话!");
    }
    private void open(){
        System.out.println("开机!");
    }

}


class  NewPhone extends Phone{
    @Override
    public void sendShortMessage(){
        super.sendShortMessage();//想使用父类的功能就加上, 不想使用就舍弃
        System.out.println("发彩信!");
    }

    @Override
    public void call(){
        super.call();
        System.out.println("打视屏电话!");
    }
    public void open(){
        System.out.println("开机!");
    }

}