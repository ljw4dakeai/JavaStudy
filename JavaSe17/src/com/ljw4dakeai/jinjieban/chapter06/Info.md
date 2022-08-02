### generic(泛型)

```properties
优点:(1), (2) 
(1):编译时起到限定数据类型的作用
(2):避免强制转换的麻烦
介绍:JDK5之后就引入了泛型的概念 在编译阶段就限制了 ,避免了强制转化
```

#### 泛型类

```java
public class 类<T> {
    public void add(E e) {
        if (index < objects.length) {
            objects[index] = e;
            index++;
        } else {
            System.out.println("list中的数据已经满了");
        }
    }

    /**
     * 获取对应索引位置的元素
     * @param index 索引
     * @return 返回元素
     */
    public E get(int index) {
        if (index <= this.index) {
            return (E) objects[index];
        } else {
            return null;
        }
    }
}
```

#### 泛型接口

````java
public interface 接口<T> {
    E get(int index);
}
````

#### 泛型方法

```java
class Test {
    public <T> 类型<泛型> addAll(类型<泛型> 变量名, 泛型 变量名) {
    }

    public static <T> Collection<T> addElmToCollection(Collection<T> collection, T t1, T t2, T t3) {
        collection.addAll(Arrays.stream(new Object[]{t1, t2, t3}).map(val -> (T) val).toList());
        return collection;
    }
}
```

### 泛型匹配

```properties
<?>:表示通配所有泛型
<?extends类型>:表示可以传入所有类型的子类型
<?super类型>:表示可以传入所有类型的父类型
```

### 可变参数

> 可变参数可以看作是一个数组

```java
class Test {
    public static void func(类型... 参数) {

    }

    public static int sum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static void multiply(int value, int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum * value);
    }


    //不可以这样使用
//    public static void multiply(int... arr, int value){
//        int sum = 0;
//        for (int i : arr) {
//            sum += i;
//        }
//        System.out.println(sum *value);
//    }

    //注意
    //方法(参数类型... 变量名)
    //接受多个相同类型的参数
    //本质上还是一个数组
    //
    //可变参数后面不可以再添加任何参数, 只能放在前面

}
```

### Collections(集合工具类)

> 为方便操作集合

```java
class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "张三", "王五", "嘿嘿嘿!");
        System.out.println(strings);


        //打乱集合
        Collections.shuffle(strings);
        System.out.println(strings);


        //自然排序 升序
        Collections.sort(strings);
        System.out.println(strings);


        //自定义排序
        Collections.sort(strings, (val1, val2) -> val2.compareTo(val1));
        System.out.println(strings);

        ArrayList<String> nums = new ArrayList<>();
        //添加一些元素
        Collections.addAll(nums, "10", "20", "40", "80");

        System.out.println(nums.stream().map(Integer::parseInt).toList());
    }
}
```

### Map(双列集合)

- 集合的一些常用方法

```java
class Test {
    public static void main(String[] args) {
        //put添加元素
        //如果遇到后面相同的key, 值会覆盖前面的值
        HashMap<String, String> stringStringHashMap = new HashMap<String, String>();
        stringStringHashMap.put("张三", "湖北省");
        stringStringHashMap.put("李四", "湖南省");
        stringStringHashMap.put("赵四", "东北省");
        stringStringHashMap.put("张三", "山东省");

        System.out.println(stringStringHashMap);

        //remove 删除元素
        //通过key 移除键值对
        stringStringHashMap.remove("张三");

        System.out.println(stringStringHashMap);

        //get 获取值
        //通过key获取值
        stringStringHashMap.get("赵四");

        //判断是否包含key
        System.out.println(stringStringHashMap.containsKey("张三"));
        System.out.println(stringStringHashMap.containsKey("孙六"));


        //判断是否包含value
        System.out.println(stringStringHashMap.containsValues("山西省"));
        System.out.println(stringStringHashMap.containsValues("湖南省"));

        //判断是否为空
        System.out.println(stringStringHashMap.isEmpty());

        //清空map
        stringStringHashMap.clear();
        System.out.println(stringStringHashMap.isEmpty());
        System.out.println(stringStringHashMap);


    }
}
```

 - HashMap

```properties
底层 : 哈希表 + 链表 + 红黑树
HashSet : 是通过HashMap实现的, 将HashMap的value设置为空Object并且藏起来
特点 : 无序, 无索引
```


 - LinkedListMap

```properties
底层 : 哈希表 + 双向链表
特点 : 有序, 有索引
```