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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode middile = findMiddile(head);
        ListNode leftHead = head;
        ListNode rightHead = middile.next;
        middile.next = null;
        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);
        return mergeTwoSortedList(leftHead, rightHead);

    }
    ListNode findMiddile(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    ListNode mergeTwoSortedList(ListNode l1, ListNode l2 ){
        ListNode prehead = new ListNode(0);
        ListNode merge = prehead;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                merge.next = l1;
                l1 = l1.next;
            }else{
                 merge.next = l2;
                l2 = l2.next;
            }
            merge = merge.next;
        }
        if(l1 == null){
            merge.next = l2;
        }else{
             merge.next = l1;
        }
        return prehead.next;
    }
}