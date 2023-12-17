package test;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {

        /*某系统的数字密码 (大于0) 。比如1983，采用加密方式进行传输
        规则如下:
        每位数加上5
        再对10求余，
        最后将所有数字反转，
        得到一串新数。
        按照以上规则进行解密:
        比如1983加密之后变成8346，解密之后变成1983*/

        //1.定义数组记录解密之后的结果
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入需要解密的密码");
//        int number = sc.nextInt();
        int[] arr = {8, 3, 4, 6};

//        int count = 0;
//        int temp = number;
//        while (number != 0) {
//            number = number / 10;
//            count++;
//        }

//        int[] arr = new int[count];
//        for (int i = 0; i < arr.length; i++) {
//            arr[arr.length - i - 1] = temp;
//            temp = temp / 10;
//            if (temp >= 0 && temp <= 4){
//                temp = temp + 10;
//            }
//        }
//        //测试
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        //2.反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp1 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp1;
        }

        //3.由于加密是通过对10取余的方式进行获取的
        //所以在解密的时候就需要判断，0~4之间+10 5~9数字不变
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }

        //4.每一位减5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }

        //5.获取数组里面的每一位数字拼接成最终的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }

        System.out.println(number);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }


    }
}
