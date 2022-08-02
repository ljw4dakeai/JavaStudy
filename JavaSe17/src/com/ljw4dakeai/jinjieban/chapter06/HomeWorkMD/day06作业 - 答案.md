

# 简答题

## 1.简答题一

写出Collection的体系结构（可以用文字描述）

```java
Collectin: 单列集合的根接口，里面有单列集合的共性方法
	--List: 有索引、有序、可以重复
		--ArrayList
		--LinkedList
	--Set：无索引、无序、不可重复
		--HashSet
		--TreeSet
```



## 2.简答题二

写出下列集合底层采用的数据结构，以及它们的特点

```java
ArrayList: 数组结构，查询快增删慢
LinkedList:链表结构，查询慢增删快

HashSet: 哈希表结构，可以对元素去重
TreeSet: 红黑树结构，可以对元素排序
```





# 代码题

## 3. 代码题一

- 创建一个员工类Employee，有姓名name、年龄age、工资salary属性
- 创建3个员工对象，添加到TreeSet集合中
- 要求按照员工的工资排序；如果工资相同，按照年龄排序；如果年龄也相同，再按照姓名的字典顺序排序；

```java
public class Empolyee {
    //有姓名name、年龄age、工资salary属性
    private String name;
    private int age;
    private int salary;

    public Empolyee() {
    }

    public Empolyee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
```

```java
public class Test1 {
    public static void main(String[] args) {
        //要求按照员工的工资排序；如果工资相同，按照年龄排序；如果年龄也相同，再按照姓名的字典顺序排序；
        TreeSet<Empolyee> ts = new TreeSet<>(new Comparator<Empolyee>() {
            @Override
            public int compare(Empolyee o1, Empolyee o2) {
                int num =  o1.getSalary()-o2.getSalary();
                if(num==0){
                    num = o1.getAge() - o2.getAge();
                    if(num ==0){
                        //姓名是字符串，字符串本身就有一个compareTo方法用来比较先后顺序
                        num = o1.getName().compareTo(o2.getName());
                    }
                }
                return num;
            }
        });
        ts.add(new Empolyee("小明",19,12000));
        ts.add(new Empolyee("小飞",22,15000));
        ts.add(new Empolyee("小强",18,11000));

        for (Empolyee t : ts) {
            System.out.println(t);
        }
    }
}
```



## 4. 代码题二

- 定义一个学生类，要求有姓名、语文成绩、数学成绩、英语成绩
- 选择合适的集合，往集合中添加3个学生对象，并按照总分从高到低输出到控制台
- 如果总分相同，按照数学成绩排序

```java
public class Student {
    //姓名、语文成绩、数学成绩、英语成绩
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}';
    }
}
```

```java
public class Test2 {
    public static void main(String[] args) {
        //选择合适的集合，往集合中添加3个学生对象，并按照总分从高到低输出到控制台
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //获取o1的总分，获取o2的总分
                int sum1 = o1.getChinese()+o1.getEnglish()+o1.getMath();
                int sum2 = o2.getChinese()+o2.getEnglish()+o2.getMath();
                //求o1和o2的总分差
                //如果结果为负数，说明o1比o2小；如果结果为正数，说明o1比o2大；如果结果为0，说明o1和o2相等（不存）
                int num = sum1 - sum2;
                if(num==0){
                    //如果总分相同，按照数学成绩排序
                    num = o1.getMath()-o2.getMath();
                }
                return num;
            }
        });
    }
}
```



## 5. 代码题三

- 定义一个Phone类，有品牌brand，价格price两个属性
- 选择合适的集合，往该集合一中添加3个Phone对象，要求元素不能重复，并且保证存取顺序

```java
public class Phone {
    private String brand;
    private int price;

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (price != phone.price) return false;
        return brand != null ? brand.equals(phone.brand) : phone.brand == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
```

```java
public class Test3 {
    public static void main(String[] args) {
        HashSet<Phone> ts = new HashSet();

        //添加元素
        ts.add(new Phone("OnePlus",3300));
        ts.add(new Phone("VIVO",4500));
        ts.add(new Phone("Oppo",3500));
        ts.add(new Phone("Oppo",3500));

        //遍历集合
        for (Phone t : ts) {
            System.out.println(t);
        }
    }
}
```



## 5. 代码题四

完成课上的斗地主案例（对玩家的牌进行排序）

```java
public class Poker {
    private String color; //花色
    private String number; //点数 {A  2 3 4 5 6 7 8 9 10 J Q K 大王 小王}
    private int order; //序号

    public Poker() {
    }

    public Poker(String number) {
        this.number = number;
    }

    public Poker(String color, String number,int order) {
        this.color = color;
        this.number = number;
        this.order = order;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        if(color==null){
            return number;
        }
        return color+number;
    }
}
```

```java
public class Test4 {
    public static void main(String[] args) {
        //定义一个集合表示牌盒
        ArrayList<Poker> box = new ArrayList<>();

        //1)创建54个Poker对象
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♥", "♠", "♦", "♣"};
        int order = 1;
        //让每一个点数配4个花色
        for (String number : numbers) {
            for (String color : colors) {
                // 2)并且把52个对象存储到ArrayList集合中去 (除了大王和小王)
                Poker p = new Poker(color,number,order);
                box.add(p);
                order++;
            }
        }

        //单独添加大王和小王
        Poker p1 = new Poker("小王");
        p1.setOrder(order++);

        Poker p2 = new Poker("大王");
        p2.setOrder(order);

        box.add(p1);
        box.add(p2);

        //先打乱所有的牌
        Collections.shuffle(box);

        //轮流发给3个玩家
        ArrayList<Poker> player1 = new ArrayList<>();
        ArrayList<Poker> player2 = new ArrayList<>();
        ArrayList<Poker> player3 = new ArrayList<>();
        ArrayList<Poker> dipai = new ArrayList<>();

        for (int i = 0; i < box.size(); i++) {
            //获取i索引位置的牌
            Poker p = box.get(i);
            //如果不是最后三张，发给玩家
            if(i<box.size()-3){
                if(i%3==0){
                    //发给玩家1
                    player1.add(p);
                }else if(i%3==1){
                    //发给玩家2
                    player2.add(p);
                }else if(i%3==2){
                    //发给玩家3
                    player3.add(p);
                }
            }else {
                //否则发给底牌
                dipai.add(p);
            }
        }

        //对玩家手中的牌排序
        /*Comparator<Poker> com = new Comparator<>() {
            @Override
            public int compare(Poker o1, Poker o2) {
                return o1.getOrder() - o2.getOrder();
            }
        };*/
        Collections.sort(player1,(o1, o2) -> o1.getOrder()-o2.getOrder() );
        Collections.sort(player2, (o1, o2) -> o1.getOrder()-o2.getOrder() );
        Collections.sort(player3, (o1, o2) -> o1.getOrder()-o2.getOrder() );

        //打印每个玩家手中的牌
        System.out.println("玩家一："+player1);
        System.out.println("玩家二："+player2);
        System.out.println("玩家三："+player3);
        System.out.println("底牌："+dipai);
    }
}
```



## 6. 代码题五

需求 :  利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量 

- 如用户输入字符串:"helloworldjava",程序输出结果：
- h-1 e-1 l-3 o-2 w-1 r-1 d-1 j-1 a-2 v-1   

```java
public class Test5 {
    public static void main(String[] args) {
        String str = "aababcabcdabcde";

        //键和值的含义是人为规定
        //键：Character表示字符串中的字符
        //值：Integer字符出现的次数
        HashMap<Character,Integer> map = new HashMap<>();

        //遍历字符串得到每一个字符
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //把字符作为键，个数作为，存储到Map集合中
            //判断是否包含键
            if(map.containsKey(ch)){
                //如果包含, 把值取出来，+1，再存回去
                Integer count = map.get(ch);
                map.put(ch,count+1);
            }else {
                //直接把字符，和1存进去
                map.put(ch,1);
            }
        }

        //遍历map集合
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            Integer value = map.get(key);
            System.out.print(key+"-"+value+" ");
        }
    }
}
```



## 7. 代码题六

定义一个商品类Product类，有商品名称，价格和购买数量三个属性

```java
public class Product {
    private String name;
    private int num;
    private int price;

    public Product() {
    }

    public Product(String name, int num, int price) {
        this.name = name;
        this.num = num;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", price=" + price +
                '}';
    }
}
```

定义一个测试类

```java
public class Test6 {
    public static void main(String[] args) {
        //1.创建一个ArrayList集合存储2个商品对象
        ArrayList<Product> list1 = new ArrayList<>();
        list1.add(new Product("老母鸡",2,50));
        list1.add(new Product("拖把头",1,13));

        //2.创建另一个ArrayList集合存储3个商品对象
        ArrayList<Product> list2 = new ArrayList<>();
        list2.add(new Product("电脑",1,6888));
        list2.add(new Product("手表",1,2500));
        list2.add(new Product("电脑包",1,100));

        //3.创建一个HashMap集合，用于存储每一个订单对应的商品
        //键：订单号（字符串类型）
        //值：该订单的多个商品，List类型
        HashMap<String, ArrayList<Product>> map = new HashMap<>();
        map.put("000001",list1);
        map.put("000002",list2);

        //4.遍历Map集合，打印每一个订单号，和每一件商品对象的信息
        Set<String> keys = map.keySet();
        for (String key : keys) {
            //这里key表示订单号，根据订单号获取该订单的商品集合
            System.out.println("订单号："+key);
            List<Product> products = map.get(key);
            //得到订单的集合，可以继续遍历获取订单的商品对象
            for (Product product : products) {
                System.out.println("\t\t"+product);
            }
        }
    }
}
```





