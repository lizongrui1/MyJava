package loopdemo;

import java.util.Random;

public class LoopTest6 {
    public static void main(String[] args){
        //需求：
        //随机数范围: 1~100

        Random r = new Random();

            /*int number = r.nextInt(100);              //1~100
            System.out.println(number);*/


            //秘诀
            //用来生成任意数到任意数之间的随机数 比如7 ~15
            //1.让这个范围头尾都减去一个值，让这个范围从0开始          比如说7~15这个范围    -7后    范围就是0~8
            //2.尾巴+1                                                  8 + 1 = 9
            //3.最终的结果，再加上第一步减去的值。

        /*int number = r.nextInt(9) + 7 ;                    // 7~15
        System.out.println(number);*/

        int number = r.nextInt(100) + 1 ;
                                //   0~99  + 1
        System.out.println(number);

    }
}
