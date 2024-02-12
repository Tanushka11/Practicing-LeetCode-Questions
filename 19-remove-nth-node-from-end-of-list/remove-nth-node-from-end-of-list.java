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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if((head == null || head.next == null) && n == 1){
            return null;
        }
        int len = findLen(head); 
        if(n == len){
            return head.next;
        }
        ListNode node = head;
        for(int i = 0; i < len - n - 1; i++){
            node = node.next;
        }
        ListNode d = node.next;
        if( d!= null && d.next != null){
            node.next = d.next;
        }else{
            node.next = null;
        }
        return head;
    }
    int findLen(ListNode head){
        ListNode node = head;
        int len = 0;
        while(node != null){
            node = node.next;
            len++;
        }
        return len;
    }
}