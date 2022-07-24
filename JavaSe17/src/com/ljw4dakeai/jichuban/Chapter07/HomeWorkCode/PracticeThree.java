package com.ljw4dakeai.jichuban.Chapter07.HomeWorkCode;

/**
 * @author ZJH
 * @info
 * 请定义一个方法，该方法可以实现对int类型的数组进行遍历，在控制台打印所有元素。
 * 实现方法后，请在主方法中调用方法，查看结果。例如，数组为{11, 22, 33}，打印格式为：[11, 22, 33]
 *
 * 1、首先明确方法的返回值和参数列表，该方法只需要在控制台输出，f返回值类型为void.要实现打印数组元素的功能，需要方法的调用者把想打印的数组传递过来，所以参数列表是int[] arr
 *
 * 2、方法实现之后，不调用的话会执行吗？该怎样调用？
 *
 * ### 操作步骤
 *
 * 1、定义方法，返回值类型为void，参数列表为int[] arr
 *
 * 2、在方法中，遍历数组，判断是否是最后一个元素，并且根据不同的情况输出不同的格式。
 *
 * 3、在主方法中定义一个数组，调用方法，将数组作为参数传递，查看运行结果。
 */
public class PracticeThree {
    public static void main(String[] args) {
            arrToString(new int[]{10, 20, 40});
    }


    public static void arrToString(int[] arr){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1){
                System.out.print(arr[i]);
            }else {
            System.out.print(arr[i] + " , ");
            }
//            System.out.print(i == arr.length -1 ? arr[i] + "" : arr[i] + " , ");
        }
        System.out.println(" ]");
    }
}
