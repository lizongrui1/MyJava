package objectoriented.Test9;


        /*
        定义数组存储4个女朋友的对象
        女朋友的属性:姓名、年龄、性别、爱好
        要求1:计算出四女朋友的平均年龄
        要求2:统计年龄比平均值低的女朋友有几个?并把她们的所有信息打印出来
        */

public class girlFriendTest {
    public static void main(String[] args) {
        girlFriend[] arr = new girlFriend[4];
        girlFriend g1 = new girlFriend("王", 19, "女", "羽毛球");
        girlFriend g2 = new girlFriend("卢", 20, "女", "蓝球");
        girlFriend g3 = new girlFriend("张", 24, "女", "乒乓球");
        girlFriend g4 = new girlFriend("李", 18, "女", "羽毛球");

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //i 索引 arr[i] 元素(女朋友对象)
            girlFriend gf = arr[i];
            sum = sum + gf.getAge();
        }
        int avg = sum / arr.length;
        System.out.println("平均年龄为：" + avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            girlFriend gf = arr[i];
            if (gf.getAge() < avg) {
                count++;
                System.out.println("小于平均年龄的有：" + gf.getName());
            }
        }
        System.out.println("小于平均年龄的有" + count + "个");
    }
}
