/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode node = headB;
        while(headA != null){
            while(node != null){
                if(node == headA){
                    return node;
                }else{
                    node = node.next;
                }
            }
            headA= headA.next;
            node = headB;
        }
        return null;
    }
}