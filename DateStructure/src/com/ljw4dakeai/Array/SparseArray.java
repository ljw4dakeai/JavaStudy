package com.ljw4dakeai.Array;

import java.io.*;

public class SparseArray {
//稀疏数组
//第一行共几行几列
//不同值的元素的行列及值记录再一个最小数组里面
//保存棋盘地图等等这种对象-->二维数组-->稀疏数组(存)
//行不确定，列为     row          col         value
//            [0]数组的行      数组的列      数组有效值的个数
//            [1]数组中数据的行 数组数据中的列 数组数据中的值
//           [...]
//思路
//二维数组-->>稀疏数组：1：遍历二维数组，得到要保存的有效数据的个数sum
//                  2：根据sum可以创建稀疏数组 sparseArr int[sum+1][3]
//                  3：将二维数组的有效数据存入稀疏数组

    //稀疏数组-->>稀疏数组：1：读取稀疏数组第一行，根据第一行的数据建立一个二维数组chessArr2[][]
//                  2：再根据稀疏数组后面的数据，赋值给二维数组
    public static void main(String[] args) throws IOException {
        //创建一个原始的二维数组 11*11
        //o：没有棋子；1：黑色；2：蓝色
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        System.out.println("原始二维数组为：");
        for (int[] row : chessArr1) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        //将二维数组-->>稀疏数组
        //1：遍历二维数组，得到非0的数据的个数sum
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] != 0) {
                    sum++;
                }
            }
        }
        //System.out.println("sum="+sum);
        //2：创建稀疏数组 sparseArr int[sum+1][3]
        int sparseArr[][] = new int[sum + 1][3];
        //3：将二维数组的有效数据存入稀疏数组
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        //4：遍历二维数组将非0的值放进稀疏数组中
        //用于记录第几个非0数据
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        }
        //输出稀疏数组
        System.out.println();
        System.out.println("得到稀疏数组为：");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
        }


        //数组的读取和写入
        System.out.println();
        System.out.println("开始写入");
        DataOutputStream out = null;
        DataInputStream in = null;
        try {
            out = new DataOutputStream(new FileOutputStream("C:\\software\\code\\java\\JavaStudy\\DateStructure\\src\\com.ljw4dakeai.Array\\SparseArray.data"));
            for (int[] row : sparseArr) {
                for (int data : row) {
                    out.writeInt(data);
                }
            }
            System.out.println();
            System.out.println("稀疏数组写入完成");
            System.out.println();
            System.out.println("开始文件读出");
            //写出去的文件打开是乱码。jbc打开文本类型  所以乱码  数据流在流动的时候有明确的数据类型
            in = new DataInputStream(new FileInputStream("C:\\software\\code\\java\\JavaStudy\\DateStructure\\src\\com.ljw4dakeai.Array\\SparseArray.data"));
            for (int i = 0; i < sparseArr.length; i++) {
                System.out.print(in.readInt() + "\t");
                System.out.print(in.readInt() + "\t");
                System.out.println(in.readInt() + "\t");
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("稀疏数组读出完成");


        //稀疏数组-->>二维数组
        //1：读取稀疏数组第一行，根据第一行的数据建立一个二维数组chessArr2[][]
        int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];
        //2：再根据稀疏数组后面的数据，赋值给二维数组
        for (int i = 1; i < sparseArr.length; i++) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        System.out.println();
        System.out.println("由稀疏数组转换的二维数组为：");
        for (int[] row : chessArr2) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }
}

