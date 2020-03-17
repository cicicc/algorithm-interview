package cn.algorithm.leetcode;

/**
 * @Description 验证回文串
 * 题目:
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 * 解题思路：
 * 对原字符串修改，转为小写并去除所有的非字母和数字的字符
 * 使用两个指针，分别指向字符串的起始位置和结束位置，比较指针指向位置是否相等，如果不等则返回false,全都相等则返回true
 * 时间/空间复杂度
 * 时间复杂度：o(n),空间复杂度o(n)
 * @Author: HaiBo Chen
 * @Date: 2020/3/17
 * @Time: 6:07 下午
 */
public class PalindromeStr {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if ("".equals(s)) {
            return true;
        }
        String str = "";
        for (char c : s.toLowerCase().toCharArray()) {
            if ('a' <= c && 'z' >= c || '0' <= c && '9' >= c) {
                str += c;
            }
        }
        int point1 = 0;
        int point2 = str.length() - 1;
        boolean isPalindromeStr = true;
        while (point1 < point2 && isPalindromeStr) {
            if (str.charAt(point1) == str.charAt(point2)) {
                point1++;
                point2--;
            } else {
                isPalindromeStr = false;
            }

        }


        return isPalindromeStr;
    }

    public static void main(String[] args) {
        PalindromeStr palindromeStr = new PalindromeStr();
        System.out.println(palindromeStr.isPalindrome("A man, a plan, a canal: Panama"));
    }

}
