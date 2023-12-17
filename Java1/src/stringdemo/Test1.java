package stringdemo;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //容量：最多装多少
        //长度：已经装了多少
        System.out.println(sb.capacity());  //16
        System.out.println(sb.length());   //0

//        System.out.println("===========");
//        sb.append("abc");
//
//        System.out.println(sb.capacity());  //16
//        System.out.println(sb.length());   //3
//
//        System.out.println("===========");
//        sb.append("qhjwioehqwiehiqwheiqwhe");
//        System.out.println(sb.capacity());  //34
//        System.out.println(sb.length());   //26

        System.out.println("===========");
        sb.append("qhjwioehe123121233iqe23123124");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

    }
}
