package orderdemo;

public class VariableDemo2 {
    //main方法，表示程序的主入口
    public static void main(String[] args){

    int a = 10;
    System.out.println(a);//a = 10
    System.out.println(a);//a = 10
    System.out.println(a);//a = 10

    int c = 11;
    int b = 89;
    System.out.println(c + b);

    a = 50;
    System.out.println(a);//a = 50

    System.out.println("------------");
    int d = 100, e = 200, f = 300;
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);

    //变量在使用之前必须赋值
    int g;
    g = 15;
    //建议：以后在定义变量时直接赋值，不要把赋值分开写
    System.out.println(g);

    }
}
