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
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = head;
        ListNode prev = null;
        while(node != null){
           if(prev == null && node.val == val){
               head = head.next;
               node = head;
           }else if(prev != null && node.val == val){
               prev.next = node.next;
               node = node.next;
           }else if(node.val != val){
               prev = node;
               node = node.next;
           }
        }
        return head;
    }
}