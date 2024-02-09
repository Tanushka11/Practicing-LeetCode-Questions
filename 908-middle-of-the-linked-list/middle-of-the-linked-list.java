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
    public ListNode middleNode(ListNode head) {
        // two approaches 
        // first find the lenght and reach temp at half of its length 
        // second with only one iteration - fast and slow method

        // first
        // int size = 0;
        // ListNode temp = head;
        // while(temp != null){
        //     size++;
        //     temp = temp.next;
        // }
        // int mid = size/2;
        // ListNode node = head;
        // for(int i = 0; i<mid; i++){
        //     node = node.next;
        // }
        // return node;

        // second
        int size = 0;
        ListNode slow = head;
        ListNode fast = head;
        if(head == null){
            return head;
        }
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}