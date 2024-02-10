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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head; 
        ListNode prev = null;
        ListNode pres = head;
        ListNode nxt = head.next;
        while(pres != null){
             pres.next = prev;
             prev = pres;
             pres = nxt;
             if(nxt != null) nxt = nxt.next;
        }
        return prev;
    }
}