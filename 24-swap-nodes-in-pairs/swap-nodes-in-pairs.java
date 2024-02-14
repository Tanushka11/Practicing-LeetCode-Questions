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
    ListNode th;
    ListNode tt;
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        int len = findLen(head);
        ListNode curr = head;
        ListNode oh = null;
        ListNode ot = null;
        while(len >= 2){
            int tempK = 2;
            while(tempK-- > 0){
               ListNode forward = curr.next;
               curr.next = null;
               addFirst(curr);
                curr = forward; 
            }
            if(oh == null){
                oh = th;
                ot = tt;
            }
            else{
            ot.next = th;
            ot = tt;
            }
            th = null;
            tt = null;
            len -= 2;
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
    int findLen(ListNode node){
        int l = 0;
        while(node != null){
            node = node.next;
            l++;
        }
        return l;
    }
}