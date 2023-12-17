package arraydemo;

public class ArrTest2 {
    public static void main(String[] args){
//        统计个数
//        定义一个数组，存储1,2,3,4,5,6,7,8,9,10
//        遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字


        //分析:
        //1.定义一个数组 存储1,2,3,4,5,6,7,8,9,10
        //2.遍历数组得到每一个元素
        //3.判断当前的元素是否为3的倍数，如果是那么统计变量就需要自增一次。


        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //i 依次表示数组里面的每一个索引
            //arr[i] 依次表示数组里面的每一个元素
            if (arr[i] % 3 == 0){
                System.out.println(arr[i]);
                sum++;
            }
//            else {
//                continue;
//            }
        }
        System.out.println("总共有" + sum + "个");

    }
}
