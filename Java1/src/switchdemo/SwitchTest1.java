package switchdemo;

import java.util.Scanner;

public class SwitchTest1 {
    public static void main(String[] args){
        /*需求:键盘录入星期数，显示今天的减肥活动。
        周一:跑步
        周二:游泳
        周三:慢走
        周四:动感单车
        周五:拳击
        周六:爬山
        周日:好好吃一顿*/

        //分析：
        //1.键盘录入星期数
        Scanner sc = new Scanner(System.in);
                System.out.println("请录入星期");
//              int week = sc.nextInt();
                String week = sc.nextLine();
        //2.利用Switch语句进行星期匹配
        switch (week){
            case "跑步":
                System.out.println("跑步");
                break;
//            case 2:
//                System.out.println("游泳");
//                break;
//            case 3:
//                System.out.println("慢走");
//                break;
//            case 4:
//                System.out.println("动感单车");
//                break;
//            case 5:
//                System.out.println("拳击");
//                break;
//            case 6:
//                System.out.println("爬山");
//                break;
//            case 7:
//                System.out.println("好好吃一顿");
//                break;
            default:
                System.out.println("没有这个日子");
                break;


/*比如用if-else结构也可以完成
            if(week == 1){
                System.out.println("跑步");
            }else if (week == 2){
                System.out.println("游泳");
*/


            }

        }
    }
}
