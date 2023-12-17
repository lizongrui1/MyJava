package test;

import java.util.Random;
import java.util.Scanner;

public class Test10_1 {
    public static void main(String[] args) {
        /*
        投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1-33中选择;蓝色球号码从1-16中选择。
        */

        //1.随机生成中奖号码
        int[] arr = createNumber();

        //2.让用户输入彩票号码（红球 + 蓝球）
        int[] userInputarr = userInputNumber();

        //3.判断用户的中奖情况

    }

    public static int[] userInputNumber(){
        //1.创建数组用于添加用户购买的彩票号码
        //6个红球 1个蓝球 数组长度: 7
        int[] arr = new int[7];

        //2.利用键盘录入让用户输入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码：");
            int redNumber = sc.nextInt();
            //redNumber 在1~33 且唯一不重复
            if(redNumber >= 1 && redNumber <= 33){
                //判断唯一性，直接用刚才的contains
                boolean flag = contains(arr,redNumber);
                if(!flag){
                    //不存在，有效可以添加到数组当中
                    arr[i] = redNumber;
                    i++;
                }else {
                    //存在
                    System.out.println("当前红球号码已经存在，请重新输入");
                }

            }else {
                System.out.println("当前红球号码超出范围");
            }
        }

        //让用户输入蓝球号码
        System.out.println("请输入蓝球号码");
        //只需要判断范围在1~16之间就行
        while (true) {
            int blueNumber = sc.nextInt();
            if(blueNumber >= 1 && blueNumber <= 16){
                arr[arr.length - 1] = blueNumber;          //把blueNumber添加到最大索引
                break;                                     //要一直循环，直到输入正确的蓝球数字
            }else {
                System.out.println("当前篮球号码超出范围");
            }
        }
        return arr;
    }

    public static int[] createNumber() {
        Random r = new Random();
        //1.创建数组用于添加中奖号码
        //6个红球 1个蓝球 数组长度: 7
        int[] arr = new int[7];

        //2.随机生成号码并添加到数组当中
        //红球:不能重复的
        //蓝球:可以跟红球号码重复

        //生成红球号码并添加到数组当中
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1;         //nextInt(n) 方法会生成一个在 [0, n) 范围内的随机整数，包括0但不包括n
            //redNumber不能重复，还要拿着redNumber到arr里做一个判断  ---->再去写一个方法
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                //把红球号码添加到数组当中
                arr[i] = redNumber;
                i++;                    //只有成功添加的时候i才会++
            }
        }
        //生成蓝球号码并添加到数组当中
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    //用于判断数字在数组中是否存在
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] == number) {
                return true;
            } /*else {
                return false;
            }*/
        }
        return false;
    }

}
