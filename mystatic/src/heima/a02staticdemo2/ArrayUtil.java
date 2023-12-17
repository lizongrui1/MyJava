package heima.a02staticdemo2;

public class ArrayUtil {
    /*请按照如下要求编写一个数组的工具类:ArrayUtil
    提供一个工具类方法printArr，用于返回整数数组的内容。
    返回的字符串格式如:[10,20,50,34,100](只考虑整数数组，且只考虑一维数组)
    提供这样一个工具方法getAverage，用于返回平均分。(只考虑浮点型数组，且只考虑一维数组)
    定义一个测试类TestDemo，调用该工具类的工具方法，并返回结果*/

    //私有化构造方法
    //目的:为了不让外界创建他的对象
    private ArrayUtil() {
    }


    //需要定义为静态的，方便调用
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            //i 索引   arr[i]元素
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }
}

