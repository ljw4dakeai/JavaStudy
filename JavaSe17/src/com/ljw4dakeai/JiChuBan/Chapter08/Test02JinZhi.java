package com.ljw4dakeai.JiChuBan.Chapter08;

/**
 * @author ZJH
 * @info 进制
 * 2 0B 0b
 * 8 0
 * 16 0x
 * 负数计算机存储的是二进制补码
 * 原码 符号位 数据 (符号位 0表示正数 , 1 表示负数 )
 * 反码 数据位取反 符号位不变
 *补码 反码 + 1
 *
 * 正数的原反补都是一样的
 *
 */
public class Test02JinZhi {
    public static void main(String[] args) {


        System.out.println(0b11);
        System.out.println(0xb);
        System.out.println(010);
        System.out.println(10);

        System.out.println(~1);
        // 00000001 11111110
        System.out.println(~0);
        //00000000 11111111

        System.out.println(2 << 2); //
        // 2*2*2

        System.out.println(-3 >> 1);
        //右移 补符号位
        //原码1000 0110
        //反码1111 1001
        //补码1111 1010
        // >> 1111 1101
        //反码1111 1100
        //原码1000 0010  -> -2

        System.out.println(-3 >>> 1);
        //右移 补0 和符号位无关(如果是一个字节 8位)
        //原码1000 0110
        //反码1111 1001
        //补码1111 1010
        // >> 0111 1101(正数,很大)


    }
}
