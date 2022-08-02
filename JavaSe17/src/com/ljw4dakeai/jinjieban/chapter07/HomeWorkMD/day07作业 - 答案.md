# 简答题

## 1. 简单题一

请描述一下你对可变参数的理解

```java
答：可变参数允许让方法可以接收多个参数
```

## 2. 简答题二

请写出Stream流有哪些中间操作方法，并描述其含义

```java
filter: 按照指定条件过滤流中的元素
limit:截取流中指定的前面几个元素
skip: 跳过前面几个元素
map: 将流中的元素转换为其他类型的元素
distinct: 去除重复元素
sorted: 对流中的元素排序
```



请写出Stream流有哪些终结操作方法，并描述其含义

```java
count: 统计流中剩余的元素
forEach: 遍历流中的元素
```



请写出Stream流有哪些收集方法，并描述其含义

```java
collect(Collectors.toList());//将流中的元素收集为List集合
collect(Collectors.toSet());//将流中的元素收集为Set集合
collect(Collectors.toMap(
	lamdba表达式1, //返回键
    lamdba表达式2 //返回值
)); //将流中的元素收集为Set集合
```



## 3. 简单题三

请写出任意3种异常，在什么情况下产生

```java
如：ArrayIndexOutBoundsException: 在索引越界时产生
```



## 4. 简答题四

请写出异常的继承体系结构

```java
Throwable类
   -- Exception: 异常类
   	 -- RuntimeException：运行时异常
   	 -- 非RuntimeException: 非运行时异常（编译时异常）
   -- Error: 错误
```





# 编程题

## 1. 编程题一

已经给你准备好下面的元素，按要求完成代码

```java
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
        //准备好一个集合
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"金毛狮王","周芷若", "周芷若","张无忌","灭绝师太","灭绝师太","张三丰", "张翠山", "小昭", "赵敏");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"杨过","小龙女","张三丰", "张翠山", "小昭", "赵敏");

        //1.获取两个集合的流
        //2.将两个流合并为一个流
        Stream<String> stream = Stream.concat(list1.stream(), list2.stream());

        //3.过滤姓名长度大于2的元素、截取前面8个、跳过前面1个、去重重复元素，打印剩余元素
        stream.filter(s->s.length()>2).limit(8).skip(1).distinct().forEach(s-> System.out.println(s));
    }
}

```





## 2. 编程题二

按要求完成下面的需求：

```java
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
        Integer[] arr = {123,456,777,345,345,222,999,222,110,120,567};
        //获取流-->降序排列-->截取8个-->跳过1个-->去重-->过滤保留偶数-->遍历打印
        Stream.of(arr).sorted((o1, o2) -> o2-o1).limit(8).skip(1).distinct().filter(s->s%2==0).forEach(s-> System.out.println(s));
    }
}
```



## 3. 编程题三

按要求完成下面的需求

```java
1.创建一个Student类，有name和age两个属性	
2.创建一个ArrayList集合，往集合中添加10个Student对象
3.使用Stream流过滤集合中年龄>20的元素
4.截取前面的8个元素
5.跳过前面的2个元素
6.把Stream流中剩余的元素打印

学习小技巧：学习小技巧：调用完一个方法之后使用forEach测试一下，看是否和目标项目，这样可以加深印象。
```

下面是给你提供好的材料代码

```java
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
        ArrayList<Student> list = new ArrayList<Student>();
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

        list.stream().filter(s->s.getAge()>20).limit(8).skip(2).forEach(s-> System.out.println(s));
    }
}
```

