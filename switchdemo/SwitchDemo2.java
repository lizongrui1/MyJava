package switchdemo;
//default的位置和省略
//1.位置（default不一定写在最下面，可以写在任意位置，只不过会习惯写在最下面）
//2.省略（default可以省略，语法不会有问题，但是不建议省略）
//

public class SwitchDemo2 {
    public static void main(String[] args){
        int number = 1;
        switch (number){
            default:
                System.out.println("number的值不是1，10或者20");
                break;
            case 1:
                System.out.println("number的值是1");
                break;
            case 20:
                System.out.println("number的值是20");
                break;
            case 10:
                System.out.println("number的值是10");
                break;
        }
    }
}
