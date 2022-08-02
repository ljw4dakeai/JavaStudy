package com.ljw4dakeai.jinjieban.chapter07.test03exception.testpackage01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ZJH
 */
public class Test02TestExceptions {
    public static void main(String[] args) {
//        //.Test02TestExceptions
//        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 2
//        //	at com.ljw4dakeai.jinjieban.chapter07.test03exception.testpackage01.Test02TestExceptions.main(Test02TestExceptions.java:14)
        int[] ints = new int[2];
        //ArrayIndexOutOfBoundsException 数组越界异常
        System.out.println(ints[-1]);

//        //NullPointException 空指针异常
//        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.ArrayList.size()" because "strings" is null
//        //	at com.ljw4dakeai.jinjieban.chapter07.test03exception.testpackage01.Test02TestExceptions.main(Test02TestExceptions.java:21)
        ArrayList<String> strings = null;
        strings.size();

//        //ArithmeticException 算术异常
//        //Exception in thread "main" java.lang.ArithmeticException: / by zero
//        //	at com.ljw4dakeai.jinjieban.chapter07.test03exception.testpackage01.Test02TestExceptions.main(Test02TestExceptions.java:26)
        System.out.println(10 / 0);

//        //CLassCastException
//        //Exception in thread "main" java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class java.util.LinkedList (java.util.ArrayList and java.util.LinkedList are in module java.base of loader 'bootstrap')
//        //	at com.ljw4dakeai.jinjieban.chapter07.test03exception.testpackage01.Test02TestExceptions.main(Test02TestExceptions.java:32)
        List<String> list = new ArrayList<>();
        LinkedList<String> linkedList= (LinkedList)list;

        //NumberFormatException
        //Exception in thread "main" java.lang.NumberFormatException: For input string: "10*"
        //	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        //	at java.base/java.lang.Integer.parseInt(Integer.java:668)
        //	at java.base/java.lang.Integer.parseInt(Integer.java:786)
        //	at com.ljw4dakeai.jinjieban.chapter07.test03exception.testpackage01.Test02TestExceptions.main(Test02TestExceptions.java:37)
        int i = Integer.parseInt("10*");


    }
}
