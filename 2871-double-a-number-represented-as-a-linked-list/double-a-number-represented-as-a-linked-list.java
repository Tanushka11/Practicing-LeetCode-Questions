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
    public ListNode doubleIt(ListNode head) {
        ListNode newHead = reverse(head);
        ListNode node = newHead;
        ListNode prehead = new ListNode(-1);
        ListNode pres = prehead;
        int carry = 0;
        while(node != null){
            int prod = node.val * 2 + carry;
            carry = prod/10;
            prod = prod % 10;
            ListNode newNode = new ListNode(prod);
            node = node.next;
            pres.next = newNode;
            pres = newNode;
        }
        if(carry >= 1){
            ListNode newNode = new ListNode(carry);
            pres.next = newNode;
            pres = newNode;
        }
        return reverse(prehead.next);
    }
    ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null) next = next.next;
        }
        return prev;
    }
}