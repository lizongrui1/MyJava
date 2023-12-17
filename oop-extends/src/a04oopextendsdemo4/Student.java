package a04oopextendsdemo4;

public class Student {
    String name;
    int age;
    String school;

    //需求：默认为天津工业大学


    public Student() {
        //表示调用本类其他构造方法
        //细节: 虚拟机就不会再添加super();
        this(null,0,"天津工业大学");

    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
