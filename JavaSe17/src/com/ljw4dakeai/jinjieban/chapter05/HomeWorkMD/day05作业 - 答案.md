# 简答题

## 题目1 :

- 需求 : 
  - 请描述栈内存结构的特点
  - 请描述队列内存结构的特点

```
栈：先进后出
队列：先进先出
```



## 题目2:

- 需求 :  请描述 List 接口 和 Set接口的特点

```
List: 有序、有索引、可以重复
Set: 无序、无索引、不能重复
```



## 题目3:

- 需求 :  请说明,  ArrayList集合  LinkedList集合 底层的数据结构和特点

```
ArrayList: 数组结构（查询快、增删慢）
LinkedList: 链表结构（查询慢、增删快）
```



# 代码题

## 题目4:

* 需求 :  
  * 请描述 Iterator 迭代器的作用
  * 请描述 hasNext() 和 next() 两个方法的作用,  以及应该怎么配合使用 
  * 请描述, 集合中如果没有元素了, 继续调用 next() 方法会出现什么问题

```
1. Iteartor是遍历集合的一种通用方式
2. hashNext()方法的作用是，判断当前有没有元素可以迭代，next()是获取元素并指向下一个元素。
3. 如果没有元素，继续调用next()会出现NoSachElementExcpetion异常
```



## 题目5 :

* 需求 :  往ArrayList添加以下元素”abc1”, ”abc2”, ”abc3”, ”abc4”.使用迭代器获取ArrayList集合中的元素
  * 使用 4 种遍历方式,  对集合进行遍历

```java
ArrayList<String> list = new ArrayList<>();
list.add("abc1");
list.add("abc2");
list.add("abc3");
list.add("abc4");

for(int i=0;i<list.size();i++){
    String s = list.get(i);
    System.out.println(s);
}

//1.迭代器遍历
Iterator<String> it = list.iterator();
while (it.hasNext()){
    String s = it.next();
    System.out.println(s);
}

//增强for遍历
for(String s: list){
    System.out.println(s);
}

//forEach遍历
list.forEach(s->System.out.println(s));
```





## 题目6:

* 需求 : 自定义学生类:包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.
* 创建5个学生对象放到 ArrayList中，获取每个学生信息，统计总分，平均分，最高分，最低分并输出。

```
public class Student {
    private String name;
    private int age;
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
```

```java
public class Test6 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("小明",20,100));
        list.add(new Student("小强",22,98));
        list.add(new Student("小刚",18,99));
        list.add(new Student("小黄",19,97));
        list.add(new Student("小飞",21,95));

      
        //定义一个最大值的变量，和最小值的变量
        Student max=list.get(0);
        //先获取0索引的元素，假设为最大值
        Student max  = list.get(0);
        //让max和其他的学生进行比较
        for (int i = 1; i < list.size(); i++) {
            Student stu = list.get(i);  //
            if(stu.getAge()>max.getAge()){
                max = stu;
            }
        }

        //先获取0索引的元素，假设为最大值
        Student min  = list.get(0);
        //让max和其他的学生进行比较
        for (int i = 1; i < list.size(); i++) {
            Student stu = list.get(i);  //
            if(stu.getAge()<min.getAge()){
                min = stu;
            }
        }

        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
             sum +=stu.getAge();
        }
        
        System.out.println("总分是："+sum);
        System.out.println("最高分："+max);
        System.out.println("最低分："+min);

        //求平均分
        int avg = sum/list.size();
        System.out.println("平均分是："+avg);
    }
}
```



## 题目7:

* 需求 : 自定义人类:包含姓名,年龄,身高属性.私有成员变量,生成无参,有参构造方法,生成get/set方法
* 创建5个人放到ArrayList 中，获取每个人的信息.找出最高的人,最矮的人并输出最高人和最矮人的信息.打印格式如下:最高的人是张 三,身高1.80. 最矮的人是李四,身高1.60

```java
public class Person {
    //姓名,年龄,身高属性
    private String name;
    private int age;
    private int high;

    public Person() {
    }

    public Person(String name, int age, int high) {
        this.name = name;
        this.age = age;
        this.high = high;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", high=" + high +
                '}';
    }
}
```

```java
public class Test7 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("小明", 20, 165));
        list.add(new Person("小强", 22, 170));
        list.add(new Person("小飞", 18, 172));
        list.add(new Person("小刚", 25, 160));
        list.add(new Person("小黄", 22, 163));

        //假设最高的人是集合中0索引的元素
        //（仅仅是假设而已，但是实际上0索引的元素并不是身高最高的，所以需要和后面的元素比较）
        Person max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            //如果p对象的身高，比max对象的身高大，就把p对象的地址赋值给max.
            if (p.getHigh() > max.getHigh()) {
                max=p;
            }
        }
        System.out.println("最高的人：" + max);

        //假设最矮的人是集合中0索引的元素
        //（仅仅是假设而已，但是实际上0索引的元素并不是身高最矮的，所以需要和后面的元素比较）
        Person min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            //如果p对象的身高，比min对象的身高小，就把p对象的地址赋值给max.
            if (p.getHigh() < min.getHigh()) {
                min=p;
            }
        }
        System.out.println("最矮的人：" + min);
    }
}
```



## 题目8:

* 需求 : ArrayList有以下元素: "a","f","b","c","a","d"  对ArrayList集合去重 
* 不允许使用 Set 集合 (因为是明天学的东西)

```java
public class Test8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("e");
        list.add("f");
        list.add("d");
        list.add("a");

        //对集合中的元素去重
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list) {
            //如s元素再list2中不包含，添加到list2中
            if(!list2.contains(s)){
                list2.add(s);
            }
        }
        System.out.println(list2);
    }
}
```

