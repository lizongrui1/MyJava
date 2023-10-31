package loopdemo;

import java.util.Enumeration;
import java.util.Scanner;

public class LoopTest1 {
    public static void main(String[] args){
        /*案例1:逢7过
        朋友聚会的时候可能会玩一个游戏:逢7过游戏规则:从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说过:过
        需求:使用程序在控制台打印出1-100之间的满足逢七必过规则的数据*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("请说出一个数字：");
        int num = sc.nextInt();*/

        //个位7 十位7 7的倍数        都要过

        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);

            if (i % 7 == 0 || i / 10 % 10 == 7 || i % 10 == 7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
