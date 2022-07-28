### (enum)枚举类

```properties
定义:是一种特殊的类, 使用enum定义, 枚举类的对象只有几种
使用:一半用来当做信息表示符
```

```java
class EnumTest {
    public enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    public static void move(Direction direction) {
        switch (direction) {
            case UP -> System.out.println("向上");
            case DOWN -> System.out.println("向下");
            case LEFT -> System.out.println("向左");
            case RIGHT -> System.out.println("向右");
        }
    }

    public static void main(String[] args) {
        move(Direction.DOWN);
    }
}
```

### 内部类

#### 成员内部类

```properties
位置:类的成员位置,类中,方法外
创建:外部类.内部类 变量名 = new 外部类().new 内部类()
```

#### 静态内部类

```properties
位置:类的成员位置,类中,方法外,加上static关键字
创建:外部类.内部类 变量名 = new 外部类.内部类()
静态内部类的静态方法:外部类.内部类.静态方法()
```

#### 局部内部类

```properties
位置:方法中定义的类,只在方法中有效(一般不使用)
```

```java
//外部类和 内部类变量重名, 内部类访问外部变量方式
//外部类.this.成员变量
public class Outer {
    private int num = 100;

    public class Inner {
        int num = 110;

        public void show() {
            int num = 90;
            System.out.println(num);//90
            System.out.println(Inner.this.num);//110
            System.out.println(Outer.this.num);//100
        }
    }
}
```

#### 局部内部类

> 本质是父类或者接口的子类(不想写子类时可以使用)

```java
public abstract class Animal {
    /**
     * 动物吃方法
     */
    public abstract void eat();
}

```

```java
public interface LambdaInnerOne {
    /**
     * show方法
     */
    void show();
}
```

```java
class Test {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("这是一个匿名内部类重写的eat方法!");
            }
        };
        animal.eat();

        new Animal() {
            @Override
            public void eat() {
                System.out.println("不实现变量名调用eat方法!");
            }
        }.eat();
    }
}
```

### API

#### API使用

```properties
1:通过索引窗口查找我们需要的类
2:查看构造方法
3:查看对象调用方法
```

#### Object类

```properties
toString:复写toSting 会输出自己的复写的, 不复写就是 "类" + "@" + "地址值",打印一个对象自动调用toString方法
equals:没有复写都是false,和==一样  是比较地址值 ,如果被复写了  就是按照复写的方法进行比较的
```

#### 包装类

```properties
基本数据类型包装类:基本类型 -> 引用类型
基本:int    byte    short   long    float   double  char    boolean
引用:Integer    Byte    Short   Long    Float   Double  Chaaracter  Boolean
```

- 类型转换

```java
//包装类转换为String
包装类.toString(数据);
        String.valueOf(数据);

//String转化为数据
        包装类.parseXxx("字符串");
//转换时注意数据不要,转换为数字真么写,字符就怎么写,不要有其他字符!
```

- 自动装箱

```java
class Test {
    public static void main(String[] args) {
        //自动装箱
        Integer integerOne = 10;

        //自动装箱
        int anIneOne = integerOne;

        //手动装箱
        Integer integerTwo = Integer.valueOf(10);

        //手动拆箱
        int anIntTwo = integerTwo.intValue();

        //如果 被包装的数据在-128和127不会创建新对象,如果大于或者小于 的都会出创建新对象+
    }
}
```

#### BigDecimal
```java
//对于计算精度要求很高时 使用BigDecimal
class Test{
    public static void main(String[] args) {
        BigDecimal bigDecimalOne = BigDecimal.valueOf(0.1);
        BigDecimal bigDecimalTwo = BigDecimal.valueOf(0.9);

        //加法add
        System.out.println(bigDecimalOne.add(bigDecimalTwo));
        //减法subtract
        System.out.println(bigDecimalOne.subtract(bigDecimalTwo));
        //乘法multiply
        System.out.println(bigDecimalOne.multiply(bigDecimalTwo));
        //除法divide
        System.out.println(bigDecimalTwo.divide(bigDecimalOne));



        //计算10 除以 3 Non-terminating decimal expansion; no exact representable decimal result.
        BigDecimal bigDecimalThree = BigDecimal.valueOf(10);
        BigDecimal bigDecimalFour = BigDecimal.valueOf(3);
        //保留两位 UP -> 不管满不满5都进1
        System.out.println(bigDecimalThree.divide(bigDecimalFour, 2, RoundingMode.UP));
        //保留两位 UP -> 不管满不满5都舍弃
        System.out.println(bigDecimalThree.divide(bigDecimalFour, 2, RoundingMode.DOWN));
        //保留两位 -> 四舍五入法
        System.out.println(bigDecimalThree.divide(bigDecimalFour, 2, RoundingMode.HALF_UP));
    }
}
```

#### System
```java
//System.exit(0); 结束虚拟机

//获取当前系统时间戳(1970年01月01日00时00分00秒)
//System.out.println(System.currentTimeMillis());

class Test{
    public static void main(String[] args) {
        int[] ints = {10, 20, 30, 40, 50};
        int[] intsCopyAll = new int[5];
        //数组中的数据全部赋值
        //参数(原数组, 原数组的起始索引, 目标数组, 目标数组的起始位置,赋值数据的个数)
        System.arraycopy(ints, 0, intsCopyAll, 0, 5);
        int[] ints = {10, 20, 30, 40, 50};
        System.out.println(System.currentTimeMillis());
    }
}
```