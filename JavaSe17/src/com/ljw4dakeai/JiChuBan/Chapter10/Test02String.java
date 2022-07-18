package com.ljw4dakeai.JiChuBan.Chapter10;

/**
 * @author ZJH
 * @info String 类型的使用
 */
public class Test02String {
    public static void main(String[] args) {
        //所有 被"" 包起来的都是String类的对象

        //String 对象是不可以改变的, 但是字符串变量的引用是可以改变的

        String nullString = new String();
        //创建了一个对象

        String zoujiahao = new String("zoujiahao");
        /**  这个对象的构造函数,里面存放的是
         *public String(String original) {
         *this.value = original.value;
         * this.coder = original.coder;
         *this.hash = original.hash;
         *  private int hash; // Default to 0
         *  private final byte coder;
         *  private final byte[] value;
         *   new String(" ")存放在堆内存中的是字符串字符对应的是byte数据 而不是存放的引用
         *   "new String("something")
         *   " "首先会在常量池里面创建
         *   然后new String () 会从常量池中获取到这个数据然后 将数据修改为byte存放在new String()构造器中
         *
         */


        //创建了两个对象
        System.out.println(zoujiahao);

        String charString = new String(new char[]{'z', 'j', 'h'});
        //创建了两个队形

        String lijingwen = "lijingwen";
        //创建了一个对象


        //字符串变量比较的是地址值, 而不是对象的内容
        //字符串比较使用equals

        String lzoujiahao = "zoujiahao";
        //双引号包括起来的放在字符串常量池中

        String rzoujiahao = "zoujiahao";
        //对常量池中的数据检查有没有


        System.out.println(lzoujiahao == zoujiahao); //false
        System.out.println(rzoujiahao == lzoujiahao); //true

        String abc = "abc";
        String ab = "ab";
        String c = "c";

        //ab + c 是变量, 通过StringBuilder拼接起来 会产生 新的对象
        System.out.println(abc == ab + c); // false

        String def = "def";
        String def_ = "d" + "e" + "f"; //编译前就会拼接起来(常量优化机制!)


        System.out.println(def == def_); //true


        //比较字符串内容是不是相等(区分大小写) equals
        //比较字符串内容是不是相等(不区分大小写)

        System.out.println(zoujiahao.equals(lijingwen));
        System.out.println(zoujiahao.equals(lzoujiahao));
        System.out.println(lzoujiahao.equals(rzoujiahao));
        System.out.println(zoujiahao.equalsIgnoreCase(lijingwen));
        System.out.println(zoujiahao.equalsIgnoreCase(lzoujiahao));
        System.out.println(lzoujiahao.equalsIgnoreCase(rzoujiahao));


    }
}
