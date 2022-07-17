package com.ljw4dakeai.JiChuBan.Pritice710;

/**
 * @author ZJH
 */
public @interface Info {
    /*
1 * 键盘录入一个int类型的数据,使用三元运算符判断这个数是奇数还是偶数
 */

/*
2 * 键盘录入一个学生成绩(int类型),如果成绩大于等于60输出”及格”,如果成绩小于60输出”不及格”
 */

/*
 3* 键盘录入自己的姓名(String),年龄(int),身高(int)保存到对应的变量中,
 * 输出结果如:我的姓名是张三,年龄25岁,身高180CM(提示姓名是String类型,需要使用Scanner的next()方法.)
 *
 */

/*
 4* 键盘录入一个长方形的长和宽(长和宽为int类型),计算长方形的面积和周长
 */

/*
 * 定义int类型的变量a,定义int类型的变量b,
5 * 使用三元运算符判断如果a大于b返回a与b的和,
 * 否则返回a与b的乘积,打印结果
 */

/*
 * 定义int类型的变量i,初始化值为5.
6 * 再定义double类型的变量d ,初始化值为3.14.
 * 将变量i和变量d相加再赋值给另一个short类型的变量s.输出s的值.
 */


/*7
	1.小明左、右手中分别拿两张纸牌（比如：黑桃10和红桃8，数字10和8可通过键盘录入），要求编写代码交换小明手中的牌
	2.程序运行的结果如下：

	请输入小明左手中的纸牌：10
	请输入小明右手中的纸牌：8

	互换前小明手中的纸牌：
	左手中的纸牌：10
	右手中的纸牌：8

	互换后小明手中的纸牌：
	左手中的纸牌：8
	右手中的纸牌：10

	分析：
		1.创建键盘录入对象
		2.定义int类型的变量left和right，并通过nextInt()方法给left和right赋值
		3.定义临时变量temp实现left和right变量值得交换
		4.按格式打印交换后的结果

*/


/*8
	分析一下需求，并用代码实现
	1.键盘录入学员张浩的3门课程(Java、SQL、Web)的成绩
	2.编写程序实现：
		(1)Java课程和SQL课程的分数只差
		(2)3门课程的平均分
		分析：
			1.创建键盘录入对象
			2.定义三个变量用于存储三门课程的成绩
			3.使用nextInt()方法给三门课程的变量赋值
			4.定义存储差值及平均值的变量
			5.求差值和平均值
			6.打印最终结果
 */


    /**
     * 看程序说结果，请不要提前运行？
     */
    public class Task05 {
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            int x = a + b++;
            System.out.println("b=" + b);
            System.out.println("x=" + x);

        }
    }


    /**
     * 看程序说结果，请不要提前运行？
     */
    public class Task06 {
        public static void main(String[] args) {
            int x = 4;
            int y = --x + x-- + (x * 10);
            System.out.println("x = " + x + ",y = " + y);
        }
    }


    /**
     * 看程序说结果，请不要提前运行？
     */
    public class Task07 {
        public static void main(String[] args) {
            short s = 30;
            int i = 50;
            s += i;
            System.out.println("s=" + s);
            int x = 0;
            int y = 0;
            int z = 0;
            boolean a, b;

            a = x > 0 & y++ > 1;
            System.out.println("a=" + a);
            System.out.println("y=" + y);

            b = x > 0 && z++ > 1;
            System.out.println("b=" + b);
            System.out.println("z=" + z);

            a = x > 0 | y++ > 1;
            System.out.println("a=" + a);
            System.out.println("y=" + y);

            b = x > 0 || z++ > 1;
            System.out.println("b=" + b);
            System.out.println("z=" + z);
        }
    }


}
