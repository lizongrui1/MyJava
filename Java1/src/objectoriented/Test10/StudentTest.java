package objectoriented.Test10;

public class StudentTest {
        /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性:学号，姓名，年龄。
        要求1: 再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2:添加完毕之后，遍历所有学生信息。
        要求3:通过id删除学生信息
            如果存在，则删除，如果不存在，则提示删除失败
        要求4: 删除完毕之后，遍历所有学生信息。
        要求5:查询数组id为“224”的学生，如果存在，则将他的年龄+1岁*/

    public static void main(String[] args) {

        //1.创建一个数组用来存储学生对象
        Student[] arr = new Student[3];

        //2.创建学生对象并添加到数组当中
        Student stu1 = new Student(223, "xiaoming", 23);
        Student stu2 = new Student(224, "xiaoli", 24);
        Student stu3 = new Student(226, "xiaowang", 21);

        //3.把学生对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要求1: 再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        Student stu4 = new Student(227, "xiaohong", 22);

        //唯一性判断（用方法去做）
        //已存在 --- 不用添加
        //不存在 --- 就可以把学生对象添加进数组
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //已存在 --- 不用添加
            System.out.println("当前id重复，请修改id后再进行添加");
        } else {
            //不存在 --- 就可以把学生对象添加进数组
            //把stu4添加到数组当中
            //1.数组已经存满 --- 只能创建一个新的数组，新数组的长度 = 老数组 + 1
            //2.数组没有存满直接添加
            int count = getCount(arr);
            if (count == arr.length) {
                //老数组已经存满
                //创建一个新的数组，长度 = 老数组的长度 + 1
                //然后把老数组的元素，拷贝到新数组当中
                Student[] newArr = creatNewArr(arr);
                //[stu1, stu2, stu3] --->  [stu1, stu2, stu3 ,null]
                //把stu4添加进去
                newArr[count] = stu4;
                //要求2:添加完毕之后，遍历所有学生信息。
                printArr(newArr);
            } else {
                //老数组没有存满
                //[stu1,stu2,null]
                //getcount获取到的是2，表示数组当中已经有了2个元素
                //还有一层意思: 如果下一次要添加数据，就是添加到2索引的位置
                arr[count] = stu4;
                //要求2:添加完毕之后，遍历所有学生信息。
                printArr(arr);
            }
        }
        System.out.println("====================");
        /*要求3: 通过id删除学生信息
        如果存在，则删除，如果不存在，则提示删除失败。*/

        //找到id在数组中对应的索引（方法）
        int index = getIndex(arr, 223);
//        System.out.println(index);
        if (index >= 0) {
            //如果存在，则删除
            //[stu1,stu2,stu3] ---> [stu1,null,stu3]
            arr[index] = null;
            //遍历数组
            printArr(arr);
        } else {
            //如果不存在，则提示删除失败
            System.out.println("当前id不存在，删除失败");
        }
        System.out.println("====================");
        //要求5:查询数组id为“224”的学生，如果存在，则将他的年龄+1岁
        //4.先要找到id为224的学生对于的索引
        int index1 = getIndex(arr, 224);
        //5.判断索引
        if(index1 >= 0){
            //存在，则将他的年龄+1岁
            Student stu = arr[index1];
            //把原来的年龄拿出来
            int newAge = stu.getAge() + 1;
            //把+1之后的年龄放回去
            stu.setAge(newAge);
            //遍历数组
            printArr(arr);
        }else {
            //不存在，则直接提示
            System.out.println("当前id不存在，修改失败");
        }

    }




    //找到id在数组中对应的索引

    //1.我要干嘛?找到id在数组中的索引
    //2.我需要什么? 数组 id
    //3.调用处是否需要继续使用方法的结果?  要
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //依次得到每一个学生对象
            Student stu = arr[i];
            //对stu进行一个非空判断
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return i;
                }

            }
        }
        //当循环结束之后，还没有找到就表示不存在
        return -1;
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            //对每一个元素做一个非空判断（因为数组里面还有可能有null）
            if (stu != null) {
                System.out.println(stu.getId() + "，" + stu.getName() + "，" + stu.getAge());
            }
        }
    }


    //创建一个新的数组，长度 = 老数组的长度 + 1
    //然后把老数组的元素，拷贝到新数组当中
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        //循环遍历得到老数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //把老数组中的元素添加到新数组当中
            newArr[i] = arr[i];
        }
        //把新数组返回
        return newArr;
    }

    //定义一个方法判断数组中已经存了几个元素
    public static int getCount(Student[] arr) {
        int count = 0;
        //判断数组中有几个地方不是null
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //1.我要干嘛?
    //2.我干这件事情，需要什么才能完成?   数组  id
    //3.调用处是否需要继续使用方法的结果?    必须返回（只有两种情况，所以用boolean类型）
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //依次获取到数组里面的每一个学生对象
            Student stu = arr[i];
            if (stu != null) {
                //获取数组中学生对象的id
                int sid = stu.getId();
                //比较
                if (sid == id) {
                    return true;
                }
            }
        }
        //当循环结束之后，还没有找到一样的，那么就表示数组中要查找的id是不存在的。
        return false;
    }
}
