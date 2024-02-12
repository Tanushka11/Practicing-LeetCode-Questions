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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(0);
        ListNode curr = prehead;
        int carry = 0;
        int sum = 0;
        while(l1 != null || l2 != null){
            sum = carry;
            if(l1 != null) sum +=l1.val;
            if(l2 != null) sum +=l2.val;
                carry = sum/10;
                sum = sum % 10;
            ListNode node = new ListNode(sum);
            curr.next = node;
            curr = node;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        } 
        if(carry == 1){
            ListNode node = new ListNode(1);
            curr.next = node;
            node.next = null;
        }
        return prehead.next;
    }
}