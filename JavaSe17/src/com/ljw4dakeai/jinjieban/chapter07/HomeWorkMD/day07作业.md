# 简答题

## 1. 简单题一

请描述一下你对可变参数的理解

```properties
答 : 本质上是一个数组, 简化了传入时定义参数

```

## 2. 简答题二

请写出Stream流有哪些中间操作方法，并描述其含义

```properties
filter  : 过滤流中的数据
map     : 流中的数据做转换    
reduce  : 对流中的数据按照自定义规则聚合
sorted  : 对流中得数据排序
distinct: 对流中的数据去重
concat  : 合并两个流
limit   : 去除流中的前n个数据
skip    : 跳过流中的数据
max     : 获区流中数据的最大值
min     : 获取流中数据的最小值
mapToXxx:将流中的数据转化为Xxx型数据的流
averavg :对IntStream和DoubleStream中的数据求平均值(这两个流中特有的值)

```



请写出Stream流有哪些终结操作方法，并描述其含义

```properties
cout    : 获取流中数据的个数
forEach : 遍历流中的数据 
```



请写出Stream流有哪些收集方法，并描述其含义

```properties
collect(Collectors.toMap(key -> {}, value ->{})): 将流中的数据收集为Map
collect(Collectors.toList(value -> {} )): 将流中的数据收集为List
collect(Collectors.toSet(value -> {})) : 将流中的数据收集为Set
toArray(类型[]::new) :  将流中数据收集为数组
```



## 3. 简单题三

请写出任意5种异常，在什么情况下产生

```properties
ArrayIndexOutBoundsException: 在索引越界时产生
NullPointException : 空指针异常
ClassCastException : 类型转换异常
NumberFormatException : 数字格式化异常
ArithmeticException :  算术异常
```



## 4. 简答题四

请写出异常的继承体系结构

```
 --Error
 --Exception
    --RuntimeException 及其子类
    --非RuntimeException 及其子类

```





# 编程题

## 1. 编程题一

已经给你准备好下面的元素，按要求完成代码

```
//准备好一个集合
ArrayList<String> list1 = new ArrayList<>();
Collections.addAll(list1,"金毛狮王","周芷若", "周芷若","张无忌","灭绝师太","灭绝师太","张三丰", "张翠山", "小昭", "赵敏");

ArrayList<String> list2 = new ArrayList<>();
Collections.addAll(list2,"杨过","小龙女","张三丰", "张翠山", "小昭", "赵敏");

//1.获取两个集合的流
        
//2.将两个流合并为一个流
       
//3.过滤姓名长度大于2的元素、截取前面8个、跳过前面1个、去重重复元素，打印剩余元素
```

代码如下

```java
public class Test1 {
    public static void main(String[] args) {
        
    }
}

```





## 2. 编程题二

按要求完成下面的需求：

```
1.定义一个字符串数组
	Integer[] arr = {123,456,777,345,345,222,999,222,110,120,567};
3.对元素按照降序排列（可以使用流的sort方法，虽然我没讲，但是我相信你会用的）
4.截取前面8个
5.跳过前面3个
6.去除重复元素
7.过滤保留偶数元素
8.遍历打印剩余元素

学习小技巧：调用完一个方法之后使用forEach测试一下，看是否和目标项目，这样可以加深印象。
```

```java
public class Test3 {
    public static void main(String[] args) {
        
    }
}
```



## 3. 编程题三

按要求完成下面的需求

```
1.创建一个Student类，有name和age两个属性	
2.创建一个ArrayList集合，往集合中添加10个Student对象
3.使用Stream流过滤集合中年龄>20的元素
4.截取前面的8个元素
5.跳过前面的2个元素
6.把Stream流中剩余的元素打印

学习小技巧：学习小技巧：调用完一个方法之后使用forEach测试一下，看是否和目标项目，这样可以加深印象。
```

下面是给你提供好的材料代码

```
ArrayList<Student> list=new ArrayList<>();
list.add(new Student("张三",20));
list.add(new Student("李四",18));
list.add(new Student("王五",19));
list.add(new Student("赵六",25));
list.add(new Student("前妻",27));
list.add(new Student("王炸",28));
list.add(new Student("小王",26));
list.add(new Student("大王",24));
list.add(new Student("蘑菇头",23));
list.add(new Student("妹爷",29));
list.add(new Student("老王",30));
list.add(new Student("老李",22)); 
```

代码如下：

```java
public class Test3 {
    public static void main(String[] args) {
        
        
    }
}
```

