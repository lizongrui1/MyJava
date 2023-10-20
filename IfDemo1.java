//package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args){
        //需求：键盘输入酒量，如果大于2斤，则老丈人给出回应，否则不回应
        //分析：1。键盘输入酒量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入酒量：");
        int wine = sc.nextInt();
        //分析：2.对酒量进行判断
        if (wine > 2){
            System.out.println("小伙子不错");
        }
        //System.out.println("小伙子不太行啊");
    }
}
