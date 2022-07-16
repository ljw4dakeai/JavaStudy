package com.ljw4dakeai.Recursion;

public class MiGong_Recursion {
    public static void main(String[] args) {
        //先创建一个迷宫
        int[][] migong = new int[8][7];
        //使用1表示墙
        //把上下的先制成1
        for (int i = 0;i < 7; i++){
            migong[0][i] = 1;
            migong[7][i] = 1;
        }
        //左右再制成1
        for (int j = 0; j < 8; j++){
            migong[j][0] = 1;
            migong[j][6] = 1;
        }
        //设置挡板
        migong[3][1] = 1;
        migong[3][2] = 1;

        //初始迷宫
        System.out.println("初始地图为:");
        for (int[] item:migong){
            for (int m:item){
                System.out.printf("%d\t",m);
            }
            System.out.println();
        }

        //走图顺序为下->右->上->左
        System.out.println("走图顺序为下->右->上->左");
        setMap(migong,1,1);
        System.out.println("走后的地图为:");
        for (int[] item:migong){
            for (int m:item){
                System.out.printf("%d\t",m);
            }
            System.out.println();
        }

        //走图顺序为上->右->下->左(使用时请注释掉以前的走图方法)
        System.out.println("走图顺序为上->右->下->左");
        setMapto(migong,1,1);
        System.out.println("走后的地图为:");
        for (int[] item:migong){
            for (int m:item){
                System.out.printf("%d\t",m);
            }
            System.out.println();
        }
    }

    //使用递归回溯给小球找路
    //i,j从1,1开始
    //ij到6,5表示找到了通路
    //约定:
    //      0:表示还没有走过;
    //      1:表示墙;
    //      2:表示通路;
    //      3:表示走过但是不同;
    //策略:路径顺序:下->右->上->左
    public static boolean setMap(int[][] migong ,int i, int j){
        if (migong[6][5] == 2){
            return true;
        }else {
            if (migong[i][j] == 0){
                //按照策略走
                //先假定能走通
                migong[i][j] = 2;
                //下
                if (setMap(migong, i+1, j)){
                    return true;
                //右
                }else if(setMap(migong, i, j+1)){
                    return true;
                //上
                }else if(setMap(migong, i-1, j)){
                    return true;
                //左
                }else if (setMap(migong, i, j-1)){
                    return true;
                }else {
                    //说明为死路，走不通
                    migong[i][j] = 3;
                    return false;
                }
            }else {
                //migong[i][j] != 0;  那么可能为1,2,3
                return false;
            }
        }
    }

    //修改找路的策略
    //上->右->下->左
    public static boolean setMapto(int[][] migong ,int i, int j){
        if (migong[6][5] == 2){
            return true;
        }else {
            if (migong[i][j] == 0){
                //按照策略走
                //先假定能走通
                migong[i][j] = 2;
                //上
                if (setMapto(migong, i-1, j)){
                    return true;
                    //右
                }else if(setMapto(migong, i, j+1)){
                    return true;
                    //下
                }else if(setMapto(migong, i+1, j)){
                    return true;
                    //左
                }else if (setMapto(migong, i, j-1)){
                    return true;
                }else {
                    //说明为死路，走不通
                    migong[i][j] = 3;
                    return false;
                }
            }else {
                //migong[i][j] != 0;  那么可能为1,2,3
                return false;
            }
        }
    }
}
