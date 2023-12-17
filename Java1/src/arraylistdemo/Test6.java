package arraylistdemo;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        /*需求:
        1，main方法中定义一个集合，存入三个用户对象。
        用户属性为: id，username，password
        2,要求:定义一个方法，根据id查找对应的用户信息
        如果存在，返回索引
        如果不存在，返回-1*/

        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("a1","zhangsan","abc");
        User u2 = new User("a2","lisi","123");
        User u3 = new User("a3","wangwu","abc123");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        int index = getIndex(list, "a1");

        System.out.println(index);
    }
    public static int getIndex(ArrayList<User> list, String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)){
                return i;
            }
        }
        return -1;

    }
}
