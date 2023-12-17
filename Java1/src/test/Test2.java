package test;

public class Test2 {
    public static void main(String[] args) {
        //判断 101 ~ 200 之间有多少个素数，并输出所有素数
        int count = 0;
        //外循环: 遍历101~200这个范围，依次得到这个范围之内的每一个数字
        for (int i = 101; i <= 200; i++) {
            //i 依次表示循环中的每一个数字

            //继续判断i是否为一个质数
            boolean flag = true;
            //内循环:判断当前数字是否为一个质数
            for (int j = 2; j < i; j++) {      //从2开始，到当前数字-1结束
                if (i % j == 0) {
                    flag = false;
                    break;   //break跳出单层循环（内循环）
                }
            }
            System.out.println(i);
            if (flag) {
                System.out.println("当前数字是质数");
                count++;
            } else {
                System.out.println("当前数字不是一个质数");
            }
        }
        System.out.println("一共有" + count + "个质数");
    }
}