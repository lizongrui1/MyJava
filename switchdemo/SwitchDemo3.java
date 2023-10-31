package switchdemo;

/*
    case穿透   （break千万不能省略）
    case穿透执行流程：
    首先还是会拿着小括号中表达式的值跟下面每一个case进行匹配。
    如果匹配上了，就会执行对应的语句体，如果此时发现了break，那么结束整个switch语句。
    如果没有发现break，那么程序会继续执行下一个case的语句体，
    一直遇到break或者右大括号为止。

    使用场景：
    如果多个case的语句体重复了，那么我们考虑利用case穿透去简化代码。
 */
public class SwitchDemo3 {
    public static void main(String[] args){
        int number = 20;
        switch (number){
            case 1:
                System.out.println("number的值是1");
                break;
            case 20:
                System.out.println("number的值是20");
                //break;         识别到20并且没有break然后继续向下穿透
            case 10:
                System.out.println("number的值是10");
                break;
            default:
                System.out.println("number的值不是1，10或者20");
                //break;
        }
    }
}