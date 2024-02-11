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
     ListNode th = null;
     ListNode tt = null;
    public ListNode reverseList(ListNode head) {
        // if(head == null || head.next == null) return head;
        // ListNode prev = null;
        // ListNode pres = head;
        // ListNode next = head.next;
        // while(pres != null){
        //     pres.next = prev;
        //     prev = pres;
        //     pres = next;
        //     if(next != null) next = next.next;
        // }
        // return prev;

        // addfirst method
        // one more method where we take four node trmphead,temptail and curr,forw

        ListNode curr = head;
        while(curr != null){
            ListNode forward = curr.next;
            curr.next = null;
            addFirst(curr);
            curr = forward;
        }
        return th;
    }
    void addFirst(ListNode node){
        if(th == null){
            th = node;
            tt = node;
        }else{
            node.next = th;
            th = node;
        }
    }
}