package test;

import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        /*
        投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1-33中选择;蓝色球号码从1-16中选择。
        */

        //1.随机生成中奖号码
//        int[] red = new int[6];
//        int[] blue = new int[1];
        int[] arr = createNumber();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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
