package objectoriented.Test2;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //创建空参对象
//        Student s = new Student();

        Student s = new Student("lisi",18);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
