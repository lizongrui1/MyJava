package methoddemo;

public class Test6 {
    public static void main(String[] args) {
        /*需求:设计一个方法求数组的最大值，并将最大值返回*/

        int[] arr = {11,22,33,44,55};
        int max = getMax(arr);
        System.out.println(max);
    }

    //1.我要干嘛?               求最大值
    //2.我干这件事情，需要什么才能完成?        数组
    //3.是否返回?       返回
    public static int getMax(int[] arr){
        int temp = arr[0];                  //这里千万不能写0，因为不知道数组里面是不是都是负数
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > temp){
                temp  = arr[i];
            }
        }
        return temp;                        //有返回值的一定千万不要忘了写return！！！！！
    }
}
