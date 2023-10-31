package loopdemo;

import java.util.Scanner;

public class ForTest5 {
    public static void main(String[] args) {
        /*
        需求:键盘录入两个数字，表示一个范围。
            统计这个范围中
            既能被3整除，又能被5整除数字有多少个?
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入下限i：");
        int i = sc.nextInt();

//        Scanner cs = new Scanner(System.in);      上面一句就行

        System.out.println("请输入上限j：");
        int j = sc.nextInt();

//        System.out.println(i);
//        System.out.println(j);

        int count = 0;
        for (int number = i; number <= j; number++) {
            if (number % 3 == 0 && number % 5 == 0) {              // 或是||
                count += 1;                                        //count++;    自增函数
            }
        }
        System.out.println(count);
    }
}