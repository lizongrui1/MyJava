package objectoriented.Test7;

import java.util.Scanner;

        /*定义数组存储3部汽车对象。
        汽车的属性:品牌，价格，颜色
        创建三个汽车对象，数据通过键盘录入而来，并把数据存入到数组当中*/

public class CarTest {
    public static void main(String[] args) {
        //1.创建一个数组用来存3个汽车对象
        Car[] arr = new Car[3];

        //2.创建汽车对象，数据来自于键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车的对象（一定要写在循环的里面）
            Car c = new Car();
            //录入品牌
            System.out.println("请输入汽车的品牌");
            String brand = sc.next();
            c.setBrand(brand);
            //录入价格
            System.out.println("请输入汽车的价格");
            int price = sc.nextInt();
            c.setPrice(price);
            //录入颜色
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            c.setColor(color);

            //把汽车对象添加到数组当中
            arr[i] = c;
        }
        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            //i索引 arr[i]元素
            Car car = arr[i];
            System.out.println(car.getBrand() + "，" + car.getPrice() + "，" + car.getColor());
        }
    }
}
