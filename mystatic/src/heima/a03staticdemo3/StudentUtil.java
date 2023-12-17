package heima.a03staticdemo3;

import heima.a02staticdemo2.ArrayUtil;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    //静态方法
    public static int getMaxAgeStudent(ArrayList<Student> list){
        //1.定义一个参照物
        int max = list.get(0).getAge();

        //2.循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            //i 索引         list.get(i)元素即为学生对象 我们还需要getAge获取到年龄之后再进行比较
            int tempAge = list.get(i).getAge();    //避免方法的反复调用，提高代码的运行效率
            if(tempAge > max){
                max = tempAge;
            }
        }
        //3.直接返回max
        return max;
    }
}
