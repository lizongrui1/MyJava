package loopdemo;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        /*案例2:求平方根
        需求:键盘录入一个大于等于2的整数X，计算并返回X的平方根
        结果只保留整数部分，小数部分将被舍去*/


        //在代码当中
        //从1开始循环，拿着数字的平方跟原来的数字进行比较
        //如果小于的，那么继续往后判断
        //如果相等，那么当前数字就是平方根
        //如果大于的，那么前一个数字就是平方跟的整数部分


        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个大于等于2的整数：");
        int i = sc.nextInt();
        int chu = 1;
        while (chu * chu <= i) {
            chu++;
            if (chu * chu == i) {
                System.out.println("平方根为：" + chu);
                break;
            } else if (chu * chu > i) {
                System.out.println("平方根的整数部分为：" + (chu - 1));
                break;
            }
        }

/*        for (int i = 1; i <= number; i++) {
            //用i * i 再跟number进行比较
            if (i * i == number) {
                System.out.printIn(i + "就是" + number + "的平方根");
            //一旦找到了，循环就可以停止了，后面的数字就不需要再找了，提高代码的运行效率。
                break;
            } else if (i * i > number) {
                System.out.println((i - 1) + "就是" + number + "平方根的整数部分");
                break;
            }
        }*/


    }
}
