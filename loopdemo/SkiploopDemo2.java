package loopdemo;

public class SkiploopDemo2 {
    public static void main(String[] args){
        /*案例2: 小老虎吃包子
        小老虎吃包子，吃完第三个就饱了。*/

        for (int i = 1; i < 5; i++) {
            System.out.println("小老虎吃了" + i + "个包子");
            if (i == 3){
            //结束整个循环
                break;
            }
        }
    }
}
