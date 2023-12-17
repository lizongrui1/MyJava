package stringdemo;

public class StringDemo12 {
    public static void main(String[] args) {
        //1.获取到说的话
        String talk = "真菜啊，TMD，sb";

        //定义一个敏感词库
        String[] arr = {"TMD", "CNM", "SB", "MLGB"};

        //循环得到数组中的每一个敏感词，依次进行替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replaceAll("(?i)" + arr[i], "***");   //(?i)用来表示不区分大小写
        }

        //2.把里面的敏感词TMD替换为***
//        String result = talk.replace("TMD","***");

        System.out.println(talk);
    }
}
