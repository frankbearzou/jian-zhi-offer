/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null, cur = head, front = head.next;
        while (cur != null) {
            cur.next = pre;
            pre = cur;
            cur = front;
            if (front != null) {
                front = front.next;
            } else {
                break;
            }
            
        }
        return pre;
    }
}
