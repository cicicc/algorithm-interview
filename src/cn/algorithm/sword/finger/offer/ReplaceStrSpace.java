package cn.algorithm.sword.finger.offer;

/**
 * @Description 剑指offer算法题- 替换空格
 * 题目：
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * <p>
 * 解题思路： 在不申请额外空间的情况下，首先将字符串末尾填充2*空格数的空格，然后指定两个指针，指针1指向原字符串末尾，指针2指向填充空格后字符串末尾，
 * 向字符串头移动，如果指针1指向的字符不是空格，那么就将指针2对应的位置修改为指针1对于字符，否则指针2向前依次填充02%
 * @Author: HaiBo Chen
 * @Date: 2020/2/19
 * @Time: 12:01 上午
 */
public class ReplaceStrSpace {

    public static String replaceSpace(StringBuffer str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int strOldLength = str.length();
        // 1. 遍历字符串，每扫描出字符串的一个空格，在字符串的末尾追加两个空格
        for (int i = 0; i < strOldLength; i++) {
            if (str.charAt(i) == ' ') {
                str.append("  ");
            }
        }
        int point1 = strOldLength - 1;
        int point2 = str.length() - 1;
        while (point1 != point2 && point1 >= 0) {
            if (str.charAt(point1) != ' ') {
                str.setCharAt(point2--, str.charAt(point1--));
            } else {
                str.setCharAt(point2--, '0');
                str.setCharAt(point2--, '2');
                str.setCharAt(point2--, '%');
                point1--;
            }
        }

        return str.toString();

    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer(" helloworld")));
    }

}
