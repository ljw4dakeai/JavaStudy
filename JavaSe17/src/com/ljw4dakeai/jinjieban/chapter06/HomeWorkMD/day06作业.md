

# 简答题

## 1. 简答题一

写出Collection的体系结构（可以用文字描述，也可以画图）

```
---Collection
    ---List
        ---ArrayList
        ---LinkedList
    ---Set
        --HashSet
            ---LinkedHashSet
        ---TreeSet

```



## 2. 简答题二

写出下列集合底层采用的数据结构，以及它们的特点

```properties
ArrayList底层:数组 
ArrayList特点: 查询快, 增删慢
LinkedList底层: 双向链表
LinkedList特点: 查询慢, 增删快


HashSet底层: 哈希表, 双向链表, 红黑树
HashSet特点: 无序, 无索引, 不可重复
TreeSet底层: 红黑树
TreeSet特点 : 可排序, 无索引, 不可重覅
```





# 代码题

## 3. 代码题一

- 创建一个员工类Employee，有姓名name、年龄age、工资salary属性
- 创建3个员工对象，添加到TreeSet集合中
- 要求按照员工的工资排序；如果工资相同，按照年龄排序；如果年龄也相同，再按照姓名的字典顺序排序；

```java

```

## 4. 代码题二

- 定义一个学生类，要求有姓名、语文成绩、数学成绩、英语成绩
- 选择合适的集合，往集合中添加3个学生对象，并按照总分从高到低输出到控制台
- 如果总分相同，按照数学成绩排序

```java

```



## 5. 代码题三

- 定义一个Phone类，有品牌brand，价格price两个属性
- 选择合适的集合，往该集合一中添加3个Phone对象，要求元素不能重复，并且保证存取顺序

```java

```



## 6. 代码题四

完成课上的斗地主案例（对玩家的牌进行排序）

```java

```



## 7. 代码题五

需求 :  利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量 

- 如用户输入字符串:"helloworldjava",程序输出结果：
- h-1 e-1 l-3 o-2 w-1 r-1 d-1 j-1 a-2 v-1   

```java
思路提示：
 1.可以创建一个HashMap集合，键用Character类型，值有Integer类型	
 	键表示每一个字符，值表示每一个字符出现的次数
 	
 2.遍历字符串获取每一个字符，准备把字符往Map集合中添加
    在添加之前先判断Map集合中是否包这个字符
       1)如果不包含这个字符，就把这个字符作为键，值是1，添加到Map集合中去
       2)如果集合中已经包含这个字符，就把字符对应的获取出来，再加1，添加到集合中去。
         【ps: 利用的是键如果重复，旧值替换新值的特性】
```





## 8. 代码题六

定义一个商品类Product类，有商品名称，价格和购买数量三个属性

```java

```

定义一个测试类

```java
public class Test6 {
    public static void main(String[] args) {
        //1.创建一个ArrayList集合存储2个商品对象
        ArrayList<Product> list1 = new ArrayList<>();
       

        //2.创建另一个ArrayList集合存储3个商品对象
        ArrayList<Product> list2 = new ArrayList<>();
       

        //3.创建一个HashMap集合，用于存储每一个订单对应的商品
        //键：订单号（字符串类型）
        //值：该订单的多个商品，List类型
        HashMap<String, ArrayList<Product>> map = new HashMap<>();
        map.put("000001",list1);
        map.put("000002",list2);

        //4.遍历Map集合，打印每一个订单号，和每一件商品对象的信息
    }
}
```







