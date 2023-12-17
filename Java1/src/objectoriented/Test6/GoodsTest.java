package objectoriented.Test6;

public class GoodsTest {
    public static void main(String[] args) {

        //1，创建一个数组
        Goods[] arr = new Goods[3];

        //2.创建三个商品对象
        Goods g1 = new Goods("001","小米",1999.0,100);
        Goods g2 = new Goods("002","OPPO",2999.0,50);
        Goods g3 = new Goods("003","VIVO",3999.0,70);

        //3.把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //遍历
        for (int i = 0; i < arr.length; i++) {
            //i：索引  arr[i]：元素
            Goods goods = arr[i];  //用arr[i]获取数组里面的每一个元素
            System.out.println(goods.getId() + "，" + goods.getName() + "，" + goods.getPrice() + "，" + goods.getCount());
        }
    }
}
