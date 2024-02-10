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
    public boolean isPalindrome(ListNode head) {
        // find middile
        // reverse the second half of the ll
        // traverse and check if head == mid if true then move ahead till mid reaches null if the condition is break in middile then just return false;
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode mid = findMiddile(head);
        ListNode secondHead = reverseLL(mid);
        ListNode reverseHead = secondHead;
        while(head != null && secondHead != null){
            if(head.val != secondHead.val){
                return false;
            }
                head = head.next;
                secondHead = secondHead.next;
        }
        reverseLL(secondHead);
        return head == null || secondHead == null;
       
    }
    ListNode reverseLL(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
         ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;
        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null) next = next.next;
        }
        return prev;
    }
    ListNode findMiddile(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}