package Depository;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Method method = new Method();
        int key;//接受用户输入
        Scanner userScanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("****** | 1、InPut         :商品的入库");
            System.out.println("****** | 2、OutPut       :商品的出库");
            System.out.println("****** | 3、GoodsUpd    :商品的修改");
            System.out.println("****** | 4、GoodsShow   :商品的显示");
            System.out.println("****** | 5、GoodsAll      :同名商品总数");
            System.out.println("****** | 6、WareUpd      :仓库的更新");
            System.out.println("****** | 7、WareDel      :仓库的删除");
            System.out.println("****** | 8、WareShow    :仓库的显示");
            System.out.println("****** | 9、WareAdd     :仓库的增加");
            System.out.println("****** | 10、Exit          :退出");
            System.out.println("-------------------------------------------------------------------------");
            System.out.print("请输入数字：");
            key = userScanner.nextInt();
            switch (key) {
                case 1:
                    method.Input();
                    break;
                case 2:
                    method.Output();
                    break;
                case 3:
                    method.GoodsUpd();
                    break;
                case 4:
                    method.GoodsShow();
                    break;
                case 5:
                    method.GoodsAll();
                    break;
                case 6:
                    method.WareUpd();
                    break;
                case 7:
                    method.WareDel();
                    break;
                case 8:
                    method.WareShow();
                    break;
                case 9:
                    method.WareAdd();
                    break;
                case 10:
                    userScanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误请重新输入!");
                    break;
            }
        }
    }
}
