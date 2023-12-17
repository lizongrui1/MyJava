package stringdemo;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        /*定义一个方法，实现字符串反转。
        键盘录入一个字符串，调用该方法后，在控制台输出结果
        例如，键盘录入abc，输出结果cba*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串");
        String str = sc.next();

        String s = reverser(str);
        System.out.println(s);

    }

    public static String reverser(String str) {
            String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            //i 依次表示字符串中的每一个索引 (倒着的)
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}
