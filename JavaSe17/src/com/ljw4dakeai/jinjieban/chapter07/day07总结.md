## 一、不可变集合

```java
//创建List不可变集合
List<元素类型>  变量名 = List.of(元素1,元素2,元素3...);

//创建Set不可变集合
Set<元素类型>  变量名 = Set.of(元素1,元素2,元素3...);

//创建Map不可变集合
Map<键的类型,值的类型>  变量名 = Map.of(键1,值1, 键2,值2...);
```



## 二、Stream流

Stream流是用来对集合或者数组进行操作的一种便捷方式，称之为【流式编程】

### 1. 获取Stream流

```java
//1.准备一个单列集合
ArrayList<String> list = new ArrayList<>();
list.add("hello");
list.add("world");
list.add("java");

//通过list集合获取Stream流
list.stream().forEach(s -> System.out.println(s));

System.out.println("-----------------");

//2.双列集合不能直接获取流，需要转换为单列集合才能获取流
HashMap<String,Integer> map = new HashMap<>();
map.put("张三",20);
map.put("李四",19);
map.put("王五",18);

//获取所有的键Set集合，再获取流
map.keySet().stream().forEach(s -> System.out.println(s));
//获取所有的值Collection集合，，再获取流
map.values().stream().forEach(s-> System.out.println(s));
//获取所有的键值对集合，再获取流
map.entrySet().stream().forEach(s-> System.out.println(s.getKey()+"="+s.getValue()));

System.out.println("-------------------------");
//3. 数组获取流, 数组中的元素只能是引用类型不能是基本类型
//Integer[] arr = {10,20,30,40,50};
//Stream.of(arr).forEach(s-> System.out.println(s));
Stream.of(10,20,30,40,50).forEach(s-> System.out.println(s));
```



### 2. Stream流的中间操作方法

下面的这些方法返回值都是Stream流，调用完方法之后还可以继续调用流的方法

```java
filter: 过滤(保留满足条件的元素)
limit: 截取前面几个元素
skip: 跳过前面几个元素
distinct: 去除重复元素
max: 获取流中元素的最大值
min: 获取流中元素的最小值
sorted: 对流中的元素进行排序

average: 求流中元素的平均值，IntStream和DoubleStream可以调用
```



### 3. Stream流终结方法

调用完方法之后结果不再是一个Stream流，不能再继续调用流的方法

```java
forEach: 遍历流中的元素
count: 获取流中元素的个数
```



### 4. 收集方法

流可以对集合或者数组进行操作，但是原来集合或者数组中的元素没有变化的。如果想把流中的元素在收集到集合或者数组中，可以用下面的方法

```java
collect(Collectors.toList()): 收集成List集合
collect(Collectors.toSet()): 收集成Set集合
collect(Collectors.toMap(键的lambda，值的lamdba)): 收集成Map集合

toArray(value->new 数据类型[value]): 把流转化为指定类型的数组
```



## 三、异常【了解】

### 1. 什么是异常

```java
异常就是程序在编译或者运行时的一些不正常状况。

Java语言的设计者，早就预判到Java程序员在使用代码时，由于操作不当，导致一些问题，为了告诉程序是什么问题，就有了异常机制。【通过异常告诉程序员代码出现了什么问题】

由于问题有很多种，每一种问题就用一个类来表述
	ArrayIndexOutOfBoundsException： 数组索引越界异常
	NullPointerException: 空指针异常
	...        
```



### 2. 异常的体系

```java
由于异常类有很多，有些异常来描述的问题是有共性的，所以就可以进行抽取形成了异常的继承体系；

Throwable类
	--Error类：所有错误的父类(用代码无法解决)
	--Exception类：所有异常类的父类(用代码可以处理的)
    	--RuntimeException类及其子类：运行时期异常
    	--非RuntimeException所有子类：编译时异常(受检异常)
```



### 3. 异常的产生

异常的产生一般是在API方法中，编写方法的人考虑到方法的调用者可能会传递非法数据，就需要对非法数据进行校验。如果校验不通过，就需要通过`throw new 异常类()`给调用者一个异常，让调用者知道你错了。

```java
/**
* 打印1~100中间的整数
* @param n
*/
public static void method(int n) throws NumberOverSizeException{
    //一般在方法中先对非法数据进行校验
    if(n<=0 || n>100){
        throw new NumberOverSizeException("数据过大或者过小"); //当方法中产生一个编译时异常，必须在方法上用throws声明
    }
    //后面再写正常代码
    System.out.println(n+"合法数据");
}
```



### 4. 异常的处理

当用户调用一个方法时，如果没有按照方法的规则传递参数，就会触发异常。调用者就需要处理异常

- 为了让方法能够继续执行，可以使用try...catch处理。

```java
public static void main(String[] args){
    try{
       method(125);
    }catch(NumberOverSizeException e){
        System.out.println("数据不合法");
    }
}
```

- 调用者不想处理，可以继续往外抛

```java
public static void main(String[] args) throws NumberOverSizeException{
      method(125);
}
```



### 5. 自定义异常

如果API官方提供的异常类，不足以描述你的问题，就可以自己写一个异常类来描述自己的问题。

要求：继承Exception或者RuntimeException【见名知道意思】

```java
/*
自定义异常类： 数据过大异常，这是编译异常
 */
public class NumberOverSizeException extends Exception {
    public NumberOverSizeException() {
    }

    //创建异常对象时，赋值异常的描述信息
    public NumberOverSizeException(String message) {
        super(message);
    }
}
```







