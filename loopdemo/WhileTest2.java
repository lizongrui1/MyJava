package loopdemo;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        /*
        案例2: 回文数
        需求:给你一个整数x。
        如果x是一个回文整数，打印 true ，否则，返回 false 。
        解释:回文数是指正序(从左向右)和倒序(从右向左)读都是一样的整数
        例如，121 是回文，而 123 不是。
         */

        //核心思路:把数字倒过来跟原来的数字进行比较

        //1.定义数字
        //2.利用循环开始从右往左获取每一位
        Scanner sc = new Scanner(System.in);
        System.out.println("请属于一个整数：");
        int number = sc.nextInt();
        int x = 0;                           //记录倒过来之后的结果
        //定义一个临时变量用于记录x原来的值，用于最后进行比较
        int temp = number;

//        int ge = number % 10;
//        int shi = number / 10 % 10;


        while (number != 0) {
            //从右往左获取每一位
            int ge = number % 10;
            //修改一下number记录的值
            number = number / 10;       // 1234/10 = 123
            x = x * 10 + ge;                //把当前获取到的数字拼接到最右边

        }
        //3.打印最后的结果x
        System.out.println(x);
//        System.out.println(number);       //number变成0了
        //4.比较
        System.out.println(x == temp);
    }
}
