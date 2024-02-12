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
    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null) return head;
        head = reverse(head);
        
        ListNode prev = head;
        ListNode newHead = head.next;
        int max = head.val;
        while(newHead != null){
            
            if(newHead.val >= max ){
                max = Math.max(newHead.val,max);
                prev = newHead;
                newHead = newHead.next;
            }else{
                prev.next = newHead.next;
                newHead = newHead.next;
            }
        }
        ListNode node = reverse(head);
        return node;
    }
    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;
        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null) next = next.next;
        }
        return prev;
    }
}