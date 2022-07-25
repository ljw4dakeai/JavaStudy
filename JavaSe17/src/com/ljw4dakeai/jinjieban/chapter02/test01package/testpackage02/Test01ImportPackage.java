package com.ljw4dakeai.jinjieban.chapter02.test01package.testpackage02;
//导入单个类
//import com.ljw4dakeai.jinjieban.chapter02.test01package.testpackage01.Student;

//导入包下全部类
import com.ljw4dakeai.jinjieban.chapter02.test01package.testpackage01.*;


//导入包的快捷键 alt + enter 选择import class
/**
 * @author ZJH
 */
public class Test01ImportPackage {
    public static void main(String[] args) {

        //不同包下的相同类(带包名访问)
        //不推荐使用, 尽量使用不同类名  不写重复类
        com.ljw4dakeai.jinjieban.chapter02.test01package.testpackage01.Student student =
                new com.ljw4dakeai.jinjieban.chapter02.test01package.testpackage01.Student();
        Student student1 = new Student();
    }
}
