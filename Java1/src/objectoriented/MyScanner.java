package objectoriented;
import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        //键盘录入:
        //第一套体系:
        //nextInt();接收整数
        //ne*tDouble();接收小数
        //next();接收字符串
        //遇到空格，制表符，回车就停止接受。这些符号后面的数据就不会接受了

        //第二套体系:
        //nextLine();接收字符串
        //可以接收空格，制表符，遇到回车才停止接受数据

        //键盘录入两套体系不能混用
        //弊端: 先用nextInt，再用nextLine会导致下面的nextLine接受不到数据

        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数"); //123 234
        int num1 = sc.nextInt();  //123
        System.out.println(num1); //123
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();  //234
        System.out.println(num2);   //234*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串");   //abc bcd
        String str1 = sc.next();    //abc
        System.out.println(str1);    //abc
        System.out.println("请输入第二个字符串");
        String str2 = sc.next();     //bcd
        System.out.println(str2);    //bcd*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串");   //abc bcd
        String line1 = sc.nextLine();   //abc bcd
        System.out.println(line1);        //abc bcd
        System.out.println("请输入第二个字符串");    //接着输入：123 234
        String line2 = sc.nextLine();      //123 234
        System.out.println(line2);        //123 234
    }
}
