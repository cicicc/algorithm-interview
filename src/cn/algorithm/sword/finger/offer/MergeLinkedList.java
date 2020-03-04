package cn.algorithm.sword.finger.offer;

/**
 * @Description 合并链表
 * 题目：
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 思路：
 * 递归
 * @Author: HaiBo Chen
 * @Date: 2020/3/4
 * @Time: 11:35 上午
 */
public class MergeLinkedList {

    public ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = merge(list1.next, list2);
            return list1;
        } else {
            list2.next = merge(list1, list2.next);
            return list2;
        }
    }


}
