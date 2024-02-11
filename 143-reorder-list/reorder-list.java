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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode middile = findMiddile(head);
        ListNode newHead = reverseLL(middile);
        ListNode headF= head;
        while(headF != null && newHead != null){
           ListNode temp = headF.next;
           headF.next = newHead;
           headF = temp;
           temp = newHead.next;
           newHead.next = headF;
           newHead = temp;
        }
        if(headF != null){
            headF.next = null;
        }
    }
    ListNode reverseLL(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;
        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null) next = next.next;
        }
        return prev;
    }
    ListNode findMiddile(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}