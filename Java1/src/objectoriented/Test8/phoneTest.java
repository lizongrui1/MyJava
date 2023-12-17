package objectoriented.Test8;

        /*定义数组存储3部手机对象
        手机的属性:品牌，价格，颜色。
        要求，计算出三部手机的平均价格*/

import java.util.Scanner;

public class phoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            Phone p = new Phone();
//            System.out.println("请输入手机的品牌");
//            String brand = sc.next();
//            p.setBrand(brand);
//            System.out.println("请输入手机的价格");
//            int price = sc.nextInt();
//            p.setPrice(price);
//            System.out.println("请输入手机的颜色");
//            String color = sc.next();
//            p.setColor(color);
//
//            arr[i] = p;
//        }

        Phone p1 = new Phone("小米",1999,"白色");
        Phone p2 = new Phone("苹果",5999,"黑色");
        Phone p3 = new Phone("OPPO",3999,"粉色");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //获取三部手机的平均价格
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //i 索引 arr[i] 元素（手机对象）
            Phone phone = arr[i];
            sum = sum + phone.getPrice();
        }
        double avg = 0;
        avg = sum / arr.length;
        System.out.println(avg);
    }
}
