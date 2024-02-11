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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode last = head;
        int len = 1;
        while(last.next != null){
            last = last.next;
            len++;
        }
        last.next = head;
      
        int skip = len - (k % len);
        ListNode newHead = head;
        for(int i = 0; i < skip - 1; i++){
            newHead = newHead.next;
        }
        head = newHead.next;
        newHead.next = null;
        return head;

    }
}