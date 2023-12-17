package stringdemo;

import java.util.Scanner;

public class myTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额");
        int money = sc.nextInt();

//        String capital = getCapital(money);
//        System.out.println(capital);
        String moneyStr = "";
        while (true){
            int i = money % 10;
            String capital = getCapital(i);
//            System.out.println(capital);
            moneyStr = capital + moneyStr;
            money = money / 10;
            if (money == 0){
                break;
            }
        }
//        System.out.println(moneyStr);

        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr= "零" + moneyStr;
        }
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};

    }

//    public static String

    public static String getCapital(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}
