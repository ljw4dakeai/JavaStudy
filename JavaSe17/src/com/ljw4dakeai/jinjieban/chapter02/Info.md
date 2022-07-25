_(包, 访问修饰符号, 抽象类, 接口)_

### package(包)

```properties
定义:package 包名.包名
导入:import  访问其他包中的类就需要导入包!

单类导入: import 包名.单类名
全类导入:import 包名.* (导入包下所有所有类)

注意 : 不同包下出现相同的类名,必须带包名访问 
创建对象 : 包名.类 value = new 包名.类(参数列表);
```

### modify(权限修饰符)
```properties
访问权限修饰符 : private < default(缺省) < protected < public
访问权限 : 当前类 | 当前包 | 其他包中的子类  | 任何包任何类中
private :    √       ×            ×              × 
default :    √       √            ×              × 
protected :  √       √            √              × 
public :     √       √            √              √
```


### 抽象类
```java
//抽象类 : 被abstract修饰的类
//抽象方法 : 被abstract修饰,并且没有方法体的方法

public abstract class 类 {
    public abstract void func();
}
```

````java
//抽象类的使用,必须有子类继承抽象方法
public class 类 extends 抽象类{
    //重写抽象类中的所有从抽象方法
}
````

- 抽象类注意事项
````properties
1 : 抽象类不能创建对象
2 : 抽象类中有抽象方法,也可以有非抽象方法
3 : 有抽象方法的类必须是抽象类
4 : 子类继承抽象类必须复写抽象方法,否则也为抽象类
5 : final static 不能和abstract共存
````

###interface(接口)
- 定义

```java
public interface 接口1{
    public static final int num = 10 ; //常量 通常public static final缺省
    public abstract void methodOne(); //抽象方法 通常  public abstract 缺省
}
public interface 接口2{
    public abstract void methodTwo();
}
```

- 实现
```java
public class 实现类 implements 接口1, 接口2{
    @Override
    public void methodOne(){
        ....
    }
    @Override
    public void methodTwo(){
        ...
    }
}

```
- 类 接口 之间的关系
```properties
类与类 : 单继承关系
类与接口 :  多实现关系
接口与接口 :  多继承关系
```

- 抽象类 和接口之间的区别

```java
public abstract class 抽象类{
    private int num; //成员变量
    public 抽象类{ } //构造方法
    public void methodOne(){ }//普通方法
    public abstract void methodTwo(); //抽象方法
    private void methodThree(){}//私有方法
}
```

```java
public interface 接口{
    public static final int num = 10; //public static final 默认缺省, 并且 num 为常量
    
    public abstract void methodOne(); //public abstract 默认缺省,  抽象方法
    
    public default void methodTwo(){ }//public 默认缺省 , 默认方法 (可以重写也可不重写, jdk8以后添加)
    
    public static void methodThree(){} //静态方法(接口.方法()调用, jdk8后添加)
    
    private void methodThree(){} //私有方法(本类访问,jdk9添加)
}
```

### 多态

```properties
什么是多态 : 在继承父类、实现接口的前提下，同一个对象具有多种表现形态
坏处举例 : Animal a = new Dog(); //父类变量接收子类对象 Usb  u = new UsbMouse(); //接口接收实现类对象

多态的好处 : 让方法的扩展性更强
好处举例  : 把方法的参数写成父类类型、接口类型，调用方法时传递父类或者接口的子类对象。

多态的弊端 : 多态的形式不能直接调用子类的特有方法(子类有，父类没有的方法)
多态的转型 : 强制转化的前提是,强制转换后应为转换前的类 ,不然会出现类型转换错误
```