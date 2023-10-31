package switchdemo;

import java.util.Scanner;

public class SwitchTest2 {
    public static void main(String[] args){
        /*需求：键盘录入星期数，输出工作日、休息日。
            （1-5）工作日（6-7）休息日
         */

        //分析
        //1.键盘录入整数表示星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个整数表示星期几：");
        int week = sc.nextInt();

        //2.利用switch语句进行选择
        switch (week){
//            case 1:
//                System.out.println("工作日");
//                break;
//            case 2:
//                System.out.println("工作日");
//                break;
//            case 3:
//                System.out.println("工作日");
//                break;
//            case 4:
//                System.out.println("工作日");
//                break;
//            case 5:
//                System.out.println("工作日");
//                break;
/*
              上面都是重复的，所以可以使用case穿透
 */
//            case 1,2,3,4,5:（Java12的特性）
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }
    }
}
