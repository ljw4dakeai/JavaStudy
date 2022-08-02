# 简答题

## 题目1 :

* 需求 :
    * 请描述 Iterator 迭代器的作用
    * 请描述 hasNext() 和 next() 两个方法的作用, 以及应该怎么配合使用
    * 请描述, 集合中如果没有元素了, 继续调用 next() 方法会出现什么问题

```
1. Iteartor是遍历集合的一种通用方式
2. hashNext()方法的作用是，判断当前有没有元素可以迭代，next()是获取元素并指向下一个元素。
3. 如果没有元素，继续调用next()会出现NoSachElementExcpetion异常
```

## 题目2 :

* 需求 :  往ArrayList添加以下元素”abc1”, ”abc2”, ”abc3”, ”abc4”.使用迭代器获取ArrayList集合中的元素
* 使用 4 种遍历方式, 对集合进行遍历

```java
class Test {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("abc1");
        stringArrayList.add("abc2");
        stringArrayList.add("abc3");
        stringArrayList.add("abc4");

        Iterator<String> iterator = stringArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String string : stringArrayList) {
            System.out.println(string);
        }

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }

        stringArrayList.forEach(System.out::println);

    }
}
```

## 题目3 :

* 需求 :
    * 请描述栈内存结构的特点
    * 请描述队列内存结构的特点

```properties
栈 ：先进后出
队列 ：先进先出
```

## 题目4:

* 需求 :  请描述 List 接口 和 Set接口的特点

```properties
List:有序,有索引, 可重复
Set:无序, 无索引, 不可重复
```

## 题目5:

* 需求 :  请说明, ArrayList集合 LinkedList集合 底层的数据结构, 以及数据结构的特点

```properties
ArrayList: 数组 , 查询快,插入删除慢
LinkedList: 双向链表 插入删除快, 查找慢
```

# 代码题

## 题目6:

* 需求 : 自定义学生类:包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.
* 创建5个学生放到 ArrayList中。获取每个学生信息，统计总分，平均分，最高分，最低分并输出

```java
//学生类
```

```java
//测试类
```

## 题目7:

* 需求 : 自定义人类:包含姓名,年龄,身高属性.私有成员变量,生成无参,有参构造方法,生成get/set方法
* 创建5个人放到ArrayList 中，找出最高的人，最矮的人并输出最高人和最矮人的信息

```java
//人类
```

```java
//测试类
```

## 题目8:

* 需求 : ArrayList有以下元素: "a","f","b","c","a","d"  对ArrayList集合去重
* 不允许使用 Set 集合 (因为是明天学的东西)

```java
//测试类
```

