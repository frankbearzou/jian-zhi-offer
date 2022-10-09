/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode front = head, node = head;
        for (int i = 0; i < k; i++) {
            front = front.next;
        }
        while (front != null) {
            front = front.next;
            node = node.next;
        }
        return node;
    }
}
