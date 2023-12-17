package objectoriented.Test1;

public class GirlFriend_1 {
    //属性
    private int age;   //0

    public void method(){
        int age = 10;
        System.out.println(age);    //10  就近原则
        System.out.println(this.age);   //0
    }
}
