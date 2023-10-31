package loopdemo;

public class WhileTest1 {
    public static void main(String[] args) {
        /*
        需求:世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，
        假如我有一张足够大的纸，它的厚度是0.1毫米
        请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
         */

        //分析: 折叠纸张:每一次折叠纸张的厚度都是原先的两倍
        // double a = 0.1;
        // a = a*2;
        // 或者 a *= 2;

        //1.定义一个变量记录山峰的高度
        //2.定义一个变量记录纸张的初始厚度
        //  定义一个变量统计循环次数
        //3.循环折叠纸张，只要纸张的厚度小于山峰的高度，那么循环继续
        //每折叠一次，统计次数就要++

//        double i = 0.1;
//        int count = 0;
//        while (i >= 8844430){
//            i = i+i;
//            count ++;
//        }

        double height = 8844430;
        double paper = 0.1;
        int count = 0;
        while (paper <= height) {
            paper = paper * 2;
            count++;

        }
//      选择while的理由是因为此时我们不知道循环的次数和循环的范围，只知道循环的结束条件
        System.out.println(count);
    }
}
