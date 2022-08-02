## 一、Collection集合体系

```java
Collection接口：定义了所有单列集合共性的一些方法
	-- List接口：有序、有索引、可以重复
		-- ArrayList类：数组结构(查询快、增删慢)
		-- LinkedList类：链表结构(查询慢、增删快)
		
	-- Set接口：没有索引、不可以重复
		--HashSet类：无序，哈希表结构：数组+链表+红黑树
		--LinkedHashSet类：有序，链表+哈希表
		--TreeSet类：可以排序，红黑树结构【后面讲】
```

## 二、Collection集合的通用方法

```java
public boolean add(E e)
    往集合的末尾添加元素
    参数：表示要添加的元素; 
	返回值：true表示添加成功，false表示添加失败
    
public boolean remove(E e)
     删除集合中指定的元素
     参数：要删除的元素； 
     返回值：删除成功(true)或者失败(false)
        
public boolean contains(E e)
      判断集合中是否包含指定的元素
      参数：需要判断的元素
      返回值：如果包含返回true, 不包含返回false

public boolean isEmpty()
      判断集合是否为空
      返回值：如果为空返回true; 不为空返回false

public void clear()
      清空集合中的元素

public int size()
      获取集合的长度

public Object[] toArray()
      把集合转换为数组
```

## 三、集合的遍历方式

- 迭代器遍历集合

```java
public Iterator iterator()
    获取集合的迭代器；返回Iterator对象
public boolean hasNext()
    判断当前位置是否有元素可以获取
public E next()
    获取迭代器当前位置的元素
```

演示集合遍历

```java
ArrayList<String> list = new ArrayList<>();

//添加元素，使用add方法
list.add("张三丰");
list.add("张无忌");
list.add("铁拐李");
list.add("吕洞兵");
list.add("金毛狮王");

//第一步：获取迭代器对象（用于遍历集合的对象）
Iterator<String> it = list.iterator();
//第二步：判断当前位置是否有元素可以获取
while (it.hasNext()){
    //第三步：获取当前位置的元素
    String e = it.next();
    System.out.println(e);
}
```



- 增强for遍历集合

```java
ArrayList<String> list = new ArrayList<>();

//添加元素，使用add方法
list.add("张三丰");
list.add("张无忌");
list.add("铁拐李");
list.add("吕洞兵");
list.add("金毛狮王");

//增强for遍历集合，实际上是迭代器的简化写法。
for(String s: list){
    System.out.println(s);
}
```



- forEach方法遍历

forEach方法是JDK8版本以后才有的，结合的Lambda表达式一起使用。

```java
ArrayList<String> list = new ArrayList<>();

//添加元素，使用add方法
list.add("张三丰");
list.add("张无忌");
list.add("铁拐李");
list.add("吕洞兵");
list.add("金毛狮王");

//调用forEach方法遍历
list.forEach(s->System.out.println(s));
```



## 四、数据结构【了解】

数据结构指的是数据的组织方式，数据以不同的方式组织，其特点也不一样。

```java
栈结构：先进后出
队列结构：先进先出

数组结构：查询快、增删慢
链表结构：查询慢、增删快

二叉树结构：每一个节点最多只有两个子节点

二叉查找树：
	1)每一个节点最多只有两个子节点
	2)任意一个节点左边的节点都比自己小，右边的节点都比自己大

二叉平衡树：
	1)每一个节点最多只有两个子节点
	2)任意一个节点左边的节点都比自己小，右边的节点都比自己大
	3)任何一个节点它的左子树和右子树的高度差不超过1

红黑树：通过自己的红黑规则实现的
	1)任何一个节点必须是红色或者黑色，根节点是黑色
	2)如果一个节点没有子节点，那么该节点则指向Nil,Nil节点称之为叶子节点
	  叶子节点必须是黑色
	3)如果一个节点为红色，那么它的子节点必须是黑色(不能出现两个红色节点相连)
    4)任何一个节点到其叶子节点的简单路径上，均包含相同的黑色节点数目
```



## 五、List系列集合

- List系列集合多了一些针对索引操作的方法

```java
public void add(int index, E e)
    在指定索引位置添加元素
    参数1：指定的索引
    参数2：新添加的元素
    
public E remove(int index)
    根据索引位置删除元素
    参数1：指定索引位置
   	返回值：被删除的元素

public E set(int index, E e)
    修改指定索引位置的元素
    参数1：指定索引位置
    参数2：新的元素
    返回值：被修改的元素
    
public E get(int index)
    获取指定索引位置的元素
    参数：指定的索引位置
    返回值：该索引位置的元素
```

- 不同的集合底层的数据不一样，特点也不一样

```java
ArrayList: 数组结构(查询快、增删慢)
LinkedList：双向链表结构(查询慢、增删快)
```



## 六、Set系列集合

Set系列集合都是没有索引的，它们没有任何特有方法，它们的方法全都来自于Collection

```java
--HashSet类：无序，哈希表结构：数组+链表+红黑树
--LinkedHashSet类：有序，链表+哈希表
--TreeSet类：可以排序，红黑树结构【后面讲】
```



## 七、结束语

```java
1.在前面讲到的这些集合中，ArrayList集合时最常用的
2.其他集合的运用除了特点和ArrayList不一样，使用方式完全一样。
```





