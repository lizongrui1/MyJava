package stringdemo;

public class StringBuilderDemo2_1 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder();
        //链式编程
        sb.append("aaa").append("bbb").append("ccc").append("ddd");
        System.out.println(sb);
    }
}
