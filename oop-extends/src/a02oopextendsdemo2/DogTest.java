package a02oopextendsdemo2;

public class DogTest {
    public static void main(String[] args) {
        //创建对象并调用方法
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.breakHome();
        h.lookHome();

        System.out.println("================");

        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookHome();
    }
}
