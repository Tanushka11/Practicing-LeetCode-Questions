/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode p = fast;
        while(slow != null && fast != null){
            slow.next = fast.next;
            fast.next = null;
            if(slow.next != null) slow = slow.next;
            if(fast != null) fast.next = slow.next;
            if(fast != null) fast = fast.next;
        }
        slow.next = p;
        return head;
    }
}