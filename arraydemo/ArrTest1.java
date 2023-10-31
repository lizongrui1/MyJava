package arraydemo;

public class ArrTest1 {
    public static void main(String[] args){
//        遍历数组并求和
//        定义一个数组，存储1,2,3,4,5
//        遍历数组得到每一个元素，求数组里面所有的数据和


        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //i 依次表示数组里面的每一个索引
            //arr[i] 依次表示数组里面的每一个元素

            sum = sum + arr[i];

        }
        System.out.println(sum);

    }
}
