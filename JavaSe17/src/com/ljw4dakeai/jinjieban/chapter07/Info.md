### 不可变集合

- 介绍

```properties
使用条件:当我们只需要获取集合中的数据,不需要进行其他操作的时候使用
好处:保证数据不会被更改, 线程安全
```

- 使用方法

```java
import java.awt.datatransfer.StringSelection;
import java.util.Map;

class Test {
    public static void main(String[] args) {
        List<String> immutableStringsList = List.of("张三", "李四", "赵四", "王五");
        System.out.println(immutableStringsList);

        Set<String> immutableStringsSet = Set.of("张三", "李四", "赵四", "王五");
        System.out.println(immutableStringsList);


        Map<String, String> immutableStringsMap = Map.of("张三", "湖北", "李四", "江西");
        System.out.println(immutableStringsMap);

    }
}
```

### Stream流

- 获取Stream流

```properties
单列获取Stream流:集合.stream()
双列集合(将双列集合变成单列集合):双列集合.keySet().stream() , 双列集合.values().stream(), 双列集合.entrySet().stream()
数组获取流:Arrays.stream(数组) // 数组不需要是引用数据类型 , Stream.of(数组) // 这个数组必须是引用数据类型
```

```java
import java.util.stream.Stream;

class Test {
    public static void main(String[] args) {
        //单列获取Stream流(通过集合.stream())
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "Hello", "Java", "Word");
        strings
                .stream()
                .forEach(System.out::println);


        //双列集合(将双列集合变成单列集合)
        //双列集合.keySet().stream()
        //双列集合.values().stream()
        //双列集合.entrySet().stream()
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("李四", "湖北");
        stringStringHashMap.put("赵四", "山东");
        stringStringHashMap.put("大表哥", "江西");
        stringStringHashMap.put("嘿嘿嘿", "湖南");

        stringStringHashMap
                .keySet()
                .stream()
                .forEach(System.out::println);

        stringStringHashMap
                .values()
                .stream()
                .forEach(System.out::println);

        stringStringHashMap
                .entrySet()
                .stream()
                .forEach(System.out::println);


        //数组获取流(工具类)
        //Arrays.stream(数组)
        int[] ints = {60, 50, 40, 20, 10};
        Arrays
                .stream(ints)
                .sorted()
                .forEach(System.out::println);


        //数组获取流of方法
        //Stream.of(数组) // 这个数组必须是引用数据类型
        Integer[] integers = {10, 20, 40, 50, 60};
        System.out.println(
                Stream
                        .of(integers)
                        .sorted((val1, val2) -> val2 - val1)
                        .reduce(Integer::sum)
        );

    }
}

```

- Stream流中间操作

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

```java
class Test{
    public static void main(String[] args) {
        ArrayList<String> stringsOne = new ArrayList<>();
        ArrayList<String> stringsTwo = new ArrayList<>();
        Collections.addAll(stringsOne, "张无忌", "张三丰", "白眉鹰王", "金毛狮王", "杨过", "小龙女");
        Collections.addAll(stringsTwo, "宋江", "鲁智深", "吴用", "金毛狮王", "杨过", "小龙女", "西门庆");

        //合并Stream.concat
        System.out.println(
                Stream
                        .concat(stringsOne.stream(), stringsTwo.stream())
                        .toList()
        );


        //去重 distinct
        System.out.println(
                Stream
                        .concat(stringsOne.stream(), stringsTwo.stream())
                        .distinct()
                        .toList()
        );


        //截取前面8个limit(8)
        System.out.println(
                Stream
                        .concat(stringsOne.stream(), stringsTwo.stream())
                        .distinct()
                        .limit(8)
                        .toList()
        );

        //跳过前面2个skip(2)
        System.out.println(
                Stream
                        .concat(stringsOne.stream(), stringsTwo.stream())
                        .distinct()
                        .limit(8)
                        .skip(2)
                        .toList()
        );


        //过滤filter (人名长度为4的)
        System.out.println(
                Stream
                        .concat(stringsOne.stream(), stringsTwo.stream())
                        .distinct()
                        .limit(8)
                        .skip(2)
                        .filter(val -> val.length() == 4)
                        .toList()
        );
    }
}
```

- Stream 流终结方法
```properties
cout    : 获取流中数据的个数
forEach : 遍历流中的数据 
```

```java
class Test{
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "张三", "李四", "张无忌", "张三丰", "周芷若", "小昭", "金毛狮王", "白眉鹰王");


        //forEach
        strings
                .stream()
                .forEach(System.out::println);

        //count
        System.out.println(
                strings
                        .stream()
                        .filter(val -> val.length() == 3)
                        .count()
        );
    }
}
```

- Stream 流收集方法
```properties
collect(Collectors.toMap(key -> {}, value ->{})): 将流中的数据收集为Map
collect(Collectors.toList(value -> {} )): 将流中的数据收集为List
collect(Collectors.toSet(value -> {})) : 将流中的数据收集为Set
toArray(类型[]::new) :  将流中数据收集为数组
```

```java
class Test{
    public static void main(String[] args) {
        ArrayList<Employee> employeesOne = new ArrayList<>();
        Collections.addAll(employeesOne,
                new Employee("孙悟空", "猴", 30000.0, 5000.0, "大闹天宫"),
                new Employee("唐僧", "男", 40000.0, 10000.0, "无"),
                new Employee("猪八戒", "猪", 3000.0, 3000.0, "调戏妇女"),
                new Employee("沙和尚", "男", 18000.0, 8000.0, "打碎琉璃盏"),
                new Employee("白龙马", "龙", 14000.0, 6000.0, "杀生")
        );


        //把流中的数据收集成List集合
        System.out.println(
                employeesOne
                        .stream()
                        .filter(val -> val.getSalary() >= 20000.0)
                        .collect(Collectors.toList())
        );


        //把流中的数据收集成Set集合
        System.out.println(
                employeesOne
                        .stream()
                        .filter(val -> val.getSalary() >= 20000.0)
                        .collect(Collectors.toSet())
        );

        //把流中的数据收集成Map集合
        System.out.println(
                employeesOne
                        .stream()
                        .filter(val -> val.getSalary() >= 20000.0)
                        .collect(Collectors.toMap(Employee::getName, Employee::getAllSalary))
        );

        //把流中的数据收集成Array数组
        System.out.println(
                Arrays.toString(
                        employeesOne
                                .stream()
                                .filter(val -> val.getSalary() >= 20000.0)
                                .toArray(Employee[]::new)
                )
        );
    }
}
```
### 异常

- 什么是异常
```
    异常就是程序在编译或者运行时的一些不正常状况。

      Java语言的设计者，早就预判到Java程序员在使用代码时，
    由于操作不当，导致一些问题，为了告诉程序是什么问题，就有了异常机制。
    [通过异常告诉程序员代码出现了什么问题]
```

- 异常的体系
```
    由于异常类有很多，有些异常来描述的问题是有共性的，所以就可以进行抽取形成了异常的继承体系
       
       --Error 所有错误的父类(通过代码无法解决)
       --Exception 所有异常的父类(通过代码可以解决)
            --RuntimeException及其子类(运行时异常)
            --非RuntimeException及其子类(编译时异常)
```

- 异常的产生
```
    异常的产生一般是在API方法中，编写方法的人考虑到方法的调用者可能会传递非法数据，就需要对非法数据进行校验。
    如果校验不通过，就需要通过`throw new 异常类()`给调用者一个异常，让调用者知道你错了。


```

- 异常的处理

    - 不处理在方法
    ```java
         class Test {
              public static void main(String[] args) throws ParseException{
                  System.out.println(func(new Scanner(System.in).nextLine()));
              }
              /**
               * 给定生日字符串, 返回对应的日期对象
               * @param birthday 用户传进来的生日字符串
               * @return 用户生日对应的Date对象
               * @throws  
               */
              public static Date func(String birthday) throws ParseException {
                  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                  return  simpleDateFormat.parse(birthday);
              }
          }
    ```
    - 处理的方法
    ```java
           class Test {
              public static void main(String[] args) {
              //   第一种方法 使用try catch解决
                  try {
                      System.out.println("请输入你的生日!");
                      System.out.println(func(new Scanner(System.in).nextLine()));
                  } catch (ParseException e) {
                      System.out.println("输入错误,请重新输入");
                  }
                  
              }
          
              /**
               * 给定生日字符串, 返回对应的日期对象
               * @param birthday 用户传进来的生日字符串
               * @return 用户生日对应的Date对象
               * @throws  
               */
              public static Date func(String birthday) throws ParseException {
                  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                  return  simpleDateFormat.parse(birthday);
              }
          }
    
    ```

- 自定义异常
```java
class NumberOverSizeException extends Exception {
    public NumberOverSizeException() {
    }

    /**
     * 创建异常对象时候赋值的异常信息
     *
     * @param message 异常信息
     */
    public NumberOverSizeException(String message) {
        super(message);
    }
}
```


