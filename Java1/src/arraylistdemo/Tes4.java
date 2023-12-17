package arraylistdemo;

import arraylistdemo.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class Tes4 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();
        //长度为0


        //2.键盘录入学生的信息并添加到集合当中
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Student s = new Student();       //重点：每次创建新的学生对象

            System.out.println("请输入学生的姓名：");
            String name = sc.next();
            System.out.println("请输入学生的年龄：");
            int age = sc.nextInt();

            //把name和age赋值给学生对象
            s.setName(name);
            s.setAge(age);

            //把学生对象添加到集合当中
            list.add(s);

        }
        System.out.println(list.size());   //3

        //3.遍历
        for (int i = 0; i < list.size(); i++) {
            //i 索引 list.get(i) 元素/学生对象
            Student stu = list.get(i);
            System.out.println(stu.getName() + "，" + stu.getAge());
        }
    }
}
