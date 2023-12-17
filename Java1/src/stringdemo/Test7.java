package stringdemo;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*
         * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中最后一个单词的长度。
         * 单词是指仅由字母组成、不包含任何空格字符的最大子字符串
         * 示例 1: 输入: s ="Hello World" 输出:5 解释: 最后一个单词是“World”，长度为5。
         * 示例 2: 输入: s ="输出:fly me the moon" 输出:4 解释: 最后一个单词是“moon”，长度为4。
         * 示例 3: 输入: s ="luffy is still joyboy" 输出:6 解释: 最后一个单词是长度为6的“joyboy”。
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("输入：");
        String s = sc.nextLine();

        int length = 0;
        // 倒着遍历字符串，直到遇到空格或到达字符串开头
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != ' ') {
                // 如果不是空格，单词长度加一
                length++;
            } else if (length > 0) {
                // 如果是空格且长度大于0，说明找到了单词的末尾，结束循环
                break;
            }
        }
        System.out.println("最后一个单词的长度为:" + length);
    }
}
