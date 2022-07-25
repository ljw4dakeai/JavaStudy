package com.ljw4dakeai.jinjieban.chapter01.test01extends;

/**
 * @author ZJH
 * @info
 * 继承的注意实现
 * 类 是 单继承 ,但是可以多重继承
 * 如果一个类,没有继承,那他默认是继承object的
 */
public class Test02ExtendsInfo {
}

class Grandfather{

}
class FeatherOne{

}


class FeatherTwo{

}

//class Son extends FeatherOne, FeatherTwo{
//
//} error  不能继承两个


//class FeatherOne extends Grandfather{
//
//}
//class Son extends FeatherOne{
//
//}正确 // 可以多重继承

