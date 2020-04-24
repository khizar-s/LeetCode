/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode duplicate = new ListNode(0);
        ListNode head = duplicate;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                duplicate.next = l1;
                l1 = l1.next;
            } else {
                duplicate.next = l2;
                l2 = l2.next;
            }
            duplicate = duplicate.next;
        }
        
        if (l1 != null) {
            duplicate.next = l1;
        } else {
            duplicate.next = l2;
        }
        
        return head.next;
    }
}