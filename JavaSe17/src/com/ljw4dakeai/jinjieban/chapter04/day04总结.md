## 一、Date类【重点】

表示一个日期和时间，单位是毫秒

- Date构造方法

```java
public Date()
    用于创建表示当前系统时间的Date对象
public Date(long time)
    用于创建一个指定时间的Date对象
    参数：自1970年1月1日0时0分0秒以来的毫秒值
```

- Date的成员方法

```java
public long getTime()
    获取Date对象的毫秒值
public void setTime(long time)
    设置Date对象的毫秒值
```



## 二、SimpleDateFormat类【掌握】

因为打印一个Date对象输出的日期格式不是我们想要的，就可以使用SimpleDateFormat类对日期进行格式化和解析；

```java
格式化：把Date对象转换为String
解析：把String转换为Date对象

【注意：不管进行格式化还是解析，都需要规定日期的格式，需要用一些特殊的字母拼接而成】
    y	年
    M	月
    d	日
    H	小时
    m	分钟
    s	秒钟
举例1: "yyyy年MM月dd日 HH时mm分ss秒"
举例2: "yyyy-MM-dd HH:mm:ss"
```

- 格式化日期的代码如下

```java
SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
String str = sdf.format(new Date());
```

- 解析日期的代码如下

```java
SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
Date date = sdf.parse("2002年12月18日 18时20分19秒");
```



## 三、Calendar类【了解】

日历类，可以对日历的各个字段（年、月、日、时、分、秒、星期.....）进行操作（获取、修改、计算）

- 获取Calendar的子类对象

```java
Calendar c = Calendar.getInstance();
```

- 调用Calendar类提供的方法

```java
 //获取年、月、日的值
int year = c.get(Calendar.YEAR);
int month = c.get(Calendar.MONTH)+1; //月份是从0开始的
int day = c.get(Calendar.DAY_OF_MONTH);
ystem.out.println(year+"年"+month+"月"+day+"日");

//修改年、月、日
c.set(Calendar.YEAR,2008);
c.set(Calendar.MONTH,7);    //7表示8月
c.set(Calendar.DAY_OF_MONTH,8);

//计算年、月、日
c.add(Calendar.DAY_OF_MONTH,-10); //减10天
```

- 扩展：获取星期几

```java
//注意：星期中的第一天是星期日
/*
   星期日,星期一,星期二,星期三,星期四,星期五,星期六
   1     2     3     4     5     6     7
*/
int index = c.get(Calendar.DAY_OF_WEEK);
String[] weeks = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
String week = weeks[index];
System.out.println(week);
```



## 四、常见算法【了解】

- 冒泡排序

```java
/**
冒泡排序核心思想： 把相邻的两个元素两两比较，小的往前放，大的往后放
排序的规律：
    1.每一轮是从0开始，把相邻的两个元素进行比较
        索引：j和j+1
    2.比较的轮数是长度-1
    3.每一轮比较的次数比上一轮要少一次
* 对int数组进行排序
* @param array  要排序的数组
*/
public static void sort(int[] array){
    //比较的轮数：要比长度少一次
    for (int i = 0; i < array.length-1; i++) {
        //每一轮比较的次数：比上一轮少一次
        //-1的目标：为了防止索引越界
        //-i的目标：为了每一轮比较的次数比上一轮少一次
        for (int j = 0; j < array.length-1-i; j++) {
            //把相邻的两个元素比较，索引：j和j+1
            if(array[j]>array[j+1]){
                int temp = array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
    }
}
```

- 二分查找（折半查找）

```java
/*
二分查找核心思路： 首先要求元素从小到大排序，每次查找中间位置的元素
    第一步：确定开始和结束的索引
            int start = 0;
            int end = 长度-1;
    第二步：找到start和end中间的索引位置
            int mid = (start+end)/2;
    第三步：把mid索引位置的元素和目标元素进行比较
            比目标元素大：end=mid-1
            比目标元素小：start=mid+1
            和目标元素相同：找到了，mid就是要找的索引
    需要把第二步和第三步循环执行，直到找到为止

* 查找数组中指定元素的索引位置
* @param array  要查找的数组
* @param key   要查找的元素
* @return  返回元素的索引
*/
public static int getIndex(int[] array, int key){
    //第一步：确定开始和结束的索引
    int start = 0;
    int end = array.length-1;

    while (start<=end) {
        //第二步：找到start和end中间的索引位置
        int mid = (start+end)/2;

        //第三步：把mid索引位置的元素和目标元素进行比较
        if(array[mid]>key){
            //比目标元素大：end=mid-1
            end = mid-1;
        }else if(array[mid]<key){
            //比目标元素小：start=mid+1
            start=mid+1;
        }else {
            return mid; //如果找到了，mid就是要找的索引
        }
    }
    return -1; //没有找到
}
```

## 五、Arrays类【重点】

操作数组的工具类，在该工具类中提供对数组进行排序、查找等方法。

```java
public static void sort(数组)
    对数组进行排序，默认升序
    
public static void sort(数组, Comparator比较器)
     对数组进行排序，按照比较器的规则排序
     
public static String toString(数组)
     把数组转换为字符串，方便打印元素
     
public static int binarySearch(数组, 元素)
     使用二分查找法查找指定数组中的元素
     【要求：数组必须排序，而且不能重复】
```



## 六、Lambda表达式【重点】

Lambda表达式简化匿名内部类的书写。在有一个函数式接口的前提之下，才能使用lambda表达式； 

- 函数式接口：只有一个抽象方法的接口，一般会使用@FunctionalInterface进行标记

```java
@FunctionalInterface
public interface Swimming{
    public void swim(String s);
}
```

- Lamdba表达式的运用场景

当调用一个方法时，发现参数是一个函数式接口，那么就可以传递Lambda表达式

```java

public static void main(String[] args) {
    method(new Swimming() {
        @Override
        public void swim(String s) {
            System.out.println("游泳姿势是:"+s);
        }
    });

    //lamdba标准格式
    method((String s)->{
        System.out.println("游泳姿势是："+s);
    });

    //lamdba省略数据类型
    method((s)->{
        System.out.println("游泳姿势是："+s);
    });

    //lamdba省略数据类型
    method((s)-> System.out.println("游泳姿势是："+s));

    //lamdba省略数据类型
    method(s-> System.out.println("游泳姿势是："+s));

    //如果lamdba表达式的参数，正好可以被一个方法接收，那么久可以用方法引用
    //格式：对象名::方法名 【了解】
    method(System.out::println);
}

public static void method(Swimming sw){
    sw.swim("仰泳");
}
```



## 七、正则表达式【了解】

- 正则表达式的作用

```java
答：正则表达式专门用于对字符串进行合法性校验（手机号码、邮箱账号...）
```

- 正则表达式的语法规则

```java
[abc]	       只能是a, b, 或c
[^abc]	       除了a, b, c之外的任何字符
[a-zA-Z]               a到z A到Z，包括（范围）
[a-d[m-p]]	       a到d，或m通p：（[a-dm-p]联合）
[a-z&&[def]]	       d, e, 或f(交集)
[a-z&&[^bc]]	       a到z，除了b和c：（[ad-z]减法）
[a-z&&[^m-p]]     a到z，除了m到p：（[a-lq-z]减法）

.	任何字符
\d	一个数字： [0-9]
\D	非数字： [^0-9]
\s	一个空白字符： [ \t\n\x0B\f\r]
\S	非空白字符： [^\s]
\w	[a-zA-Z_0-9] 英文、数字、下划线
\W	 [^\w] 一个非单词字符

X?	X , 一次或根本不
X*	X，零次或多次
X+	X , 一次或多次
X {n}	X，正好n次
X {n, }	X，至少n次
X {n,m}	X，至少n但不超过m次
```

- 正则表达式案例

```java
/*
需求1：校验手机号码是否正确
    手机号码举例：13545176688  16978788888
    分析手机号码的规律：
        1)手机的号码的第一位都是1
        2)除了第一位其他的每一个都是0到9的任意数字
        3)手机号码的位数固定11位
     按照分析的规律来写正则表达式： "[1][0-9]{10}"

2.校验邮箱是否正确
    邮箱账号的举例： itheima@itcast.cn    5783667788@qq.com    zhagnan_123@163.com.cn
    分析有效的规则：
           1)每一个邮箱多有一个@符号
           2)@的左边：字母数字或者下划线，出现一次或多次
           3)@的右边：字母数字或下划线，出现一次或者多次
           4)后缀： 点字母数字或者下划线，出现一次或者多次
     使用正则表达式来表示规则："\w+[@]\w+([\.]\w+)+"
 */
public class Demo2 {
    public static void main(String[] args) {
        String phone = "13545176688";
        //校验手机号码
        boolean b1 = phone.matches("[1][0-9]{10}");
        System.out.println(b1);

        String emial="zhagnan_123@163.com.cn";
        //校验邮箱是否正确
        boolean b2 = emial.matches("\\w+[@]\\w+([\\.]\\w+)+");
        System.out.println(b2);
    }
}
```



