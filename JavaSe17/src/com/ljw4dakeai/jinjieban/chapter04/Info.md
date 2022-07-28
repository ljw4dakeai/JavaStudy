#### Date

- 构造方法

```java
class Test {
    public static void main(String[] args) {
        //日期和时间类 单位是ms
        //用于表示当前系统时间
        Date nowDate = new Date();
        //用于创建指定时间的Long型号数据(1970以后)
        Date selfDate = new Date(number);
    }
}
```

-成员方法

```java
class Test {
    public static void main(String[] args) {
        Date nowDate = new Date();
        //获取时间ms值
        nowDate.getTime();
        //设置时间ms值
        nowDate.setTime();
    }
}
```

### SimpleDateFormat

- 格式化字符串规则

```properties
格式化:Date对象 -> 字符串
解析:字符串 -> Date对象
注意:不管是格式化 还是解析都需要规定格式化字符串
格式化字符:y   M   d   H   m   s   S 
时间类型:年   月  日 小时 分钟 秒 毫秒
```

- 举例

```properties
格式化字符串:yyyy年MM月dd日 HH时mm分ss秒 yyyy-MM-dd HH:mm:ss
对应的字符串:2001年11月20日 06时50分20秒 2001-11-20 06:50:20
```

- 代码

```java
class Test {
    public static void main(String[] args) {
        //Date对象 -> 格式化时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
        String formatDate = simpleDateFormat.format(new Date());
        System.out.println(formatDate);

        //格式化时间 -> Date对象
        String date = "2001-11-20 06:00:20";
        Date parseDate = simpleDateFormat.parse(date);
        System.out.println(parseDate);
    }
}
```

### calendar

- 注意

```properties
类型:calendar是抽象类 通过Calendar.getInstance()获取子类对象
月份:月份是从0开始的(  JANUARY which is 0)
月中的天:月中的天是从1开始的
周:周中的天,1表示周日,2表示周一
```

```java
class Test {
    public static void main(String[] args) {
        //获取calendar 子类对象
        Calendar instance = Calendar.getInstance();

        System.out.println(instance);
        //设置年月日
        instance.set(Calendar.YEAR, 2001);
        //月份是从0开始的(  JANUARY which is 0)
        instance.set(Calendar.MONTH, 10);
        //first day of the month has value 1
        instance.set(Calendar.DAY_OF_MONTH, 22);


        //年月日的加减

        instance.add(Calendar.DAY_OF_MONTH, -2);


        //获取年月日
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH) + 1;
        int dayOfMonth = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println("birthday : " + year + "年" + month + "月" + dayOfMonth + "日");


        //获取日期时间是周几
        //星期中的第一天是星期日
        //星期日, 星期一,星期二,星期三,星期四,星期五,星期六
        //1           2          3         4          5         6          7
        int dayOfWeek = instance.get(Calendar.DAY_OF_WEEK);
        String[] weeks = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        System.out.println(weeks[dayOfWeek]);

    }
}
```

### 常见的两个算法

- 冒泡排序

```java
class Test {
    public static void bubbleSort(int[] array) {
        //优化
        boolean flag = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                //如果前面的比后面的大就交换
                if (array[j] > array[j + 1]) {
                    flag = true;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if (!flag) {
                //一次都没有发生
                System.out.println("排序完成");
                break;
            } else {
                //重置flag，进行下次判断
                flag = false;
            }
        }
    }
}
```

- 二分查找

````java
class Test {
    public static int binarySearch(int[] ints, int findValue) {
        int start = 0;
        int end = ints.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (ints[mid] > findValue) {
                end = mid - 1;
            } else if (ints[mid] < findValue) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
````

### Arrays

- toString

```java
import java.util.Arrays;

class Test {
    public static void main(String[] args) {
        //public static void toString()
        //格式化输出数组
        Arrays.toString(new ints[]{1, 2, 3, 4, 5});
    }
}
```

- sort

```java
import java.util.Arrays;
import java.util.Comparator;

class Test {
    public static void main(String[] args) {
        //数组排序
        // (1)、 默认排序
        Integer[] ints = {10, 8, 6, 7, 3, 5, 1, 2};
        Arrays.sort(ints);

        //(2)、自定义排序
        Arrays.sort(ints, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }
}

```

- binarySearch

```properties
注意(1):查找前的数组必须是有序的!
注意(2):数组中最好不要出现重复数据!
```

```java
import java.util.Arrays;

class Test {
    public static void main(String[] args) {
        int[] ints = {1, 4, 6, 7, 10, 15};
        System.out.println(Arrays.binarySearch(ints, 10));
    }
}

```

### lambda

- 作用

```properties
作用:简化匿名内部类的写法实现的
```

- 注意

```properties
1:可以实现lambda表达式的必须是一个函数式接口
函数式接口:接口中只有一个抽象方法的接口叫做函数式接口
```

```java
//函数式接口,当写的是一个函数式接口时加上注解@FunctionalInterface
@FunctionalInterface
public interface Swimming {
    /**
     * @param name 游泳方式
     */
    void swim(String name);

    static void method(Swimming swimming) {
        swimming.swim("仰泳");
    }

    public static void main(String[] args) {
        //标准格式
        method(new Swimming() {
            @Override
            public void swim(String name) {
                System.out.println("游泳姿势是" + name);
            }
        });
        //简化格式 省略数据类型
        method((name) -> {
                    System.out.println("游泳姿势是" + name);
                }
        );
        //当语句只有一条的时候 省略大括号
        method((name) -> System.out.println("游泳姿势是" + name));
        //当参数只有一个的时候 省略小括号
        method(name -> System.out.println("游泳姿势是" + name));
        //方法引用
        method(System.out::println);
    }
}

```

- 简化Lambda

```properties
1:简化格式 省略数据类型
2:当语句自由一条的时候 省略大括号,return
3:当参数只有一个的时候 省略小括号
```

### Regex

- 作用

````properties
作用:匹配字符 或者判断字符是否正确或者替换字符!
````

```properties
//常用的解析格式
一.校验数字
数字 ：^[0-9]*$
n位的数字 ：^\d{n}$
至少n位的数字 ：^\d{n,}$
m-n位的数字 ：^\d{m,n}$
零和非零开头的数字 ：^(0|[1-9][0-9]*)$
非零开头的最多带两位小数的数字 ：^([1-9][0-9]*)+(.[0-9]{1,2})?$
带1-2位小数的正数或负数 ：^(\-)?\d+(\.\d{1,2})?$
正数、负数、和小数 ：^(\-|\+)?\d+(\.\d+)?$
有两位小数的正实数 ：^[0-9]+(.[0-9]{2})?$
有1~3位小数的正实数 ：^[0-9]+(.[0-9]{1,3})?$
非零的正整数 ：^[1-9]\d*$
非零的负整数 ：^\-[1-9][]0-9"*$
非负整数 ：^\d+$
非正整数 ：^-[1-9]\d*|0$
非负浮点数 ：^\d+(\.\d+)?$
非正浮点数 ：^((-\d+(\.\d+)?)|(0+(\.0+)?))$
正浮点数 ：^[1-9]d.d|0.d[1-9]d$
负浮点数 ：^-([1-9]\d*\.\d*|0\.\d*[1-9]\d*)$
浮点数 ：^(-?\d+)(\.\d+)?$
二.效验字符
汉字 ：^[\u4e00-\u9fa5]{0,}$
英文和数字 ：^[A-Za-z0-9]+$
长度为3-20的所有字符 ：^.{3,20}$
由26个英文字母组成的字符串 ：^[A-Za-z]+$
由26个大写英文字母组成的字符串 ：^[A-Z]+$
由26个小写英文字母组成的字符串 ：^[a-z]+$
由数字和26个英文字母组成的字符串 ：^[A-Za-z0-9]+$
由数字、26个英文字母或者下划线组成的字符串 ：^\w+$
中文、英文、数字包括下划线 ：^[\u4E00-\u9FA5A-Za-z0-9_]+$
中文、英文、数字但不包括下划线等符号 ：^[\u4E00-\u9FA5A-Za-z0-9]+$
可以输入含有(^%&',;=?$\"等字符) ：[^%&',;=?$\x22]+
禁止输入含有~的字符 ：[^~\x22]+
三.特殊需求表达式
Email地址  ：^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$
手机号码 ：^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$(国内 13、15、18开头的手机号正则表达式,可根据目前国内收集号扩展前两位开头号码）
电话号码("XXX-XXXXXXX"、"XXXX-XXXXXXXX"、"XXX-XXXXXXX"、"XXX-XXXXXXXX"、"XXXXXXX"和"XXXXXXXX) ：^(\(\d{3,4}-)|\d{3.4}-)?\d{7,8}$
国内电话号码(0511-4405222、021-87888822) ：\d{3}-\d{8}|\d{4}-\d{7}
身份证号(15位） ：^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$
身份证号码(18位) ：^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$
帐号是否合法(字母开头，允许5-16字节，允许字母数字下划线) ：^[a-zA-Z][a-zA-Z0-9_]{4,15}$
密码(以字母开头，长度在6~18之间，只能包含字母、数字和下划线) ：^[a-zA-Z]\w{5,17}$
强密码(必须包含大小写字母和数字的组合，不能使用特殊字符，长度在8-16之间) ：^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,16}$
日期格式 ：^\d{4}-\d{1,2}-\d{1,2}
一年的12个月(01～09和1～12) ：^(0?[1-9]|1[0-2])$
一个月的31天(01～09和1～31) ：^((0?[1-9])|((1|2)[0-9])|30|31)$
xml文件 ：^([a-zA-Z]+-?)+[a-zA-Z0-9]+\\.[x|X][m|M][l|L]$
中文字符的正则表达式 ：[\u4e00-\u9fa5]
双字节字符 ：[^\x00-\xff] (包括汉字在内，可以用来计算字符串的长度(一个双字节字符长度计2，ASCII字符计1))
空白行的正则表达式 ：\n\s*\r (可以用来删除空白行)
首尾空白字符的正则表达式 ：^\s*|\s*$或(^\s*)|(\s*$) (可以用来删除行首行尾的空白字符(包括空格、制表符、换页符等等)，非常有用的表达式)
腾讯QQ号 ：[1-9][0-9]{4,11} (腾讯QQ号从10000开始)
中国邮政编码 ：[1-9]\d{5}(?!\d) (中国邮政编码为6位数字)
IP-v4地址 ：\\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b (提取IP地址时有用)
校验IP-v6地址 :(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))
子网掩码：((?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){3}(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d))
校验日期:^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$(“yyyy-mm-dd“ 格式的日期校验，已考虑平闰年。)
抽取注释 ：<!--(.*?)-->
查找CSS属性 :^\\s*[a-zA-Z\\-]+\\s*[:]{1}\\s[a-zA-Z0-9\\s.#]+[;]{1}
提取页面超链接 :(<a\\s*(?!.*\\brel=)[^>]*)(href="https?:\\/\\/)((?!(?:(?:www\\.)?'.implode('|(?:www\\.)?', $follow_list).'))[^" rel="external nofollow" ]+)"((?!.*\\brel=)[^>]*)(?:[^>]*)>
提取网页图片 :\\< *[img][^\\\\>]*[src] *= *[\\"\\']{0,1}([^\\"\\'\\ >]*)
提取网页颜色代码 :^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$
文件扩展名效验:^([a-zA-Z]\\:|\\\\)\\\\([^\\\\]+\\\\)*[^\\/:*?"<>|]+\\.txt(l)?$
判断IE版本：^.*MSIE [5-8](?:\\.[0-9]+)?(?!.*Trident\\/[5-9]\\.0).*$
```