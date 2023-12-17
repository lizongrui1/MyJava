package loopdemo;

public class ForTest1 {
    public static void main(String[] args) {
        /*
        需求1：打印1-5
        需求2：打印5-1
         */
        System.out.print("需求1：");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // 添加一个新行，使需求2输出在新的一行

        System.out.print("需求2：");
        for (int j = 5; j >= 1; j--) {
            System.out.print(j + " ");
        }
    }
}
