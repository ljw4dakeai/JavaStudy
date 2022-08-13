## 题目1

**所有文件的存储, 使用相对路径放在当前模块下**



需求：请编写程序，定义一个Properties对象，存储以下内容：

```java
Properties pro = new Properties();
pro.setProperty("品名","Iphone11 Pro Max");
pro.setProperty("颜色","暗夜绿");
pro.setProperty("存储容量","256G");
pro.setProperty("价格","10899");
```

* 请将上述内容写入到文件：“test1.properties”中

* 答案

```java
public class Test1 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.setProperty("品名","Iphone11 Pro Max");
        pro.setProperty("颜色","暗夜绿");
        pro.setProperty("存储容量","256G");
        pro.setProperty("价格","10899");

        pro.store(new FileWriter("day10_io_properties\\test1.txt"),null);
    }
}
```



## 题目2

请编写程序，定义一个Properties对象，将文件”test1.properties”的内容读取到Properties对象中，遍历，并打印每个键值对

* 答案

```java
public class Test2 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.load(new FileReader("day10_io_properties\\test1.txt"));

        String color = pro.getProperty("颜色");
        String brand = pro.getProperty("品名");
        String size = pro.getProperty("存储容量");
        String price = pro.getProperty("价格"); 

        System.out.println(color);
        System.out.println(brand);
        System.out.println(size);
        System.out.println(price);

        //尝试自学：Properties还有一个方法叫stringPropertyNames, 可以获取键的集合；
        //自己尝试一下，能不能获取每个键对应的值
    }
}
```



## 题目3

请按以下要求编写程序：

1).定义一个学员类，有以下属性：姓名、性别、年龄、分数

​        无参、全参构造方法，get/set方法



2).定义main()方法，定义一个存储Student的集合，并初始化一些数据：

```java
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

```java
public class Test3 {
    public static void main(String[] args) throws IOException {
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("迪丽热巴","女",18,99));
        stuList.add(new Student("古力娜扎","女",19,98));
        stuList.add(new Student("周杰伦","男",20,88));
        stuList.add(new Student("蔡徐坤","男",19,78));

        //使用BufferedWriter往文件中写入集合中的学生信息
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10_io_properties\\test2.txt"));
        for (Student stu : stuList) {
            bw.write(stu.getName()+","+stu.getAge()+","+stu.getSex()+","+stu.getScore());
            bw.newLine();
        }
        bw.close();
    }
}
```



## 题目4

定义一个字符缓冲输入流BufferedReader对象，读取”test2.txt”文件，一次读取一行，将每行数据封装为一个Student对象，并将Student对象存储到一个集合。遍历并打印集合的所有Student信息。

* 答案：

```java
public class Test4 {
    public static void main(String[] args) throws IOException {

        List<Student> list = new ArrayList<>();

        //使用BUfferedReader读取test2文件中的每一行
        BufferedReader br = new BufferedReader(new FileReader("day10_io_properties\\test2.txt"));
        //下面是一行一行读取的代码
        String line;
        while ((line = br.readLine()) != null) {
            //如：line = “迪丽热巴,18,女,99”
            //可以使用","进行切割，得到一个字符串数组；
            String[] array = line.split(",");

            //创建一个Student对象，并且将姓名、性别、年龄、分数设置给对象
            Student stu = new Student();
            stu.setName(array[0]);
            stu.setAge(Integer.parseInt(array[1]));
            stu.setSex(array[2]);
            stu.setScore(Integer.parseInt(array[3]));

            //将对象添加到集合中
            list.add(stu);
        }
        //关闭流
        br.close();

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
```

## 题目5

完成课堂上《出师表》案例，写完的同学再写一遍巩固一下，最好能自己独立写出来。

通过这个案例，你能学会了BufferedReader读取数据、BufferedWriter写入手胡建、集合的排序、集合的遍历等。

参考课堂代码

```java
public class Test5 {
    public static void main(String[] args) throws IOException {
        //1.定义一个缓冲字符输入流BufferedIputStream与源文件csb.txt关联
        BufferedReader br = new BufferedReader(new FileReader("day10_io_properties\\csb.txt"));

        //2.创建List集合
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine())!=null){
            //3.循环读取文件中的每一行，并添加到List集合中
            list.add(line);
        }
        //3.释放资源
        br.close();

        //将汉字按照先后顺序存储到集合中，方便后面通过元素找索引
        List<String> orders = List.of("一", "二", "三", "四", "五", "陆", "柒", "八", "九", "十", "十一");

        //4.对List集合中元素按照首字母升序排序,自定义比较器
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //o1和o2表示需要比较的两个字符串
                //假设o1: 一.先帝创业未半而中道崩殂
                //假设o2: 四.将军向宠，性行淑均，晓畅军事
                //获取字符串中”.“前面的字符
                String first1 = o1.split("\\.")[0];  //"一"
                String first2 = o2.split("\\.")[0];  //"四"

                //比较first1和first2
                //获取汉字数字元素，在orders集合中的索引
                int index1 = orders.indexOf(first1);
                int index2 = orders.indexOf(first2);

                return index1 - index2;
            }
        });

        //5.创建字符缓冲输出流BufferedWriter，关联目标csb2.txt文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10_io_properties\\csb2.txt"));
        //6.遍历排好序的集合往目标文件中写
        for (String s : list) {
            bw.write(s);
            bw.newLine(); //换行
        }
        bw.close();
    }
}
```



## 题目6

- 创建一个配置文件如下`config.properties`（不需要用代码创建，手动创建即可），speed的值表示小蛇的移动速度

```
speed=100
```

- 写一个测试类，在静态代码块中读取配置文件中speed的值
- 在main方法中输出：“当前小蛇的移动速度是：50”`

```java
public class Test6 {
    private static int speedValue = 0;
	
    //当前游戏启动时，就读取配置文件
    static {
        try {
            Properties pro = new Properties();
            pro.load(new FileReader("day10_io_properties\\config.properties"));
            //读取配置文件中小蛇的速度
            String speed = pro.getProperty("speed");
            speedValue = Integer.parseInt(speed);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("游戏开始");
        System.out.println("小蛇的奔跑速度是："+speedValue+"毫秒刷新一次");
        System.out.println("游戏结束");
    }
}
```



## 题目7

- 手动在模块目录下创建一个a.txt文件（不需要用代码创建），修改它的编码格式为GBK编码
- 编写代码，使用InputStreamReader指定GBK编码读取a.txt文件中的内容，并使用UTF-8编码将读取到的内容，写入到b.txt文件中

```java
public class Test7 {
    public static void main(String[] args) throws IOException {
        //指定编码GBK读取a.txt文件（前提是a.txt的编码本身是GBK格式）
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_io_properties\\a.txt"),"GBK");
        BufferedReader br = new BufferedReader(isr);

        //指定编码UTf-8写入b.txt文件（b.txt文件idea会自动创建，自动创建的默认就是utf-8格式）
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10_io_properties\\b.txt"),"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);

        String line;
        while ((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}
```



## 题目8

使用FileUtils工具类，完成文件复制、文件夹复制、获取文件夹大小(sizeOf方法)、删除文件夹（deleteDirectory方法）操作. 

**虽然有些方法没讲，但是要有自己探索、尝试的意识，实际开发中并不是所有的内容都是讲过的，很多公司可能用的是自己公司封装的类库**。

```java
public class Test8 {
    public static void main(String[] args) throws IOException {
        //读取文件中的内容
        File file = new File("day10_io_properties\\a.txt");
        String str = FileUtils.readFileToString(file, "GBK");
        System.out.println(str);

        //复制文件
        File src = new File("day10_io_properties\\a.txt");
        File dest = new File("day10_io_properties\\b.txt");
        FileUtils.copyFile(src,dest);

        //复制文件夹
        File srcDir = new File("day10_io_properties");
        File destDir = new File("C:\\Users\\WANGQI\\Desktop");
        FileUtils.copyDirectoryToDirectory(srcDir,destDir);

        //获取文件夹大小
        long size = FileUtils.sizeOf(srcDir);
        System.out.println(srcDir+"大小："+size);

        //删除文件夹(前提是你有这个文件夹才能删除)
        File dir = new File("day10_io_properties\\hello");
        FileUtils.deleteDirectory(dir);
    }
}
```

