package studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("============欢迎来到学生管理系统==============");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    delateStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("退出");
//                    break ;
                    break loop;
                //停止虚拟机运行
//                System.exit(0);
//                    break ;
                default:
                    System.out.println("没有这个选项");
            }

        }


    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        System.out.println("添加学生");

        //利用空参构造先创建学生对象（下面注释这些都是）
        Student s = new Student();


        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入id");
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                //表示id已经存在，需要重新录入
                System.out.println("id已经存在，请重新录入");
            } else {
                //表示id不存在，表示可以使用
                s.setId(id);
                break;
            }
        }

//        s.setId(id);

        System.out.println("请输入名字");
        String name = sc.next();
//        s.setName(name);

        System.out.println("请输入年龄");
        int age = sc.nextInt();
//        s.setAge(age);

        System.out.println("请输入家庭地址");
        String add = sc.next();
//        s.setAddress(add);

        //创建学生对象
//        Student s = new Student(id, name, age, add);

        //把学生对象添加到集合当中
        list.add(s);

        //提示一下用户
        System.out.println("学生信息添加成功");


    }

    //删除学生
    public static void delateStudent(ArrayList<Student> list) {
        System.out.println("删除学生");

    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("修改学生");
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("查询学生");
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            //结束方法
            return;
        }
        //打印表头信息
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        //当代码执行到这里，表示集合中是有数据的
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    //判断id在集合中是否存在
    public static boolean contains(ArrayList<Student> list, String id) {
        //循环遍历集合得到里面的每一个学生对象
        for (int i = 0; i < list.size(); i++) {
            //拿到学生对象后，获取id并进行判断
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                //存在true
                return true;
            }
        }
        //不存在false
        return false;

    }
}
