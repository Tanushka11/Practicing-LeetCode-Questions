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
    //     int len = findLen(head); 
    //     if(n == len){
    //         return head.next;
    //     }
    //     ListNode node = head;
    //     for(int i = 1; i < len - n ; i++){
    //         node = node.next;
    //     }
    //     ListNode d = node.next;
    //     if( d!= null && d.next != null){
    //         node.next = d.next;
    //     }else{
    //         node.next = null;
    //     }
    //     return head;
    // }
    // int findLen(ListNode head){
    //     ListNode node = head;
    //     int len = 0;
    //     while(node != null){
    //         node = node.next;
    //         len++;
    //     }
    //     return len;

    // one more method slow and fast 
    ListNode slow = head;
    ListNode fast = head;
    for(int i = 1; i<= n; i++){
        fast = fast.next;
    }
    ListNode prev = null;
    while(fast != null){
        prev = slow;
        slow = slow.next;
        fast = fast.next;
    }
    if(prev == null){
        return head.next;
    }
    prev.next = slow.next;
    return head;
    }
}