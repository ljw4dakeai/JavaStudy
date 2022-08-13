# 简答题

## 1. 简答题一

```
1. GBK编码汉字占几个字节、字母占几个字节？
	2个字节, 1个字节
	
2. UTF-8编码汉字占几个字节、字母占几个字节？
	3个字节, 1个字节
```

## 2. 简答题二

什么时候会产生乱码问题？


```
答：编码格式和解码格式不同
```



# 代码题



## 3. 题目一

使用FileInputStream和FileOutputStream读取，一次读取、写入一个字节，完成复制文件的操作。

```java
public class Test1 {
    public static void main(String[] args) throws IOException {
        //1.创建流对象
        FileInputStream fis = new FileInputStream("day09_file_io\\b.txt");
        FileOutputStream fos = new FileOutputStream("day09_file_io\\a.txt");

        //2.读、写数据
        //一次读取一个字节，一次写一个字节
        int b; //用来记录每次读取的这一个字节
        while ((b = fis.read())!=-1){
            fos.write(b);
        }

        //3.是否资源
        fis.close();
        fos.close();
    }
}
```



## 4. 题目二

使用FileInputStream和FileOutputStream，一次读、写一个字节数组，完成复制文件的操作。

```java
public class Test2 {
    public static void main(String[] args) throws IOException {
        //1.创建流对象
        FileInputStream fis = new FileInputStream("day09_file_io\\b.txt");
        FileOutputStream fos = new FileOutputStream("day09_file_io\\a.txt");

        //2.读、写数据
        //一次读取多个字节，一次写多个字节
        byte[] bytes  = new byte[1024];
        int len; //每次读取的有效字节个数
        /*
         * read(bytes): 读取文件中的字节，把读取到的字节存入数组中，返回值代表读取到的有效字节个数。
         */
        while ((len = fis.read(bytes))!=-1){
            //把读取到的有效字节，写到目标文件中去
            fos.write(bytes,0,len);
        }

        //3.是否资源
        fis.close();
        fos.close();
    }
}
```



## 5. 题目三

使用FileInputStream和FileOutputStream，一次读取、写入所有字节，完成复制文件的操作。(ps: JDK8版本没有读取所有字节的方法，免做)

```java
public class Test3 {
    public static void main(String[] args) throws IOException {
        //1.创建流对象
        FileInputStream fis = new FileInputStream("day09_file_io\\b.txt");
        FileOutputStream fos = new FileOutputStream("day09_file_io\\a.txt");

        //2.读、写数据
        //一次读取全部，一些写全部
        fos.write(fis.readAllBytes());

        //3.是否资源
        fis.close();
        fos.close();
    }
}
```



## 6. 题目四

使用FileInputStream和FileOutputStream，完成文件复制，并且使用try...catch...final对异常进行处理。（明天再做）

```java

```

## 7. 题目五

使用FileInputStream和FileOutputStream，完成文件复制，并且使用JDK7自动释放资源的方式，对异常进行处理。（明天再做）

```java

```

