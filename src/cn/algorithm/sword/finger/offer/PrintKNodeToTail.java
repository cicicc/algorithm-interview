package cn.algorithm.sword.finger.offer;

/**
 * @Description 链表中倒数第k个结点
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 解题思路：
 * 使用两个指针，一个指针先向前走k步，然后两个指针再一起向前，当第一个指针到达链表末尾的时候，另一个指针所在节点也就是链表中倒数第k个结点
 * @Author: HaiBo Chen
 * @Date: 2020/3/4
 * @Time: 12:53 上午
 */
public class PrintKNodeToTail {

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode point1 = head;
        ListNode point2 = head;
        int i = 1;
        while (point1.next != null && i < k) {
            point1 = point1.next;
            i++;
        }
        if (i < k) {
            return null;
        }
        while(point1.next !=null){
            point1 = point1.next;
            point2 = point2.next;
        }
        return point2;

    }

}