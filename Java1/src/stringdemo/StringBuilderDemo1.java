package stringdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder("你好");

        //2.添加元素
//        sb.append(1);
//        sb.append(2.3);
//        sb.append(true);     //你好12.3true

        //反转
//        sb.reverse();          //好你

        //获取长度
        int len = sb.length();
        System.out.println(len);    //2


        //打印
        //普及：
        //因为stringBuilder是Java已经写好的类
        //java在底层对他做了一些特殊处理
        //打印对象不是地址值而是属性值
        System.out.println(sb);
    }
}
