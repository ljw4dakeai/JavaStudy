# Day05作业题干

## 选择题

### 题目1(多选): 

​	下面关于方法的概述描述，正确的是（A D） 

#### 选项 : 

​	A:  方法定义的先后顺序无所谓 

​ B:  方法的定义不能产生嵌套包含关系。 

​	C:  方法可以让程序的执行效率更高 

​	D:  方法定义好了之后，不会执行的，如果要想执行，一定要进行方法的调用 



------

### 题目2(多选): 

​	以下选项中，关于方法定义的参数或返回值描述正确的是（A B D ） 

#### 选项 : 

​	A:  方法的参数可以有，可以没有，也可以有多个 

​	B:  方法的参数就是定义一些变量，当方法被调用的时候，用来接收数据使用的 

​	C:  一个方法执行完成之后可以有一个返回值 ,也可以有多个返回值

​	D:  方法的返回值是方法执行完成之后得到的结果 



------

### 题目3(多选): 

​	关于对方法的调用，正确的是（A D ） 

#### 选项 : 

​	A:  有具体返回值的方法, 可以直接调用, 赋值调用以及输出调用

​	B:  无具体返回值的方法, 可以直接调用和输出调用

​	C:  有具体返回值的方法, 只能赋值调用和输出调用

​	D:  无具体返回值的方法, 只能直接调用



------

### 题目4(单选): 

代码如下：

```java
public static void main(String[] args){
   ________________________________
}

public static void method(){
    System.out.println("我是黑马程序员");
}
```

​	运行结果是：

​	我是黑马程序员

​	横线处应该填写的正确代码是（C ）

#### 选项 : 

​	A:  method;

​B:  void v = method();

​	C:  method();

​	D:  method("我是黑马程序员");



------

### 题目5(多选): 

​	请观察以下代码，分别为第三行和第六行选出正确选项，保证可以在控制台上输出 

```java
public class Test08 {
    public static void main(String[] args){
	    _____①_____
    }

    public _____②_____ print() {	
        System.out.println("wo ai java");
    }
}
```

​	运行结果是：

​	wo ai java

​	横线处应该填写的正确代码是（B）

#### 选项 : 

​	A:  ①  void v = print();		②  static void	

​ B:  ①  print();				②  static void    

​	C:  ①  int v = print();		②  static int	

​	D:  ①  print();			②  static	



------

### 题目6(单选): 

​	下列方法定义格式正确的是（B ） 

```java
A:
public static void method1(){
    public static void method2(){
    }
}

B:
public static void method1(){
}

C:
public static void method1(){
   return 10;
}

D:
public static boolean method1(int n){
    if(n < 10){
        return false;
    }else if(n > 10){
		return true;
	}
}
```

#### 选项 : 

​	A:  选择A

​	B:  选择B

​	C:  选择C

​	D:  选择D



------

### 题目7(单选): 

观察以下代码，请选出方法调用过程的正确顺序（ D）

```java
public static void main(String[] args) {
    System.out.println("开始执行");	   //1
    int a = print(10);                //2
    System.out.println(a);		     //3
}
public static int print(int n){    	 //4
    n += 10;                         //5
    return n;          			    //6
}
```

#### 选项 : 

​	A:  1，2，3，4，5，6  

​	B:  1，2，4，6，5，3 

​	C:  1，4，5，6，2，3 

​	D:  1，2，4，5，6，3  



------

### 题目8: 

​	以下选项中，关于方法的调用过程描述正确的是 ( ACD) 

```java
public class Demo{
  public static void main(String[] args) {
     int a = 10;
     int b = 20;
     int sum = getSum(a,b);
     System.out.println(sum);
     isEquals(a, b);
  }

  public static int getSum(int a,int b){
     int sum = a + b;
     return sum;
  }
  
  public static void isEquals(int a,int b){
    boolean c = a == b;
    System.out.println(c);
  }
}
```

#### 选项 : 

​	A:  由java虚拟机调用main方法，main方法先执行 

​	B:  在main方法执行中，会定义a和b变量，并分别赋值10和20，然后先调用isEquals方法，再调用getSum方		 		法并输出结果 

​	C:  调用getSum方法时，要先传入两个整数，否则编译失败。然后执行getSum方法内的代码，执行完成之后，将结果返回赋值给int类型的变量sum 

​	D:  调用isEquals方法时，要先传入两个整数，否则编译失败。然后执行isEquals方法内的代码，执行完成之后，没有结果返回 



------

### 题目9(单选):

​	有关方法重载下列描述正确的是（C ） 

#### 选项 :

​	A:  在多个类中，两个或者两个以上方法的名称一样，参数列表不一样，返回值必须一样，这些方法称之为重载 

​	B: 在同一个类中，两个或者两个以上方法的名称一样，参数列表不一样，返回值必须相同，这些方法称之为重载 

​	C:  在同一个类中，两个或者两个以上方法的名称一样，参数列表不一样，和返回值无关，这些方法称之为重载 

​	D:  在多个类中，两个或者两个以上方法的名称一样，参数列表必须一样，和返回值无关，这些方法称之为重载 



------

### 题目10(单选):

​	下面关于方法的重载，描述错误的是（ A） 

#### 选项 :

​	A:    方法重载，是指方法的名称相同，参数列表也相同的多个方法 

​	B:   方法重载，可以减少对方法名称的命名次数 

​	C:   方法重载，只能在同一个java类当中 

​	D:   方法重载，返回值类型可以不相同 



------

### 题目11(单选):

​	下面关于方法的参数传递正确的是( C） 

#### 选项 :

​	A:  方法的参数是基本数据类型, 形参的改变直接影响实参的值

​	B:  方法的参数是引用数据类型, 形参的改变不影响实参的值

​	C:  方法的参数是基本数据类型, 形参的改变不影响实参的值

​	D:  方法的参数是基本数据类型,传递的是地址值.方法的参数是引用数据类型, 传递的是数据值



------

### 题目12(单选):

​	以下选项中，不属于方法重载的是（B ） 

```java
A:
public class Demo{
  public int getSum(int a,byte b){
    return a + b;
  }
  
  public int getSum(int a,int b){
    return a + b;
  }
}

B：
public class Demo{
  public int getSum(int b,int a){
    return a + b;
  }
  
  public void getSum(int a,int b){
    System.out.println(a + b);
  }
}

C:
public class Demo{
  public long getSum(long a,int b){
    return a + b;
  }
  
  public long getSum(int a,long b){
    return a + b;
  }
}

D:
public class Demo{
  public void getSum(int a,int b){
    System.out.println(a + b);
  }
  
  public int getSum(int a,int b,int c){
    return a + b + c;
  }
}
```



------

### 题目13(单选):

​	观察下面代码，最终在控制台显示 33 正确的方法调用格式是 ( C ） 

```java
public static void main(String[] args){
    //此处需要调用下面的某个方法，在控制台当中显示33
}

public static void printData(int a,int b){
    System.out.println(11); 
}

public static void printData(int a){
    System.out.println(22); 
}

public static void printData(boolean b){
    System.out.println(33); 
}

public static void printData(){
    System.out.println(44); 
}
```

#### 选项 :

​	A:  printData(10,20);

​	B:  printData(333);

​	C:  printData(true)

​	D:  printData();



------

### 题目14(单选):

​	下面代码执行之后，控制台显示的结果是（ B） 

```java
public static void main(String[] args){
    int[] arr = { 11,22,33,44,55 };
    method(arr);
    for(int i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i] + " ");
    }
}

public static void method(int[] arr){
    for(int i = 0 ; i < arr.length ; i++){
        if( i % 2 == 0 ){
            arr[i] += 100;
        }
    }
}
```

#### 选项 :

​	A:  11    122   33   144  55 

​	B:  111    22   133   44   155 

​	C:  11    22    33    44    55 

​	D:  111   122    133   144   155 



------

### 题目15(单选):

下列代码的运行结果是（B ） 

```java
public static void main(String[] args) {
    int arr[] = {1, 3, 5, 7, 9};
    int num = 10;
    showArray(arr, num);
    System.out.println("arr[2]的结果是:"+arr[2]);
    System.out.println("num的结果是："+num);
}
private static void showArray(int[] arr, int num) {
    arr[2] = 6;
    num = 1;
}
```

#### 选项 :

​	A:     arr[2]的结果是：6 

​		num的结果是：1  

​	B:     arr[2]的结果是：6 

​		num的结果是：10  

​	C:     arr[2]的结果是：5

​		 num的结果是：1  

​	D:    arr[2]的结果是：5

​		num的结果是：10 



------

### 题目16(单选):

​	下列代码的运行结果是（ C ） 

```java
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    changeArr(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+",");
    }
}

public static void changeArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]%2==1) {
            arr[i] = 10;
        }
    }
}
```

#### 选项 :

​	A:  1，2，3，4，5， 

​	B:   1，10，3，10，5， 

​	C:   10，2，10，4，10， 

​	D:  10，10，10，10，10， 





## 代码题

### 题目1:

数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试 

### 训练提示

1. 根据方法的功能描述，方法的参数应该接收一个double类型数据。
2. 小数的绝对值也是double，所以返回值类型也是double类型。

### 操作步骤

1. 定义一个小数变量num。

2. 定义获取绝对值的方法，方法的参数是一个double类型，返回值类型是double。

3. 在方法内部使用if..else..判断。

   3.1. 如果是负数则对负数取反并返回。

   3.2. 如果不是负数则直接返回数字本身。

4. 在主方法中调用绝对值方法，传入参数num,并接受返回值。

5. 打印返回的结果。

### 参考代码



------

### 题目2:

定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。

### 训练提示

1. 根据题意，方法中需要使用三个整数，所以方法参数应该是三个整数类型。
2. 方法需要有返回值，返回值的类型也是整数类型。

### 解题方案

### 操作步骤

1. 定义方法getMax()，方法的参数是三个int类型变量a,b,c，方法的返回值是int类型。
2. 在方法中使用多分支if...else...判断出最大值并返回。
3. 在主方法中调用getMax()方法并接受返回值。
4. 在主方法中打印结果。

### 参考代码

### 题目3:

请定义一个方法，该方法可以实现对int类型的数组进行遍历，在控制台打印所有元素。实现方法后，请在主方法中调用方法，查看结果。例如，数组为{11, 22, 33}，打印格式为：[11, 22, 33] 

### 训 

1、首先明确方法的返回值和参数列表，该方法只需要在控制台输出，f返回值类型为void.要实现打印数组元素的功能，需要方法的调用者把想打印的数组传递过来，所以参数列表是int[] arr

2、方法实现之后，不调用的话会执行吗？该怎样调用？

### 操作步骤

1、定义方法，返回值类型为void，参数列表为int[] arr

2、在方法中，遍历数组，判断是否是最后一个元素，并且根据不同的情况输出不同的格式。

3、在主方法中定义一个数组，调用方法，将数组作为参数传递，查看运行结果。

### 参考代码



------

### 题目4:

请定义一个方法，实现交换整数数组中两个索引上的元素值。并调用方法，查看运行效果。

例如，数组为{11, 22, 33, 44, 55, 66}，交换索引1和索引5位置上的元素，结果为{11, 66, 33, 44, 55, 22}

### 训练提示

1、首先明确方法的返回值和参数列表，交换元素, 不需要具体返回值.我们要操作哪个数组，要交换哪两个索引上的元素，所以参数列表应该接收一个数组,和两个变量(代表的要交换的索引)

2、在方法中，如果交换两个数组中的元素, 需要根据索引进行交换

3、在主方法中，用void修饰的方法,如何调用？

### 操作步骤

1、定义方法，返回值void，参数列表 int[] arr, int index1, int index2。

2、在方法中，定义临时变量，交换两个索引上的元素值。

3、在主方法中，创建一个int数组，调用方法，将数组作为参数传递。然后遍历数组查看结果

### 参考代码



