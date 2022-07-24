package com.ljw4dakeai.jichuban.Practice720;

/**
 * @author ZJH
 * 720 模拟考试
 */
public @interface Info {

    /**
     * 考卷
     * 一、单选题(共15题，每题2分，共30分)
     *                          0 1 2 3 4 5
     * 1. 数组int[] num={2,6,11,9,12,8},数组中数组索引和对应的元素都为奇数的元素为？（c）
     * A: 6
     * B: 11
     * C: 9
     * D: 12
     *
     *
     *
     * 2. 下面代码执行完，x的值为( B)
     * case 穿透!
     * public static void main(String[] args){
     *   int i=10, j=26, x=20;
     *     switch(j-i){
     *         case 15 : x++;
     *         case 16 : x+=2; 22
     *         case 17 : x+=3; 25
     *         default : --x; 24
     *     }
     * }
     * A 23
     * B 24
     * C 25
     * D 26
     *
     *
     * 3. 执行下列代码，会输出几次hello字符串（C）
     * for (int i = 1; i < 7; i+=2) {
     *     // 1  3  5
     *     System.out.println("hello");
     * }
     * A: 1
     * B: 2
     * C: 3
     * D: 4
     *
     *
     * 4. ArrayList的初始化内容如下：
     * ArrayList<String> list = new ArrayList<>();
     * list.add("a");
     * list.add("b");
     * list.add("c");
     * list.add("b");
     * list.add("b");
     * 下面可以删除list集合中所有的"b"的代码是？（ A）//index 索引会导致前面的index 前移 导师无法删除的 C
     *
     * removeIf("b":: equals)
     * strings.removeAll(Collections.singleton("a"));
     * for (int i = 0; i < list.size(); i++) {
     *      if (list.get(i).equals("b")) {
     *            list.remove(i);
     *            i--;
     *      }
     * }
     *以上三种方法可以删除重复元素!
     * A:
     *   for (int i = 0; i < list.size(); i++) {
     *         if (list.get(i).equals("b")) {
     *             list.remove(i);
     *         }
     *     }
     *
     * B:
     *   list.remove(i);
     * C:
     *   for (int i = list.size()-1; i >=0; i--) {
     *         if (list.get(i).equals("b")) {
     *             list.remove(i);
     *         }
     *     }
     * D:
     *   以上的代码都不能成功删除list集合中所有的“b”
     *
     *
     * 5. 以下代码打印出的结果是？（B ）
     * public static void main(String[] args) {
     *     String info = "itheima";
     *     int a = 10, b = ++a; b=11 a==11
     *         if(a>b){
     *             System.out.println(info+">>>"+(a+b));
     *         }else { info1111
     *             System.out.println("info"+">>>"+a+b);
     *         }
     * }
     *
     * A: itheima>>>1011
     * B: info>>>1111
     * C: info>>>21
     * D: itheima>>>21
     *
     *
     * 6.  在以下选项中，关于数组描述不正确的是？（ C）
     * A: 数组中的索引从0开始
     * B: 定义数组的同时需要指定存储元素的数据类型
     * C: 通过数组名.length()能获得数组的长度
     * D: 如果数组中的元素个数大于0，则数组的最大索引是数组的长度减1
     *
     * 7. 下列代码的运行结果是(C  )
     * public static void main(String[] args) {
     *     int a = 3;
     *     int b = 5;
     *     int c = 8;
     *     if (a > b ) {
     *         if (a > c) {
     *             System.out.println(a);
     *         }else {
     *             System.out.println(c);
     *         }
     *     }else {
     *         if (b > c) {
     *             System.out.println(b);
     *         } else {
     *             System.out.println(c);
     *         }
     *     }
     * }
     *
     *
     * 选项:
     *
     * A：3
     *
     * B：5
     *
     * C：8
     *
     * D：没有任何输出
     *
     * 8. 下面关于Java中类的说法哪个是不正确的？（ B）
     * A: 类中不仅可以有成员变量的定义和成员方法的定义，还可以有构造器
     * B: 类中只定义了一个有参数构造器时，此时，也可以调用无参数构造器
     * C: 一个Java文件中，可以定义多个class类，但只能一个类是public修饰的
     * D: Java中的类是对现实事物的描述信息
     *
     * 9.以下说法正确的是（D ）
     * A：死循环只能使用while循环去实现。
     * B：do...while循环，如果while里的条件是false，就不会执行do的代码。
     * C：嵌套循环的总循环次数=外循环次数+内循环次数。
     * D：switch语句中，表达的数据类型可以是：byte,short ,char 和字符串
     *
     * 10. 下列语句正确的是？（ A）
     * A: 方法的形参可被视为局部变量
     * B: 方法的形参定义时需要被初始化
     * C: 方法的形参为方法调用时，真正被传递的参数
     * D: 方法的形参不可以是引用类型的变量
     *
     *
     * 11.以下选项中随机数范围为16到50（包含16和50）的是（ B）
     * A.
     *     Random random=new Random();
     *     int num=random.nextInt(16)+50;
     * B.
     *     Random random=new Random();
     *     int num=random.nextInt(35)+16;
     * C.
     *     Random random=new Random();
     *     int num=random.nextInt(36)+15;
     * D.
     *     Random random=new Random();
     *     int num=random.nextInt(36)+16
     *
     * 12. 下列代码的运行结果是(  B)
     * public static void main(String[] args) {
     *   int count = 0;
     *   for(int i = 1;i <= 10;i++) {
     *         if(i % 5 == 0) {
     *             break;
     *         }
     *         if (i == 3 || i == 7 || i == 9){
     *             continue;
     *         }
     *         count++;
     *     }
     *     System.out.println(count);
     * }
     * A.4
     *
     * B.3
     *
     * C.2
     *
     * D.1
     *
     * 13. 以下代码，打印结果正确的是（ A）
     * public static void main(String[] args) {
     *       int a = 0;
     *         for (int i = 0; i <= 10; i++) {
     *             if( i%2==0 ){
     *                 a+=i;
     *                  2 4 6 8 10
     *             }
     *         }
     *         System.out.println(a);
     * }
     *
     * A: 30
     * B: 20
     * C: 55
     * D: 25
     *
     *
     * 14. 对于以下代码：
     * String s1 = new String("java");
     * String s2 = new String("java");
     * String s3 = "java";
     * String s4 = "ja" + "va";
     * 以下表达式的值为true的是？（C ）
     *
     * A: s1==s2
     * B: s1==s3
     * C: s3==s4
     * D: s2==s4
     *
     * 15. 下列代码的运行结果是C
     * public static void main(String[] args) {
     *     int sum=0;
     *     for (int i = 1; i < 3; i++) {
     *         for (int j = 1; j < 3; j++) {
     *             sum+=i*j;
     *             1 12 -> 3
     *             2 12 -> 6
     *         }
     *     }
     *     System.out.println("sum="+sum);
     * }
     * A.sum=3
     *
     * B.sum=4
     *
     * C.sum=9
     *
     * D.sum=5
     * 16. 下面语句会造成数组 new int[10] 索引越界异常的是 (  C D)
     *
     * A a[0]+=9;
     *
     * B a[9]=10;
     *
     * C for(int i= 0;i<=10;i++){a[i]+=1;}
     *
     * D a[a.length]
     *
     *
     * 17. 下列数组定义的方法正确的是？（ A B C）
     * A: int[] arr1 = {1,2,'a'};
     * B: int[] arr2 = new int[3];
     * C: int arr2[] = new int[]{1,2,3};
     * D: int[] arr4 = new int[3]{1,2,3};
     *
     *
     * 18. 对于构造器描述正确的有？（ A C D  ）
     * A: 构造器没有返回值类型申明
     * B: 构造器必须是public修饰的
     * C: 如果没有显式定义构造器，系统会提供一个无参数构造器
     * D: 有参数构造器可以在初始化对象的同时为对象赋值
     *
     *
     * 19. 下面哪些方法是public void aMethod(){...}的重载方法？（B D  ）
     * A: void getSum(int a){...}
     * B: public int aMethod(int a,float b){...}
     * C: public int aMethod(){...}
     * D: private int aMethod(int a){...}
     *
     *
     * 20. 根据以下代码判断： A  D
     * String s = new String("hello");
     * String t = new String("hello");
     * char c[] = {'h','e','l','l','o'};
     * 以下哪些表达式返回true
     *
     * A: s.equals(t);
     * B: t.equals(c);
     * C: s==t;
     * D: t.equals(new String("hello"));
     * E: t==c;
     * 21. （共20分）
     *    题目要求
     * 1. 产生10个 1-100 之间的随机数并存入数组中，随机数不能重复，随后遍历打印数组（元素都在一行打印）
     * 2. 反转数组中元素，再次遍历打印数组（元素都在一行打印）
     * 3. 求出数组的最大值和最小值以及元素和并打印
     *
     * 运行结果（注意：必须按照如下格式进行打印）：
     *
     *
     * 22 共（20分）
     * 1. 设计一个Movie类，私有成员变量：title(片名)，director(导演),type(类型)，并生成相应的get/set方法
     * 2. 定义测试类，在main方法中完成以下要求：
     *   2.1创建三个Movie对象，分别为：
     *      "唐山大地震"，"冯小刚","灾难";
     *      "羞羞的铁拳"，"宋阳","喜剧";
     *      "集结号"，"冯小刚","历史";
     *     2.2将以上3个对象添加到list集合中
     *     2.3遍历集合，将导演为"冯小刚"的电影按照如下格式打印到控制台上。
     *       唐山大地震-冯小刚-灾难
     *       集结号-冯小刚-历史
     * 23、共（15分）
     *     我国手机号码都是11位的，现在需要定义一个方法，方法名称为checkPhone，方法内需要实现判断手机号码是否合法。
     *     规定：
     *       1) 手机号码长度必须为11位数字;
     *     2) 手机号码第一位必须要是1;
     *   键盘录入一个手机号码，在main方法中调用checkPhone方法，如果手机号符合要求，则输出手机号码的后四位。如果不符合要求，则提示手机号码错误。
     */
}
