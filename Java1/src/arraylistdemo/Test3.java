package arraylistdemo;

import arraylistdemo.Student;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        /*添加学生对象并遍历
        需求:定义一个集合，添加一些学生对象，并进行遍历
        学生类的属性为:姓名，年龄。*/

        //1.创建集合
        ArrayList<Student> list = new ArrayList();

        //2.创建学生对象
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",19);

        //3.添加元素
        list.add(s1);
        list.add(s2);
        
        //4.遍历集合
        for (int i = 0; i < list.size(); i++) {
            //i 索引 list.get(i) 元素/学生对象
            Student student = list.get(i);
            System.out.println(student.getName() + "，" + student.getAge());    //Student这个类是我们自己写的，所以直接打印对象student的时候都是地址值，因此需要把属性get出来
        }
    }
}
