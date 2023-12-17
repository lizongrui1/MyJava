package stringdemo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringJoiner sj = new StringJoiner("，","[","]");

        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");

        int len = sj.length();  //所有字符总个数   [aaa，bbb，ccc]   13个
        System.out.println(len);

        //打印
        System.out.println(sj);    //[aaa，bbb，ccc]

        String string = sj.toString();
        System.out.println(string);   //[aaa，bbb，ccc]
    }
}
