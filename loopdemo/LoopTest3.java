package loopdemo;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {

        /*案例3:求质数
        需求:键盘录入一个正整数X，判断该整数是否为一个质数*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = sc.nextInt();

        //定义一个变量，表示标记
        //标记着number是否为一个质数
        //true:是一个质数
        //false:不是一个质数

        //表示最初就认为number是一个质数
        boolean flag = true;

        //判断：
        //写一个循环，从2开始判断，一直判断到number-1为止
        //看这个范围之内，有没有数字可以被number整除

        for (int i = 2; i <= (number - 1); i++) {
            //i 依次表示这个范围之内的每一个数字，看number是否能被整除
            if (number % i == 0) {
                flag = false;
//                System.out.println("这个数不是质数");
                break;
            }/*else {
                System.out.println("这个数是质数");
                break;
            }*/           //这段不对
        }
        //只有当这个循环结束了，表示这个范围之内所有的数字都判断完毕了
        //此时才能断定number是一个质数

        if (flag) {
            System.out.println("这个数是质数");
        } else {
            System.out.println("这个数不是质数");
        }
    }
}
