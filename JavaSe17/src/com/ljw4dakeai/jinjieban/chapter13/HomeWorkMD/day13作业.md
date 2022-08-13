## 说在前面

琦哥寄语：今天学习的反射、和注解都是框架的底层技术。虽然以后不会要求我们去写框架，但是也不要自己把自己给吓到了，如果一开始就退缩了，那怎么学到更牛的技术呢？

不信你试试，你按照步骤将下面的案例实现。你就算对编写框架入门了，加油，离大牛又进了一步。相信自己哦、哦、哦。。。。 （如果90%人写出来，明天给你们唱这首歌）



## 题目1 -- 自定义测试框架
- 自定义一个MyTest注解，要解求给注解只能在方法上有效，能够保留到运行时期
- 定义一个UserService类，并且在类中写几个方法，并且将MyTes注贴在方法上

```java
public class UserService {
    @MyTest
    public void addUser(){
        System.out.println("添加用户");
    }
    
	@MyTest
    public void deleteUser(){
        System.out.println("删除用户");
    }

    public void selectUser(){
        System.out.println("查询用户");
    }
}
```

- 定义一个测试类，解析UserService类上的注解，要求有MyTest注解的方法执行，没有MyTest注解的方法不执行。



## 题目2 -- 自定义通用框架

要求：自定义一个通用框架，在不改变源代码的情况下，能够执行任意类的任意方法。

要求如下

- 定义一个Dog类如下

```java
public class Dog{
    public void eat(){
        System.out.println("狗在吃骨头");
    }
}
```

- 定义一个Cat类

```java
public class Cat{
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
```



- 需要有一个配置文件 `config.properties`，格式如下。将Dog类的全名，和方法名配置到文件中

```java
classname=类的全名
methodname=要执行的方法名
```

- 编写一个测试类，读取配置文件，获取类的全名和方法名
- 定义一个测试类Test2，使用反射技术，获取配置类的字节码对象，并获取构造方法，根据构造方法创建对象；
- 在测试类中，使用反射技术，获取配置的方法对象，并执行这个方法

```java

```



## 题目3：自定义通用框架

要求：和上面需求一样，要求自定义一个通用框架，能够执行任意类的任意方法。

但是具体执行哪个类，哪个方法是通过注解进行配置的。

- 自定义一个注解类MyConfigration，如下

```java
//限制注解只能用在类上
@Target(ElementType.TYPE)
//限制注解在运行阶段有效
@Retention(RetentionPolicy.RUNTIME)
public @interface MyConfigration {
    String classname(); //该属性值，表示要执行的类（类的全名）
    String methodname(); //该属性值，表示要执行的方法名
}
```

- 定义一个测试类Test3，将`@MyConfigration`注解贴在方法上，通过注解的属性配置要执行的类 ，和要执行的方法。并在主方法中解析注解，完成数注释的要求

```java
@MyConfigration(classname="将Dog类的全名写在这",methodname="将要运行的方法名写在这")
public class Test3{
    
    public static void main(String[] args){
        //1.获取本类的字节码
        
        //2.获取字节码上的MyConfigration注解
        
        //3.获取注解上的classname属性值，获取methodname属性值
        
        //4.使用反射技术，以classname的属性值获取类的字节码
        
        //5.使用反射技术，以methodname的属性值获取方法对象
        
        //6.执行刚刚获取的方法
    }
}
```





