## 题目1

**所有文件的存储, 使用相对路径放在当前模块下**

需求：请编写程序，定义一个Properties对象，存储以下内容：

```
Properties pro = new Properties();
pro.setProperty("品名","Iphone11 Pro Max");
pro.setProperty("颜色","暗夜绿");
pro.setProperty("存储容量","256G");
pro.setProperty("价格","10899");
```

* 请将上述内容写入到文件：”test1.properties”中

* 答案

```

```



## 题目2

请编写程序，定义一个Properties对象，将文件”test1.properties”的内容读取到Properties对象中，遍历，并打印每个键值对

* 答案

```

```



## 题目3

请按以下要求编写程序：

1).定义一个学生类，有以下属性：姓名、性别、年龄、分数

​        无参、全参构造方法，get/set方法



2).定义main()方法，定义一个存储Student的集合，并初始化一些数据：

```
List<Student> stuList = new ArrayList<>();
stuList.add(new Student("迪丽热巴","女",18,99));
stuList.add(new Student("古力娜扎","女",19,98));
stuList.add(new Student("周杰伦","男",20,88));
stuList.add(new Student("蔡徐坤","男",19,78));
```

定义一个字符缓冲输出流BufferedWriter，将学员信息写入到”test2.txt”中，每个学员信息占一行，每个字段之间用,符号隔开

例如：

​              迪丽热巴,女,18,99

​              古力娜扎,女,19,98

​              周杰伦,男,20,88

​              蔡徐坤,男,19,78



* 答案：

```

```



## 题目4

定义一个字符缓冲输入流BufferedReader对象，读取”test2.txt”文件，一次读取一行，将每行数据封装为一个Student对象，并将Student对象存储到一个集合。遍历并打印集合的所有Student信息。

* 答案：

```

```



## 题目5

完成课堂上《出师表》案例，写完的同学再写一遍巩固一下，最好能自己独立写出来。

通过这个案例，你能学会了BufferedReader读取数据、BufferedWriter写入手胡建、集合的排序、集合的遍历等。

```java

```



## 题目6

- 创建一个配置文件如下`config.properties`（不需要用代码创建，手动创建即可），speed的值表示小蛇的移动速度

```
speed=50 
```

- 写一个测试类，在静态代码块中读取配置文件中speed的值
- 在main方法中输出：“当前小蛇的移动速度是：50”`



## 题目7

- 手动在模块目录下创建一个a.txt文件（不需要用代码创建），修改它的编码格式为GBK编码
- 编写代码，使用InputStreamReader指定GBK编码读取a.txt文件中的内容，并使用UTF-8编码将读取到的内容，写入到b.txt文件中

```java

```



## 题目8

使用FileUtils工具类，完成文件复制、文件夹复制、获取文件夹大小(sizeOf方法)、删除文件夹（deleteDirectory方法）操作

```java

```

