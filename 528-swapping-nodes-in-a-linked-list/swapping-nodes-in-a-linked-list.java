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
    public ListNode swapNodes(ListNode head, int k) {
        if(head ==  null){
            return head;
        }
        int n = findLen(head);
        int start = getValue(head,k);
        int end = getValue(head,n-k+1);
        ListNode node = head;
        for(int i = 1; node!= null && i<=n ; i++){
            if(i == k){
                node.val = end;
                 node = node.next;
            }else if(i == n- k + 1){
                 node.val = start;
                  node = node.next;
            }else{
                node = node.next;
            }
        }
        return head;
    }
     int getValue(ListNode head, int jump){
        ListNode node = head;
        for(int i = 0; i<jump-1; i++){
            node = node.next;
        }
        return node.val;
    }
    int findLen(ListNode head){
        int n = 0;
        ListNode node = head;
        while(node != null){
            n++;
            node = node.next;
        }
        return n;
    }
}