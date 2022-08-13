package com.ljw4dakeai.jinjieban.chapter10.test04printstream.testpackage01;

import java.io.*;

/**
 * @author ZJH
 */
public class Test02TestPrintWriter {
    public static void main(String[] args) throws IOException {
//        PrintWriter printWriter = new PrintWriter("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test04printstream/printFile.txt");
//        PrintWriter printWriter = new PrintWriter(new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test04printstream/printFile.txt"));
//        PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test04printstream/printFile.txt")));
        PrintWriter printWriter = new PrintWriter(new FileWriter(new File("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test04printstream/printFile.txt")));

//        //写数据
//        printWriter.write(97);
//        printWriter.write("你好");
//        printWriter.write(new char[]{'0', '1', '2'});
//        printWriter.write(new char[]{'0', '1', '2'}, 0, 1);

        //printWrite提供了print 和 println方法, 可以打印任何东西
        //底层会把任何数据类型转化为String类型
        printWriter.println(97);
        printWriter.println('a');
        printWriter.println(3.12);
        printWriter.println("哈哈哈");


        printWriter.close();

        //修改输出语句的目的地
        System.setOut(new PrintStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test04printstream/printFile.txt"));
        System.out.println("我打印到这个位置啦!");
    }
}
