package arraylistdemo;

import arraylistdemo.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        /*添加用户对象并判断是否存在
        需求:
        1.main方法中定义一个集合，存入三个用户对象
        用户属性为:id，username，password
        2.要求:定义一个方法，根据id查找对应的用户信息
        如果存在，返回true
        如果不存在，返回false*/

        //1.创建集合
        ArrayList<User> list = new ArrayList<>();

//        Scanner sc = new Scanner(System.in);

        //2.创建三个用户对象
        User u1 = new User("a1", "zhangsan", "abc");
        User u2 = new User("a2", "lisi", "123");
        User u3 = new User("a3", "wangwu", "abc123");

//        System.out.println("请输入ID");
//        int id = sc.nextInt();
//        System.out.println("请输入姓名");
//        String username = sc.next();
//        System.out.println("请输入密码");
//        String password = sc.next();

//        u.setId(id);
//        u.setUsername(username);
//        u.setPassword(password);

        //3.把用户对象添加到集合当中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4.调用方法查看id是否存在
        boolean flag = contains(list, "a1");

        //5.打印结果
        System.out.println(flag);

    }

    //1.我要干嘛?         根据id查找用户
    //2.我干这件事需要什么才能完成?   list和id
    //3.调用处是否需要使用方法的结果?   返回
    public static boolean contains(ArrayList<User> list, String id) {
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).getId().equals(id);    //以下是拆开写的

//            User u = list.get(i);
//            String idd = u.getId();
//            if(idd.equals(id)){
//                //如果找到了直接返回true
//                return true;
//            }
//        }
//        //当循环结束表示集合里面所有的元素都已经比较完毕，还没有一样的，那么返回false就可以了
//        return false;

        return getIndex(list, id) >= 0;    //此时能返回一个索引，我们再对索引进行判断，如果>= 0表示存在，
                                           // 将判断结果进行一个return，此时返回一个true，如果不存在则返回一个false
    }

    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)) {
                return i;
            }
        }
        return -1;

    }
}
