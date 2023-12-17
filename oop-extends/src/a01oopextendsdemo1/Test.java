package a01oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法

        //1.创建布偶猫的对象
        Ragdoll r = new Ragdoll();
        r.eat();
        r.drink();
        r.catchMouse();

        System.out.println("==================");
        //2.创建哈士奇的对象
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.breakHome();
        h.lookHome();

    }
}
