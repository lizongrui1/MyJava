package stringdemo;

import java.util.SplittableRandom;

public class StringDemo10 {
    public static void main(String[] args) {
        //1.获取一个手机号码
        String phoneNumber = "13234927892";

        //2.截取手机号码的前面三位
        String phoneNumber1 = phoneNumber.substring(0,3);

        //3.截取手机号码后面四位
        String phoneNumber2 = phoneNumber.substring(7);

        //4.拼接
        String result = phoneNumber1 + "****" + phoneNumber2;

        System.out.println(result);
    }
}
