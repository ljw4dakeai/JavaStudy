package com.ljw4dakeai.jinjieban.chapter01.test02final;

/**
 * @author ZJH
 * @info 修饰方法,变量类
 * 方法不想被子类重写,就添加final 访问修饰符
 * 类不想被继承,就添加final 访问修饰符
 * 变量值第一次赋值后不想被修改,就添加final 访问修饰符(即常量)
 * final 如果修饰引用类型的变量,表示地址值不会改变
 */
public class Test01Final {
    public static void main(String[] args) {
        final int num = 100;
        //num = 10;error
    }
}

class Fu{
    public final void func(){
        System.out.println("你好,这是一个final方法, 无法继承");
    }

    public void function(){
        System.out.println("你好,这不是一个final方法, 可以继承");
    }
}


class Zi extends Fu{

/*    public void func(){
        System.out.println("你这方法没有被继承, 是子类自己的方法");
    }*/
    @Override
    public void function(){
        System.out.println("你好,这不是一个final方法, 可以继承");
    }


}
