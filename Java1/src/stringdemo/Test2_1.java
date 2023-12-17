package stringdemo;

import java.util.Scanner;

public class Test2_1 {
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
                continue;
            }
        }

        /*        将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系
        I-1、II - 2、III- 3、IV - 4、V -5、VI- 6、VII - 7、VIII - 8、IX - 9*/
        //查表法:数字跟数据产生一个对应关系

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s = arrToString(c);

            sb.append(s);

        }
        System.out.println(sb);
    }

    //利用switch进行匹配
    public static String arrToString(char number) {
        String str;
        switch (number) {
            case '0' -> str = "";         //Java 12 引入的 switch 表达式的语法（箭头表达式 ->）   所以我这个还是没法使用的
            case '1' -> str = "I";
            case '2' -> str = "II";
            case '3' -> str = "III";
            case '4' -> str = "IV";
            case '5' -> str = "V";
            case '6' -> str = "VI";
            case '7' -> str = "VII";
            case '8' -> str = "VIII";
            case '9' -> str = "IX";
            default -> str = "";
        }
        return str;
    }

    public static boolean checkStr(String str) {
        //要求1:长度为小于等于9
        if (str.length() > 9) {
            return false;
        }
        //要求2：只能是数字（从左到右遍历每一个字符）
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);  //0~9
            if (c < '0' || c > '9') {            //我写的：'c' >= 48 && 'c'<= 58
                return false;
            }
        }
        //只有当字符串里面所有的字符全都判断完毕了，我才能认为当前的字符串是符合规则
        return true;
    }
}
