package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*卖飞机票
        需求:
        机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格: 旺季(5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月)头等舱7折，经济舱6.5折。*/

        //分析：
        //1.键盘录入机票原价、月份、头等舱或经济舱

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = sc.nextDouble();
        System.out.println("请输入购买月份：");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0头等舱 1经济舱：");
        double a = sc.nextInt();

        //2.先判断月份是旺季还是淡季
        //3.继续判断当前机票是经济舱还是头等舱
        //4.根据实际情况计算出对应的价格
        if (month >= 5 && month <= 10) {
            //旺季
            if (a == 0) {
                //头等舱
                price = price * 0.9;            //或者进行强转：price = (int)(price * 0.9）；
            } else if (a == 1) {
                //经济舱
                price = price * 0.85;
            } else {
                //表示键盘录入的月份是一个非法数据
                System.out.println("没有这个舱位");
            }

        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            //淡季
            if (a == 0) {
                price = price * 0.7;
            } else if (a == 1) {
                price = price * 0.65;
            } else {
                //表示键盘录入的月份是一个非法数据
                System.out.println("键盘录入的月份不合法");
            }
        }

        System.out.println("您机票的价格为：" + price);
    }
}

