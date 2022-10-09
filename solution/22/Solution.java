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
        ListNode node = head, cur = head;
        while (node != null) {
            cur = node;
            int i = 0;
            for (i = 0; i < k; i++) {
                if (cur != null) {
                    cur = cur.next;
                }
            }
            if (i == k && cur == null) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
}
