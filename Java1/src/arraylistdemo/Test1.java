package arraylistdemo;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加元素
        list.add("aaa");
        list.add("ccc");
        list.add("zzz");
        //3.遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + "， ");
            }
        }
        System.out.print("]");
        
    }
}
