package methoddemo;

public class Test3 {
    public static void main(String[] args) {
        //目标:要能区分出什么时候使用带返回值的方法
        //需求:定义方法，比较两个长方形的面积

        //调用方法获取长方形的面积
        double are1 = getArea(5.3,1.7);
        double are2 = getArea(2.4,2.7);
        if (are1 > are2){
            System.out.println("are1 > are2");
        }else {
            System.out.println("are1 < are2");
        }
    }
        //在以后实际开发当中，我们一般是把重复的代码或者具有独立功能的代码抽取到方法当中。
        // 以后我们直接调用就可以了

        //定义一个方法求长方形的面积
        //1.我要干嘛?求长方形的面积（方法体）
        //2.需要什么?长 和 宽（形参）
        //3.方法的调用处，是否需要继续使用方法的结果（返回值）
        //如果要用，那么方法必须有返回值
        //如果不要用，方法可以写返回值，也可以不写返回值。（本题必须要有返回值，因为得到两个长方形的面积后要进行比较）
    public static double getArea(double len,double width){
        double area = len * width;
        return area;
    }
}
