package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage01;

/**
 * @author ZJH
 * @info
 * 分析以下需求用代码实现:
 * 	1.定义形状类Shape:
 * 		功能:
 * 			求面积,求周长
 * 	2.定义圆形类Round:
 * 		属性:
 * 			半径,圆周率
 * 		功能:
 * 			求面积,求周长
 *
 * 	3.定义长方形类 Rectangle:
 * 		属性:
 * 			长和宽
 * 		功能:
 * 			求面积,求周长
 * 	4.定义测试类:
 * 		分别创建圆形和长方形对象,为相应的属性赋值
 * 		分别调用求面积和求周长的方法
 */
public abstract class Shape {
    /**
     * 求图形周长
     * @return 周长
     */
    public abstract double perimeter();

    /**
     * 求图形状面积
     * @return 面积
     */
    public abstract double area();


}
