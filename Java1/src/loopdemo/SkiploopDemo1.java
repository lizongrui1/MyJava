package loopdemo;

public class SkiploopDemo1 {
    public static void main(String[] args){

        /*案例1: 小老虎吃包子
        小老虎吃包子，第三个包子有虫子，跳过。*/

        for (int i = 0; i < 5; i++) {
            if (i == 3){
                //结束本次循环，继续下次循坏。
                continue;
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
    }
}
