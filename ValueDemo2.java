public class ValueDemo2 {
    //main方法，表示程序的主入口
    public static void main(String[] args){
        //目标:熟悉制表符的基本用法

        System.out.println("name" + "age");
        System.out.println("tom" + "18");

        //更改后
        System.out.println("name" + '\t' + "age");
        System.out.println("lzzzzzz" + '\t' + "18");
    }
}
