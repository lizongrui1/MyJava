package arraylistdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素
//        boolean result = list.add("aaa");
//        System.out.println(result);   //true
//
//        System.out.println(list);   //[aaa]

        list.add("aaa");
        list.add("bbb");
        list.add("vvv");
        list.add("rrr");
//        System.out.println(list);  //[aaa, bbb, vvv, rrr]


        //3.删除元素
//        boolean result1 = list.remove("aaa");
//        System.out.println(result1);    //true
//        boolean result2 = list.remove("ddd");
//        System.out.println(result2);     //false
//        System.out.println(list);     //[bbb, vvv, rrr]

//        String str = list.remove(0);
//        System.out.println(str);   //aaa 
//        System.out.println(list);   //[bbb, vvv, rrr]

        //4.修改元素
//        String result = list.set(1, "ddd");
//        System.out.println(result);   //bbb
//        System.out.println(list);    //[aaa, ddd, vvv, rrr]

        //5.查询元素
//        String s = list.get(0);
//        System.out.println(s);    //aaa
//        System.out.println(list);    //[aaa, bbb, vvv, rrr]

        //遍历
        for (int i = 0; i < list.size(); i++) {
            //i 索引            list.get(i)  元素
            String str = list.get(i);
            System.out.println(str);
        }


    }
}
