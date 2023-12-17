package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*评委打分
        需求:
        在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
        选手的最后得分为: 去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。*/

/*        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入6位评委老师的分数");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (0 <= arr[i] <= 100) {
            int[] arr1 = new int[5];
            for (int i = 1; i < arr.length; i++) {
                int temp = arr[0];
                if (temp < arr[i]) {
                    arr1[i] = arr[i];
                }
            }
            int[] arr2 = new int[4];
            for (int i = 1; i < arr.length; i++) {
                int temp = arr1[0];
                if (temp > arr1[i]) {

                } else {
                    arr2[i] = temp;
                }
            }
        }else {

        }*/

        //分析:
        //1.定义一个数组 用来存储6名评委的打分 (0~100)

        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.print(scoreArr[i] + " ");
        }
        //2.求出数组中的最大值
        int max = getMax(scoreArr);
        //3.求出数组中的最小值
        int min = getMin(scoreArr);
        //4.求出数组中6个分数的总和
        int sum = getSum(scoreArr);
        //5.(总和 - 最大值 - 最小值 ) /4
        int avg = (sum - max - min) / (scoreArr.length - 2);
        System.out.println("平均分为" + avg);
    }

    //求出总和
    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }

    //求数组的最大值
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {            //循环从0开始或者从1开始对结果没什么影响，可能效率偏低
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    //求数组的最小值
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    //1.我要干嘛?     定义一个数组，用来存储6名评委的打分 (0~100)
    //2.我需要什么?        都不需要
    //3.干完了这件事情，是否需要返回?        必须返回
    public static int[] getScores() {
        //定义数组
        int[] scores = new int[6];
        //使用键盘录入的形式，输入分数：0~100
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {   //条件控制语句空着，表示i没有任何的变化，还是0
            System.out.println("请输入第" + (i + 1) + "位评委老师的分数");
            int score = sc.nextInt();
            if (0 <= score && score <= 100) {
                scores[i] = score;
                i++;                     //防止分数录入错误时不在0~100这个范围内，而把当前这个i直接跳过去才把i++放在这里了
            } else {
                System.out.println("您输入的分数有误，请重新输入");
            }

        }
        return scores;
    }

}
