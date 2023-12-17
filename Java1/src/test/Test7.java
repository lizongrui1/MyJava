package test;

public class Test7 {
    public static void main(String[] args) {
        //需求:
        //把整数上的每一位都添加到数组当中
        //反向推导

        //1.计算出数组的长度
        int number = 12345;
        int temp = number;
        //定义一个变量进行统计
        int count = 0;
        while (number != 0) {
            //每一次循环就去掉右边的一个数字
            number = number / 10;
            count++;
//            System.out.println(number);
        }
//        System.out.println(count);
        //2.定义数组
        //动态初始化

        int[] arr = new int[count];

        //3.把整数上的每一位都添加到数组当中
        //定义一个变量临时记录number的值，就是为了第三步的时候再次使用

        for (int i = 0; i < arr.length; i++) {
            arr[arr.length - 1 - i] = temp % 10;       //如果这里用number的话，之前number都已经变为0了
            temp = temp / 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
