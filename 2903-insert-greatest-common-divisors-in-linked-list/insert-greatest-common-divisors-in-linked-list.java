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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode a = head;
        ListNode b = head.next;
        while(a != null && b != null){
            int D = gcd(a.val,b.val);
            ListNode node = new ListNode(D);
            a.next = null;
            a.next = node;
            node.next = b;
            a = b;
           if(b != null) b = b.next;
        }
        return head;
    }
    int gcd(int A , int B) 
    { 
        //code here
       if(A == 0){
           return A;
       }
       if(B == 0){
           return B;
       }
       if(A == B){
           return A;
       }
       if(A > B){
           return gcd(A-B, B);
       }
       return gcd(A, B-A);
    } 
}