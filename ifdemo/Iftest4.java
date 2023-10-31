package ifdemo;

import java.util.Scanner;

public class Iftest4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的票号");
        int number = sc.nextInt();
        //只有当number在0到100之间才是真实有效的票
        if (number >= 0  && number <= 100){
        if (number % 2 == 1){
            System.out.println("请坐左侧");
        }else {
            System.out.println("请坐右侧");
        }
        }else {
            System.out.println("您的票无效");
        }
    }
}
