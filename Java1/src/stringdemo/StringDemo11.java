package stringdemo;

import java.sql.SQLOutput;

public class StringDemo11 {
    public static void main(String[] args) {
        /*  7-14位: 出生年、月、日
        17位: 性别 (奇数男性，偶数女性)
        人物信息为:
        出生年月日: XXXX年X月X日
        性别为: 男/女    */

        //1.定义一个字符串记录身份证号码
        String id = "230602199901107112";

        //2.获取出生年月日
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
//        System.out.println(year);
//        System.out.println(month);
//        System.out.println(day);
        System.out.println("人物信息为:");
        System.out.println("出生年月日：" + year + "年" + month + "月" + day +"日");
        //3.获取性别
        char gender = id.charAt(16);  // '1' ---> 1
//        System.out.println(gender);
        //利用ASCII码表进行转换
        // '0' ---> 48
        //  。。。
        // '9' ---> 57

        int num = gender - 48;
        if (num % 2 == 0){
            System.out.println("性别为：女");
        }else {
            System.out.println("性别为：男");
        }

    }
}
