package cn.algorithm.sword.finger.offer;

/**
 * @Description 反转链表
 * 题目：
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 解题思路：
 * 使用递归，先反转后面的链表，从最后面的两个结点开始反转，依次向前，将后一个链表结点指向前一个结点，
 * 注意每次反转后要将原链表中前一个结点的指针域置空，表示将原链表中前一个结点指向后一个结点的指向关系断开。
 * 复杂度分析
 * 时间复杂度：O(n)，假设 nn 是列表的长度，那么时间复杂度为 O(n)O(n)。
 * 空间复杂度：O(n)，由于使用递归，将会使用隐式栈空间。递归深度可能会达到 nn 层。
 * @Author: HaiBo Chen
 * @Date: 2020/3/4
 * @Time: 11:11 上午
 */
public class ReverseList {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode listNode = reverseList(head.next);
         head.next.next = head;
        head.next = null;

        return listNode;
    }
}
