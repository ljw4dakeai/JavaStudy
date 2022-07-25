## 一、包

```java
1.包的定义: 告诉Java虚拟机类在哪一个包下
	package com.itheima.demo1;
	public class 类名{
        
    }
2.导包：如果访问到其他包下的类，就需要导包
	import 包名.类名;

3.不同包下出现相同的类名，就必须带包名的访问
	包名.类名 变量名 = new 包名.类名();
```



## 二、权限修饰符

```java
每一种权限修饰符的作用范围不一样,按照从小到大的顺序排列
	private < 默认的 < protected < public 
    
private访问范围：只能在本类中被访问
默认的(不写)：只能在本包中被访问
protected:  可以在不同包的子类中被访问
public: 任何地方都可以访问
```



## 三、抽象类

- 什么是抽象类？什么是抽象方法？

```java
抽象类：被abstract修饰类
抽象方法：被abstract修饰，并且没有方法体的方法

public abstract class 类名{
	public abstract void 方法名();
}
```

- 抽象类的使用：必须需要有子类去继承抽象类

```java
public class 子类 extends 抽象类{  
    //复写抽象类中所有的方法  
}
```

- 抽象类的注意事项

```java
1.抽象类不能创建的对象
2.抽象类可以有抽象方法、也可以有非抽象方法
3.有抽象方法的类必须是抽象类
4.子类继承抽象类必须复写抽象类中所有的方法，否则这个类也必须是抽象类
5.final、static不能和abstarct共存
```



## 四、接口

- 接口的定义

```java
public interface 接口名1{
    //常量：默认被public static final 修饰
    public static final int NUM = 10;
    
    //抽象方法：默认被 public abstarct修饰
    public abstract void method1();
}

public interface 接口名2{
    //抽象方法：默认被 public abstarct修饰
    public abstract void method2();
}
```

- 接口的实现

```java
//类实现接口：必须重写所有的抽象方法
public class 类名 /*extends 父类*/ implements 接口名1, 接口名2{
    @Override
    public void method(){
        ....
    }
    @Override
    public void method2(){
        ...
    }
}
```

- 类与类、类与接口、接口与接口的关系

```java
1.类与类：单继承关系
2.类与接口：多实现关系
3.接口与接口：多继承
```

- 接口与抽象类的区别

```java
public class 抽象类{
    //成员变量	—— 描述事物的属性(变量的值可以更改)
    int num = 10;
    //普通方法
    public void 方法名1(){
        
    }
  
    //抽象方法
    public abstract void 方法名2();、
        
    //私有方法
    private void 方法名3(){
        
    }
    
    
    //构造方法	—— 给子类创建对象用的
    public 类名(){
        
    }
}
```

```java
public interface 接口{
    //成员变量 ——— 看着像变量(本质上是常量，不能更改)
    int num = 10; //默认被public  static final修饰
    
    //默认方法	—— 类似于类中的普通方法 JDK8开始
    public defualt void 方法名1(){
        
    }
    
    //静态方法：JDK8开始
    public static void 方法名2(){
        
    }
    
    //抽象方法
    public abstract void 方法名2();
    
    //私有方法：JDK9开始
    private void 方法名3(){
        
    }
}
```



##  五、多态

- 什么是多态？

```java
答：在继承父类、实现接口的前提下，同一个对象具有多种表现形态
举例：
	Animal a = new Dog(); //父类变量接收子类对象
	Usb  u = new UsbMouse(); //接口接收实现类对象
```

- 多态的好处

```java
答：让方法的扩展性更强
//举例：把方法的参数写成父类类型、接口类型，调用方法时传递父类或者接口的子类对象。
//参数Usb u在没有调用方法之前是不知道u是谁的？
public void useUsb(Usb u){
   ....
}
```

- 多态的弊端

```java
答：多态的形式不能直接调用子类的特有方法(子类有，父类没有的方法)
```

- 多态的转型

```java
答：当多态的情况下，想调用子类特有方法。就需要转型后才能调用
		//判断变量a是Dog类的对象吗？
		if(a instanceof Dog){
            //Dog dog = (Dog)a;
            //dog.swimming();
            //先把a强制转换为Dog，再调用Dog的方法
            ((Dog) a).swimming();
        }

        //判断变量a是Cat对象吗？
        if(a instanceof Cat){
            ((Cat) a).catchMouse();
        }
```



