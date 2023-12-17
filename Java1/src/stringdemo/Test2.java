package stringdemo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*转换罗马数字
        键盘录入一个字符串
        要求1:长度为小于等于9
        要求2:只能是数字
        将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系
        I-1、II - 2、III- 3、IV - 4、V -5、VI- 6、VII - 7、VIII - 8、IX - 9
        注意点:
        罗马数字里面是没有0的
        如果键盘录入的数字包含0，可以变成""(长度为0的字符串)*/

        //1.键盘录入一个字符串
        //书写scanner的代码
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串：");

            str = sc.next();
            //2.校验字符串是否满足规则
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("输入有误");
//                continue;     // 'continue' 不必要，因为是循环中的最后一条语句
            }
        }

        /*        将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系
        I-1、II - 2、III- 3、IV - 4、V -5、VI- 6、VII - 7、VIII - 8、IX - 9*/
        //查表法:数字跟数据产生一个对应关系

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
//            System.out.println(c);
            int number = c - 48;  // 1 2 3 4 5
            String s = arrToString(number);
//            System.out.print(s);
            sb.append(s);

        }
        System.out.println(sb);
    }


    public static String arrToString(int number) {
        //定义一个数组，让索引跟罗马数字产生一个对应关系
        String[] str = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return str[number];
    }

    public static boolean checkStr(String str) {
        //要求1:长度为小于等于9
        if (str.length() > 9) {
            return false;
        }
        //要求2：只能是数字（从左到右遍历每一个字符）
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);  //0~9
            if (c <= 48 || c>= 58) {            //c < '0' || c > '9'
                return false;
            }
        }
        //只有当字符串里面所有的字符全都判断完毕了，我才能认为当前的字符串是符合规则
        return true;
    }
}
