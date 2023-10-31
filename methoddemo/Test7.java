package methoddemo;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处*/

        int[] arr = {1, 3, 4, 6, 7, 9};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字来进行判断：");
        int input = sc.nextInt();

        boolean a = contains(arr, input);
        System.out.println(a);
    }

    //1.我要干嘛?                           判断数字在数组中是否存在
    //2.我干这件事情，需要什么才能完成?         数组、数字
    //3.调用处是否需要继续使用结果?            返回 true false
    public static boolean contains(int[] arr, int input) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                return true;              //return关键字代表找到一个方法，结束，并把这个true返回给调用者，后面的代码就不会执行了
//                break;                  //如果这里是break，方法没结束，而是把for循环结束了，然后跳到for循环的下面继续读取代码
            }
        }
        //什么时候才能断定9，在数字中是不存在的?
        //当数组里面所有的数据全部比较完毕之后，才能断定
        return false;
    }
}

//return 、 break关键字的区别：
//return:其实跟循环没有什么关系，跟方法有关的，表示1结束方法 2返回结果
//       如果方法执行到了return，那么整个方法全部结束，里面的循环也会随之结束了。

//break关键字
//其实跟方法没有什么关系，结束循环或者结束switch的。