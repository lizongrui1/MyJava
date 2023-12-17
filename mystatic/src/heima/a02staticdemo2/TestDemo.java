package heima.a02staticdemo2;

import javax.crypto.spec.PSource;

public class TestDemo {
    public static void main(String[] args) {
        //测试工具类中的两个方法是否正确
        int[] arr1 = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.2, 1.6, 2.6, 7.8};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);

    }
}
