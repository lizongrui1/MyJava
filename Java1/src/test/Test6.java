package test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*数字加密
        需求：
        某系统的数字密码(大于0)，比如1983，采用加密方式进行传输。
        规则如下:
        先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。*/

        //1.把整数里面的每一位放到数组当中
//        int[] arr = {1, 8, 7, 3};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入系统的数字密码");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        while (number != 0) {
            //每一次循环就去掉右边的一个数字
            number = number / 10;
            count++;
        }

        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[arr.length - 1 - i] = temp % 10;       //如果这里用number的话，之前number都已经变为0了
            temp = temp / 10;
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        //2.加密

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }                                      //但是最好一个循环做一件事情，就比如一个循环用来+5另外一个循环对10取余！！！

        //将所有的数字反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {        //定义两个指针，一个指针指着0索引，还有一个指着最大的一个索引（长度 - 1），每次交换完了以后左边的指针++，右边的指针--，当左边的指针比右边的指针大的时候循环就要结束
            int temp1 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp1;
        }
        //8 2 3 6 --》 8236
        //3.把数组里面的每一个数字进行拼接，变成加密之后的结果
        int number1 = 0;
        for (int i = 0; i < arr.length; i++) {
            number1 = number1 * 10 + arr[i];
        }
        System.out.println(number1);
    }
}
