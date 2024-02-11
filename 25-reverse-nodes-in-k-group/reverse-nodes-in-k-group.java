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

    public ListNode reverseKGroup(ListNode head, int k) {

    if(head == null || head.next == null) return head;

    ListNode curr = head;
    ListNode oh = null;
    ListNode ot = null;
    int length = findLength(head);

    while(length >= k){
        int tempK = k;
        while(tempK-- > 0){
        ListNode forward = curr.next;
        curr.next = null;
        addFirst(curr);
        curr = forward;
    }
    if(oh == null){
        oh = th;
        ot = tt;
    }else{
        ot.next = th;
        ot = tt;
    }
    th = null;
    tt = null;
    length -= k;
    }
    ot.next = curr;
    return oh;
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
    int findLength(ListNode head){
        ListNode node = head;
        int len = 0;
        while(node != null){
            node = node.next;
            len++;
        }
        return len;
    }
}