package arraydemo;

public class ArrTest6 {
    public static void main(String[] args){
        /*需求1: 定义两个变量，交换两个变量记录的值*/

/*        int a = 10;
        int b = 20;
        //定义一个临时的第三方变量
        //把变量a的值，赋值给了temp
        int temp = a;
        //把变量b的值，赋值给了a。那么变量a原来记录的值就被覆盖了
        a = b;
        //就是把变量a原来的值，赋值给了变量b
        b = temp;
        System.out.printIn(a);//20
        System.out.printIn(b);//10      */


        /*需求2:定义一个数组，将数组中0索引和最大索引出的值进行交换*/

/*        //1.定义一个数组
        int[] arr = {1,2,3,4,5};
        //2.将数组中o索引和最大索引出的值进行交换
        //也是可以利用第三方变量进行交换
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/


        /*交换数组中的数据
        需求:定义一个数组，存入1,2,3,4,5。
        按照要求交换索引对应的元素
        交换前: 1,2,3,4,5
        交换后: 5,4,3,2,1*/

        //1.定义数组存储数据
        int[] arr = {1,2,3,4,5};
        //2.利用循环交换数据
        for (int i = 0,j = arr.length - 1;i < j; i++,j--){
            //交换变量i和变量j指向的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //当循环结束之后，那么数组中的数据就实现了头尾交换

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
