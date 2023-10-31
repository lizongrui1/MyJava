package methoddemo;

public class Test2 {
    public static void main(String[] args) {
        //需求:定义一个方法，求圆的面积，将结果在方法中进行打印。
        //目标: 根据不同的需求，选择定义无参的方法，还是带参数的方法。
        getArea(1.5);

    }
    public static void getArea(double r){
        double s = r * r * 3.14;
        System.out.println(s);
    }
}
