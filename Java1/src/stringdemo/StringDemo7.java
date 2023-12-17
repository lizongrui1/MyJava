package stringdemo;

public class StringDemo7 {
    public static void main(String[] args) {
        /*定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回
        调用该方法，并在控制台输出结果
        例如:
        数组为int[] arr ={1,2,3};
        执行方法后的输出结果为:[1,2,3]*/

        //1.我要干嘛?     ---  遍历数组并把数组拼接成一个字符串
        //2.我干这件事情需要什么才能完成?    ---  数组
        //3.我干完了是否要把结果返回给调用处   ---  返回一个拼接之后的字符串
        //如果调用处需要继续使用，那么必须返回
        //如果调用处不需要继续使用，那么可以返回也可以不返回

        int[] arr = {1, 2, 3};
        String newStr = arrToString(arr);
        System.out.println(newStr);


    }

    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            //i 索引   arr[i] 元素
            if (i == arr.length - 1) {
                result = result + arr[i];
            } else {
                result = result + arr[i] + "， ";
            }
//            System.out.println(num);
        }
        result = result + "]";
        return result;
    }
}
