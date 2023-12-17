package loopdemo;

import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    public static void main(String[] args) {

        //需求: 程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少?

        //注意：生成随机数的代码int number = r.nextInt(100) + 1;
        //不能写在随机数的里面，否则每次都会产生一个新的随机数

        //拓展需求：加一个保底机制，三次猜不中，直接提示猜中了
        //用点券抽水晶
        //计数器
        //用来统计当前已经猜了多少次
        int count = 0;

        Random r = new Random();
        int number = r.nextInt(100) + 1;
//        System.out.println(number);

//        System.out.println("生成的随机数为" + number);
//        for (int i = 0; i < 100; i++) {
//            if (number == i) {
//                System.out.println(i);
//                break;
//            }


        //猜这个数字是多少
        Scanner sc = new Scanner(System.in);

        //判断两个数字给出不同的提示
        //猜的数字大了，提示  大了
        //猜的数字小了，提示  小了
        //猜的数字一样，提示  猜中了

        while (true) {                            //true无限循环


            System.out.println("请输入你要猜的数字：");
            int cai = sc.nextInt();

            count++;
            if (count == 3) {
                System.out.println("猜对了");
                break;
            }
                if (cai < number) {
                    System.out.println("小了");
                } else if (cai > number) {
                    System.out.println("大了");
                } else {
                    System.out.println("猜对了");
                    break;
                }
        }
    }
}

