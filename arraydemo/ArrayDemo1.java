package arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args){

        //静态初始化
        //完整格式：
        //数据类型[] 数组名 = new 数据类型[]{元素1，元素2，元素3...};
        //简化格式：
        //数据类型[] 数组名 ={元素1，元素2，元素3...};

        //需求1:定义数组存储5个学生的年龄
        int[] array1 = new int[]{11,22,33,44};
        System.out.println(array1);              //[I@1b6d3586
//        int[] array2 ={11,22,33,44};
//
//        //需求2: 定义数组存储3个学生的姓名
//        String[] array3 = new String[]{"张三","李四"};
//        String[] array4 = {"张三","李四"};
//
//        //需求3: 定义数组存储4个学生的身高   1.93
//        double[] array5 = new double[]{1.94,1.93,1.80};
//        double[] array6 = {1.94,1.93,1.80};
//        System.out.println(array6);         //打印  [D@1b6d3586    ----这是地址值

        //扩展：
        //解释一下地址值的格式含义  [D@776ec8df
        //[     ----表示当前是个数组
        //D     ----表示数据类型：当前数组里面的元素都是double类型的            如果是整数的话就是I
        //@     ----表示一个间隔符号，固定格式
        //776ec8df   ----才是数组的真正地址值（十六进制）
        //平时我们习惯性的会把这个整体叫做数组的地址值。
    }
}
